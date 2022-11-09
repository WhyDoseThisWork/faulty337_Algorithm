package 백준;

public class _15596 {

    long sum(int[] a){
        long ans = 0;
        for(int num : a){
            ans += num;
        }
        return ans;
    }
}
