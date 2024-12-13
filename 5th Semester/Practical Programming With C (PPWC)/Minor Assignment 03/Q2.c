#include<stdio.h>
void summarr(int a[],int b[],int c[],int size)
{
    for(int i=0;i<size;i++)
    {
        c[i]=a[i]+b[i];
        printf("%d ",c[i]);
    }
}
int main()
{
    int size=3;
    int a[]={5,-1,7};
    int b[]={2,4,-2};
    int c[size];
    summarr(a,b,c,size);
}

/*
OUTPUT:-
7 3 5 
*/