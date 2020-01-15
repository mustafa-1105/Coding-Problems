import java.util.Scanner;

public class BookletPrinting {
    public static void main (String[]args) throws Exception  {
        Scanner sc = new Scanner(System.in);
        int pages=sc.nextInt();
        StringBuilder sb=new StringBuilder("");

        int currSheet=1;
        boolean leftSide=true;
        int actualPage=pages;
        if (pages%4!=0) {
            actualPage+=(4-pages%4);
        }
        if (pages==1) {
            System.out.println("s1,front,blank,1");
        } else {
            for (int i=1;i<=actualPage/2;i++) {
                sb.append("s");
                sb.append(currSheet);
                sb.append(",");
                if (leftSide) {
                    sb.append("front,");
                    if (actualPage-i+1<=pages) {
                        sb.append(actualPage-i+1);
                    } else {
                        sb.append("blank");
                    }
                    sb.append(",");
                    sb.append(i);
                } else {
                    sb.append("back,");
                    sb.append(i);
                    sb.append(",");
                    if (actualPage-i+1<=pages) {
                        sb.append(actualPage-i+1);
                    } else {
                        sb.append("blank");
                    }
                    currSheet++;
                }
                leftSide=!leftSide;
                sb.append("\n");
            }
            System.out.print(sb.toString());
        }
    }
}
