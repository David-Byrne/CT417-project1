import org.joda.time.DateTime;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import project1.Student;

public class TestStudent {

    @Test
    public void testGetUsername(){
        Student stu1 = new Student("Joe", 18, new DateTime(), "123");
        assertEquals("Joe18", stu1.getUsername());

        Student stu2 = new Student("", 23, new DateTime(), "444");
        assertEquals("23", stu2.getUsername());

        Student stu3 = new Student("Alice Jones", 7, new DateTime(), "444");
        assertEquals("Alice Jones7", stu3.getUsername());
    }

}
