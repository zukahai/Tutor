#include<bits/stdc++.h>
using namespace std;

typedef struct stack1 *stack_pointer;

struct stack1
{
    char item;
    stack_pointer link;
};

void push(stack_pointer *top, char item)
{
    stack_pointer temp = new stack1;
    temp->item = item;
    temp->link = *top;
    *top = temp;
}
char pop(stack_pointer *top)
{
    stack_pointer temp = *top;
    char item;
    item = temp->item;
    *top = temp->link;
    delete (temp);
    return item;
}
bool is_Empty(stack_pointer top){
    if(top==NULL){
        return true;
    }
    return false;
}

#define IS_EMPTY(ptr) (!(ptr));
#define IS_FULL(ptr) (!(ptr));

typedef struct Queue *queue_pointer;
struct Queue
{
    char item;
    queue_pointer link;
};
void addQ(queue_pointer *front, queue_pointer *rear, char item){
    queue_pointer temp = new Queue;
    
    temp->item = item;
    temp->link = NULL;
    if(*front!=NULL){
        (*rear)->link=temp;
    }else{
        *front = temp;
    }
    *rear = temp;
}
char DeleteQ(queue_pointer *front){
    queue_pointer temp =*front;
    char item;
    item = temp->item;
    cout<<item;
    *front = temp->link;
    delete(temp);
    return item;
}
void Display(queue_pointer *front, queue_pointer *rear){
    queue_pointer temp = *front;
    while(temp != *rear){
        cout<<(temp)->item<<" ";
        (temp)=(temp)->link;
    }
    cout<<(temp)->item<<" ";
}

void copyStackToQueue(stack_pointer top, queue_pointer *front, queue_pointer *rear){
    while(top != NULL) {
        addQ(front, rear, pop(&top));
    }
}
int main(){
    queue_pointer front=NULL, rear = NULL;
    string str;
    getline(cin, str);
    stack_pointer top = NULL;
    for (int i = 0; i < str.length(); i++)
        push(&top, str[i]);
    copyStackToQueue(top, &front, &rear);
    Display(&front, &rear);
}
