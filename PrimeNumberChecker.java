package AssignmentTask_1;

import java.util.Scanner;

class PrimeNumberChecker{
    public static void main(String[] args){
    	
     while(true) {
    	
      int n,count=0;
      
      System.out.print(Constant.ENTER_NUMBER);
      Scanner sc = new Scanner(System.in);
      n=sc.nextInt();
      
      for(int i=1; i<=n; i++){
        if(n%i==0){
            count++;
        }
      }
      if(count==2)
        System.out.println("It is Prime number.");
      else
        System.out.println("It is not Prime number");
     }
    }
}