package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10807 {
    //개수 세기

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String st = br.readLine();
        String V = br.readLine();
        int answer = 0;

        for(String num : st.split(" ")){
            if(V.equals(num)){
                answer++;
            }
        }
        System.out.println(answer);

    }
}