package Freestyle.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {

		//Note that the Application context extends the Bean Factory
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

		Nurse nurse = context.getBean(Nurse.class);
		nurse.assist();
		nurse.setQualification("Yooo!");

		Doctor doctor = context.getBean(Doctor.class);
		doctor.assist();
       doctor.setQualification("B.Sc in Agbero");

//		System.out.println( doctor.getQualification());
//		System.out.println(doctor);
//
//		Doctor doctor1 = context.getBean(Doctor.class);
//		System.out.println(doctor1);
//
//		Nurse nurse = context.getBean(Nurse.class);
//		nurse.assist();
	}

}
