import java.util.Arrays;

public class Tip {
    public static void main(String[] arg) throws Exception{
        String str = "1 2 3 4 5 6 7";
        strToIntArray(str);
    }
    
    public static int[] strToIntArray(String str){
        return Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    
}
