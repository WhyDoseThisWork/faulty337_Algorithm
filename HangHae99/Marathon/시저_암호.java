package HangHae99.Marathon;

public class 시저_암호 {
    public static void main(String[] args) {
        System.out.println(solution("a B z", 4));
    }

    public static String solution(String s, int n) {
        String answer = "";
        char temp;
        for(int i = 0; i < s.length(); i++){
            temp = s.charAt(i);
            if(temp == 32){
                answer += " ";
                continue;
            }
            if(temp >= 97){
                answer += (char)((s.charAt(i)+n-97)%26 + 97);
                //97 ~ 122

            }else{
                answer += (char)((s.charAt(i)+n-65)%26 + 65);
            }
            
        }
        
        return answer;
    }
}
