# Fractional Knapsack using Python 3
# Design Analysis and Algorithms Lab : Coding Competition Phase 2
# language used : Python 3
# Date : 28.04.2021


class ItemValue:
    def __init__(self, wt, val, ind):
        self.wt = wt
        self.val = val
        self.ind = ind
        self.cost = val // wt
    def __lt__(self, other):
        return self.cost < other.cost
# Author : Abhishek Sharma
class FractionalKnapSack:
    def getMaxValue(wt, val, capacity):
        iVal = []
        for i in range(len(wt)):
            iVal.append(ItemValue(wt[i], val[i], i))
        iVal.sort(reverse=True)
        totalValue = 0
        for i in iVal:
            curWt = int(i.wt)
            curVal = int(i.val)
            if capacity - curWt >= 0:
                capacity -= curWt
                totalValue += curVal
            else:
                fraction = capacity / curWt
                totalValue += curVal * fraction
                capacity = int(capacity - (curWt * fraction))
                break
        return totalValue
# driver code : Author : Abhishek Sharma    
if __name__ == "__main__":
    z = int(input())
    capacity = int(input())
    wt = list(map(int, input().strip().split()))
    val = list(map(int, input().strip().split()))
    maxValue = FractionalKnapSack.getMaxValue(wt, val, capacity)
    print(int(maxValue))
