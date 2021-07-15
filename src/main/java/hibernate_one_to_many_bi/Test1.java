package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
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
/*
            session = factory.getCurrentSession();
            session.beginTransaction();

            Department department = new Department("IT", 300, 1200);
            Employee emp1 = new Employee("Artem", "Zychkov", 800);
            Employee emp2 = new Employee("Elena", "Smirnova", 1000);

            department.addEmployeeToDepartment(emp1);
            department.addEmployeeToDepartment(emp2);

            session.save(department);

            session.getTransaction().commit();
            System.out.println("Done!");
            */
/*
            session = factory.getCurrentSession();
            session.beginTransaction();

            Department department = session.get(Department.class, 1);
            System.out.println(department);
            System.out.println(department.getEmps());

            session.getTransaction().commit();
            System.out.println("Done!");
*/
/*
            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 1);
            System.out.println(employee);
            System.out.println(employee.getDepartment());

            session.getTransaction().commit();
            System.out.println("Done!");
*/
/*
            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 4);
            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("Done!");
*/
//***********************************************************************************************************
            session = factory.getCurrentSession();
            session.beginTransaction();

            Department department = session.get(Department.class, 4);
            System.out.println("Show department:");
            System.out.println(department);
            System.out.println("Show employees:");
            System.out.println(department.getEmps());

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
