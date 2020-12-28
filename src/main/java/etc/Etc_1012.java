package etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Etc_1012 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase-- > 0){
            int m,n,k,x,y, count = 0;
            String[] factors = br.readLine().split(" ");
            m = Integer.parseInt(factors[0]);
            n = Integer.parseInt(factors[1]);
            k = Integer.parseInt(factors[2]);

            int[][] filed = new int[n][m];
            for(int i=0;i<k;i++) {
                String[] inputXY = br.readLine().split(" ");
                filed[Integer.parseInt(inputXY[1])][Integer.parseInt(inputXY[0])] = 1;
            }

            for(int i=0;i<n;i++) {
                for (int j = 0; j < m; j++) {
                    // �翡�� 1�� ���� �ڸ��� ã��
                    if (filed[i][j] == 1) {
                        //�����̰� ������ ��Ƹӱ�
                        filed[i][j] = 2;

                        //������ ���� 1�� �ø�
                        count++;

                        //Ȯ��
                        boolean extend;
                        do{
                            extend = false;
                            for(int r=0;r<n;r++){
                                for(int c=0;c<m;c++){
                                    if(filed[r][c] == 2) {
                                        if (c < m - 1 && filed[r][c + 1] == 1) {filed[r][c + 1] = 2; extend = true;}
                                        if(c > 0 && filed[r][c-1] == 1) {filed[r][c-1] = 2; extend = true;}
                                        if(r < n-1 && filed[r+1][c] == 1) {filed[r+1][c] = 2; extend = true;}
                                        if(r > 0 && filed[r-1][c] == 1){filed[r-1][c] =2; extend = true;}
                                    }
                                }
                            }
                        }while(extend);

                    }

                    System.out.print(filed[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println(count);
        }
    }
}
