#include<stdio.h>
int main()
{
    int mark;
    printf("Enter the mark:\n");
    scanf("%d",&mark);
    int v=mark/10;
    switch (v)
    {
    case 9:
        if(mark>=95)
            printf("O Grade");
        else
            printf("A Grade");
        break;
    case 8:
        if(mark==80)
            printf("B Grade");
        else
            printf("A Grade");
        break;
    case 7:
        if(mark==70)
            printf("C Grade");
        else
            printf("B Grade");
        break;
    case 6:
        if(mark==60)
            printf("D Grade");
        else
            printf("C Grade");
        break;
    case 5:
        if(mark==50)
            printf("E Grade");
        else
            printf("D Grade");
        break;
    case 4:
        printf("E Grade");break;
    default:
        if(mark<40)
            printf("F grade");
        break;
    }
}