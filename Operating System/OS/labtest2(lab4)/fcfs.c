#include <stdio.h>
#include <stdlib.h>

typedef struct
{
    int burstTime;
    int arrTime;
    int pid;
    int entry;
    int exit;
} process;

// Function to swap 2 processes while sorting
void swapProcess(process *a, process *b)
{
    process temp;

    temp.burstTime = a->burstTime;
    temp.arrTime = a->arrTime;
    temp.pid = a->pid;

    a->burstTime = b->burstTime;
    a->arrTime = b->arrTime;
    a->pid = b->pid;

    b->burstTime = temp.burstTime;
    b->arrTime = temp.arrTime;
    b->pid = temp.pid;
}

int main()
{
    int n, waitTime = 0, resTime = 0, turnTime = 0;

    printf("Enter the number of processes: ");
    scanf("%d", &n);
    process *p = (process *)malloc(sizeof(process) * n);
    for (int i = 0; i < n; i++)
    {
        p[i].pid = i;
        printf("Enter burst time for process %d: ", i);
        scanf("%d", &p[i].burstTime);
        printf("Enter arrival time for process %d: ", i);
        scanf("%d", &p[i].arrTime);
        p[i].entry = -1;
        p[i].exit = -1;
    }

    // Sorting of process according to arrival time
    for (int i = 0; i < n; i++)
        for (int j = i + 1; j < n; j++)
            if (p[i].arrTime > p[j].arrTime)
                swapProcess(&p[i], &p[j]);

    // Calculating entry and exit times
    for (int i = 0; i < n; i++)
    {
        if (i == 0)
            p[i].entry = p[i].arrTime;
        else
        {
            if (p[i].arrTime <= p[i - 1].exit)
                p[i].entry = p[i - 1].exit;
            else
                p[i].entry = p[i].arrTime;
        }
        p[i].exit = p[i].entry + p[i].burstTime;
    }

    // Calculating the total arrival,turn around and response times
    for (int i = 0; i < n; i++)
    {
        int tt = 0, wt = 0, rt = 0;

        tt = p[i].exit - p[i].arrTime;  // Turn Around time = Finish Time - Arrival Time
        wt = tt - p[i].burstTime;       // Waiting Time = Turn Around Time - Burst Time
        rt = p[i].entry - p[i].arrTime; // Response Time = Entry Time - Arrival Time

        waitTime += wt;
        turnTime += tt;
        resTime += rt;
    }

    printf("\nTotal wait time: %d\n", waitTime);
    printf("Total response time: %d\n", resTime);
    printf("Total turnaround time: %d\n", turnTime);

    return 0;
}