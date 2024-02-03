#include<bits/stdc++.h>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int t;
    cin>>t;
    while(t--)
    {
        int n, count1=0,count=0,sum=0;
        cin>>n;
        int a;
        for (int i = 0; i < n; i++)
        {
            cin>>a;
            sum+=a;
            if(a==1){
                count1++;
            }
            if(a==2){
                count++;
            }
        }
        if (n==1)
        {
            cout<<"NO"<<endl;
            continue;
        }
        
        if(n%2==1 ){
            if (sum%2==0 && (count1%2==0 && count%2==1&& count1>0)){
                cout<<"YES"<<endl;
                continue;
            }
            
        }
        else if(n%2==0 ){
            if (sum%2==0 && (count1%2==0 && count%2==0)){
                cout<<"YES"<<endl;
                continue;
            }
            /*else if (sum%2==1 && count1==count && count1>1 && count>1){
                cout<<"YES"<<endl;
                continue;
            }
            */
        }
        cout<<"NO"<<endl;
            
        
    }
    return 0;
}
