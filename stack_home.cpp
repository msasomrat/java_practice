#include<stdio.h>
#include<stdlib.h>

struct node {
   int data;
   struct node *next;
};

int main(){

    struct node *head , *tail;
    struct node *top, *p;
    char ch[2], ch1[2];
    int n;

    head = NULL;
    tail = NULL;
    top = NULL;

    while(1){
      
       printf("Set the mode s-stack, q-queue\n");
       scanf("%s",ch);
       if (ch[0] == 's'){
          while(1){
             printf("\np-push , o-pop , t-top, d-display q- quit mode\n");
             scanf("%s",ch1);
             if (ch1[0] == 'p'){
                printf("Enter an integer:");
                scanf("%d",&n);
                if (top == NULL){
                    top = (struct node *)malloc(sizeof(struct node ));
                    top->data = n;
                    top->next = NULL;
                }
                else {
                   p = top;
                   top = (struct node *)malloc(sizeof(struct node ));
                   top->data = n;
                   top->next = p;     
                }
               
             }
             else if (ch1[0] == 'o'){
                if (top == NULL){
                    printf("\nStack Empty\n");
                }
                else {
                  p = top;
                  printf("Element pop out:%d\n",p->data);
                  top = top->next;
                  free(p);
               }
             }
             else if (ch1[0] == 't'){
                 if (top != NULL)
                    printf("%d\n",top->data);
                 else
                    printf("\nStack Empty\n");

             }
             else if (ch1[0] == 'd'){
                if (top == NULL){
                   printf("\nStack Empty\n");
                }
                else {
                   p = top;
                   while (p != NULL){
                      printf("%d ",p->data);
                      p = p->next;
                   }
                   printf("\n");
                }
             }
             else if (ch1[0] == 'q'){
                break;
             }
             else {
               printf("Invalid choice\n");
             }
                  
      
          }
       }
      
       else if (ch[0] == 'q'){
         
          while(1){
             printf("\n d-dequeue , e-enqueue , p-display q- quit mode\n");
             scanf("%s",ch1);
             if (ch1[0] == 'd'){
                if (head == NULL){
                    printf("\nQueue Empty\n");
                }
                else {
                  p = head;
                  printf("Element dequeued:%d\n",p->data);
                  head = head->next;
                  free(p);
               }
                                
             }
             else if (ch1[0] == 'e'){
                printf("\nEnter an integer:");
                scanf("%d",&n);
                if (head == NULL){
                    head = (struct node *)malloc(sizeof(struct node ));
                    head->data = n;
                    head->next = NULL;
                    tail = head;
                }
                else {
                   p = tail;
                   tail = (struct node *)malloc(sizeof(struct node ));
                   p->next = tail;
                   tail->data = n;
                   tail->next = NULL;     
                }

             }
             else if (ch1[0] == 'p'){
                if (head == NULL){
                   printf("\nQueue Empty\n");
                }
                else {
                   p = head;
                   while (p != NULL){
                      printf("%d ",p->data);
                      p = p->next;
                   }
                   printf("\n");
                }

             }
             else if (ch1[0] == 'q'){
                break;
             }

             else {
               printf("Invalid choice\n");
             }
                
          }
         
       }
       else {
          printf("\nInvalid choice\n");
       }
              
    }   
}