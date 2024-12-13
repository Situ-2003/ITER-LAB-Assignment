#include<stdio.h>
int main()
{
int prime_it_100[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
int i=10;
printf("a) %d\n", prime_it_100[24]);         
printf("b) %d\n", prime_it_100[i+4]);        
printf("c) %d\n", prime_it_100[prime_it_100[2] + prime_it_100[0]]); 
prime_it_100[6]=prime_it_100[6]+prime_it_100[16];
printf("d) %d\n", prime_it_100[6]);          

}
/*
OUTPUT:-
a) 97
b) 47
c) 19
d) 76
*/