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
        int p,q, count=0;
        cin>>p>>q;
        if ((p>0 && q<0) || (p<0 && q>0) ){
            cout<<abs(p)*2+ abs(q)*2<<endl;
            for (int i = min(p,q); i <= max(p,q); i++) {
                cout<<i<<" ";
            }
            for (int i =  max(p,q)-1; i >min(p,q); i--){
                cout<<i<<" ";
            }
            cout<<endl;
            
        }
        if (p<0 && q<0)
        {
            cout<<abs(abs(p)-abs(q))*2<<endl;
            for (int i = min(p,q); i <= max(p,q); i++) {
                cout<<i<<" ";
            }
            for (int i =  max(p,q)-1; i >min(p,q); i--){
                cout<<i<<" ";
            }
            cout<<endl;
            
        }
        if (p>0 && q>0)
        {
            cout<<abs(p-q)*2<<endl;
           cout<<abs(abs(p)-abs(q))*2<<endl;
            for (int i = min(p,q); i <= max(p,q); i++) {
                cout<<i<<" ";
            }
            for (int i =  max(p,q)-1; i >min(p,q); i--){
                cout<<i<<" ";
            }
            cout<<endl; 
        }
        
        
        
        /*cout<<abs(p)*2+ abs(q)*2<<endl;
        //int p1=max(p,q);
        for (int i = min(p,q); i <=max(p,q); i++)
        {
            cout<<i<<" ";
           // count++;
        }
        for (int i =max(p,q)-1 ; i >min(p,q) ; i--)
        {
            cout<<i<<" ";
           // count++;
        }
        //cout<<count<<endl;
        /*for (;count<=(abs(p)*2+ abs(q)*2);)
        {
            cout<<"0"<<" ";
            count++;
        }
        */
       // cout<<endl;
        
        
        
    }
    return 0;
}