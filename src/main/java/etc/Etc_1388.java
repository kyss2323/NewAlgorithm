package etc;

import java.util.Arrays;
import java.util.Scanner;

public class Etc_1388 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); //flash

        char[][] tiles = new char[n][m];

        for(int i=0;i<n;i++){
            String inLine = sc.nextLine();
            for(int j=0;j<m;j++){
                tiles[i][j] = inLine.charAt(j);
            }

        }

        int rowTileCnt = 0;
        int verticalTileCnt = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                char currentTile = tiles[i][j];

                if(currentTile == '-'){
                    rowTileCnt++;
                    if(j!=0 && tiles[i][j-1]=='-')
                        rowTileCnt--;
                } else if(currentTile == '|'){
                    verticalTileCnt++;
                    if(i!=0 && tiles[i-1][j]=='|')
                        verticalTileCnt--;
                }
            }

        }
        System.out.println(rowTileCnt + verticalTileCnt);

    }
}
