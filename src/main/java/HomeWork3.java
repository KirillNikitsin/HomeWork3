public class HomeWork3 {
    private static int length;

    public static void main(String[] args) {
        booleanNegativeArray(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0});
        System.out.println("=============");
        fillUpArray(100);
        System.out.println("=============");
        doubleIfless(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        System.out.println("=============");
        fillDiagonals(new int[5][5]);
        System.out.println("=============");
        fillWithInitialValue(6, 5);
        System.out.println("=============");
        minMax(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        checkBalance(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 36});
    }
    public static int[] booleanNegativeArray(int[] input){
        for(int i = 0; i < input.length; i++){
            if(input[i] == 1){
                input[i] = 0;
            }
            else if (input[i] == 0){
                input[i] = 1;
            }
            System.out.println(input[i]);
        }
        return input;
    }
    public static int[] fillUpArray(int length){
        HomeWork3.length = length;
        int []x = new int [length];
        for(length = 0; length < x.length; length ++){
            for(int j = 1; j <= 100; j++){
                x[length] = j;
                System.out.println(x[length]);
            }
            break;
        }
        return x;
    }
    public static int[] doubleIfless(final int[] input){
        for(int i = 0; i < input.length; i ++){
            if(input[i] < 6){
                input[i] = input[i] * 2;
            }
            System.out.println(input[i]);
        }
        return input;
    }
    public static void fillDiagonals(final int[][] size){
        for(int i = 0; i < size.length; i++){
            for(int j = 0; j < size.length; j++){
                if(i == j || size.length - i - 1 == j){
                    size[i][j] = 1;
                }
                else{
                    size[i][j] = 0;
                }
                System.out.println(size[i][j]);
            }
        }
    }
    public static int[] fillWithInitialValue(int len, final int initialValue){
        int[] x = new int[len];
        for(len = 0; len < x.length; len++){
            x[len] = initialValue;
            System.out.println(x[len]);
        }
        return x;
    }
    public static void minMax(final int[]arr){
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }
    public static boolean checkBalance(final int [] arr){
        int a;
        a = arr[arr.length - 1];
        int b = arr[arr.length - 2];
        int sum1 = 0;
        int sum2 = a + b;
        for(int i = 0; i < arr.length; i++){
            sum1 = sum1 + arr[i];
        }
        sum1 = sum1 - sum2;
        if(sum1 == sum2){
            System.out.println(true);
            return true;
        }
        else{
            System.out.println("false" + sum1);
            return false;
        }

    }
}
