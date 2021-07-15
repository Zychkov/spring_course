package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            //********************************************************************************
/*
            Section section1 = new Section("Dance");

            Child child1 = new Child("Olya", 5);
            Child child2 = new Child("Grisha", 7);
            Child child3 = new Child("Pavlik", 6);

            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);

            session.persist(section1);
*/
            //********************************************************************************

            //********************************************************************************
            /*
            Section section1 = new Section("VolleyBall");
            Section section2 = new Section("Chess");
            Section section3 = new Section("Math");
            Child child1 = new Child("Igor", 10);

            child1.addSectionToChild(section1);
            child1.addSectionToChild(section2);
            child1.addSectionToChild(section3);

            session.save(child1);
            */
            //********************************************************************************

/*            Section section = session.get(Section.class, 1);
            System.out.println(section);
            System.out.println(section.getChildren());*/

/*            Child child = session.get(Child.class, 4);
            System.out.println(child);
            System.out.println(child.getSections());*/

/*            Section section = session.get(Section.class, 1);
            session.delete(section);*/
            //********************************************************************************

            Child child = session.get(Child.class, 5);
            session.delete(child);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
