#include<bits/stdc++.h>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int k, l, m, n, d, count=0;
    cin>>k >>l >>m >>n >>d;
    int arr[d];
    if (k==1 || l==1 || m==1 || n==1)
    {
        cout<<d<<endl;
        return 0;
    }
    else{
    /*for (int i = 0; i < d; i++)
    {
        arr[i]=i+1;
    }
    */
    for (int i = 1; i <= d; i++)
    {
        if (i%k==0 || i%l==0 || i%m==0 || i%n==0 )
        {
            count++;
        }
        
    }

    cout<< count<<endl;
    }
    return 0;
}