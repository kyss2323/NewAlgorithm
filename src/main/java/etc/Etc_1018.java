package etc;

import java.util.Scanner;

public class Etc_1018 {
    private static final char[][] whiteFirst = {
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
    };
    private static final char[][] blackFirst = {
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
    };
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();

        int min = Integer.MAX_VALUE;

        char[][] board = new char[row][col];

        for(int r=0;r<row;r++){
            String rowStr = sc.nextLine();
            for(int c=0;c<col;c++){
                board[r][c] = rowStr.charAt(c);
            }
        }

        for(int r=0;r<row-7;r++){
            for(int c=0;c<col-7;c++){
                int cnt;
                //calc black first cnt
                cnt = calcBoard(r, c, board,blackFirst);
                min = Math.min(min, cnt);

                //calc white first cnt
                cnt = calcBoard(r, c, board, whiteFirst);
                min = Math.min(min, cnt);
            }
        }

        System.out.println(min);
    }

    private static int calcBoard(int  r, int c, char[][] board, char[][] baseBoard) {
        int cnt = 0;
        for(int i=r;i<r+8;i++){
            for(int k=c;k<c+8;k++){
                if(baseBoard[i-r][k-c] != board[i][k])
                    cnt++;
            }
        }
        return cnt;
    }

}
