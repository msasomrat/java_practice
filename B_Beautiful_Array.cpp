#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n;
    cin>>n;
    while(n--)
    {
        long long n,k,b,s;
        cin>>n>>k>>b>>s;
        long long arr[n];
    
    if( s< (k*b) || s> k*b+n*(k-1)){
        cout<<"-1"<<endl;
        continue;
        }
    
    
    else{
        arr[0]= b*k;
        s -= b*k;
        if (s>0){
            arr[0]+= min(k-1,s);
            s=s-min(k-1,s);
        }
        for (long long i = 1; i < n; i++)
        {
            if(s>0){
                arr[i]= min(k-1,s);
                s -= arr[i];
            }
            else{
                arr[i]=0;
            }
        }
        
        
    }
    for (long long i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
    
    cout<<endl;
    }
    return 0;
}