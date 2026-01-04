public class T9Q1 {

    static class Person {
        String name;
        public Person(String name) {
            this.name = name;
        }
    }

    static class Student extends Person {

        public Student(String name) {
            super(name);
            this.name = name;
        }
    }

    static class Teacher extends Person{

        public Teacher (String name) {
            super(name);
            this.name = name;
        }
    }

    // a. Write  a  static  method  compare  that  return  true  if  two  objects  parameter 
    //   (Student s, Teacher t) are belongs to the same class. Otherwise return false.

    public static boolean compare (Student s, Teacher t) {
        return s.getClass().equals(t.getClass());
    }

    // b. Write a static method isClass that return true if the object parameter
    //    (Student s) is belong to any decendent clas of Person. Otherwise return false.

    public static boolean isClass (Student s) {
        return s instanceof Person;
    }

    public static void main(String[] args) {

        Student s1 = new Student("Jamilah");
        Teacher t1 = new Teacher("Mr. William Kacip");

        System.out.println(compare(s1, t1));
        System.out.println(isClass(s1));
    }
}
