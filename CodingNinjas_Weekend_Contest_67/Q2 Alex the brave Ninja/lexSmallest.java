import java.util.Arrays;

public class lexSmallest {

    // 1st Method: Using StringBuilder class
    public static String lexicographicallySmallest(int n, String s) {
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        while (i<n-1) {
            if (sb.charAt(i)<=sb.charAt(i+1)) {
                i++;
            } else {
                char c = sb.charAt(i);
                c = (char) (Math.min((c-'0')+1,9)+'0');
                sb.deleteCharAt(i);
                int j=sb.length()-1;
                while (j>0 && sb.charAt(j)>=c) {
                    j--;
                }
                sb.insert(j+1, c);
                i=0;
            }
        }
        return sb.toString();
    } 

    // 2nd Mathod: Greedy Sorting based approach
    public static String lexicographicallySmallestBetter(int n,String s) {
        int[] suffixMinimum = new int[n+1];
        suffixMinimum[n] = s.charAt(n-1)-'0';

        for (int i=n-1;i>=1;i--) {
            suffixMinimum[i] = Math.min(suffixMinimum[i+1],(s.charAt(i-1)-'0'));
        }

        StringBuilder res = new StringBuilder(s);
        for (int i=1;i<=n;i++) {
            if (s.charAt(i-1)-'0'>suffixMinimum[i]) {
                res.setCharAt(i-1, (char) Math.min('9',(char)(s.charAt(i-1)+1)));
            }
        }

        char[] tempArray = res.toString().toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static void main(String... args) {
        System.out.println(lexicographicallySmallest(5, "04829"));
        System.out.println(lexicographicallySmallestBetter(5, "04829"));
    }
}