package HangHae99.Marathon;

public class 이상한_문자_만들기 {
        public static void main(String[] args) throws Exception{
        String s = "try hello world";

        System.out.println(solution(s));

    }
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char ch;
        int index= 0;
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if(ch == 32){
                sb.append(ch);
                index = 0;
                continue;
            }
            if(index%2==0){
                if(ch<97){
                    sb.append(ch);
                }else{
                    sb.append((char)(ch-32));
                }

            }else{
                if(ch>=97){
                    sb.append(ch);
                }else{
                    sb.append((char)(ch+32));
                }
            }
            index++;
            
        }
        String answer = sb.toString();
        return answer;
    }
}
