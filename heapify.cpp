#include<bits/stdc++.h>
using namespace std;
void heapify(int arr[], int n, int i)
{
    int largest = i;
    int l =2*i+1;
    int r =2*i+2;
    if (l<n && arr[l] > arr[largest])
    {
        largest=l;
    }
    if (r<n && arr[l] > arr[largest])
    {
        largest=r;
    }
    if (largest!=i)
    {
        swap(arr[i], arr[largest]);
        heapify(arr, n, largest);
    }
    
    
}
void deleteRoot(int arr[], int &n)
{
    int lastelement= arr[n-1];
    arr[0]= lastelement;
    n=n-1;
    heapify(arr, n, 0);
}
void printarray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    
}

int main()
{
    int n;
    cout<<"Enter the size"<<endl;
    cin>>n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    deleteRoot(arr, n);
    printarray(arr, n);
    
}