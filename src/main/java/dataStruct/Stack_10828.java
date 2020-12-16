package dataStruct;

import java.util.Scanner;

public class Stack_10828 {
    static class Stack{
        private int[] data;
        private int stackSize;
        private int top;

        public Stack(int stackSize){
            this.data = new int[stackSize];
            this.stackSize = stackSize;
            top = -1;
        }
        public void push(int data){
            this.data[++top] = data;
        }
        public int size(){
            return this.top + 1;
        }
        public int empty(){
            return this.size() == 0? 1 : 0;
        }
        public int pop(){
            if(top == -1)
                return -1;
            return this.data[top--];
        }
        public int top(){
            if(top == -1)
                return -1;
            return data[top];
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cmdNum = Integer.parseInt(sc.nextLine());
        Stack_10828.Stack stack = new Stack_10828.Stack(cmdNum);

        StringBuilder result = new StringBuilder();
        while(cmdNum-- > 0){
            String[] input = sc.nextLine().split(" ");
            if(input[0].equals("push"))
                stack.push(Integer.parseInt(input[1]));
            else if(input[0].equals("pop"))
                result.append(stack.pop());
            else if(input[0].equals("size"))
                result.append(stack.size());
            else if(input[0].equals("top"))
                result.append(stack.top());
            else
                result.append(stack.empty());
            if(!input[0].equals("push"))
                result.append("\n");
        }
        System.out.print(result);
    }
}
