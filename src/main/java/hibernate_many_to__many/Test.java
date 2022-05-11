package hibernate_many_to__many;

import hibernate_many_to__many.entity.Child;
import hibernate_many_to__many.entity.Section;
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
            Section section = new Section("Football");
            Child child1 = new Child("Zaur", 5);
            Child child2 = new Child("Masha", 7);
            Child child3 = new Child("Vassya", 6);
            section.addChildToSection(child1);
            section.addChildToSection(child2);
            section.addChildToSection(child3);

            session.beginTransaction();

            session.save(section);

            session.getTransaction().commit();
            System.out.println("Done!!!");
//            ********************************************************
//            session = factory.getCurrentSession();
//            Section section1 = new Section("A14");
//            Section section2 = new Section("B14");
//            Section section3 = new Section("C14");
//
//            Child child1 = new Child("QQQ14", 10);
//
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
//              ********************************************************
//            session = factory.getCurrentSession();
//
//
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");


//            session = factory.getCurrentSession();
//
//
//
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 4);
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
//            ******************************************************

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
//            ***********************************************
//            session = factory.getCurrentSession();
//            Section section = new Section("Dance");
//            Child child1 = new Child("Olga", 12);
//            Child child2 = new Child("Marusya", 8);
//            Child child3 = new Child("Pavel", 11);
//            section.addChildToSection(child1);
//            section.addChildToSection(child2);
//            section.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.persist(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
////            ******************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Section section = session.get(Section.class, 17);
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
            //            ******************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Child child = session.get(Child.class, 15);
//            session.delete(child);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
        }finally {
            session.close();
            factory.close();
        }

    }
}
