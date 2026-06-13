public class Level_6 {
    // Trung bình lớn nhất
    // Cho: [1,12,-5,-6,50,3]
    // k = 4
    // Tìm: average lớn nhất

    public static float maxAverageWindow(int[] arr, int k){

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

        return (float) maxSum / k;

    }

    public static void main(String[] args){

        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;

        System.out.println(maxAverageWindow(arr, k));

    }
}
