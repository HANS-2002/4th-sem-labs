#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/wait.h>

int main(int argc, char **argv)
{
    while (1)
    {
        pid_t pid = fork();
        int status = 0;
        wait(&status);
        if (pid == 0)
        {
            int choice = 0;
            char str[20];
            printf("Enter word: ");
            scanf("%s", str);
            printf("Press 1 for Vowel count\nPress 2 for letter count\nChoice: ");
            scanf("%d", &choice);
            if (choice == 1)
            {
                char *args[] = {"./prog1", str, NULL};
                execvp(args[0], args);
            }
            else if (choice == 2)
            {
                char *args[] = {"./prog2", str, NULL};
                execvp(args[0], args);
            }
        }
    }
    return 0;
}


