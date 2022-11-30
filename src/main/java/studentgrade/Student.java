package studentgrade;

public class Student {
    /*
    Student Sınıfı Özellikleri :
Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote()(topluNote girisi), isPass(), calcAvarage(), printNote()

     */
    public String stdName;
    public String stdNo;
    public String className;
    public Course mat;
    public Course fizik;
    public Course kimya;
    public double avarage;
    public boolean isPass;

    public Student(String stdName, String stdNo, String className, Course mat, Course fizik, Course kimya) {
        this.stdName = stdName;
        this.stdNo = stdNo;
        this.className = className;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;

    }

    public void addBulkExamNote(int mat,int fizik,int kimya){
        if (mat>=0 && mat<=100){
            this.mat.note=mat;
        }
        if (fizik>=0 && fizik<=100){
            this.fizik.note=fizik;
        }
        if (kimya>=0 && kimya<=100){
            this.kimya.note=kimya;
        }
    }
    public void isPass(){
        if ( this.mat.note==0||this.fizik.note==0||this.kimya.note==0){
            System.out.println("herhangi not girisi olmamistir");
        }else {
            this.isPass=checkPoint();
            System.out.println("ortalam: "+avarage);
            if (checkPoint()){
                System.out.println("dersi gectiniz");
            }else System.out.println("dersten kaldiniz");

        }
    }

    private boolean checkPoint() {
        calcAvarage();
        return avarage >55;

    }

    private void calcAvarage() {
        this.avarage=(this.mat.note+this.fizik.note+this.kimya.note)/3;
    }
    public void printNote(){
        System.out.println("Ogrenci adi: "+this.stdName+"\nMat Notu: "+this.mat.note+"\nFizik Notu: "+this.fizik.note+
                "\nKimya Notu: "+this.kimya.note);
    }
}
