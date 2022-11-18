import java.util.Arrays;

public class 완주하지_못한_선수 {
    public static void main(String[] args) throws Exception{
        String[] p = {"kiki"};
        String[] c = {};

        System.out.println(solution(p, c));

    }
    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        //정렬해서 같은 이름끼리의 인덱스 동일화
        String answer = "";
        for(int i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                break;
            }
        }
        if(answer.equals("")){
            answer = participant[participant.length-1];
        }
        
        return answer;
    }
}
