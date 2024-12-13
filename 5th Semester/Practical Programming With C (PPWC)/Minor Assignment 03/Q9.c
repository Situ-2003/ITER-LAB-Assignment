 #include<stdio.h>
 #include<string.h>
 void countCharacter(char *str)
 {
    int count[256]={0};
    
    for(int i=0;str[i]!='\0';i++)
    {
        count[(unsigned char)str[i]]++;
    }
    printf("The count of each character in the string %s is: \n",str);
    for(int i=0;i<256;i++)
    {
        if(count[i]>0)
        {
            printf("%c-%d, ",i,count[i]);
        }
    }
    printf("\n");
 }
 int main()
 {
    char str[100];
    printf("Enter a string: ");
    scanf("%s",str);
    countCharacter(str);
 }