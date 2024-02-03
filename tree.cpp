#include<bits/stdc++.h>
using namespace std;
struct Node
{
    int data;
    struct Node *left, *right;
};

Node* newNode(int data)
{
    Node* temp = new Node;
    temp->data = data;
    temp->left = temp->right = NULL;
    return temp;
}

int main()
{
    cout<<"Enter the root"<<endl;
    int n;
    cin>>n;
    struct Node * root= newNode(n);
    cout<<"Enter the chi"<<endl;

}