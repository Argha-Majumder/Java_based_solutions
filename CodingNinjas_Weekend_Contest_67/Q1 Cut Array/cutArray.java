public class cutArray {
    static int cuttingArray(int n, int[] a) {
        int ct=0;
        for (int i=0;i<n-1;i++) {
            if (a[i]>a[i+1]) {
                ct++;
            }
        }
        return ct;
    }
    public static void main(String... args) {
        System.out.println(cuttingArray(6,new int[]{8,9,2,30,20,17}));
    }
}