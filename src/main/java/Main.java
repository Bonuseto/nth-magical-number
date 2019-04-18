import java.util.BitSet;

public class Main {

    public static int bitSet (int N, int A, int B){
        int a = A;
        int b = B;
        BitSet array = new BitSet(1000000000);
        for (int i = 0; i < N ; i++) {
            array.set(A, true);
            array.set(B, true);
            A = A + a;
            B = B + b;
        }
        return N;
    }

    public static void main(String[] args) {
        bitSet(5,9,2);
    }
}