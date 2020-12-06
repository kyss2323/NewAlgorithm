package etc;

import java.util.Scanner;

public class Etc_1920 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] listA = new int[n];

        for(int i=0;i<n;i++)
            listA[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] listB = new int[m];

        for(int i=0;i<m;i++)
            listB[i] = sc.nextInt();

        for(int i=0;i<m;i++){
            boolean c = false;
            for(int k=0;k<n;k++){
                if(listB[i] == listA[k]){
                    c = true;
                    break;
                }
            }
            if(c)
                System.out.println(1);
            else
                System.out.println(0);
        }

    }
}
