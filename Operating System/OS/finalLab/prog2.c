// 2. Write a process scheduler that does FCFS but breaks ties using SJF. It should accept the arrival time and burst time of each process.
// If the arrival times are the same for two processes then the one with the lower burst time should get priority.
// If the burst times are also identical then you should break ties randomly.
#include <stdio.h>
#include <stdlib.h>

typedef struct
{
    int burstTime;
    int arrivalTime;
    int pid;
    int entryTime;
    int exitTime;
} process;

void swapProcess(process *a, process *b)
{
    process temp;

    temp.burstTime = a->burstTime;
    temp.arrivalTime = a->arrivalTime;
    temp.pid = a->pid;

    a->burstTime = b->burstTime;
    a->arrivalTime = b->arrivalTime;
    a->pid = b->pid;

    b->burstTime = temp.burstTime;
    b->arrivalTime = temp.arrivalTime;
    b->pid = temp.pid;
}

int main()
{
    int n, waitTime = 0, resTime = 0, turnTime = 0;

    printf("Enter the number of processes: ");
    scanf("%d", &n);
    process *p = (process *)malloc(sizeof(process) * n);
    int *waiting = (int *)malloc(sizeof(int) * n);
    int *turnaround = (int *)malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++)
    {
        p[i].pid = i;
        printf("Enter arrival time for process %d: ", i);
        scanf("%d", &p[i].arrivalTime);
        printf("Enter burst time for process %d: ", i);
        scanf("%d", &p[i].burstTime);
        p[i].entryTime = -1;
        p[i].exitTime = -1;
    }

    for (int i = 0; i < n; i++)
        for (int j = i + 1; j < n; j++)
        {
            if (p[i].arrivalTime > p[j].arrivalTime)
                swapProcess(&p[i], &p[j]);
            else if (p[i].arrivalTime == p[j].arrivalTime && p[i].burstTime > p[j].burstTime)
                swapProcess(&p[i], &p[j]);
        }

    for (int i = 0; i < n; i++)
    {
        if (i == 0)
            p[i].entryTime = p[i].arrivalTime;
        else
        {
            if (p[i].arrivalTime <= p[i - 1].exitTime)
                p[i].entryTime = p[i - 1].exitTime;
            else
                p[i].entryTime = p[i].arrivalTime;
        }
        p[i].exitTime = p[i].entryTime + p[i].burstTime;
    }

    for (int i = 0; i < n; i++)
    {
        int tt = 0, wt = 0, rt = 0;

        tt = p[i].exitTime - p[i].arrivalTime;  // Turn Around time = Finish Time - Arrival Time
        wt = tt - p[i].burstTime;               // Waiting Time = Turn Around Time - Burst Time
        rt = p[i].entryTime - p[i].arrivalTime; // Response Time = entryTime Time - Arrival Time

        waitTime += wt;
        turnTime += tt;
        resTime += rt;

        waiting[i] = wt;
        turnaround[i] = tt;
    }

    printf("\nProcess\t\tAT\tBT\tWT\tTT\tCT\n");
    for (int i = 0; i < n; i++)
        printf("\n  P%d\t\t%d\t%d\t%d\t%d\t%d\n", p[i].pid, p[i].arrivalTime, p[i].burstTime, waiting[i], turnaround[i], p[i].exitTime);

    printf("\nTotal wait time: %d\n", waitTime);
    printf("Total response time: %d\n", resTime);
    printf("Total turnaround time: %d\n", turnTime);

    return 0;
}