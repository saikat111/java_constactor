public class teacher {
    String name;
    String subject;
    int age;

    teacher(String name,String subject,int age)
    {
   this.name=name;
   this.subject=subject;
   this.age=age;

    }
    void teacherout(){

        System.out.println("Name:"+name);
        System.out.println("subject:"+subject);
        System.out.println("age:"+age);
    }
}

