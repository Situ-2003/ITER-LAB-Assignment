#include<stdio.h>
#include<math.h>
int main()
{
    double x;
    printf("Enter the value of x: \n");
    scanf("%lf",&x);
    double v=(x-1)/x;
    double sum=v;
    for (int i =2; i <=9; i++)
    {
        v*=(x-1)/x;
        
        sum+=(0.5*v);
    }
    printf("%lf",sum);
    return 0;
    
}