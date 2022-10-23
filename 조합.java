import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 조합 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        makeCase(N);
    }

    public static void makeCase(int N){
        int[] arr =new int[N];
        for(int i = 1; i <= N; i++){
            arr[i-1] = i;
        }
        //여기서 만들어진 배열에서 부분집합을 뽑는다.
        //꼭 연속된 숫자가 아니라 무작위 숫자여도 해당하는 배열의 부분집합을 표시

        for(int i = 1; i< (1<<N); i++){ //경우의 수는 2ⁿ만큼 나오기때문에 <<연산으로 처리
            for(int j=0;j<arr.length;j++){
                if((i&1<<j) > 0){ //1을 <<연산으로 움직여서 2의 제곱, 즉, 2진수 자리수를 만들어낸다.
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println();
        }
    }


    
}
