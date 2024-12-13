#include<stdio.h>
int binary(int arr[],int tar,int size)
{
    int st=0;
    int end=size-1;
    while(st<=end)
    {
        int mid=(st+end)/2;

        if(tar>arr[mid])
        {
            st=mid+1;
        }
        else if(tar<arr[mid])
        {
            end=mid-1;
        }
        else
        {
            return mid;
        }
    }
    return -1;
}
int main()
{
    int arr1[]={-1,0,3,4,5,9,12};
    int tar1=5;
    int size1=7;
    printf("%d \n",binary(arr1,tar1,size1));

    int arr2[]={-1,0,3,4,5,9,12,13,14,15};
    int tar2=13;
    int size2=10;
    printf("%d",binary(arr2,tar2,size2));
}

/*
OUTPUT:-
4 
7
*/