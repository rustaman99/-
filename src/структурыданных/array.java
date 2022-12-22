package структурыданных;

public class array {
    public static void main(String[] args) {
        int arr[];
        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 12;
        arr1[2] = 13;
        arr1[3] = 14;
        arr1[4] = 15;
        System.out.println(arr1[3]);//14


        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(arr2[2]);//3
        System.out.println(arr2.length);//7
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);// вывести двнные с массива

        }

    }
}
