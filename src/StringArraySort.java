import java.util.Arrays;

import static java.lang.String.CASE_INSENSITIVE_ORDER;

public class StringArraySort {
    public static void main(String[] args) {

        String[] names = new String[] {"Mathankumar", "Ramya", "Dhanya","dhanya","ramya"};
        Arrays.sort(names,CASE_INSENSITIVE_ORDER);
        for(String name : names){
            System.out.println(name);
        }
    }

}
