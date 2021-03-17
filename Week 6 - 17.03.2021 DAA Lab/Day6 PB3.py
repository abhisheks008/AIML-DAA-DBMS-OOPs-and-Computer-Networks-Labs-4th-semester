# Author : Abhishek Sharma
# Day6 PB3 Huffman Encoding Program solution using Python 3
# Difficulty : Medium
# Design and analysis lab week 6 - 17.03.2021


# pythonpapa
class node:
    def __init__(self, freq, symbol, left=None, right=None):
        self.freq = freq
        self.symbol = symbol
        self.left = left
        self.right = right
        self.huff = ''
# Pythonpapa
def printNodes(node, val=''):
    newVal = val + str(node.huff)
    if(node.left):
        printNodes(node.left, newVal)
    if(node.right):
        printNodes(node.right, newVal)
    if(not node.left and not node.right):
        mama.append([node.symbol,int(newVal)])
# pythonpapa
mama = []
z = int(input()) 
chars = []
chars = input().split()
freq = list(map(int, input().split()))
nodes = []
for x in range(len(chars)):
    nodes.append(node(freq[x], chars[x]))
# Author : Abhishek Sharma
while len(nodes) > 1:
    nodes = sorted(nodes, key=lambda x: x.freq)
    left = nodes[0]
    right = nodes[1]
    left.huff = 0
    right.huff = 1
    newNode = node(left.freq+right.freq, left.symbol+right.symbol, left, right)
    nodes.remove(left)
    nodes.remove(right)
    nodes.append(newNode)
printNodes(nodes[0])
# Pythonpapa ends here!
for i in range (len(chars)):
    for j in range (0,z):
        if (chars[i]==mama[j][0]):
            print ("{} = {}".format(chars[i], mama[j][1]))
            break
