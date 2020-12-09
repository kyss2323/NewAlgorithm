package etc;

import java.util.Scanner;

public class Math_2609 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = Math.min(a,b);
        int maxGdc = Integer.MIN_VALUE;
        int minLcm;

        for(int i=1;i<=min;i++){
            if(a%i == 0 && b%i==0){
                if(i > maxGdc)
                    maxGdc = i;
            }
        }
        minLcm = (a/maxGdc) * (b/maxGdc) * maxGdc;

        System.out.println(maxGdc);
        System.out.println(minLcm);
    }
}
