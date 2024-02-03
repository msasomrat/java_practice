#include<bits/stdc++.h>
using namespace std;
int comp(int const &i, int const &j) {
    return i > j;
}

int main()
{
    int n ;
    cin>>n;
    while(n--)
    {
        int p, k, sum=0;
        cin>>p>>k;
        int arr1[p], arr2[p];
        for (int i = 0; i < p; i++){
            cin >> arr1[i] ;
        }
        for (int i = 0; i < p; i++){
            cin >> arr2[i];
        }
        sort(arr1, arr1+p);
        sort(arr2, arr2+p, comp);
        for (int i = 0; i < p; i++)
        {
            if (k==0){
                break;
            }
            if (arr1[i]< arr2[i]){
                swap(arr1[i], arr2[i]);
                k--; 
            }
             
        }
        
        for (int i = 0; i < p; i++)
        {
            sum+= arr1[i];
            //cout<<arr1[i]<<" ";
        }
        //cout<<endl;

        /*for (int i = 0; i < p; i++)
        {
            //sum+= arr1[i];
            cout<<arr2[i]<<" ";
        }
        */
        cout<<sum<<endl;
        
    }
    return 0;
}