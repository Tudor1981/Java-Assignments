import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Teacher {

    private  int id;
    private String name;
    private Set<Course> courses;

    public Teacher(int id, String name) {
        if (id > 0) {
            this.id = id;
        }else {
            this.id = 0;
        }
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }else {
            this.name = "Unknown";
        }
        this.courses = new HashSet<Course>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Course> getCourses(){
        return this.courses;
    }

    public Course getCourse(int id) throws MyException {
        Course foundCourse = null;
        Iterator<Course> itr = this.courses.iterator();
        while (itr.hasNext()){
            Course currentCourse = itr.next();
            if (currentCourse.getId() == id){
                foundCourse = currentCourse;
                break;
            }
        }
        if (foundCourse != null) {
            return foundCourse;
        }else {
            throw new  MyException(this);
        }
    }

    public void addCourse(Course course){
        if (course != null) {
            this.courses.add(course);
        }else {
            System.out.println("Will not add a null course.");
        }
    }

    public void updateCourse(Course course, int id, String name){

        if (courses.contains(course)){
            Course updatedCourse = new Course(id, name);
            this.courses.remove(course);
            this.courses.add(updatedCourse);
        }else {
            System.out.println("Course to be updated not found.");
        }
    }

    public void removeCourse(int id){

        Iterator<Course> itr = this.courses.iterator();
        while (itr.hasNext()){
            Course removedCourse = itr.next();
            if (removedCourse.getId() == id){
                this.courses.remove(removedCourse);
                break;
            }
        }
    }

}
