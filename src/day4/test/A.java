package day4.test;

 class A {
     private int s;
     public class B{
         public void mb(){
             A.this.s=100;
             System.out.println("内部类B中s="+s);
         }
     }
     public void ma(){
         B b=new B();
         b.mb();
     }
}

