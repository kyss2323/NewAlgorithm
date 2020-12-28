package etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Etc_1012_DFS {
    public static int[] dx = {0, -1, 1, 0};
    public static int[] dy = {1, 0, 0, -1};
    public static int n,m,k;
    public static int[][] visited, filed;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        while(testCase-- > 0){
            String[] factors = br.readLine().split(" ");
            m = Integer.parseInt(factors[0]);
            n = Integer.parseInt(factors[1]);
            k = Integer.parseInt(factors[2]);
            visited = new int[n][m];
            filed = new int[n][m];
            int count = 0;
            //배추밭 초기화
            while (k-- > 0) {
                String[] input = br.readLine().split(" ");
                filed[Integer.parseInt(input[1])][Integer.parseInt(input[0])] = 1;
            }


            //배추밭 탐색
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(visited[i][j] == 0 && filed[i][j] == 1){
                        //지렁이 추가
                        count++;

                        dfs(i, j);
                    }
                }
            }
            System.out.println(count);

        }
    }
    public static void dfs(int y, int x){
        //방문 여부 체크
        visited[y][x] = 1;

        //순환 호출 dfs
        for(int i=0;i<4;i++){
            int ax = x + dx[i];
            int ay = y + dy[i];

            if(ax < 0 || ay < 0 || ax>=m || ay >= n)
                continue;

            if(filed[ay][ax] == 0 || visited[ay][ax] == 1)
                continue;

            dfs(ay, ax);
        }

    }
}
