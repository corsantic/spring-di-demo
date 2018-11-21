package enemo.springframework.didemo;

import enemo.springframework.didemo.controllers.ConstructorInjectedController;
import enemo.springframework.didemo.controllers.MyController;
import enemo.springframework.didemo.controllers.PropertyInjectedController;
import enemo.springframework.didemo.controllers.SetterInjectedController;
import enemo.springframework.didemo.examplebeans.FakeDataSource;
import enemo.springframework.didemo.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {


        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);


        MyController controller = (MyController) ctx.getBean("myController");


        FakeDataSource fakeDataSource =  ctx.getBean(FakeDataSource.class);


        System.out.println(fakeDataSource.getUser());

        FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);

        System.out.println(fakeJmsBroker.getUserJms());


    }
}
