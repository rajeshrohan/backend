package Demo;
public class Demo {
    public static void main(String[] args) {
        int[] A = {-2,-3,-4};
        int temp =  maxProduct(A);
        System.out.println(temp);
    }
    public static int maxProduct(int[] A) {
        int n = A.length;
        int ans = A[0];
        int max = A[0], min = A[0];

        for(int i=1; i<n; i++){
            if(A[i] >= 0){
                max = Math.max(A[i], max*A[i]);
                min = Math.min(A[i], min*A[i]);
            }
            else{
                max = Math.max(A[i], min*A[i]);
                min = Math.min(A[i], max*A[i]);
            }
            ans = Math.max(ans, max);
        }
        return ans;
    }
}
