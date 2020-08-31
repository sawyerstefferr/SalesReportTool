package wctc;

import wctc.face.*;
import wctc.imp.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("wctc")
public class AppConfig {
    @Bean
    public ShippingPolicy shippingPolicy() {
        return new FreeShipping();
    }

    @Bean
    public SalesOutput salesOutput() {
        return new ConsoleOutput();
    }
    @Bean
    public FileInput salesInput(){
        return new FileInput();
    }
//    @Bean
//    public Dice dice(){
//        // return new D4();
//        return new D6();
//    }
}
