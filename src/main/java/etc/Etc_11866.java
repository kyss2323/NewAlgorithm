package etc;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Etc_11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        int n = sc.nextInt();
        int k = sc.nextInt();

        for(int i=0;i<n;i++)
            q.add(i+1);

        StringBuilder result = new StringBuilder();
        result.append("<");
        for(int i=1;q.size() != 0;i++){
            int front = q.poll();
            System.out.println(front);
            if(i % k == 0){
                result.append(front);
                if(q.size() != 0)
                    result.append(", ");
                continue;
            }
            q.add(front);

        }
        result.append(">");
        System.out.println(result);

    }
}
