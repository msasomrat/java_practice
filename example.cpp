#include<bits\stdc++.h>
using namespace std;
struct Node
{
    int data;
    struct Node* next;
};
struct Node* head = NULL;
void insert(int n)
{
    struct Node* new_node = new Node;
    new_node->data = n;
    new_node->next = head;
    head = new_node;
}
void display()
{
    struct Node* ptr;
    ptr= head;
    while(ptr != NULL)
    {
        cout<<ptr->data<<" ";
        ptr = ptr->next;
    }
}
int main()
{
    int n;
    cout<<"Enter the numbers of elements"<<endl;
    cin>>n;
    for (int i = 0; i < n; i++)
    {
        cout<<"Enter the element of: "<<i+1<<" ";
        int p;
        cin>>p;
        insert(p);
    }
    cout<<"The link list: "<<endl;
    display();
    return 0;
    
}