package day4;

public abstract class Template {
    public final void getTime(){
        long start=System.currentTimeMillis();
        code();
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
    public abstract void code();
}

class Subplate extends Template{
    @Override
    public void code() {
        int j=0;
        for (int i=0;i<10000000;i++){
            j++;
        }
        System.out.println(j);
    }
}