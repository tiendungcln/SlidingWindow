public class Level_3 {
    // In tổng từng cửa sổ
    // Cho:[1,2,3,4,5]
    // k = 3
    // In:
    // 6
    // 9
    // 12

    public static void printWindowSums(int[] arr, int k){

        int sum = 0;

        for (int i = 0; i < k; i++){

            sum += arr[i];

        }

        System.out.println(sum);

        for (int i = k; i < arr.length; i++){

            // sum mới = sum cũ - vị trí bị đẩy ra + vị trí được thêm vào
            sum = sum - arr[i - k] + arr[i];

            System.out.println(sum);

        }

    }

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;

       printWindowSums(arr, k);;

    }

}
