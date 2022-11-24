package HangHae99.algorithm_test.Triangular_Output;

public class Main {
    public void solution(int star) {
        StringBuilder sb = new StringBuilder();
        String starStr;
        for(int i = 1; i <= star; i++){
            starStr = " ".repeat(star-i) + "*".repeat((i*2)-1) + " ".repeat(star-i);
            sb.append(starStr + "\n");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Main method = new Main();
        int star = 9;
        method.solution(star);
    }
}