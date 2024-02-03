#include<bits/stdc++.h>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n;
    cin>>n;
    int count1=0, count2=0,count3=0,count4=0,count=0;
    while (n--){
        int x;
        cin>>x;
        if (x==1){
            count1++;
        }
        if (x==2){
            count2++;
        }
        if (x==3){
            count3++;
        }
        if (x==4){
            count4++;
        }   
    }
    count +=count4;
    count += count3;
    count1 = count1- count3;
    if(count1 < 0){
        count1 =0;
    } 
    if (count2%2 == 0){
        count2= count2/2;
        count += count2;
    }
    else{
        count2 = count2/2+1;
        count += count2;
        count1 = count1-2;
        if(count1 < 0){count1 = 0;}  
    }
    count1 = ceil(count1/4.0);
    count +=count1;
    cout<<count;
    return 0;      
}