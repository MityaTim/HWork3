package homework3;

public class Main {

    public static void main(String[] args) {

        System.out.println(" Example1 ");
        Example1();

        System.out.println(" Example2 ");
        Example2();

        System.out.println(" Example3 ");
        Example3();

        System.out.println(" Example4 ");
        Example4(5);

        System.out.println(" Example5 ");
        int arr_example5[] = Example5(4, 9);

        for (int i = 0; i < arr_example5.length; i++) {
            System.out.printf("%4d", arr_example5[i]);
        }
        System.out.println();

        System.out.println(" Example6 ");


        System.out.println(" Example7 ");
        Example7(new int[] {2, 2, 2, 1, 2, 2, 10, 1});
        Example7(new int[] {1, 1, 1, 2, 1});
        Example7(new int[] {7, 1, 1, 2, 1});

        System.out.println(" Example8 ");
        Example8(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 0);
        Example8(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 2);
        Example8(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, -3);

    }

    static public void Example1() {
        int arr[] = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }

            System.out.printf("%2d", arr[i]);
        }
        System.out.println();
    }

    static public void Example2() {
        int arr[] = new int[100];

        for (int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d", arr[i]);
        }
        System.out.println();
    };

    static public void Example3() {
        int arr[] = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d", arr[i]);
        }
        System.out.println();
    }

    static public void Example4(int NumberOfElements) {
        int double_arr[][] = new int[NumberOfElements][NumberOfElements];

        for (int i = 0; i < double_arr.length; i++){
            double_arr[i][i] = 1;
            double_arr[i][NumberOfElements-i-1] = 1;
        }
        for (int i = 0; i < double_arr.length; i++) {
            for (int j = 0; j < double_arr[i].length; j++) {
                System.out.printf("%2d", double_arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] Example5(int len, int initialValue) {

        int arr[] = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }




    public static void Example7 (int arr[]){

        int leftSideSumm = 0;
        int rightSideSumm = 0;
        boolean result = false;
        int foundIteration = 0;

        for (int i = 0;  i < arr.length - 1; i++){
            leftSideSumm +=  arr[i];
            for (int j = arr.length - 1; j > i; j--){
                rightSideSumm += arr[j];
            }
            if (leftSideSumm == rightSideSumm){
                result = true;
                foundIteration = i;
                break;
            }
            rightSideSumm = 0;
        }

        if (result == false){
            System.out.println("Результат не найден!");
        }
        else{
            System.out.println("Результат найден!");
            for (int i = 0; i < arr.length; i++){
                if (i == foundIteration){
                    System.out.print(arr[i] + " = ");
                }
                else if (i == arr.length - 1){
                    System.out.print(arr[i]);
                }
                else {
                    System.out.print(arr[i] + " + ");
                }
            }
        }
        System.out.println();
    }


    public static void Example8 (int arr[],int n){

        int savedValue;

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d", arr[i]);
        }

        if (n > 0) {

            for (int i = 0; i < n; i++){
                savedValue = arr[arr.length-1];
                for (int j = arr.length-1; j > 0; j--){
                    arr[j] = arr[j-1];
                }
                arr[0] = savedValue;
            }

            System.out.print(" => ");


            for (int i = 0; i < arr.length; i++) {
                System.out.printf("%4d", arr[i]);
            }

        }
        else if (n < 0) {

            for (int i = 0; i > n; i--){
                savedValue = arr[0];
                for (int j = 0; j < arr.length-1; j++){
                    arr[j] = arr[j+1];
                }
                arr[arr.length-1] = savedValue;
            }

            System.out.print(" => ");

            for (int i = 0; i < arr.length; i++) {
                System.out.printf("%4d", arr[i]);
            }

        }
        else{
            System.out.print(" => ");


            for (int i = 0; i < arr.length; i++) {
                System.out.printf("%4d", arr[i]);
            }
            System.out.println();
            System.out.println("При значении n = 0 массив не изменяется!");
        }
        System.out.println();
    }

}

