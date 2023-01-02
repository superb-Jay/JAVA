package practice;


import java.util.HashMap;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";

        HashMap<String,String> map = new HashMap<>();

        for (int i = 0; i < db.length ; i++) {
            map.put(db[i][0],db[i][1]);
        }

        for (int i = 0; i < map.size() ; i++) {
            if(!(map.containsKey(id_pw[0]))) {
                answer = "fail";
            } else if (map.containsKey(id_pw[0]) && !(map.get(id_pw[0]).equals(id_pw[1]))) {
                answer = "wrong pw";
            } else if (map.containsKey(id_pw[0]) && map.get(id_pw[0]).equals(id_pw[1])) {
                answer = "login";
            }
        }

        return answer;
    }
}
public class Programmers {

    public static void main(String[] args) {


        String[] id_pw = {"rabbit04", "98761"};
        String[][] db = {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit04", "111333"}};

        System.out.println(new Solution().solution(id_pw,db));

    }

}




