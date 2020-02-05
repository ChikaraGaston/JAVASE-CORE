package day2;

public class Graduate extends Student{
    private String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(this.major);
    }
}
