import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2588 {
    //곱셈
    public static void main(String[] arg) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int firstNum = Integer.parseInt(br.readLine());
        String secondNumStr = br.readLine();
        int[] secondNum = Arrays.stream(secondNumStr.split("")).mapToInt(Integer::parseInt).toArray();;
        System.out.println(firstNum * secondNum[2]);
        System.out.println(firstNum * secondNum[1]);
        System.out.println(firstNum * secondNum[0]);
        System.out.println(firstNum * Integer.parseInt(secondNumStr));


    }
    
}
