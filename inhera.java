public class inhera {
    public static void main(String args[]){
School s1=new School();
System.out.println(s1.name="Aishwarya");
 System.out.println(s1.rollno=2);
System.out.println(s1.schoolname="st.joseph");
s1.year();
s1.marks();
s1.atte();
    }
}

class Student{
    String name;
    int rollno;
    void marks(){
        System.out.println("she is studying weel");
    }
    void atte(){
        System.out.println("she is attending classes");
    }

}

class School extends Student{
    String schoolname;
    void year(){
        System.out.println("she is studying in 10th class");
    }
}