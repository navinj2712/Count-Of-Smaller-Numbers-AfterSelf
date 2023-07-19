import java.util.Scanner;

public class CountOfSmallerNumbersAfterSelf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        int[] nums = findCount(array);
        for (int i = 0; i < size; i++){
            System.out.println(nums[i] + " ");
        }
    }

    private static int[] findCount(int[] array) {
        int size = array.length;
        int count;
        int[] nums = new int[size];
        for (int i = 0; i < size; i++){
            count = 0;
            for (int j = i; j < size; j++){
                if (array[i] > array[j]){
                    count++;
                }
            }
            nums[i] = count;
        }
        return nums;
    }
}
