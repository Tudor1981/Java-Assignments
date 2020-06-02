import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Group {

    private int id;

    private String name;

    private Set<Teacher> teachers;

    private Set<Student> students;

    public Group(int id, String name) {
        if (id >= 0) {
            this.id = id;
        } else {
            this.id = 0;
        }
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Unknown";
        }

        teachers = new HashSet<Teacher>();
        students = new HashSet<Student>();
    }

    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        } else {
            this.id = 0;
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Unknown";
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public Teacher getTeacher(int id) throws MyException {

        Teacher foundTeacher = null;
        Iterator<Teacher> itr = this.teachers.iterator();
        while (itr.hasNext()) {
            Teacher currentTeacher = itr.next();
            if (currentTeacher.getId() == id) {
                foundTeacher = currentTeacher;
                break;
            }
        }

        if (foundTeacher != null) {
            return foundTeacher;
        } else {
            throw new MyException(this);
        }
    }

    public void addTeacher(Teacher teacher) {
        if (teacher != null) {
            teachers.add(teacher);
        } else {
            System.out.println("Will not add a null teacher.");
        }
    }

    public void updateTeacher(Teacher teacher, int id, String name) {

        if (this.teachers.contains(teacher)) {
            Teacher updatedTeacher = new Teacher(id, name);
            this.teachers.remove(teacher);
            this.teachers.add(updatedTeacher);
        } else {
            System.out.println("Could not find the teacher to be updated.");
        }
    }

    public void removeTeacher(int id) {

        Iterator<Teacher> itr = this.teachers.iterator();
        while (itr.hasNext()) {
            Teacher removedTeacher = itr.next();
            if (removedTeacher.getId() == id) {
                this.teachers.remove(removedTeacher);
                break;
            }
        }
    }

    public Set<Student> getStudents() {
        return students;
    }

    public Student getStudent(int id) throws MyException {
        Student foundStudent = null;
        Iterator<Student> itr = this.students.iterator();
        while (itr.hasNext()) {
            Student currentStudent = itr.next();
            if (currentStudent.getId() == id) {
                foundStudent = currentStudent;
                break;
            }
        }
        if (foundStudent != null) {
            return foundStudent;
        } else {
            throw new MyException(this);
        }
    }

    public void addStudent(Student student) {
        if (student != null) {
            students.add(student);
        } else {
            System.out.println("Will not add a null student.");
        }
    }

    public void updateStudent(Student student, int id, String name) {

        if (this.students.contains(student)) {
            Student updatedStudent = new Student(id, name);
            this.students.remove(student);
            this.students.add(updatedStudent);
        } else {
            System.out.println("Student to be updated not found!");
        }
    }

    public void removeStudent(int id) {

        Iterator<Student> itr = this.students.iterator();
        while (itr.hasNext()) {
            Student removedStudent = itr.next();
            if (removedStudent.getId() == id) {
                students.remove(removedStudent);
                break;
            }
        }
    }

    @Override
    public String toString() {
        String result;
        Set<Student> memberStudents = getStudents();
        Set<Teacher> memberTeachers = getTeachers();
        result = "\nGroup id: " + getId() + " Group name: " + getName();
        result += "\nThis group has the following students:";
        for (Student currentStudent : memberStudents){
            result += "\n\tStudent id: " + currentStudent.getId() + " Student name: " + currentStudent.getName();
        }
        result += "\nThis group has the following teachers:";
        for (Teacher currentTeacher : memberTeachers){
            Set<Course> memberCourses = currentTeacher.getCourses();
            result += "\n\tTeacher id: " + currentTeacher.getId() + " Teacher name: " + currentTeacher.getName() +
            " teaches: ";
            for (Course currentCourse : memberCourses){
                result += "\n\t\t\tCourse id: " + currentCourse.getId() + " Course name: " + currentCourse.getName();
            }
        }
        return result;
    }
}
