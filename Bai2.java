import java.util.*;
class Result {
    public static String isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if ( c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else{
                if (stack.isEmpty()){
                    return "NO";
                }
                char top = stack.pop();
                if (c == ')' && top != '(') return "NO";
                if (c == ']' && top != '[') return "NO";
                if (c == '}' && top != '{') return "NO";
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}
public class Bai2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            String s = input.next();

            result[i] = Result.isBalanced(s);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
        input.close();
    }
}