#include<stdio.h>
void main()
{
int no,result;
int factorial(int n);
printf("\n enter number=");
scanf("%d",&no);
result=factorial(no);
printf("factorial of %d is %d",no ,result);
}
int factorial(int n)
{
int i,prod=1;
for(i=1;i<n;i++)
prod=prod*i;
return prod;
}
