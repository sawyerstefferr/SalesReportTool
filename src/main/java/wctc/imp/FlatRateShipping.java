package wctc.imp;

import wctc.face.ShippingPolicy;

public class FlatRateShipping implements ShippingPolicy {
    private double cost=.2;
    @Override
    public double getShippingCost(double s){
        return s*this.cost;
    }
}
