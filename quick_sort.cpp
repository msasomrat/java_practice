#include<bits/stdc++.h>
using namespace std;

int partition(int arr[], int l, int h)
{
    int x= arr[h];
    int i= (l-1);
    for (int j = l; j <=h-1; j++)
    {
        if (arr[j] <= x)
        {
            i++;
            swap(arr[i], arr[j]);
        }
        
    }
    swap(arr[i+1], arr[h]);
    return (i+1);
}

void quick_sort(int arr[], int l, int h)
{
    if (l<h)
    {
        int p= partition(arr, l, h);
        quick_sort(arr, l, p-1);
        quick_sort(arr, p+1, h);

    }
    
}

int main()
{
    int n;
    cout<<"Enter the number of element"<<endl;
    cin>>n;
    int arr[n];
    for (int  i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    quick_sort(arr,0, n-1);
    for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
    return 0;
}