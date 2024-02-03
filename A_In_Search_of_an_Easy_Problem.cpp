#include<bits/stdc++.h>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n;
    cin>>n;
    bool flag=0;
    while (n--)
    {
        int p;
        cin>>p;
        if (p==1)
        {
                flag=1;
        }
        
    }
    if(flag==1){
        cout<<"HARD"<<endl;

    }
    else{
        cout<<"EASY"<<endl;
    }
    return 0;
    
}