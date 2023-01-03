// Modify 2 slightly such that now it executes gcc || ls. Save this program under a different name.
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
        char *args[] = {"/bin/gcc", NULL};
        execvp(args[0], args);
    }
    wait(&waitStatus);
    if (waitStatus != 1)
    {
        if (!fork())
        {
            char *args[] = {"/bin/ls", NULL};
            execvp(args[0], args);
        }
    }
    wait(&waitStatus);
    return 0;
}
