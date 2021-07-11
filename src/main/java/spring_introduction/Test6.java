package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

//        Pet cat = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        cat.say();
//        System.out.println(cat == cat2);

        context.close();
    }
}
