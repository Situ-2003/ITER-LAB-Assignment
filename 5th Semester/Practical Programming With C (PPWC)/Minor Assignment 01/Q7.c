#include<stdio.h>
int main()
{
    char c;
    float m_a,c_a,f_c;
    printf("Enter desired grade> ");
    scanf("%c",&c);
    printf("Enter minimum average required> ");
    scanf("%f",&m_a);
    printf("Enter current average in course> ");
    scanf("%f",&c_a);
    printf("Enter how much the final counts \n as a percentage of the course grade> ");
    scanf("%f",&f_c);

    float f_w=f_c/100;
    float c_w=1-f_w;
    float score=(m_a-(c_a*c_w))/f_w;

    printf("You need to score %f on the final to get a %c.\n ",score,c);


}
/*
Output:-
PS E:\Semester 5\PPWC\Assignment\01.Minor assignment1> gcc Q7.c -o Q7
PS E:\Semester 5\PPWC\Assignment\01.Minor assignment1> ./Q7 
Enter desired grade> A
Enter minimum average required> 89.5
Enter current average in course> 82.6
Enter how much the final counts       
 as a percentage of the course grade> 25
You need to score 110.200005 on the final to get a A.
*/