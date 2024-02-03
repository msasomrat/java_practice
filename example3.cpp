#include<bits/stdc++.h>
#include<stdlib.h>
using namespace std ;


typedef struct NODE Node;

///////////////////////////////////////
// Create a Structure 
struct NODE {
    int DATA ;
    Node *NEXT ;
} ;


///////////////////////////////////////
// Create a Node 
Node *CN(int data , Node *next)
{
    Node *N = (Node*) malloc(sizeof(Node));

    N->DATA = data ;
    N->NEXT = next ;

    return N ;
}





///////////////////////////////////////
// Append data 
Node *append(Node *preNodeP , int data )
{
    if(preNodeP->DATA == NULL)
    {
        preNodeP->DATA = data;
        return preNodeP;   
    } else 
    {
        Node *app = CN(data , NULL);
        preNodeP->NEXT = app ; 
        app->DATA = data; 
        app->NEXT = NULL; 

        return app ; 
    }

}






///////////////////////////////////////
// Printing the data structure 
void printing(Node *tem2)
{
    cout<<"Position" << "\t\tData"  << "\t\tNext Position" << endl ; 
    for( ; ;)
    {
        if(tem2->NEXT == NULL)
        {
            cout << int(tem2) <<"\t\t" << tem2->DATA  << "\t\t" << int(tem2->NEXT) << endl; 
            break;  
        } else 
        {
            cout << int(tem2) <<"\t\t" << tem2->DATA  << "\t\t" << int(tem2->NEXT) << endl; 
            tem2 = tem2->NEXT;
        }
    }
}


//////////////////////////////////// 
// Traversing function 
int traversing(Node *tem)
{
    int i = 0; 
    for ( ; ; )
    {
        if(tem->NEXT!= NULL)
        {
            i++;
            tem = tem->NEXT;
        } 
        else
        {
            i++;
            break;
        }
    }
    return i; 
}






/////////////////////////////////////////////////////////////////////////////////
// Main Function 
int main ()
{
    Node *head = CN(0 , NULL);
 

    int data ; 


    // Using Append to take infinite data from user 
    Node *tem1 = head; 

    while (1)
    {
        cin >> data ; 

        if(data == -1)
            break; 
        else 
        {
            tem1 = append(tem1 , data); 
        }  

    }
    

    // Printing Data and positions 
    printing(head); 
    
   
    // traversing the data 
    int size = traversing(head);
    cout << "\n\nThe size of the linked list : " << size << endl; 
    

    // User Insertion and Deletion 
    /*
    goto repeat 
    cout << "To insert data as a apend type 1" ;
    int x ; 
    cin << x;  

    if(x==1)
    {
        
        append(tem1,data); 

    }else
    {
        cout << "You have finished your exam" ; 
    }
   */

}
