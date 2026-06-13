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

        // arr.length = tổng số chỗ
        // k = số chỗ cửa sổ chiếm
        // arr.length - k = số chỗ còn dư
        // dư bao nhiêu chỗ thì cửa sổ trượt được bấy nhiêu lần
        // vd: [1, 2, 3] 4 5 (vị trí 0) -> muốn dịch sang phải 1 lần thì phải có 1 ô trống bên phải nhường
        // => 1 [2, 3, 4] 5 (vị trí 1) -> tương tự thì => 1 2 [3, 4, 5] (vị trí 2)
        // nếu dùng i < (arr.length - k) + 1 => số vị trí = số lần trượt + 1 (có 3 vị trí đặt cửa sổ là 0 1 2)
        for (int i = 0; i <= arr.length - k; i++){

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
