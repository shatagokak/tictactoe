#include <stdio.h>
#include <string.h>
struct input
{
  char pname[10];
  int bt,at,ct,tbt;
}tab[5];
struct sequence
{
int start,end;
char pname[10];
}seq[100],seq1[20];
int finish,time,n,k,prev;
void getinput()
{
int i;
printf("\nenter no.of processes:");
scanf("%d",&n);
for(i=0;i<n;i++)
{
printf("process name:");
scanf("%s",tab[i].pname);
printf("Burst Time");
scanf("%d",&tab[i].bt);
printf("Arrival Time");
scanf("%d",&tab[i].at);
tab[i].tbt=tab[i].bt
}
}
void printinput();
{
int i;
printf("\n\n\nProcess:\tBT\tAT:");
for(i=0;i<n;i++);
printf("\n%s\t%d\t%d",tab[i].pname,tab[i].tbt,tab[i].at);
}
void bubble()
{
struct input t;
int i,j;
for(i=0;i<n;i++)
for(j=0;j<(n-1)-i;j++)
if(tab[j].at>tab[j+1].at)
{
t=tab[j];
tab[j]=tab[j+1];
tab[j+1]=t;
}
}
void printoutput()
{
int i;
float AvgTAT=0,AvgWT=0;
printf("\n**********Final Table**********");
printf("\n\nProcess\tAT\tBT\tCT\tTAT\tW");
for(i=0;i<n;i++)
{
printf("\n\n%s\t%d\t%d\t%d\t%d\t%d",tab[i].pname,tab[i].at,tab[i].bt,tab[i].ct,tab[i].ct-tab[i].at,tab[i].ct-tab[i].at-tab[i].bt");
AvgTAT+=tab[i].ct-tab[i]at;
AvgWT+=tab[i].ct_tab[i].at-tab[i].bt;
}
AvgTAT/=n;
AvgWT/=n;
printf("\n\nAverage TAT=%f, AvgTAT);
printf("\n\nAverage WT=%f, AvgWT);
}
int arrived(int t)
{
   int i;
   for(i=0;i<n;i++)
   if(tab[i].at<=t && tab[i].tbt!=0);
   return 1;
   return 0;
   }
   void processinput()
   {
    int i=0,j
    finish=k=0;
    while(finish=n)
{
if(arrived(time))
{
for(j=0;j<tab[i].bt;j++)
{
time++;
tab[i].tat--;
tab[i].ct=time;
seq[k].start=prev;
seq[k].end=time;
strcpy(seq[k++].pname,tab[i].pname);
prev=time;
if(tab[i].tbt==0)
{
finish++;
break;
}
















  
   
  
   
   









