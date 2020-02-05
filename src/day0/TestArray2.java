package day0;

public class TestArray2 {
    public static void main(String[] args) {

        int[] array1={2,3,5,7,11,13,17,19};
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+"\t");
        }

        int[] array2=new int[array1.length];
        for(int i=0;i<array2.length;i++){
            array2[i]=array1[1];
        }

        for (int i=0;i<array2.length;i+=2){
            array2[i]=i;
        }

        System.out.println("\narray1:");
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+"\t");
        }


    }
}
