package wctc.imp;

import wctc.face.SalesInput;
import wctc.face.ShippingPolicy;

import java.util.List;
import java.util.Scanner;

public class FileInput implements SalesInput {
    private String file="sales.txt";
    private List<Sale> sales;
    @Override
    public List<Sale> getSales(ShippingPolicy sp){
        Scanner s =new Scanner(this.file);
        int counter=0;
        while(s.hasNextLine()){
            String line=s.nextLine();
            System.out.println(line);
            String[] fields= line.split(",",4);
            double total=Double.parseDouble(fields[2]);
            double shipping=sp.getShippingCost(total);
            this.sales.add(new Sale(fields[0],fields[1],
                    total,Double.parseDouble(fields[3])));
            counter++;
        }
        s.close();
        return this.sales;
    }
}
