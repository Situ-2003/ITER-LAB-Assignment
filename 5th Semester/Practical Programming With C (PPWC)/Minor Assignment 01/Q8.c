#include<stdio.h>
int main()
{
    float v=278;
    float s=94;

    float a,t;

    float speed=(278*1000)/(60*60);
    printf("Speed in m/s is: %f\n",speed);
    printf("distance 's' is: %f\n",s);
    t=(2*s)/speed;
    a=speed/t;
    printf("Time is: %f\n",t);
    printf("Acceleration is: %f\n",a);
}
/*
PS E:\Semester 5\PPWC\Assignment\01.Minor assignment1> gcc Q8.c -o Q8
PS E:\Semester 5\PPWC\Assignment\01.Minor assignment1> ./Q8
Speed in m/s is: 77.000000
distance 's' is: 94.000000
Time is: 2.441558
Acceleration is: 31.537235
*/