/**
 * Created by mustafa on 18/6/16.
 */

//Problem Statement - https://mail.google.com/mail/u/0/#search/bleatrix/15427d962fca65ff

import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;



public class Bleatrix_CodeJam {

    public static void main(String[] args) {

        Set<Integer> intvalues = new HashSet<Integer>();
        Set<Character> track = new HashSet<Character>();

        int cases=0,i,val,tempval=0;
        String strval;

        DataInputStream in;

        for (int index: intvalues) {
            System.out.println(index);
        }

        try {

            in = new DataInputStream(System.in);
            cases = Integer.parseInt(in.readLine());

            for(i=0;i<cases;i++) {

                strval = in.readLine();
                val=Integer.parseInt(strval);
                if(val==0) {
                    System.out.println("case #"+i+1+": INSOMANIA");
                }

                else {

                    while(track.size()<10) {
                        tempval=tempval+val;
                        strval=String.valueOf(tempval);

                        for(int size=0;size<strval.length();size++) {
                            track.add(strval.charAt(size));
                        }
                    }
                    System.out.println(tempval);
                }
            }
        }
        catch(Exception e) {}
    }
}
