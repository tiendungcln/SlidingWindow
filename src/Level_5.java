public class Level_5 {
    // Tìm tổng nhỏ nhất
    // Cho: [4,1,8,2,3]
    // k = 2
    // Kết quả: 5

    public static int minSumWindow(int[] arr, int k){

        int sum = 0;

        for (int i = 0; i < k; i++){

            sum += arr[i];

        }

        int minSum = sum;

        for (int i = k; i < arr.length; i++){

            sum += arr[i] + arr[i - k];

            if (sum < minSum){

                minSum = sum;

            }

        }

        return minSum;

    }

    public static void main(String[] args){

        int[] arr = {4, 1, 8, 2, 3};
        int k = 2;

        System.out.println(minSumWindow(arr, k));

    }
}
