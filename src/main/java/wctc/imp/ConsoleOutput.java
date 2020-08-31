package wctc.imp;

import wctc.face.SalesOutput;

public class ConsoleOutput implements SalesOutput {
    @Override
    public void output(String t){
        System.out.println(t);
    }
}
