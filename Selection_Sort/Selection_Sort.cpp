#include<iostream>
using namespace std;
 int main()
 {
    int a,i,j,min,temp;
    cout<<"Enter the number of elements in array"<<endl;
    cin>>a;
    int b[a];
    for(i = 0; i < a; i++)
    cin>>b[i];

    for( i = 0; i < a - 1; i++)
    {
    min = i;

    for(j = i+1; j < a; j++)
    {
        if(b[j] < b[min])
        min = j;
    }
        temp = b[min];
        b[min] = b[i];
        b[i] = temp;
    }
    cout<<"The sorted array is:"<<endl;
    for(i = 0; i < a; i++)
    cout<<b[i]<<" ";
    return 0;
 }
 