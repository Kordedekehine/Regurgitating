package Freestyle.practice;

import org.springframework.context.annotation.Configuration;


public class Doctor implements Staff{

    public void assist(){
        System.out.println("Doctor is assisting");
    }

    
}
