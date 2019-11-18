package demo01;

public class Studentchange {
    public static void main(String[] args){
        student stu = new student();
        stu.setName("gkd");
        stu.setAge(20);
        System.out.println("名字:"+stu.getName()+"     "+"年龄:"+stu.getAge());
        student stu2 =new student("gdx",25);
        System.out.println("名字:"+stu2.getName()+"     "+"年龄:"+stu2.getAge());
    }
}
