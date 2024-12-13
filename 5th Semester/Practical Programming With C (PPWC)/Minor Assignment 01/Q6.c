  #include<stdio.h>
int main()
{
    float n;
    printf("Enter distance in Meter: ");
    scanf("%f",&n);
    float km,cm,mm,f,i;
    km=n*0.001;
    cm=n*100;
    mm=n*1000;
    f=n*3.28084;
    i=n*39.3701;
    printf("distance in meter is %.2f\n\n",n);

    printf("+------------------+------------------+\n");
    printf("| Unit             | Value            |\n");
    printf("+------------------+------------------+\n");
    printf("| Meters           |%15.2f   |\n",n);
    printf("| Kilometers       |%15.2f   |\n",km);
    printf("| Centimeters      |%15.2f   |\n",cm);
    printf("| Millimeters      |%15.2f   |\n",mm);
    printf("| Feet             |%15.2f   |\n",f);
    printf("| Inches           |%15.2f   |\n",i);
    printf("+------------------+------------------+");

}
/*
Output:-
PS E:\Semester 5\PPWC\Assignment\01.Minor assignment1> gcc Q6.c -o Q6
PS E:\Semester 5\PPWC\Assignment\01.Minor assignment1> ./Q6 
Enter distance in Meter: 12.5
distance in meter is 12.50

+------------------+------------------+
| Unit             | Value            |
+------------------+------------------+
| Meters           |  12.50           |
| Kilometers       |  0.01            |
| Centimeters      |  1250.00         |
| Millimeters      |  12500.00        |
| Feet             |  41.01           |
| Inches           |  492.13          |
+------------------+------------------+
  */