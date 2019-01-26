# Linked list example


# the Node class
class Node(object):
    def __init__(self, val):
        self.val = val
        self.next = None

    def get_data(self):
        return self.val

    def set_data(self, val):
        self.val = val

    def get_next(self):
        return self.next

    def set_next(self, next):
        self.next = next


# the LinkedList class
class LinkedList(object):
    def __init__(self, head=None):
        self.head = head
        self.count = 0

    def get_count(self):
        return self.count

    def insert(self, data):
        # TODO: insert a new node at the beginning of the link
        new_node = Node(data)
        new_node.set_next(self.head)  # set pointer to be at  current head
        self.head = new_node   # move current head to new node
        self.count += 1       # increase count to 1

    def find(self, val):
        item = self.head
        while (item != None):
            if item.get_data() == val:
                return item
            else:
                item = item.get_next()
        return None

    
    def deleteAt(self, idx):
        # TODO: delete an item at given index
        if idx > self.count-1: 
            return
        if self.head == None:
            return
        else:
            tempidx = 0
            node = self.head 
            while tempidx<idx -1:
                node = node.get_next()
                tempidx +=1
            node.set_next(node.get_next().get_next())
            self.count -=1




    def dump_list(self):
        tempnode = self.head   # call tempnode is the first one
        while (tempnode != None): # if the first one exist
            print("Node: ", tempnode.get_data()) # then print the data of tempnode
            tempnode = tempnode.get_next()        # then go check to the next one


# create a linked list and insert some items
itemlist = LinkedList()
itemlist.insert(38)
itemlist.insert(49)
itemlist.insert(13)
itemlist.insert(15)
print("-----the list after inserting------")
itemlist.dump_list()

# exercise the list
#print("Item count: ", itemlist.get_count())
#print("Finding item: ", itemlist.find(13))
#print("Finding item: ", itemlist.find(73))

# delete an item
print("-----deleting item ------")
itemlist.deleteAt(0)
print("Item count: ", itemlist.get_count())
print("Finding item: ", itemlist.find(38))
itemlist.dump_list()

"""
    def find(self, val):
        # TODO: find the first item with a given value
        item = self.head   # call item is the first one = head
        while (item != None):   #if the first item is existed  (that means != None)
            if item.get_data == val: # then  check the data of that item if == the val we are looking for
                return item        # then return that item
            else:
                item.get_next()    # otherwise go to the next one and back to the loop

        return None
"""