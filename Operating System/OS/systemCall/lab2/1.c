// Write a program to implement ls && gcc in the C programming language using system calls.
// Using the fact that ls returns 0 and gcc returns 1
// Author - https://github.com/HANS-2002

#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/wait.h>

int main(int argc, char **argv)
{
    int waitStatus;
    if (!fork())
    {
        char *args[] = {"/bin/ls", NULL};
        execvp(args[0], args);
    }
    wait(&waitStatus);
    if (waitStatus == 0)
    {
        if (!fork())
        {
            char *args[] = {"/bin/gcc", NULL};
            execvp(args[0], args);
        }
    }
    wait(&waitStatus);
    return 1;
}
