package lab6;
import java.util.Comparator;

public class StudComparator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.getSUM() - o2.getSUM();
    }
}
