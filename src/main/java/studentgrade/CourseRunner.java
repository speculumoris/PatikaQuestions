package studentgrade;

public class CourseRunner {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Sülüman Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Yasin bey", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ozlem Hoca", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student usuf=new Student("Yusuf","1907","IKT1",mat,fizik,kimya);
        usuf.addBulkExamNote(90,80,100);
        usuf.isPass();

    }
}
