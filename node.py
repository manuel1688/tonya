# combines the use cases of a stack and a queue!
# Stack the last-in first-out (LIFO)  
# Queue the first-in first-out (FIFO)

# Node
# Linked list
class Node:
  def __init__(self,value,next_node=None):
    self.value = value
    self.next_node = next_node

  def get_value(self):
    return self.value

  def get_next_node(self):
    return self.next_node

  def set_next_node(self,next_node): 
    self.next_node = next_node

yacko = Node("likes to yak")
wacko = Node("has a penchant for hoarding snacks")
dot = Node("enjoys spending time in movie lots")

yacko.set_link_node(dot)
dot.set_link_node(wacko)

dots_data = yacko.get_link_node().get_value()
wackos_data = dot.get_link_node().get_value()
print(dots_data)
print(wackos_data)