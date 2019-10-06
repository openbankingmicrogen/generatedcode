package test.model;


public class DeleteOrderP {

    private long orderId;

    public DeleteOrderP() {

    }

    public DeleteOrderP(long orderId) {
        this.orderId = orderId;
    }

    public long getOrderId () {
        return orderId;
    }

    public void setOrderId (long orderId) {
        this.orderId = orderId;
    }

}
