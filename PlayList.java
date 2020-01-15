import java.util.ArrayList;
import java.util.List;

public class PlayList {

    public static int playlist(List<String> songs, int k, String q) {
        // Write your code here
        int fwd = k+1;
        int bkwd = k-1;
        int count = 0;

        while (fwd >= bkwd) {
            if (fwd == songs.size())
                fwd = 0;

            if (bkwd < 0)
                bkwd = songs.size()-1;

            count++;

            if (songs.get(fwd) == q)
                return count;
            else if (songs.get(bkwd) == q)
                return count;

            fwd++;
            bkwd--;
        }
        return -1;
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
//        list.add("dancinginthedark");
//        list.add("rio");
//        list.add("liveoak");
//        list.add("liveoak");
        list.add("wheniseeyouagain");
        list.add("borntorun");
        list.add("nothingelsematters");
        list.add("cecelia");
        //int result = playlist(list, 0, "liveoak");
        int result = playlist(list, 1, "cecelia");
        System.out.println(result);

    }
}
