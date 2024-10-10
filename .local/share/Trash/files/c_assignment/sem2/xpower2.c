#include<stdio.h>
void main()
{
int x,y,result;
int power(int a,int b);
printf("\n enter base and power=");
scanf("%d %d",&x,&y);
result=power(x,y);
printf("%d %d %d",x,y,result);
}
int power(int a,int b)
{
int i,prod=1;
for(i=1;i<=b;i++)
prod=prod*a;
return prod;
}
