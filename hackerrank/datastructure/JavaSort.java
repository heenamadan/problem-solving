package hackerrank.datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by heena.madan on 27/08/17.
 */

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class Compare implements Comparator{

    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        if (s1.getCgpa()==s2.getCgpa()) {
            if (s1.getFname()==s2.getFname()) {
                if (s1.getId() < s2.getId()) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
            else {
                return s1.getFname().compareTo(s2.getFname());
            }
        }

        else if (s1.getCgpa() < s2.getCgpa()) {
            return 1;
        } else {
            return -1;
        }
    }


}
public class JavaSort {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Compare compare = new Compare();
        Collections.sort(studentList, compare);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}


//    Sample Input
//
//5
//        33 Rumpa 3.68
//        85 Ashis 3.85
//        56 Samiha 3.75
//        19 Samara 3.75
//        22 Fahim 3.76
//        Sample Output
//
//        Ashis
//        Fahim
//        Samara
//        Samiha
//        Rumpa