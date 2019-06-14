#include<stdio.h>
int main()
{
  int num , rem , decimal_val = 0, binary_val;
  int base = 1;
 scanf("%d", &num);
  binary_val = num;
  while(num > 0)
  {
    rem = num % 10;
    decimal_val = decimal_val + rem * base;
    num = num / 10;
    base = base * 2;
  }
  printf("%d", decimal_val);
}
