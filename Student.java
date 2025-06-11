Public class Student
{
 static String schoolName = "Greenwood High";
    String studentName;

    public void display()
    {
        System.out.println("Student Name: " + studentName);
        System.out.println("School Name: " + schoolName);
    }

    public static void main(String[] args) 
   {
        Student s1 = new Student();
        s1.studentName = "Aarav";
        Student s2 = new Student();
        s2.studentName = "Isha";

        s1.display();
        s2.display();
    }
}