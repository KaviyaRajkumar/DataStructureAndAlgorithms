public class ReverseAnArrayList {
    public static void main(String[] args) {
        reverseAnArrayList(new int[]{2, 3, 4, 5, 8});
    }

    public static int[] reverseAnArrayList(int[] input) {
        int left =0;
        int right =input.length-1;
        while(left<right) {
            int temp = input[left];
            input[left] = input[right];
            input[right] = temp;
            left++;
            right--;
        }
        for(int num: input) {
            System.out.println(num);
        }
        return input;
    }
}
