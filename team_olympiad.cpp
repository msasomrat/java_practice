#include<bits/stdc++.h>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int n, pr = 0, ma = 0, py = 0;
    cin>>n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
        if (arr[i]==1){
            pr++;
        }
        if (arr[i]==2){
            ma++;
        }
        if (arr[i]==3){
            py++;
        }

    }
    int team= min({pr, ma, py});
    cout<<team<<endl;
    if (team==0){
        return 0;
    }
    else
    {
        int p=0, m=0, pe=0;
        while(team--)
        {
            for (int i = p; i < n; i++){
                if (arr[i]==1){
                    cout<<i+1<<" ";
                    p=i+1;
                    break;
                }
                
            }
            for (int i = m; i < n; i++){
                if (arr[i]==2){
                    cout<<i+1<<" ";
                    m=i+1;
                    break;
                }
                
            }
            for (int i = pe; i < n; i++){
                if (arr[i]==3){
                    cout<<i+1<<" ";
                    pe=i+1;
                    break;
                }
                
            }
            cout<<endl;
            
        }
    }
return 0;   
}
