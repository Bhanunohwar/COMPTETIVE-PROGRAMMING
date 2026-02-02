public class mintimesec {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1};  
        int n = arr.length;

        int min = arr[0]; 
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int minCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == min) {
                minCount++;
            }
        } 

        int result = n - minCount;
        System.out.println("Count = " + result);
    }
}
