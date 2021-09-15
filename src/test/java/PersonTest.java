import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonTest {
    @Test
    public void person_instantiatesCorrectly_true(){
        Person testPerson = new Person("Henry", "allanlimo@gmail.com");
        assertEquals(true, true);
    }
    @Test
    public void name_instantiatesCorrectly_true(){
        Person testPerson = new Person("Henry", "allanlimo@gmail.com");
        assertEquals("Henry", testPerson.getName());    }
    @Test
    public void email_instantiatesCorrectly_true(){
        Person testPerson = new Person("Henry", "allanlimo@gmail.com");
        assertEquals("allanlimo@gmail.com", testPerson.getEmail());
    }
    @Test
    public void equals_returnsTrueIfNameAndEmailAreSame_true() {
        Person firstPerson = new Person("Henry", "allanlimo@gmail.com");
        Person anotherPerson = new Person("Henry", "allanlimo@gmail.com");
        assertTrue(firstPerson.equals(anotherPerson));
    }
    @Test
    public void save_insertsObjectIntoDatabase_Person() {
        Person testPerson = new Person("Henry", "allanlimo@gmail.com");
        testPerson.save();
        assertTrue(Person.all().get(0).equals(testPerson));
    }



}