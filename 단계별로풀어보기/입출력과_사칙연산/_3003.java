package 단계별로풀어보기.입출력과_사칙연산;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _3003 {
    //킹, 퀸, 룩, 비숏, 나이트, 폰
    public static void main(String[] arg) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] answerPiece = {1, 1, 2, 2, 2, 8};
        int[] piece = new int[6];
        String answer = "";

        for(int i = 0; i < 6; i++){
            piece[i] = Integer.parseInt(st.nextToken());
            answer += String.valueOf(answerPiece[i] - piece[i]) + " ";
        }
        System.out.println(answer);
    }
}
