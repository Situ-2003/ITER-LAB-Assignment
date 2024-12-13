#include<stdio.h>
int array(int arr[],int length)
{
    for(int i=0;i<length;i++)
    {
        printf("%d ",arr[i]);
    }
}
int main()
{
    int arr[]={7,8,3,1,2};
    int length=sizeof(arr)/sizeof(arr[1]);
    for(int i=0;i<length-1;i++)
    {
        for(int j=0;j<length-1-i;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }

        }
    }
    array(arr,length);

}

/*
OUTPUT:-
1 2 3 7 8 
*/