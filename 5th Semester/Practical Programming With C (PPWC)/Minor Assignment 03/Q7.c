#include<stdio.h>
int distinct(int arr[],int size)
{
    for(int i=0;i<size;i++)
    {
        int found=0;
        for(int j=i+1;j<size;j++)
        {
            if(arr[i]==arr[j])
            {
                found=1;
            }
        }
        if(found==0)
        {
            printf("%d ",arr[i]);
        }
    }
}
int main()
{
    int size=7;
    int arr[]={4,7,7,3,2,5,5};
    distinct(arr,size);
    
}

/*
OUTPUT:-
4 7 3 2 5 
*/