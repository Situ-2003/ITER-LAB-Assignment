#include<stdio.h>
int leap(int year)
{
    if(year%4==0 && year%100!=0 || year%400==0)
        return 1;
    else
        return 0;
}
int main()
{
    int year,day,month,count=0;
    printf("Enter day,month,year:\n");
    scanf("%d %d %d",&day,&month,&year);
    int tab[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    if(leap(year))
        tab[2]=29;
    for(int i=1;i<month;i++){
        count+=tab[i];
    }
    count=day+count;
    printf("Day number: %d\n ",count);
    return 0;
}