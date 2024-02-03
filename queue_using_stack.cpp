#include<bits/stdc++.h>
using namespace std;

stack<int> st1, st2;

void push(int x)
{
    while (!st1.empty())
    {
        st2.push(st1.top());
        st1.pop();
    }
    st1.push(x);
    while (!st2.empty())
    {
        st1.push(st2.top());
        st2.pop();
    }
    
    
}

int main()
{
    push(1);
    push(2);
    push(3);
    push(5);
    while (!st1.empty())
    {
        cout<<st1.top();
        st1.pop();
    }
    
}