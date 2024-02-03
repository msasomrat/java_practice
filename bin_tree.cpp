#include<bits/stdc++.h>
using namespace std;
struct Node
{
    int data;
    Node *left, *right;
};

Node* newNode(int data)
{
    Node* temp= new Node();
    temp-> data= data;
    temp->left= temp-> right =NULL;
    return temp;
}
Node* Tree(Node* temp, int data)
{
    if (temp == NULL)
    {
        return newNode(data);
    }
    if (data< temp->data)
    {
        temp->left = Tree(temp->left, data);
    }
    
    else
        temp->right = Tree(temp->right, data);
    
    return temp;
}
void display(struct Node* root)
{
    if(!root)
    return;
        display(root->left);
        cout<<root->data<<" ";
        display(root->right);
}
void insert(struct Node* root, int value)
{
    queue<struct Node*> q;
    q.push(root);
    while(!q.empty())
    {
        struct Node* root = q.front();
        q.pop();
    
    if (!root-> left)
    {
        root->left = newNode(value);
    }
    else
        q.push(root->left);
    
    if (!root->right) {
            root->right = newNode(value);
            break;
        } else
            q.push(root->right);
    }
}

int main()
{
    int n;
    Node* root= new Node;
    root=NULL;
    int size;
    cout<<"Enter the size ";
    cin>>size;
    int arr[size];
    for (int i = 0; i < size; i++)
    {
        cin>>arr[i];
    }
    for (int i = 0; i < size; i++)
    {
        root= Tree(root, arr[i]);
    }
    //cout<<"Enter the element to be inserted : ";
    //cin>>n;
    //insert(root, n);
    //<<"After insertion"<<endl;
    display(root);
   // cout<<endl;
 return 0;   
}
