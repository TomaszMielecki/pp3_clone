public class StudentTest {    
    public static void main(String[] args) {
        
        Student s = new Student();
        
        s.name = "Peter";
        s.age = 21;
        System.out.println(s.name + " " + s.age);

        Student s1 = new Student();

        s1.name = "Carl";
        s1.age = 22;
        System.out.print(s1.name + " "+ s1.age);

        Student s2 = new Student();

        s2.name = "Lucas";
        s2.age = 19;
        System.out.print(s2.name + " " + s2.age);

    }

}

