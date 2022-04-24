package Freestyle.practice;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Nurse implements Staff{
    
    public void assist(){
        System.out.println("Nurse is assisting");
    }

}
