public class Level_1 {
    // Tổng của cửa sổ đầu tiên
    // Cho: [1,2,3,4,5] và k = 3
    // Tính: 1 + 2 + 3
    // Kết quả: 6

    public static void firstWindowSum(int[] arr, int k){

        int sum = 0;
        // sum mới = sum cũ + arr[0]
        // sum mới = 0 + 1
        // sum mới = 1 + 2 ....
        // sum = sum + arr[i];

        for (int i = 0; i < k; i++){

            sum += arr[i];

        }

        System.out.println(sum);

    }

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;

        firstWindowSum(arr, k);

    }
}
