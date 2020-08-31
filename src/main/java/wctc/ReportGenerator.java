package wctc;
import wctc.face.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import wctc.imp.Sale;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReportGenerator {
    private SalesInput in;
    private SalesOutput out;
    private SalesReport salesReport;
    private ShippingPolicy shippingPolicy;


    @Autowired
    public ReportGenerator(SalesInput in, SalesOutput out, ShippingPolicy shippingPolicy) {
        this.in = in;
        this.out = out;
        this.shippingPolicy=shippingPolicy;
    }
    public void getReport(){
        List<Sale> sales=this.in.getSales(this.shippingPolicy);
        for(int i=0;i<sales.size();i++){
            this.out.output(sales.get(i).toString());
        }
    }
}
