package etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Etc_1003 {
    public static void main(String[] args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(sc.readLine());

        StringBuilder builder = new StringBuilder();
        while(testCase-- > 0){
            int targetN = Integer.parseInt(sc.readLine());
            List<Integer> zeroCount = new ArrayList<>();
            List<Integer> oneCount = new ArrayList<>();

            zeroCount.add(1);
            zeroCount.add(0);

            oneCount.add(0);
            oneCount.add(1);

            for(int i=2;i<=targetN;i++){
                zeroCount.add(zeroCount.get(i-1) + zeroCount.get(i-2));
                oneCount.add(oneCount.get(i-1) + oneCount.get(i-2));
            }
            builder.append(zeroCount.get(targetN) + " " + oneCount.get(targetN)+ "\n");
        }
        System.out.print(builder);
    }
}
