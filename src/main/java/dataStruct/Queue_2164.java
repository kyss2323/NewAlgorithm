package dataStruct;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_2164 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> card = new LinkedList<>();

        int cardNum = sc.nextInt();

        for(int i=0;i<cardNum;i++){
            card.add(i+1);
        }

        while(card.size() != 1){
            card.poll();
            card.add(card.poll());
        }
        System.out.println(card.peek());

    }
}
