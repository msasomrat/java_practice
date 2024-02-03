#include<bits/stdc++.h>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);  cout.tie(NULL);
    int t;
    cin>>t;
    while(t--){
        int n,k;
        cin>> n>> k;
        int ls=0,rs=0, ms=0;
        while(n--){
            int l,r;
            cin>>l>>r;
            if(l==k && r==k){
                ms++;
            }
            else if(l==k){
                ls++;
            }
            else if(r==k){
                rs++;
            }
        }
        if(ms>0){
            cout<<"YES"<<endl;
        }
        else if(ls>0 && rs>0){
            cout<<"YES"<<endl;
        }
        else
            cout<<"NO"<<endl;
    }
    return 0;
}