#include<bits/stdc++.h>
using namespace std;
#define ll   long long
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    ll t,sum=0, count=1;
    cin>>t;
    ll arr[t];
    for (ll i = 0; i < t; i++)
        {
           // ll p;
            cin>>arr[i];
            sum+=arr[i];
        }
        for (ll i = 1; i < t; i++)
        {
            if (arr[i]==arr[i-1])
            {
                count++;
            }
            
        }
        
        if (t%2==0 && sum%2==0)
        {
            cout<<"YES"<<endl;
        }
        else if(t%2==1 && count==t && sum%2==0)
        {
            cout<<"YES"<<endl;
            
        }
        else
            cout<<"NO"<<endl;
        
    
  return 0;  
}