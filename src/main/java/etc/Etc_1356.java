package etc;

import java.util.Scanner;

public class Etc_1356 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String num = String.valueOf(sc.nextInt());
        boolean isYoujinsu = false;
        for(int i=1;i<num.length();i++){
            int subMultiple1 = getSubMultiple(num.substring(0,i));
            int subMultiple2 = getSubMultiple(num.substring(i,num.length()));

            if(subMultiple1 == subMultiple2) {
                isYoujinsu = true;
                break;
            }
        }
        if(isYoujinsu)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
    public static int getSubMultiple(String subStr){
        if(subStr.length() == 0)
            return 0;
        int result = 1;
        for(int i=0;i<subStr.length();i++){
            result *= (Integer.parseInt(subStr.substring(i,i+1)));

        }
        return result;
    }
}
