#include<bits\stdc++.h>
using namespace std;

struct Node
{
    int data;
    Node* next;
};
Node* head = NULL;
void insert(int item)
{
    Node* temp = new Node;
    temp->data = item;
    temp->next= head;
    head = temp;
}

void display(Node* head)
{
   struct Node* ptr;
   ptr= head;
   while(head!=NULL)
   {
    cout<<head->data<<" ";
    head= head->next;
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
    display(head);
    return 0;
    
}