package 알고리즘스터디.수학;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class _1193 {
    //분수찾기
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int i = (int)Math.sqrt(X*2);
        if(X*2 - (int)Math.pow(i, 2) > i){
            i++;
        }
        i--;
        int distence = (1+i)*i/2;
        
        int dif = X - distence-1;
        //위 연산은 while문 통과시 이미 다음겹을 보고있기 때문에 보정이 필요
        if((i)%2 == 0){
            System.out.println((i - dif +1)+ "/" + (1 + dif));
        }else{
            System.out.println( (1 + dif) + "/" + (i - dif+1));
        }

        
    }

}


