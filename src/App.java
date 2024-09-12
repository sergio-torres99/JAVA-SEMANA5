import java.util.Arrays;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        //EJERCICIOS JAVA PARTE 1

        //1)
        
        int[] arr = {1, 2, 3, 4, 5};
        int firstNumber = arr[0];
        arr[0] = arr[4];
        arr[4] = firstNumber;
        // System.out.println(Arrays.toString(arr));

        //2)

        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr1 = {1, 2, 3, 4, 5};

        boolean comparison = Arrays.equals(arr1, arr2);

        // System.out.println("arr1 y arr2 son iguales: " + comparison);

        //3 y 4)

        int[] arr3 = {1, 8, 3, 4, 5};
        Arrays.sort(arr3);
        int max = arr3[arr3.length - 1];
        int min = arr3[0];
        // System.out.println(Arrays.toString(arr3));
        // System.out.println("El elemento minimo del array es " + min);
        // System.out.println("El elemento maximo del array es " + max);

        //5 y 6)

        int[] arr4 = {9, 8, 3, 7, 2};
        
        int suma = arr4[0] + arr4[1] + arr4[2] + arr4[3] + arr4[4];

        // System.out.println("La suma de los elementos es " + suma);

        double promedio = (double) suma / arr4.length;

        // System.out.println("El promedio de los elementos es " + promedio);

        //7)

        int[] arr5 = {2, 7, 4, 9, 6};

        int count = (arr5[0] % 2 == 0 ? 1 : 0) +
                    (arr5[1] % 2 == 0 ? 1 : 0) +
                    (arr5[2] % 2 == 0 ? 1 : 0) +
                    (arr5[3] % 2 == 0 ? 1 : 0) +
                    (arr5[4] % 2 == 0 ? 1 : 0);

        // System.out.println("Cantidad de elementos pares: " + count);

        //8)

        int[] arr6 = {1, 5, 4, 3, 6};

        int count2 = (arr6[0] % 2 != 0 ? 1 : 0) +
                    (arr6[1] % 2 != 0 ? 1 : 0) +
                    (arr6[2] % 2 != 0 ? 1 : 0) +
                    (arr6[3] % 2 != 0 ? 1 : 0) +
                    (arr6[4] % 2 != 0 ? 1 : 0);

        // System.out.println("Cantidad de elementos impares: " + count2);

        //9)

        ArrayList<Integer> arr7 = new ArrayList<>();

        arr7.add(5);
        arr7.add(7);
        arr7.add(4);

        // System.out.println(arr7.contains(5));

        //10)

        int[] arr8 = {4, 8, 9, 2, 1};
        
        int last = arr8[arr8.length - 1];
        int penultimate = arr8[arr8.length - 2];

        arr8[arr8.length - 1] = arr8[0];
        arr8[arr8.length - 2] = arr8[1];

        arr8[0] = last;
        arr8[1] = penultimate;

        // System.out.println(Arrays.toString(arr8));

        //EJERCICIOS JAVA PARTE 2

        ArrayList<Integer> arr9 = new ArrayList<>();

        arr9.add(1);
        arr9.add(2);
        arr9.add(3);
        arr9.add(0, 0);

        // System.out.println(arr9); //1) 

        arr9.add(4);

        // System.out.println(arr9); //2) 

        arr9.remove(arr9.size() - 1);
        arr9.remove(0);

        // System.out.println(arr9); //3 y 4)
        
        int lastNumberArr = arr9.get(arr9.size() - 1);
        int firstNumberArr = arr9.get(0);

        // System.out.println(lastNumberArr); //5)
        // System.out.println(firstNumberArr); //6)

        // System.out.println(arr9.isEmpty()); //7)

        // System.out.println(arr9.size()); //8)

        // System.out.println(arr9.contains(2)); //9) 

        // System.out.println(arr9.indexOf(3)); //10)
    }
}
