package wctc.face;

import wctc.imp.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> sales);
}
