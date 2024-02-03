#include<bits/stdc++.h>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int n;
    cin>>n;
    while(n--){
        int p, s1=2, s2=1, s3=0, s4=0;;
        cin>>p;
        if ((p/2)%2 != 0){
            cout<<"NO"<<endl;
        }
        else{
            cout<<"YES"<<endl;
            for (int i = 0; i < p/2;)
            {
                cout<<s1<<" ";
                s4+=s1;
                s1+=2;
                i++;
            }
            for (int i = 0; i < (p/2)-1;)
            {
                cout<<s2<<" ";
                s3+=s2;
                s2+=2;
                i++;
            }
            cout<<s4-s3<<endl;
            
        }
        
        
    }
    return 0;
}