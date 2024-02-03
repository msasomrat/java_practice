#include<bits/stdc++.h>
using namespace std;
void special(int arr1[], int arr2[], int p)
{
            int sum2=0;
                for (int i = 0; i < p; i++)
                {
                    if(arr2[i] > arr1[i]){
                        arr1[i] = arr2[i];
                    }
                }
                for (int i = 0; i < p; i++)
                {
                    sum2+= arr1[i];
                }
                
            cout<<sum2<<endl;
}   
int high(int arr2[], int n, int k)
{
    int r=k;
    int temp= arr2[k];
    for (int i = k; i < n; i++){
        if (arr2[i]>temp && arr2[i]!=0){
            temp= arr2[i];
            r=i;
        }
        
    }
    arr2[r]=0;
    return temp;
}
void swap_(int arr1[], int arr2[], int n, int q)
{
    int count=0;
    
    for (int i = 0; i < n; i++)
    {
        if(count==q){
                break;
            }
        int var = high(arr2, n, i);
        if(var>arr1[i]){
            arr1[i]= var;
            count++;
            
        }
        
    }
    
}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);  cout.tie(NULL);
    int n;
    cin>>n;
    while (n--)
    {
        int p,q, sum=0;
        cin>>p>>q;
        int arr1[p], arr2[p];
        for (int i = 0; i < p; i++){
            cin>>arr1[i];
        }
        for (int i = 0; i < p; i++){
            cin>>arr2[i];
        }
        if (p==q)
        {
             special(arr1, arr2, p);
             continue;
        }
        swap_(arr1, arr2, p, q);
        for (int i = 0; i < p; i++)
        {
           sum+=arr1[i];
        }
        cout<<sum<<endl;
           
    }
    return 0;
}