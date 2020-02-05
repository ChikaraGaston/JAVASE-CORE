package day0;

public class mountain {
    public static void main(String[] args) {
        double moubtain = 8848;
        double paper = 0.01;
        int j=0;
        while(paper<=moubtain){
                j++;
                paper*=2;
        }
        System.out.println(j);
    }
}
