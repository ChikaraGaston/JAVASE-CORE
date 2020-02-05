package day3;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(){

    }
    public MyDate(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        int flag=0;

        if (o instanceof MyDate){
            MyDate m= (MyDate) o;
            if (this.year!=m.year){
                flag+=1;
            }
            if (this.month!=m.month){
                flag+=1;
            }
            if (this.day!=m.day){
                flag+=1;
            }
        }

        if (flag==0){
            return true;
        }else {
            return false;
        }

//        if (o instanceof MyDate){
//            MyDate m= (MyDate) o;
//            if (this.getYear()==m.getYear() && this.month==m.month && this.day==m.day){
//                return true;
//            }
//        }
//        return false;
    }
}
