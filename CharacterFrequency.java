package AssignmentTask_1;

import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
        System.out.print(Constant.ENTER_STRING);
        String input = scanner.nextLine();
        
        String result = compressString(input);
        System.out.println("Output: " + result);
    }
    }
    
    public static String compressString(String input) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        
        for (int i = 0; i < input.length(); i++) {
            if (i == input.length() - 1 || input.charAt(i) != input.charAt(i + 1)) {
                result.append(input.charAt(i));
                result.append(count);
                count = 1;
            } else {
                count++;
            }
        }
        
        return result.toString();
    }
}
