package etc;

import java.util.Scanner;

public class Special_1359 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        double percentage = 0.0;
        while(m >= k){
            if(n-m < m-k){
                k++;
                continue;
            }
            double c = calCombination(m,k) * calCombination(n-m, m-k);
            double p = calCombination(n,m);

            percentage += c/p;
            k++;
        }
        System.out.println(percentage);
    }

    /* 조합 확률을 구하는 메서드 */
    public static int calCombination(int n, int r){
        int p = 1;
        int c = 1;
        while(r > 0){
            c *= n--;
            p *= r--;
        }
        return c/p;
    }
}
