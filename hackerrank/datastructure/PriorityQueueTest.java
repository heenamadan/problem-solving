//package hackerrank.datastructure;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.PriorityQueue;
//import java.util.Scanner;
//
///**
// * Created by heena.madan on 02/09/17.
// */
//class Priorities{
//
//    List<Student>  getStudents(List<String> events){
//        List<Student> students = new ArrayList<>();
//        for(String event: events){
//            String[] array= event.split(" ");
//            String command = array[0];
//            if (command.equals("ENTER")) {
//                String name = array[1];
//                double cgpa = Double.parseDouble(array[2]);
//                int token = Integer.parseInt(array[3]);
//                students.add(new Student2(token, name, cgpa));
//            }
//
//            else if (command.equals("SERVED")) {
//                priorityQueue.poll();
//            }
//
//
//        }
//
//    }
//}
//
//public class PriorityQueueTest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        PriorityQueue<Student1> priorityQueue = new PriorityQueue<Student1>((s1,s2)->(s1.cgpa!=s2.cgpa)? Double.compare(s1.cgpa,s2.cgpa):(!s1.name.equals(s2.name))
//                ? s1.name.compareTo(s2.name):Integer.compare(s1.token,s2.token));
//        for (int i = 0; i < n; i++) {
//            String command = sc.next();
//            if (command.equals("ENTER")) {
//                String name = sc.next();
//                double cgpa = sc.nextDouble();
//                int token = sc.nextInt();
//
//                priorityQueue.offer(new Student1(token, name, cgpa));
//            } else if (command.equals("SERVED")) {
//                priorityQueue.poll();
//            }
//        }
//
//
//        if(priorityQueue.isEmpty()){
//            System.out.println("EMPTY");
//        }
//
//
//        else {
//            while (!priorityQueue.isEmpty()) {
//                System.out.println(priorityQueue.poll().name);
//            }
//        }
//
//        sc.close();
//
//
//    }
//}
//
//class StudentComparator implements Comparator<Student2> {
//    double epsilon = 0.001;
//    @Override
//    public int compare(Student2 s1, Student2 s2) {
//        if (Math.abs(s1.getCgpa() - s2.getCgpa()) > epsilon) {
//            return s1.getCgpa() < s2.getCgpa() ? 1 : -1; // descending order
//        } else if ( ! s1.getFname().equals(s2.getFname())) {
//            return s1.getFname().compareTo(s2.getFname());
//        } else {
//            return s1.getToken() - s2.getToken();
//        }
//    }
