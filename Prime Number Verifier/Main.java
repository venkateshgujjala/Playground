#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main ()
{
  int n , i;
  scanf("%d", &n);
  if(n == 0 || n == 1)
  {
    printf("neither\n");
    return 0;
  }
  if(n < 0)
  {
    printf("composite\n");
    return 0;
  }
  for(i = 2; i < n; i++)
  {
    if(n % 2 == 0)
    {
      printf("composite\n");
      return 0;
    }
  }
    printf("prime\n");
    return 0;
}