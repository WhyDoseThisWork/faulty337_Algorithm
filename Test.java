import java.util.Arrays;

public class Test {

    public static void main(String[] arg[]) throws Exception{
        String a = "0 1 2 3 4 5";
        int[] b = Arrays.stream(a.split("")).mapToInt(Integer::parseInt).toArray();
    }
    
}
