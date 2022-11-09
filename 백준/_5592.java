package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _5592 {
    //과제 안 내신 분..?

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] att = new boolean[31];
        for(int i = 0; i < 28; i++){
            att[Integer.parseInt(br.readLine())] = true;
        }
        for(int i = 1; i <= 30; i++){
            if(!att[i]){
                System.out.println(i);
            }
        }
    }
}