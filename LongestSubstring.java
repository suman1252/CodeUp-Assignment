/***
 * Suman Kumari
 * 03\09\2024
 * 
 * Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without repeating characters.
*/

package AssignmentTask_1;

import java.util.Scanner;

public class LongestSubstring {
	
	//constant String string = "Enter a String";
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
        
        System.out.print(Constant.ENTER_STRING);
        String s = scanner.nextLine();
        
        int start = 0, end = 0, maxLength = 0;
        int[] charCount = new int[128];
        
        while (end < s.length()) {
            charCount[s.charAt(end)]++;
            
            while (charCount[s.charAt(end)] > 1) {
                charCount[s.charAt(start)]--;
                start++;
            }
            
            maxLength = Math.max(maxLength, end - start + 1);
            
            end++;
        }
        
        System.out.println(maxLength);
        
        }
    }
}