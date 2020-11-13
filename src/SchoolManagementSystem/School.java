package SchoolManagementSystem;

import java.util.List;

public class School {
    /**
     * many teachers, many students
     * using arraylist
     */
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneySpent;
    private static int totalMoneyEarned;

    /**
     * new school object is created
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     *
     * @param teacher add another teacher
     */
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);

}
    //public void addTeacher(Teacher teachers) {


    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }
}
