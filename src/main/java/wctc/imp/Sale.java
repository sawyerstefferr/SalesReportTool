package wctc.imp;

import org.springframework.beans.factory.annotation.Autowired;
import wctc.face.ShippingPolicy;

public class Sale {
    private String customer,country;
    private double cost,tax,shippingCost;
    public Sale(String customer,String country,double cost,double tax){
        this.customer=customer;
        this.country=country;
        this.tax=tax;
        this.cost=cost;
    }

    public String getCustomer() {
        return customer;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public double getTax() {
        return tax;
    }
}
