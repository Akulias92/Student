package StudentCourse;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student firstStudent = new Student();
        Student secondStudent = new Student();

        firstStudent.id = 1;
        firstStudent.firstName = "Ivona";
        firstStudent.lastName = "Matic";

        secondStudent.id = 2;
        secondStudent.firstName = "Ivan";
        secondStudent.lastName = "Kostic";

        Book Book1 = new Book();
        Book Book2 = new Book();

        Book1.title = "Java Object";
        Book1.authors = new String[]{
            "1.Bart Beasens,"
            + "2.Aime Backiel,"
            + "3.Seppe Broucke"
        };
        Book1.yearRealeased = 2012;
        Book1.nrOfPages = 1245;
        

        Book2.title = "Java Foundamental";
        Book2.authors = new String[]{"luka Kurcubic"};
        Book2.yearRealeased = 2010;
        Book2.nrOfPages = 654;
        

        System.out.println("-------------------------------------------");
        System.out.println("Student id number: " + secondStudent.id + "\nFirst name:" + secondStudent.firstName + "\nLast name:" + secondStudent.lastName);
        System.out.println("-------------------------------------------");
        System.out.println("Student id number: " + firstStudent.id + "\nFirst name:" + firstStudent.firstName + "\nLast name:" + firstStudent.lastName);
        System.out.println("-------------------------------------------");
          
        System.out.println("Book name:" + Book1.title + "\nAuthors:" + Arrays.toString(Book1.authors) + "\nBook is realeased:" + Book1.yearRealeased + "\nNumber of pages:" + Book1.nrOfPages);
        System.out.println("Book name:" + Book2.title + "\nAuthors:" + Arrays.toString(Book2.authors) + "\nBook is realeased:" + Book2.yearRealeased + "\nNumber of pages:" + Book2.nrOfPages);
        
    }

}
