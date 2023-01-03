#include <stdio.h>

int main(int argc, char **argv)
{
    int i = 0, sum = 0;
    while (argc--)
    {
        printf("Argument %d = %s\n", i + 1, argv[i]);
        i != 0 ? sum += (int)(*argv[i] - '0'), i++ : i++;
    }
    printf("SUM = %d\n", sum);
    return 0;
}
