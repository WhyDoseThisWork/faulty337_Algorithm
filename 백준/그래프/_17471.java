package 백준.그래프;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;

public class _17471 {
    //게리맨더링
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = -1;
        ArrayList<ArrayList<Integer>> pathList = new ArrayList<>();
        int[] local = new int[N];  
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            local[i] = Integer.parseInt(st.nextToken());
        }
        ArrayList<Integer> temp = new ArrayList<>();
        int size;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            size = Integer.parseInt(st.nextToken());
            for(int l = 0; l < size; l++){
                temp.add(Integer.parseInt(st.nextToken())-1);
            }
            pathList.add(temp);
            temp = new ArrayList<>();
        }

        //조합
        boolean[] visit = new boolean[N];
        ArrayList<Pair> c = makeCase(N, Arrays.stream(local).sum(), local);
        int check;
        for (Pair pair : c) {
            check = 0;
            check += BFS(pair.first.get(0), visit, pathList, pair, true);
            Arrays.fill(visit, false);
            for(int i = 0; i < N; i++){
                if(!pair.first.contains(i)){
                    check += BFS(i, visit, pathList, pair, false);
                    Arrays.fill(visit, false);
                    break;
                }
            }
            if(check == N){
                answer = pair.second;
                break;
            }
        }
        System.out.println(answer);
    }
    public static ArrayList<Pair> makeCase(int N, int localSum, int[] local){
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Pair> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int sum = 0;
        for(int i = 1; i< (1<<N); i++){
            for(int j=0;j<arr.length;j++){
                if((i&1<<j) > 0){
                    temp.add(arr[j]);
                }
            }
            for(int l = 0; l < temp.size(); l++){
                sum += local[temp.get(l)];
            }
            result.add(new Pair(temp, Math.abs(Arrays.stream(local).sum()-(sum*2))));
            sum = 0;
            temp = new ArrayList<>();
            
            
            
        }
        result.remove(result.size()-1);
        Collections.sort(result);

        return result;
    }

    public static Integer BFS(int x, boolean[] visit, ArrayList<ArrayList<Integer>> pathList, Pair pathCase, boolean f){
        Stack<Integer> stack = new Stack<>(); //stack이용
        stack.push(x);
        visit[x] = true;
        int value;
        int valueX;
        int size = 1;
        while(!stack.empty()){
            value = stack.pop();
            for(int i = 0; i < pathList.get(value).size(); i++){
                valueX = pathList.get(value).get(i);
                if(!(f^pathCase.first.contains(valueX)) && !visit[valueX]){
                    visit[valueX] = true;
                    stack.push(valueX);
                    size++;
                }
            }
        }
        return size;
    }
    static class Pair implements Comparable<Pair> {
        ArrayList<Integer> first = new ArrayList<>();
        int second;
        
        Pair(ArrayList<Integer> f, int s) {
            this.first = f;
            this.second = s;
        }
        
        public int compareTo(Pair p) {
            return Long.compare(second, p.second); //그냥 연산시 모호하다는 에러남;;
        }
    }

}



