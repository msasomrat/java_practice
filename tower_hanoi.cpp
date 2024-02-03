#include<bits/stdc++.h>
using namespace std;
void hanoi_tower(int n, char first, char third, char second)
{
    if (n==0)
    {
        return;
    }
    
        hanoi_tower(n-1, first, second, third);
        cout<<"Move disk"<< " From "<< first<< " to "<< third <<endl;
        hanoi_tower(n-1, second, third, first);
    
    
    
}
int main()
{
    int n;
    cin>>n;
    hanoi_tower(n, 'A', 'C', 'B');
}