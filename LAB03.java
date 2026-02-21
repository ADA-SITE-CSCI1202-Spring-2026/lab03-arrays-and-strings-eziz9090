import java.util.Scanner;
//EXERCISE 2
public class LAB03 {

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] findMinAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        return new int[]{min, max};
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        if (args.length > 0) {
            int[] cmdArray = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                cmdArray[i] = Integer.parseInt(args[i]);
            }

            System.out.println("input:");
            System.out.println("Min: " + findMin(cmdArray));
            System.out.println("Max: " + findMax(cmdArray));

            int[] both = findMinAndMax(cmdArray);
            System.out.println("Both: " + both[0] + " " + both[1]);
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("NUM of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("minimum - " + findMin(arr));
        System.out.println("maximum -  " + findMax(arr));
        int[] both2 = findMinAndMax(arr);
        System.out.println("Both: " + both2[0] + " " + both2[1]);
    //EXERCISE 7
        sc.nextLine();
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        System.out.println("Reversed: " + reverseString(text));
        sc.close();
    }
}