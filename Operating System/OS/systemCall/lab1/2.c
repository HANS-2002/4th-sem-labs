#include <stdio.h>

int main(int argc, char **argv)
{
    if (argc == 1)
        printf("Enter a string as argument!\n");
    else if (argc > 2)
        printf("Too many arguments!\n");
    else
    {
        int count = 0;
        char *word = argv[1];
        for (int i = 0; word[i] != '\0'; i++)
                count++;
        printf("Number of letters in %s = %d\n", word, count);
    }
    return 0;
}


