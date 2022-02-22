import java.util.*;



public class SearchInString {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        char c = in.next().charAt(0);
        
        System.out.println(Search(str, c));
    }
    static boolean Search(String s, char c){
        boolean verdict = false;
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)==c){
                verdict = true;
            }
        }
        return verdict;
    }
}
