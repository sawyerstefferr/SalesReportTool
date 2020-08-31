package wctc.face;


import wctc.imp.Sale;

import java.util.List;

public interface SalesInput {
     List<Sale> getSales(ShippingPolicy sp);
}
