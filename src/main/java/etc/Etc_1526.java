package etc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Etc_1526 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int targetNum;
        int max = 0;

        queue.add(4);
        queue.add(7);

        targetNum = sc.nextInt();

        while (!queue.isEmpty()){
            int el = queue.poll();

            if(el > targetNum)
                continue;

            if(el > max)
                max = el;
            queue.add(el * 10 + 4);
            queue.add(el * 10 + 7);
        }

        System.out.println(max);
    }
}
