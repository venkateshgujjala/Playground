#include <stdio.h>
int main() 
{
	int i, n;
  scanf("%d", &n);
  for(i = 1; i <= 2 *n; i++)
  {
    if(i % 2 == 1)
    {
      printf("%d\n", i);
  }
  }
	return 0;
}