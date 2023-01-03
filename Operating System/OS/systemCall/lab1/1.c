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
            if (word[i] == 'a' || word[i] == 'e' || word[i] == 'i' || word[i] == 'o' || word[i] == 'u')
                count++;
        printf("Number of vowels in %s = %d\n", word, count);
    }
    return 0;
}

