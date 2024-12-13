#include<stdio.h>
int main()
{
    int x;
    printf("Enter the number: ");
    scanf("%d",&x);
    printf("+--------------------------------------------------+\n");
    printf("|");
    for(int i=1;i<=10;i++)
    {
        printf("%-3d  ",x*i);
    }
    printf("|\n");
    printf("|");
    for(int i=1;i<=10;i++)
    {
        printf("%-4d ",i);
    }
    printf("|\n");
    printf("|");
    for(int i=1;i<=10;i++)
    {
        printf("%-4d ",x);
    }
    printf("|\n");
    printf("+--------------------------------------------------+");
    
}