package SchoolManagementSystem;
/** this class responsible for keepig the track of fees,name,fees paid, grade

 *
 */

public class Student {
    private int id;
    private String name;
    private  int grade;
    private int feesPaid;
    private int feesTotal;

    /** constractor
     * to create a new student initialiging
     * @param id id for the student unique
     * @param name name for the student
     * @param grade grade of the student
     */
    public Student(int id, String name, int grade){
        this.feesPaid = 0;
        this.feesTotal = 100;
        this.id = id;
        this.name = name;
        this.grade = grade;
        // not going to alter students id and name

    }
    /**
     * used to update students grade
     * new grade for the students
     */
    public void setGrade(int grade) {
    this.grade = grade;
    }

    public void payFees (int fees){
    feesPaid += fees;
    School.updateTotalMoneyEarned(feesPaid);
    //feespaid+=fees
    }

    /**
     *
     * @return id for student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name for student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return grade for student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return feespaid for student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return totalfees of the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "student name is " +name+ " total fees paid " +feesPaid;
    }
}
