package 알고리즘스터디.수학;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class _1193 {
    //분수찾기
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int distence = 0;
        int i = 0;
        while(distence < X){
            distence += i++;
        }
        
        int dif = X - (distence - (i -1));
        if((i-1)%2 == 1){
            System.out.println((i-1) - (dif-1) + "/" + dif);
        }else{
            System.out.println( dif + "/" + ((i-1)-(dif-1)));
        }

        
    }

}


