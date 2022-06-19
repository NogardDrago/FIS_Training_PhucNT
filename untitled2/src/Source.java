public class Source {
    int A[];
    int N;
    int count;
    public void inra(){
        for(int i=0; i<N;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public void sinhThapPhan(int index){
        if(index >= N){
            int sum = 0 ;
            for (int i = 0; i<N;i++){
                sum+=A[i];
            }
            if (sum%2 ==0){
                count++;
                inra();
            }
            return;

        }
        int i= index == 0 ? 1: A[index - 1] +1;
        for(; i<10;i++){
            A[index] = i;

            sinhThapPhan(index+1);

        }
    }

    public static void main(String[] args) {
        Source source = new Source();
        source.A = new int[10];
        source.N = 8;
        source.count = 0;
        source.sinhThapPhan(0);
        System.out.println(source.count);
    }
}