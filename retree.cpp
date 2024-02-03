#include<bits/stdc++.h>
using namespace std;
void search(int n)
{
    if(n==0)
    {
        return;
    }
    cout<<n<<endl;
    search(n-1);
    search(n-1);
    //cout<<n<<endl;
}

int main()
{
    search(3);
    
}