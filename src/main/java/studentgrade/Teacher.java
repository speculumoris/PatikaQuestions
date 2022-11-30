package studentgrade;

public class Teacher {
    /*
    Teacher Sınıfı Özellikleri :
    Nitelikler : name,mpno,branch
    Metotlar : Teacher()
     */
    public String teacherName;
    public String telNo;
    public String branch;

    public Teacher(String teacherName, String telNo, String branch) {
        this.teacherName = teacherName;
        this.telNo = telNo;
        this.branch = branch;
    }
}
