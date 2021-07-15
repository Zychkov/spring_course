package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

/*            Department department = new Department("HR", 500, 1500);
            Employee emp1 = new Employee("Oleg", "Ivanov", 800);
            Employee emp2 = new Employee("Andrey", "Sidorov", 1000);

            department.addEmployeeToDepartment(emp1);
            department.addEmployeeToDepartment(emp2);

            session.save(department);
*/
/*
            Department department = session.get(Department.class, 3);
            System.out.println(department);
            System.out.println(department.getEmps());
*/

            Department department = session.get(Department.class, 3);
            session.delete(department);

            session.getTransaction().commit();
            System.out.println("Done!");
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
    }
}
