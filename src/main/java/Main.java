public class Main {

    public static void binarySearch(int[] array, int key) {
        int first = 0;
        int last = array.length - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (array[mid] < key) {
                first = mid + 1;
            } else if (array[mid] == key) {
                System.out.println("Key is on index:" + mid);
                break;
            } else {
                last = mid;
            }
            mid = (first + last) / 2;
            if (first == last) {
                System.out.println("Key is not exist in array!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
        int key = 5; //what we searching in array
        binarySearch(arr, key);
    }
}