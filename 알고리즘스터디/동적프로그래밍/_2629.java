package 알고리즘스터디.동적프로그래밍;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class _2629 {
    //양팔 저울

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Set<Integer> pos = new HashSet<>();
        pos.add(0);
        int weightSize = Integer.parseInt(br.readLine());
        int[] weight = new int[weightSize];
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < weightSize; i++){
            weight[i] = Integer.parseInt(st.nextToken());
        }
        for(int i : weight){
            list = new ArrayList<>();
            for(int n : pos){
                list.add(Math.abs(n+i));
                list.add(Math.abs(n-i));
            }
            pos.addAll(list);
        }


        int beadSize = Integer.parseInt(br.readLine());
        int bead;
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < beadSize; i++){
            bead = Integer.parseInt(st.nextToken());
            if(pos.contains(bead)){
                sb.append("Y ");
            }else{
                sb.append("N ");
            }
        }
        System.out.println(sb);


    }

}