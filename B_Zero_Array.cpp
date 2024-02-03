#include<bits/stdc++.h>
using namespace std;
#define ll   long long
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    ll t,sum=0, max=0;
    cin>>t;
    ll arr[t];
    for (ll i = 0; i < t; i++){
            ll p;

            cin>>p;
            sum+=p;
            if (p>max){
                max=p;
            }
            
        }

        if (sum%2==0 &&  (sum-max)>=max){
            cout<<"YES"<<endl;
        }
        else
            cout<<"NO"<<endl;      
    
  return 0;  
}