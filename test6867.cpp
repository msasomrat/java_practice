#include<bits/stdc++.h>
using namespace std;
void func_(int n)
{
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        arr[i]=i+10;
        cout<<arr[i]<<" ";
    }
    
}
int main()
{
    int n;
    cin>>n;
    func_(n);

}

