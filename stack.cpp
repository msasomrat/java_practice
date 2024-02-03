#include<bits/stdc++.h>
using namespace std;

int main()
{
    stack<double> nums;
    cout<<" Is the stack Empty"<<" ";
    if(nums.empty())
    {
        cout<<"Yes"<<endl;
    }
    else
    {
        cout<<"No"<<endl;
    }
    nums.push(2.3);
    nums.push(9.7);
    if(nums.empty())
    {
        cout<<"Yes"<<endl;
    }
    else
    {
        cout<<"No"<<endl;
    }
    
    cout<< nums.top()<< endl;
    cout<< nums.size();
    
}