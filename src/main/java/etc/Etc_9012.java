package etc;

import java.util.Scanner;
import java.util.Stack;

public class Etc_9012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int testCase = Integer.parseInt(sc.nextLine());
        Stack<Character> psStack;

        first:for(int i=0;i<testCase;i++){
            String psStr = sc.nextLine();
            psStack = new Stack<>();

            for(int k=0;k<psStr.length();k++){
                if(psStr.charAt(k) == '(')
                    psStack.push(psStr.charAt(k));

                else {
                    if(psStack.empty()) {
                        System.out.println("NO");
                        continue first;
                    }
                    psStack.pop();
                }
            }
            if(psStack.empty())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
