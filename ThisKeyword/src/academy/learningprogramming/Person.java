package academy.learningprogramming;

public class Person {

    private String firstName;
    private String lastName;

    public Person() {
        this("Eric", "Jonson");
    }

    public Person(String firstName, String last) {
        //this(); // it never ends, does not compile

        this.firstName = firstName;
        //this.lastName = last;
        //String lastName = "myName";
        lastName = last;
    }

    public void setFirstName(String  firstName) {
        //this(); // does not compile
        this.firstName = firstName;
    }

    public String getFristName() {
        return firstName;
    }

    public String getFullName() {
        // return this.firstName + " " + this.lastName;
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {

    }

}
