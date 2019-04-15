import java.util.ArrayList;

public class Main {

    public static int nthMagicalNumber(int N, int A, int B) {

        ArrayList<Integer> arr = new ArrayList<Integer>(N);
        for (int i = 1; i <= N; i++) {
            if (!arr.contains(A * i)) {
                arr.add(A * i);
            }
            if (!arr.contains(B * i)) {
                arr.add(B * i);
            }
        }
        arr.sort(Integer::compareTo);
        return arr.get(N - 1);
    }

    public static void main(String[] args) {
        int result = nthMagicalNumber(5, 2, 4);
        System.out.println(result);
    }
}
