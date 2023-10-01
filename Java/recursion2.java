public class recursion2 {
    public static void calculateSumToN(int i,int n,int sum) {
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        calculateSumToN(i+1,n,sum);
        //System.out.println(i);
    }
    public static void main(String args[]) {
        calculateSumToN(1, 5,0);
    }
}
