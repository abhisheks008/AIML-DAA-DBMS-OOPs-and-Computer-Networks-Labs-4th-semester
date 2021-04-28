import java.util.Arrays;
import java.util.*;

// pythonpapa
public class Solution {

    private static double getMaxValue(int[] wt, int[] val,
                                    int capacity)
    {
        ItemValue[] iVal = new ItemValue[wt.length];
        // code created by pythonpapa
        for (int i = 0; i < wt.length; i++) {
            iVal[i] = new ItemValue(wt[i], val[i], i);
        }

        // pythonpapa code here using the JAVA
        Arrays.sort(iVal, new Comparator<ItemValue>() {
            @Override
            public int compare(ItemValue o1, ItemValue o2)
            {
                return o2.cost.compareTo(o1.cost);
            }
        });

        double totalValue = 0d;
        // code here by pythonpapa
        for (ItemValue i : iVal) {

            int curWt = (int)i.wt;
            int curVal = (int)i.val;

            if (capacity - curWt >= 0) {
 
                capacity = capacity - curWt;
                totalValue += curVal;
            }
            else {

                double fraction
                    = ((double)capacity / (double)curWt);
                totalValue += (curVal * fraction);
                capacity
                    = (int)(capacity - (curWt * fraction));
                break;
            }
        }

        return totalValue;
    }

    // pyhtonpapa written JAVA code!
    static class ItemValue {
        Double cost;
        double wt, val, ind;


        public ItemValue(int wt, int val, int ind)
        {
            this.wt = wt;
            this.val = val;
            this.ind = ind;
            cost = new Double((double)val / (double)wt);
        }
    }

    // pythonpapa
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int capacity = sc.nextInt();
        int[] wt = new int[10];
        int[] val = new int[10];
        for (int i=0; i<n; i++){
            wt[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){
            val[i] = sc.nextInt();
        }

        // pythonpapa driver code here
        double maxValue = getMaxValue(wt, val, capacity);
        int output = (int) maxValue;

        System.out.println(output);
    }
}
// code created by Abhishek Sharma, 2021 @abhisheks008
