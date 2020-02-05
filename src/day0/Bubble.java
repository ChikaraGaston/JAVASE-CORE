package day0;

public class Bubble {
    public static void main(String[] args) {
        int[] arr=new int[]{7,6,8,9,10,1,4,2,5,3};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++)
                if (arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
            }
        }
            for (int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }


    }
}
