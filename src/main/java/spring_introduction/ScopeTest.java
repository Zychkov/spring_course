package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog = context.getBean("dogBean", Dog.class);
//        myDog.setName("Belka");
        Dog yourDog = context.getBean("dogBean", Dog.class);
//        yourDog.setName("Strelka");

        //        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());
        System.out.println(myDog == yourDog);
        System.out.println(myDog);
        System.out.println(yourDog);
    }
}
