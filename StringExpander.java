package AssignmentTask_1;

import java.util.Scanner;

public class StringExpander {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();;
        
        for(int i = 0; i<str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i)) ) {
                System.out.print(str.charAt(i));
            }
            else {
                int x = Character.getNumericValue(str.charAt(i));
                for(int j=1; j<x; j++ ) {
                    System.out.print(str.charAt(i-1));
                }
            }
        }
    }
}