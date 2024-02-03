#include<bits/stdc++.h>
using namespace std;

struct Node
{
    int data;
    struct Node* next;
};
void insertAtEnd(struct Node** head_ref, int new_data)
{
    struct Node* new_node = new Node();
    struct Node* last = *head_ref;
    new_node->data = new_data;
    new_node->next = NULL;
    if (*head_ref == NULL)
    {
        *head_ref = new_node;
        return;
    }
    while(last->next != NULL)
    {
        last = last->next;
    }
    last->next = new_node;
    return;
    
}
void printlist( struct Node* ptr)
{
    int count=0;
    while (ptr!= NULL)
    {
        count++;
        cout<< ptr->data<<" ";
        ptr = ptr->next;
    }
    cout<<endl;
    cout<<count;
}

int main()
{
    struct Node* head = NULL;
    cout<<"Enter Q for exist"<<endl;
    while (1)
    {
        string s;
        cin>>s;
        if (s[0] == 'Q' || s[0] == 'q')
        {
            break;
        }
        else
        {
            int n= stoi(s);
            insertAtEnd(&head, n);
        }
        
        
    }
    cout<<"Linked List"<<endl;
    printlist(head);
    
}