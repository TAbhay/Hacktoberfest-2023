public class recursion1 {
    public static void printNumb(int n){
        if(n==6)//base
        {return;}
        System.out.println(n);//print
        printNumb(n+1);//recursion
    }
    public static void main(String args[]) {
        int n=1;
        printNumb(n);
    }
}
