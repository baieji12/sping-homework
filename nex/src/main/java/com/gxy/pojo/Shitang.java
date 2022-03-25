package com.gxy.pojo;

public class Shitang {
    private Customer customer;

    @Override
    public String toString() {
        return "Shitang{" +
                "customer=" + customer +
                '}';
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
