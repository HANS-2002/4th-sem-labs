#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/wait.h>

int main(int argc, char **argv)
{
    int RET, c = 0;
    printf("IN Parent\n\n");

    for (int i = 0; i < 3; i++)
    {
        int s;
        if (!fork())
        {
            char *args[] = {"ls", NULL};
            execvp(args[0], args);
        }
        else
            wait(&s);
        if (s == 0)
            c++;
    }

    printf("OUT Parent\n\n");
    if (c == 3)
        RET = 0;
    else
        RET = 1;
    return RET;
}
