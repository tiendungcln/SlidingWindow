public class Level_4 {
    // Tìm tổng lớn nhất
    // Cho:[1,2,3,4,5]
    // k = 3
    // Kết quả:
    // 12

    public static int maxSumWindow(int[] arr, int k){

        int sum = 0;

        for (int i = 0; i < k; i++){

            sum += arr[i];

        }

        int maxSum = sum;

        for (int i = k; i < arr.length; i++){

            sum += arr[i] - arr[i - k];

            if (sum > maxSum){

                maxSum = sum;

            }

        }

        return maxSum;

    }

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;

        System.out.println(maxSumWindow(arr, k));;

    }
}
