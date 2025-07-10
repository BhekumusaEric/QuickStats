import  java.util.Arrays;
import static java.lang.System.out;

public class More {
    public static void main(String[] string){
        int[] numbers = new int[100];
        out.println(Arrays.toString(numbers));
        int i = Integer.MAX_VALUE;
        out.println(i);
        int j = i + 1;
        out.println(j);
// j will roll over to -2_147_483_648

        double d = Double.MAX_VALUE;
        out.println((d));
        double o = d + d;
        out.println(o);
// o will be Infinity
    }
}
