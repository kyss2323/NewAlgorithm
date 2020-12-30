package etc;

import java.util.Scanner;

public class Etc_1074 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();

        int indexR = r, indexC = c;
        int count = 0;

        while(n != 0) {
            Double zSize = Math.pow(2, n) * Math.pow(2, n);
            int offset = (int) (zSize / 4);

            int halfSize = (int) (Math.pow(2, n) / 2);

            if (indexR - halfSize >= 0) {
                indexR = indexR - halfSize;
                count += offset * 2;
            }
            if (indexC - halfSize >= 0) {
                indexC = indexC - halfSize;
                count += offset;
            }
            n--;
        }
        System.out.println(count);

    }
}
