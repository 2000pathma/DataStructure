##Stack Implementation using List in python
##create a stack
def createStack():
  stack=[]
  return stack

##check the stack is empty
def isEmpty(stack):
  return len(stack)==0

##Insert element to stack
def push(stack,item):
  stack.append(item)
  print("Pushed Item: "+item)

##Delete element from stack
def pop(stack):
  if(isEmpty(stack)):
    return "Stack is Empty"
  else:
    return stack.pop()

##Main function
stack=createStack()
push(stack,str(11))
push(stack,str(12))
push(stack,str(13))
print("Stack: "+str(stack))
print("Popped Item: "+pop(stack))
print("Stack after Popping: "+str(stack))