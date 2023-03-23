class Queue:

    def __init__(self):
        self.queue = []

    # Add an element
    def enqueue(self, item):
        self.queue.append(item)

    # Remove an element
    def dequeue(self):
        if len(self.queue) < 1:
            return None
        return self.queue.pop(0)

    # Display  the queue
    def display(self):
        print(self.queue)
   #Size of queue
    def size(self):
        return len(self.queue)

q = Queue()
print("Queue :")
q.display()
q.enqueue("Ramya")
q.enqueue("Priya")
q.enqueue("Ramesh")
q.enqueue("Pappu")
q.enqueue("Papa")
print("After Insert an element to Queue :")
q.display()

q.dequeue()

print("After removing an element")
q.display()