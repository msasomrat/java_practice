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
        int n, count1=0,count=0;
        cin>>n;
        while(n--)
        {
            int a;
            cin>>a;
            if(a==1){
                count1++;
            }
            if(a==2){
                count++;
            }
        }
        if (count%2==0 && count1%2==0)
        {
            cout<<"YES"<<endl;
            continue;
        }
        else if(count%2==1 && (count1-2)%2==0 && count1>=2){
            cout<<"YES"<<endl;
            continue;
        }
        else
            cout<<"NO"<<endl;       
        
    }
    return 0;
}
