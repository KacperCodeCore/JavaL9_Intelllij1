import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = Integer.compare(o1.getYearbook(), o2.getYearbook());
        if (result == 0){
            result = Double.compare(o1.getAverageGrade(), o2.getAverageGrade());
            if (result == 0){
                result = o1.getSurname().compareTo(o2.getSurname());
            }
        }
        return result;
    }
}
