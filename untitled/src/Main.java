public class Main {
    public int giaithua(int m){
        //System.out.println(m);
        if (m<=1){return 1;}
        int a[][] = new int [1000][1000];
        return m*giaithua(m-1);
    }
    public static void main(String args[]){
        Main n = new Main();

        System.out.println(n.giaithua(20));
    }
}
