package HangHae99.Marathon;

public class 신규_아이디_추천 {
    public static void main(String[] args) throws Exception{
        String s = "abcdefghijklmn.p";
        System.out.println(solution2(s));
    }
    public static String solution(String new_id) {

        String answer = "";
        new_id = new_id.toLowerCase();
        char c;
        for(int i = 0; i < new_id.length(); i++){
            c = new_id.charAt(i);
            if(c ==45 || c==46 || c==95|| (c >= 48 && c <=57) || (c>=65 && c <= 90) || (c >=97 &&c <= 122) ){
                answer += c;
            }
        }

        while(answer.indexOf("..") != -1){
            answer = answer.replace("..", ".");
        }
        answer = strEnd(answer);
        if(answer.isEmpty()){
            answer+='a';
        }
        if(answer.length() >= 16){
            answer = answer.substring(0, 15);
        }
        answer = strEnd(answer);
        
        if(answer.length()<=2){
            answer += (answer.charAt(answer.length()-1) + "").repeat(3-answer.length());
        }

        return answer;
    }
    public static String strEnd(String s){
        if(!s.isEmpty() && s.charAt(0) == 46){
            s = s.substring(1);
        }
        if(!s.isEmpty() && s.charAt(s.length()-1) == 46){
            s = s.substring(0, s.length()-1);
        }
        return s;
    }

    public static String solution2(String new_id){
        String answer = "";
        
        answer = new_id.toLowerCase().replaceAll("[^-_.a-z0-9]","").replaceAll("[.]{2,}", ".").replaceAll("^[.]|[.]$", "");
        System.out.println(answer);
        if(answer.length() >= 16){
            answer = answer.substring(0, 15);
        }
        if(answer.isEmpty()){
            answer += 'a';
        }
        answer = answer.replaceAll("^[.]|[.]$", "");
        if(answer.length() < 3)
        answer += (""+answer.charAt(answer.length()-1)).repeat(3-answer.length());
        return answer;
    }
}
