import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1008 {
    //A/B
    public static void main(String[] arg) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        double A = Double.parseDouble(input[0]);
        double B = Double.parseDouble(input[1]);
        System.out.println(A/B);
    }
}
