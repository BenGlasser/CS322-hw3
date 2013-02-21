#include <stdio.h>

void byref (int &y);
void byrefagain(int &y);

int main()
{
    int x = 0;

    byref(x);
    printf("%d\n", x);

    return 0;
}

void byref(int &y) {
    y = y + 1;
    printf("%d\n", y);
}

void byrefagain(int &y) {
    y = y + 1;
    printf("%d\n", y);
}
