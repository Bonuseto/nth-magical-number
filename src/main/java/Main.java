public class Main {

    public static int[] mergeRemoveDupSortIt(int[] a, int[] b) {
        int[] c = mergeIt(a, b);
        int[] d = removeIt(c);
        int[] e = sortIt(d);
        return e;
    }

    private static int[] mergeIt(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int k = 0;
        for (int n : a) {
            c[k++] = n;
        }
        for (int n : b) {
            c[k++] = n;
        }
        return c;
    }

    private static int[] removeIt(int[] c) {
        int len = c.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (c[i] == c[j]) {
                    for (int k = j; k < len - 1; k++) {
                        c[k] = c[k + 1];
                    }
                    --len;
                }
            }
        }
        int[] r = new int[len];
        for (int i = 0; i < r.length; i++) {
            r[i] = c[i];
        }
        return r;
    }

    private static int[] sortIt(int[] a) {
        for (int index = 0; index < a.length - 1; index++) {
            for (int i = index + 1; i < a.length; i++) {
                if (a[index] > a[i]) {
                    int temp = a[index];
                    a[index] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }

    public static int nthMagicalNumber(int N, int A, int B) {

        int a = A;
        int b = B;

        int[] divisibleByA = new int[N]; //numbers divisible by A
        int[] divisibleByB = new int[N]; //numbers divisible by A
        for (int i = 0; i < divisibleByA.length; i++) {
            divisibleByA[i] = A;
            A = A + a;
        }
        for (int i = 0; i < divisibleByB.length; i++) {
            divisibleByB[i] = B;
            B = B + b;
        }

        int[] arr = mergeRemoveDupSortIt(divisibleByA, divisibleByB); //merge to arrays and remove duplicates
        return arr[N - 1];
    }

    public static void main(String[] args) {
        int result = nthMagicalNumber(5, 2, 4);
    }
}