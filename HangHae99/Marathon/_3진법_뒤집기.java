package HangHae99.Marathon;


public class _3진법_뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution(125));
    }

    public static int solution(int n) {
        StringBuilder sb = new StringBuilder(Integer.toString(n, 3));
        int answer = Integer.parseInt(sb.reverse().toString(), 3);
        return answer;
    }
}
