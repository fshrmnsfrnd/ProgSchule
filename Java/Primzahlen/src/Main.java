import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> getPrimes(int N){
        boolean gestrichen[] = new boolean[N+1];
        for (int i = 2 ; i <= gestrichen.length -1;i++){
            gestrichen[i] = false;
        }

        for (int i = 2; i <= N; i++){
            if(!gestrichen[i]){
                //Set all multiples false if isn't set false
                for (int j = i + i; j <= N; j+=i){
                    gestrichen[j] = true;
                }
            }
        }

        //Write the numbers in a list
        ArrayList<Integer> list = new ArrayList();
        for (int i = 1; i <= gestrichen.length-1; i++){
            if(!gestrichen[i]){
                list.add(i);
            }
        }
        return list;
    }

    private static boolean isPrime(int n){
        for (long i=2; i<=Math.sqrt(n); i++){
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = getPrimes(50);
        System.out.println(list);
        for(int u = 0; u < 10; u++){
            System.out.print(u);
            System.out.println(isPrime(u));
        }
    }
}