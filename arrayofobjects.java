class Student{
    int id;
    String name;
    Student(int i,String n){
        id=i;
        name=n;
    }

}
public class arrayofobjects{
    public static void main(String[]args){
        Student s1=new Student(101,"Ravi");
        Student s2=new Student(102,"Vijay");
        Student s3=new Student(103,"Ajay");
        Student[] arr=new Student[3];
        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].id+" : "+arr[i].name);
        }
    }
    
}
