package day3.test;

public class Test4 {
}
class TestIt
{
    public static void main ( String[] args )
    {
        int[] myArray = {1, 2, 3, 4, 5};
        ChangeIt.doIt( myArray );
        for(int j=0; j<myArray.length; j++)
            System.out.print( myArray[j] + " " );
    }
}
class ChangeIt
{
    static void doIt( int[] z )
    {
        z = new int[]{5, 4, 3, 2, 1};
    }
}