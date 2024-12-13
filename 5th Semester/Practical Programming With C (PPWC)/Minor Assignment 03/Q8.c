 #include<stdio.h>
 #include<string.h>
 char repetative(char *str)
 {
    int len=strlen(str);
    for(int i=0;i<len;i++)
    {
        for(int j=i+1;j<len;j++)
        {
            if(str[i]==str[j])
            {
                return str[i];
            }
        }
    }
    return '\0';
 }
 int main()
 {
    char str[100];
    printf("Enter the string: ");
    scanf("%s",str);

    if(repetative(str))
    {
        printf("The first repititive character in the string %s is %c\n",str,repetative(str));
    }
    else
    {
        printf("No repetative character found in String %s\n ",str);
    }
    return 0;
 }   