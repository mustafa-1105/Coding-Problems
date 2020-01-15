import java.util.Scanner;

/**
 * Created by admin on 31-Dec-16.
 */
public class BattleShip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        char[][] board = new char[][]{"X..XX".toCharArray(),"X.X..".toCharArray(),".X.XX".toCharArray()};
        count = new BattleShip().countBattleships(board);
        System.out.print(count);
    }
    public int countBattleships(char[][] board) {
        int count = 0 ;
        int row = board.length;
        int col = board[0].length;
        int p,q;
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                if (board[i][j] == 'X') {
                    count++;
                    p=j;
                    while (p<col-1 && board[i][p+1] == 'X') {
                        p++;
                    }
                    q=i;
                    while (q<row-1 && board[q+1][j] == 'X') {
                        board[q+1][j] = '.';
                        q++;
                    }
                    j=p;
                }
            }
        }
        return count;
    }
}
