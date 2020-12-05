package ass4.que1;

public class Pattern {
    public static void main(String[] args) {

/*
        for (int i =4; i >=1; i--){
            for (int j = i; j >0 ; j--) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
*/

        int [ ] [ ]  arr = { {4,3,2,1}, {3,2,1}, {2,1},{ 1 } };
        for (int [ ] i : arr){
            for (int element : i) {
                System.out.print(element + " ");
            }
            System.out.println();
        }


        /*int [] arr1 =  {4,3,2,1};
        int [] arr2 =  {3,2,1};
        int [] arr3 =  {2,1};
        int [] arr4 =  {1};

        for (int i : arr1){
                System.out.print(i+" " );
            }
        System.out.println();
        for (int i : arr2){
                System.out.print(i +" " );
            }
        System.out.println();
        for (int i : arr3){
                System.out.print(i +" " );
            }
        System.out.println();
        for (int i : arr4){
                System.out.println(i +" " );
            }*/
    }
}
