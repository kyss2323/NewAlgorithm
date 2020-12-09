package etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Etc_2751 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);
        StringBuffer stringBuffer = new StringBuffer();
        for(int i: list)
            stringBuffer.append(i+"\n");
        System.out.print(stringBuffer);

    }
}
