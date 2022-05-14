//public class Student implements Comparable<Student> {
public class Student {
    private int yearbook;
    private String surname;
    private double averageGrade;

    public int getYearbook() {
        return yearbook;
    }

    public void setYearbook(int yearbook) {
        this.yearbook = yearbook;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(float averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Student(int yearbook, String surname, double averageGrade) {
        this.yearbook = yearbook;
        this.surname = surname;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "yearbook=" + yearbook +
                ", averageGrade='" + averageGrade + '\'' +
                ", surname=" + surname +
                '}';
    }

}
