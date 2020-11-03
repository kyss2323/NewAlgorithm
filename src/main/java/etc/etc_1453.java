package etc;


import java.util.Arrays;
import java.util.Scanner;

public class etc_1453 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean[] isOccupied = new boolean[100];
        int rejectCnt = 0;

        Arrays.fill(isOccupied, false);

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int seat = sc.nextInt();
            seat--;

            if(isOccupied[seat])
                rejectCnt++;
            else
                isOccupied[seat] = true;

        }
        System.out.println(rejectCnt);

    }
}
