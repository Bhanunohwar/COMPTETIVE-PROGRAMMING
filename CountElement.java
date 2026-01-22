public class CountElement {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 4, 2};  
        int n = arr.length;

        int max = arr[0]; 
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                maxCount++;
            }
        }

        int result = n - maxCount;

        System.out.println("Count = " + result);
    }
}