#include<stdio.h>
int main()
{
 int n = 365,d = 4,remainder, quotient;
  scanf("%d", &n);
  scanf("%d", &d);
  quotient = n / d;
  remainder = n % d;
  printf("Quotient: %d\n", quotient);
  printf("Remainder: %d\n", remainder);
  return 0;
}