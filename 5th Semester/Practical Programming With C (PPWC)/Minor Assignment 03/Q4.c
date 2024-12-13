#include<stdio.h>
int merged(int arr1[],int arr2[],int arr3[],int size1,int size2)
{
    int i=0,j=0,k=0;
    while(i<size1 && j<size2)
    {
    if(arr1[i]>arr2[j])
    {
        arr3[k]=arr2[j];
        k++;
        j++;
    }
    else
    {
        arr3[k]=arr1[i];
        k++;
        i++;
    }
    }
    while(i<size1)
    {
        arr3[k]=arr1[i];
        k++;
        i++;
    }
    while (j<size2)
    {
        arr3[k]=arr2[j];
        k++;
        j++;
    }
    for(int i=0;i<size1+size2;i++)
    {
        printf("%d ",arr3[i]);
    }
    
    
}
int main()
{
    int arr1[]={12,20,24,100,120,130};
    int arr2[]={17,28,105,110};
    int size1=sizeof(arr1)/sizeof(arr1[0]);
    int size2=sizeof(arr2)/sizeof(arr2[0]);
    int arr3[size1+size2];
    merged(arr1,arr2,arr3,size1,size2);
    


}

/*
OUTPUT:-
12 17 20 24 28 100 105 110 120 130 
*/