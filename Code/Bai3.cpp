#include <bits/stdc++.h>
using namespace std;

typedef struct
{
    char data;
} element;

typedef struct stack1 *stack_pointer;

struct stack1
{
    element item;
    stack_pointer link;
};

void push(stack_pointer *top, element item)
{
    stack_pointer temp = new stack1;
    temp->item = item;
    temp->link = *top;
    *top = temp;
}
element pop(stack_pointer *top)
{
    stack_pointer temp = *top;
    element item;
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

int main()
{
    stack_pointer top = NULL;
    element item;
    string s;
    getline(cin,s);
    for(int i=0 ; i<s.length(); i++){
        item.data = s[i];
        push(&top, item);
    }
    while(is_Empty(top)==false){
        cout<<pop(&top).data;
    }
}
