package employeeManagmentSystem;


public class Teaching extends Employee{
    // variables
    private Course course;
    private boolean isTeaching = true;
    private int noOfWorkingHours;

    public Teaching(String name, String id, int age, int salary, int noOfWorkingHours , College c) {
        super(name, id, age, salary);
        this.isTeaching = true;
        this.noOfWorkingHours = noOfWorkingHours;
        c.addEmployee(this);
    }

    // getters and setters
    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public boolean isIsTeaching() {
        return this.isTeaching;
    }

    public int getNoOfWorkingHours() {
        return this.noOfWorkingHours;
    }

    public void setNoOfWorkingHours(int noOfWorkingHours) {
        this.noOfWorkingHours = noOfWorkingHours;
    }    

    public void getDetails() {
        super.getDetails();
        System.out.println("Course He/She teaches : " + this.course.getCourseName());
    }

    public void getCourseDetailsOfTeacher() {
        this.course.getCourseDetails();
    }

    public boolean isTeacher() {
        return this.isTeaching;
    }
}
