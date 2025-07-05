import java.util.ArrayList;
import java.util.Collections;

public class Section {
    public static void main(String[] args) {

        Section sn = new Section();
        
        
        ArrayList<ArrayList<Integer>> bl = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> brr = new ArrayList<>();
        ArrayList<Integer> crr = new ArrayList<>();

        for(int i=1;i<=5;i++){
            arr.add(i*1);
            brr.add(i*2);
            crr.add(i*3);
        }

        bl.add(arr);
        bl.add(brr);
        bl.add(crr);

        

        for(int i = 0;i<bl.size();i++){
            ArrayList<Integer> cl =  bl.get(i);

            for(int j=0;j<cl.size();j++){
                System.out.print(cl.get(j) + " ");
            }

            System.out.println();
        }
    }
}
