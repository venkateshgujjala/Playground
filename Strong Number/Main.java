#include <stdio.h>
int main()
{
  int n,r,sum = 0;
  int fact;
 scanf("%d", &n);
 int temp = n;
  while (temp > 0)
  {
    r = temp % 10;
    fact = 1;
    for (int i = 1; i <= r; i++)
    {
	fact = fact * i;
    }
    sum = sum + fact;
    temp = temp / 10;
  }
  if(n == sum)
  {
    printf("Yes");
  }
    else
    {
      printf("No");
    }
	return 0;
}