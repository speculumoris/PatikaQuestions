package studentgrade;

public class Course {
    /*
    Course Sınıfı Özellikleri :
    Nitelikler : name,code,prefix,note,Teacher(teacher class'indan alinacak)
    Metotlar : Course()(contructor) , addTeacher() , printTeacher()
     */
    public String courseName;
    public String lessonCode;
    public String prefix;
    int note;
    int SozluNotu;
    Teacher teacherName;

    public Course(String courseName, String lessonCode, String prefix) {
        this.courseName = courseName;
        this.lessonCode = lessonCode;
        this.prefix = prefix;
        this.note=0;
    }
    public void addTeacher(Teacher t){
        if (t.branch.equalsIgnoreCase(prefix)){
            teacherName=t;
        }else System.out.println("bu dersin hocasi "+teacherName.toString()+" degildir");
    }
    public void printTeacher(){
        if(teacherName!=null){
            System.out.println(courseName+" dersinin hocasi "+teacherName.toString()+"'dir");
        }else {
            System.out.println(lessonCode+" dersine hoca atanmamistir");
        }
    }
}
