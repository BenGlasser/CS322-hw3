#include <stdio.h>
#include <stdlib.h>

extern void mini_main();

void print(int x) {
    printf("print: %d\n",x);
}

int* new_array(int n) {
  return (int*)malloc(n*4);
}

int square(int x) {
  return x*x;
}

int main() {
    mini_main();
    return 0;
}

