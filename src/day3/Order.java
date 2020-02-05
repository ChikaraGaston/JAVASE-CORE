package day3;

public class Order {
    private int orderId;
    private String orderName;

    public Order() {

    }

    public Order(int orderId, String orderName) {
            this.orderId=orderId;
            this.orderName=orderName;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Order){
            Order o= (Order) obj;
            if (this.getOrderId()==o.getOrderId() && this.getOrderName()==o.getOrderName()){
                return true;
            }
        }
        return false;
    }
}
