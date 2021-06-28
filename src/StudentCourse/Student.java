package StudentCourse;

public class Student {

   public int id, birthDay, birthYear, birthMonth;
   public String firstName, lastName;
   
   public Student(){
       
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
   

   
   public boolean isBirthDay() {

        return false;
    }

    public void giveWarning(boolean isFinalWarning) {
    }

    public int numberOfFriends() {
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", birthDay=" + birthDay + ", birthYear=" + birthYear + ", birthMonth=" + birthMonth + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }

}
