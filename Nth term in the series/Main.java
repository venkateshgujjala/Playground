#include<stdio.h>

int main()
{
  int res , n, term;
  scanf("%d", &n);
  if(n % 2 == 1)
  {
  term = (n + 1)/2;
  res = 2 * (term - 1);
    printf("%d", res);
}
  else
    {
  term = n / 2;
  res = term - 1;
    printf("%d", res);
  }
}