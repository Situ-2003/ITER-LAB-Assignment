#include<stdio.h>
int diff_a_b(int arr1[],int arr2[],int size1,int size2)
{
    for(int i=0;i<size1;i++)
    {
        int d=0;
        for(int j=0;j<size2;j++)
        {
            if(arr1[i]==arr2[j])
            {
                d=1;
            }
        }
        if(d==0)
        {
            printf("%d ",arr1[i]);
        }
    }
}
int diff_b_a(int arr1[],int arr2[],int size1,int size2)
{
    for(int i=0;i<size1;i++)
    {
        int d=0;
        for(int j=0;j<size2;j++)
        {
            if(arr2[i]==arr1[j])
            {
                d=1;
            }
        }
        if(d==0)
        {
            printf("%d ",arr2[i]);
        }
    }
}
int main()
{
    int arr1[]={1,2,3,4};
    int arr2[]={2,4,5,6};
    int size1=4;
    int size2=4;
    diff_a_b(arr1,arr2,size1,size2);
    diff_b_a(arr1,arr2,size1,size2);
}

/*
OUTPUT:-

*/