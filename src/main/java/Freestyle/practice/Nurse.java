package Freestyle.practice;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Configuration
@Component
public class Nurse implements Staff{

    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist(){
        System.out.println("Nurse is assisting");
    }


    @Override
    public String toString() {
        return "Nurse{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    @PostConstruct
    public void PostConstruct(){
        System.out.println("Post Construct nurse is called");
    }
}
