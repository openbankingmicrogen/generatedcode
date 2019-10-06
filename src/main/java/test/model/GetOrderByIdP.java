package test.model;

import test.model.Order;

public class GetOrderByIdP {

    private long orderId;

    public GetOrderByIdP() {

    }

    public GetOrderByIdP(long orderId) {
        this.orderId = orderId;
    }

    public long getOrderId () {
        return orderId;
    }

    public void setOrderId (long orderId) {
        this.orderId = orderId;
    }

}
