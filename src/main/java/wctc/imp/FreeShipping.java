package wctc.imp;

import wctc.face.ShippingPolicy;

public class FreeShipping implements ShippingPolicy {

    private double cost=0;
    @Override
    public double getShippingCost(double s){
        return this.cost;
    }
}
