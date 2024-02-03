#include<bits/stdc++.h>
using namespace std; 
void insert(int arr[], int n, int m)
{
    int idx;
    for (int i = 0; i < n; i++)
    {
       if (arr[i]>m)
       {
            idx= i;
            break;
       }
       
    }
    for (int i = n+1; i >=idx; i--)
    {
        swap(arr[i], arr[i-1]);
    }
    arr[idx-1]=m;
    n=n+1;
    for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
    
}
void del_(int arr[], int n, int m)
{
    int idx, count=0;
    for (int i = 0; i < n; i++)
    {
       if (arr[i]==m)
       {
            idx= i;
            count++;
            break;
       }
       
    }
    if (count==0)
    {
        cout<<"Not found"<<endl;
    }
    else
    {
        for (int i = idx; i<n; i++)
        {
            swap(arr[i], arr[i+1]);
        }
        //arr[idx-1]=m;
        n=n-1;
        for (int i = 0; i < n; i++)
        {
            cout<<arr[i]<<" ";
        }
    }
    
}
void sorting(int arr[], int n)
{
    for (int i = 0; i < n-1; i++)
    {
        
        for (int j = 0; j < n-1-i; j++)
        {
            if(arr[j]>arr[j+1])
            {
                swap(arr[j], arr[j+1]);
            }
        }
        
        cout<<endl;
    }
    
    
}
void bin_search(int arr[], int low, int upper, int m)
{
    int count=0;
    int p;
    
    while(low<= upper)
    {
        int mid=  low+ (upper-low)/2;
        if (arr[mid]== m)
        {
            p=mid;
            count++;
            cout<<"Found"<<" "<<"position" << p<<endl;
            break;
        }
        else if(arr[mid]> m)
        {
            upper = mid-1;
        }
        else
        {
            low = mid+1;
        }
        
    }
    if(count!=1)
    {
        cout<<"Not found"<< endl;
    }
}
int main()
{
    int n;
    cin>>n;
    int arr[n+1];
    for (int  i = 0; i < n; i++)
    {
        cin>>arr[i];
    }

    sorting(arr, n);
    for (int  i = 0; i < n; i++)
    {
        cout<<arr[i]<< " ";
    }

    cout<<endl;
    bin_search(arr, 0, n, 80);
    //del_(arr,n, 3);
    //insert(arr,n,3);

    return 0;
    
}