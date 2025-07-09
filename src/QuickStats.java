import java.util.ArrayList;
import  java.util.Arrays;

public class QuickStats {
    public static boolean isNumeric(String val){
        if (val == null){
            return  false;
        }
        try {
            Integer.parseInt(val);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public  static void main(String[] args){
        if (args.length == 0){
            System.out.println("There are no numbers in the list");
            return;
        }

        System.out.println(args.length);
        String[] myArgs = args;
        System.out.println(Arrays.toString(myArgs));
        ArrayList<String> dynamic_lst = new ArrayList<>();
        int intTotal = 0;
        for (int counter = 0; counter < args.length; counter ++){
            System.out.println(myArgs[counter]);
            if (isNumeric((String)myArgs[counter])){
                dynamic_lst.add(myArgs[counter]);
                intTotal += Integer.parseInt(myArgs[counter]);
                continue;
            }
            dynamic_lst.add(myArgs[counter] + " (ignored)");
        }
        System.out.println(dynamic_lst);
        System.out.println("Count :" + dynamic_lst.toArray().length);
        System.out.println("Total :" + intTotal);
        System.out.println("Average :" + (float)(intTotal / dynamic_lst.toArray().length));
    }
}
