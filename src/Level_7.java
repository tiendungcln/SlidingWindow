public class Level_7 {
    // Đếm số cửa sổ có tổng > target
    // Cho: [1,2,3,4,5]
    // k = 3
    // target = 8
    // Các cửa sổ:
    // 6
    // 9
    // 12
    // Kết quả: 2

    public static int countWindowsGreaterThanTarget(int[] arr, int k, int target){

        int sum = 0;
        int count = 0;

        for (int i = 0; i < k; i++){

            sum += arr[i];

        }

        if (sum > target){

            count++;

        }

        for (int i = k; i < arr.length; i++){

            sum += arr[i] - arr[i - k];

            if (sum > target){

                count++;

            }

        }

        return count;

    }

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        int target = 8;

        System.out.println(countWindowsGreaterThanTarget(arr, k, target));

    }
}
