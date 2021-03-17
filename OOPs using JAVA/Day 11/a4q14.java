/*
14. Write a test program that prompts the user to enter the investment amount (e.g., 1000) and the interest rate (e.g., 9%), and print a table that displays future value for the years from 1 to 30, as shown below: 
The amount invested: 1000 
Annual interest rate: 9% 
Years Future Value 
1 1093.8 
2 1196.41 
... 
29 13467.25 
30 14730.57 
*/
// Author : Abhishek Sharma


import java.util.*; 
class Amt{
   Double x;
   Double sum=1000.0; 
   Amt(Double x){
      this.x=x;
   }
   void interest(){
      System.out.println("Years ....... future_value");
      for(int i=1;i<=30;i++){
         System.out.println(i+". ...... "+sum(x,0.09/12,i));
      }
   }
   Double sum(Double tot,double rate,int years){ 
      return x*Math.pow(1+rate,years*12);
   }
}
class q14{
   public static void main(String[] args) { 
      Amt ob=new Amt(100.0); 
ob.interest();
   }
}


/*
Output :
Years ....... future_value
1. ...... 109.38068976709839
2. ...... 119.64135293926222
3. ...... 130.86453709165366
4. ...... 143.1405333313711
5. ...... 156.56810269415706
6. ...... 171.25527068212796
7. ...... 187.32019633462298
8. ...... 204.89212282389357
9. ...... 224.1124172232252
10. ...... 245.13570781248114
11. ...... 268.1311280707507
12. ...... 293.28367736408916
13. ...... 320.7957092751521
14. ...... 350.888559548417
15. ...... 383.80432674789427
16. ...... 419.80781995281484
17. ...... 459.1886891606074
18. ...... 502.2637555363697
19. ...... 549.379560255814
20. ...... 600.9151524472612
21. ...... 657.2851386618252
22. ...... 718.9430184049334
23. ...... 786.3848325637133
24. ...... 860.1531540820313
25. ...... 940.8414529883785
26. ...... 1029.098870893479
27. ...... 1125.6354433687086
28. ...... 1231.2278122196296
29. ...... 1346.7254736101859
30. ...... 1473.057612304044
*/
