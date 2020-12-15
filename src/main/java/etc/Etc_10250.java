package etc;

import java.util.Scanner;

public class Etc_10250 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        while (testCase-- > 0){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int room = (int) Math.ceil((double)n / (double)h);
            int floor = n - (h * (room-1));

            System.out.println(5%6);
            System.out.printf("%d%02d\n",floor, room);
            System.out.println(String.format("%d%02d", (n-1)%h+1, (n-1)/h+1));
        }

    }
}
