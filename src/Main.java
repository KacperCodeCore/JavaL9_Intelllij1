import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("\nExe 2*////////////////////////////////////////////////////////////////////\n");

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(2000, "kacper",4.5));
        studentList.add(new Student(2001, "Karol",4.9));
        studentList.add(new Student(2002, "Krystian",3.5));
        studentList.add(new Student(2003, "Beata",2.4));
        studentList.add(new Student(2003, "Ala",4.9));
        studentList.add(new Student(2003, "Anastazja",4.9));
        studentList.add(new Student(2003, "Zygmunt",5));
        studentList.add(new Student(2003, "Jurek",4.9));
        studentList.add(new Student(2003, "Helga",4.5));

        studentList.sort(new StudentComparator());

//        Stream<Student> studentStream = studentList.stream();
//        studentStream
//                .filter(e1 -> e1.getYearbook() > 2000)
//                .filter(e1 -> e1.getAverageGrade() > 4)
//                .toList()
//                .forEach(System.out::println);
//
//        System.out.println("\nExe 2*////////////////////////////////////////////////////////////////////\n");
        for (Student s: studentList) {
            System.out.println(s.toString());
        }

        System.out.println("\nExe 3*////////////////////////////////////////////////////////////////////\n");
        System.out.println("     arrayList////////////////////////////////////\n");

        Map<Integer, String> map = new HashMap<>();
        List<String> arrayList = new ArrayList<>();
        long start, stop;


        start = System.currentTimeMillis();
        for(int i=0; i<1000000; i++)
        {
            arrayList.add("Dodawanie i = " + i);
        }
        stop = System.currentTimeMillis();
        System.out.println("Czas dodawania " + (stop - start));

        start = System.currentTimeMillis();
        for(int i=0; i<arrayList.size(); i++)
        {
            arrayList.get(i);
        }
        stop = System.currentTimeMillis();
        System.out.println("Czas odczytywania " + (stop - start));

        start = System.currentTimeMillis();
        for(int i=0; i<arrayList.size(); i++)
        {
            arrayList.set(i, "Nadpisywanie i = " + i);
        }
        stop = System.currentTimeMillis();
        System.out.println("Czas nadpisywania " + (stop - start));

        start = System.currentTimeMillis();
        for(int i=0; i<arrayList.size(); i++)
        {
            arrayList.remove(i);
        }
        stop = System.currentTimeMillis();
        System.out.println("Czas usuwania " + (stop - start));


        System.out.println("     map//////////////////////////////////////////\n");


        start = System.currentTimeMillis();
        for(int i=1; i<=1000000; i++)
        {
            map.put(i, "Dodawanie i = " + i);
        }
        stop = System.currentTimeMillis();
        System.out.println("Czas dodawania " + (stop - start));

        start = System.currentTimeMillis();
        for(int i=1; i<=map.size(); i++)
        {
            map.get(i);
        }
        stop = System.currentTimeMillis();
        System.out.println("Czas czytania " + (stop - start));

        start = System.currentTimeMillis();
        for(int i=1; i<=map.size(); i++)
        {
            map.replace(i, "Nadpisanie i = " + i);
        }
        stop = System.currentTimeMillis();
        System.out.println("Czas nadpisania " + (stop - start));

        start = System.currentTimeMillis();
        for(int i=1; i<=map.size(); i++)
        {
            map.remove(i);
        }
        stop = System.currentTimeMillis();
        System.out.println("Czas usuwania " + (stop - start));
    }
}