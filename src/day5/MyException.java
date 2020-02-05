package day5;


public class MyException extends  Exception {
    private int idnumber;
    public MyException(String msg,int id){
        super(msg);
        this.idnumber=id;
    }
    public int getId(){
        return idnumber;
    }
}
