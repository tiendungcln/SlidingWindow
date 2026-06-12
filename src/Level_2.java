import java.util.Arrays;

public class Level_2 {
    // In tất cả cửa sổ độ dài k
    // Cho: [1,2,3,4,5]
    // k = 3
    // In:
    // [1,2,3]
    // [2,3,4]
    // [3,4,5]

    public static void printWindows(int[] arr, int k){

        int sum = 0;

        // i <= 5 - 3 -> run: 0 -> 2
        // nếu không có arr.length - k thì khi i = 3 -> j run: 3, 4, 5 mà arr[5] thì quá mảng
        // arr:   1 2 3 4 5
        // index: 0 1 2 3 4
        // Nếu cửa sổ bắt đầu ở i thì phần tử cuối của cửa sổ sẽ là: i + k - 1
        // Phần tử cuối không được vượt quá mảng Index cuối của mảng là: arr.length - 1
        // index cuối của cửa sổ = index bắt đầu + số phần tử - 1 => lastIndex = i + k - 1
        // => index cuối cửa sổ <= index cuối mảng
        // => i + k - 1 <= arr.length - 1
        // => i <= arr.length - k
        for (int i = 0; i <= arr.length - k; i++){

            // j = 0 ->  j < 0 + 3 -> run: 0 -> 2
            for (int j = i; j < i + k; j++){

                System.out.print(arr[j] + " ");

            }

            System.out.println();

        }

    }

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;

        printWindows(arr, k);

    }

}
