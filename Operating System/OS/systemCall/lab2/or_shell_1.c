#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/wait.h>

int main()
{
    int status0, status1;
    int pid0 = fork();
    if (pid0 == 0)
    {
        char *args[] = {"/usr/bin/ls", NULL};
        execvp(args[0], args);
    }
    wait(&status0);
    status0 = WEXITSTATUS(status0);
    if (status0 == 0)
        exit(0);

    int pid1 = fork();
    if (pid1 == 0)
    {
        char *args[] = {"/usr/bin/gcc", NULL};
        execvp(args[0], args);
    }
    wait(&status1);
    status1 = WEXITSTATUS(status1);
    exit(status0 & status1);
}


