package Homework2;
//pull
public class Homework2 {
    public static void main(String[] args) {
        //Swap 1 to 0 and 0 to 1 in the array
        int[] changeArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        changeOneToZero(changeArray);
        System.out.println();
        System.out.println();

        //0 3 6 9 12 15 18 21
        int[] emptyArr = new int[8];
        incrementThreeArr(emptyArr);
        System.out.println();
        System.out.println();

        //Elements that are less than 6, multiply by 2
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        lessThanSix(arr);
        System.out.println();
        System.out.println();

        //filling diagonal sections with 1
        diagonalSections(6);
        System.out.println();

        //searching for maximum and minimum element
        int[] maxAndMin = {6, 15, 28, 4, 0, -6, 57, 1, 3};
        maximumAndMinimum(maxAndMin);
        System.out.println();

        //Checking is the left part's sum equals to the right part's sum
        int[] rightLeft = {2, 6, 4, 5, 10, 7};
        System.out.println(checkBalance(rightLeft));
    }

    //Swap 1 to 0 and 0 to 1 in the array
    public static void changeOneToZero(int[] changeArr) {
        //original array
        for (int o : changeArr) {
            System.out.print(o + " ");
        }
        System.out.println();

        //changed array
        for(int i = 0; i < changeArr.length; i++) {
            if(changeArr[i] == 0) {
                changeArr[i] = 1;
            } else {
                changeArr[i] = 0;
            }
            System.out.print(changeArr[i] + " ");
        }
    }

    //0 3 6 9 12 15 18 21
    public static void incrementThreeArr(int[] threeArr) {
        for(int i = 0, j = 0; i < threeArr.length; i++, j += 3) {
            System.out.print((threeArr[i] += j) + " ");
        }
    }

    //Elements that are less than 6, multiply by 2
    public static void lessThanSix(int[] array) {
        //original array
        for (int o : array) {
            System.out.print(o + " ");
        }
        System.out.println();

        //changed array
        for(int i = 0; i < array.length; i++) {
            if(array[i] < 6) {
                array[i] *= 2;
            }
            System.out.print(array[i] + " ");
        }
    }

    //filling diagonal sections with 1
    public static void diagonalSections(int capacity) {
        int[][] twoArr = new int[capacity][capacity];
        for(int i = 0; i < twoArr.length; i++) {
            for(int j = 0; j < twoArr[i].length; j++) {
                if(i == j || j == (twoArr.length - 1 - i)) {
                    twoArr[i][j] = 1;
                }
                System.out.print(twoArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //searching for maximum and minimum element
    public static void maximumAndMinimum(int[] maxMin) {
        //original array
        for(int o : maxMin) {
            System.out.print(o + " ");
        }
        System.out.println();

        //maximum and minimum
        int max = maxMin[0];
        int min = maxMin[0];
        for (int value : maxMin) {
            if (value > max) {
                max = value;
            } else if (value < min) {
                min = value;
            }
        }
        System.out.println("Max = " + max + " Min = " + min);
    }

    //Checking is the left part's sum equals to the right part's sum
    public static boolean checkBalance(int[] array){
        int totalLeft = 0;
        for(int i = 0; i < array.length; i++){
            totalLeft += array[i];
            int totalRight = 0;
            for (int j = 0; j < array.length; j++){
                if(j > i) {
                    totalRight +=  array[j];
                } else {
                    totalRight += 0;
                }
            }
            if(totalLeft == totalRight){
                return true;
            }
        }
        return false;
    }
}
