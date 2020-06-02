import java.util.Iterator;
import java.util.Set;

public class Application {

    public static void main(String[] args) throws Exception {

        //creating the objects
        Student student1Gr1 = new Student(44841,"Vasile");
        Student student2Gr1 = new Student(8984, "Gheorhe");
        Student student3Gr1 = new Student(28943, "Ion");
        Student student1Gr2 = new Student(566490,"Mircea");
        Student student2Gr2 = new Student(893384, "Vlad");
        Student student3Gr2 = new Student(2894311, "Radu");

        Course course1Tch1 = new Course(1234, "Maths");
        Course course2Tch1 = new Course(2345, "Java");
        Course course1Tch2 = new Course(123234, "Literature");
        Course course2Tch2 = new Course(234544, "Algebra");
        Course course1Tch3 = new Course(12443234, "Architecture");
        Course course2Tch3 = new Course(23454499, "Swimming");
        Course course1Tch4 = new Course(124234, "Photography");
        Course course2Tch4 = new Course(234549, "Anatomy");

        Teacher teacher1Gr1 = new Teacher(9034, "Constantin");
        Teacher teacher2Gr1 = new Teacher(8983, "Vasolica");
        Teacher teacher3Gr1 = new Teacher(6738, "Fasolea");
        Teacher teacher4Gr1 = new Teacher(7675, "Marin");
        Teacher teacher1Gr2 = new Teacher(901134, "Jack");
        Teacher teacher2Gr2 = new Teacher(892283, "Michael");
        Teacher teacher3Gr2 = new Teacher(673338, "Muhamad");
        Teacher teacher4Gr2 = new Teacher(764475, "Ali");

        Group group1 = new Group(95575, "First group");
        Group group2 = new Group(83890, "Second group");

        //filling the sets
        teacher1Gr1.addCourse(course1Tch1);
        teacher1Gr1.addCourse(course2Tch1);

        teacher2Gr1.addCourse(course1Tch2);
        teacher2Gr1.addCourse(course2Tch2);

        teacher3Gr1.addCourse(course1Tch3);
        teacher3Gr1.addCourse(course2Tch3);

        teacher4Gr1.addCourse(course1Tch4);
        teacher4Gr1.addCourse(course2Tch4);

        teacher1Gr2.addCourse(course1Tch4);
        teacher1Gr2.addCourse(course1Tch3);

        teacher2Gr2.addCourse(course1Tch1);
        teacher2Gr2.addCourse(course2Tch4);

        teacher3Gr2.addCourse(course2Tch2);
        teacher3Gr2.addCourse(course1Tch2);

        teacher4Gr2.addCourse(course2Tch1);
        teacher4Gr2.addCourse(course2Tch3);

        group1.addStudent(student1Gr1);
        group1.addStudent(student2Gr1);
        group1.addStudent(student3Gr1);

        group2.addStudent(student1Gr2);
        group2.addStudent(student2Gr2);
        group2.addStudent(student3Gr2);

        group1.addTeacher(teacher1Gr1);
        group1.addTeacher(teacher2Gr1);
        group1.addTeacher(teacher3Gr1);
        group1.addTeacher(teacher4Gr1);

        group2.addTeacher(teacher1Gr2);
        group2.addTeacher(teacher2Gr2);
        group2.addTeacher(teacher3Gr2);
        group2.addTeacher(teacher4Gr2);

        //displaying the info inserted in our objects & data structures
        System.out.println("\nGroup 1 contains the following info:" + group1.toString());
        System.out.println("\nGroup 2 contains the following info:" + group2.toString());

        //performing updates and showing how info changed
        //updating a course for 2 teachers teacher1Gr1.addCourse(course1Tch1); teacher3Gr2.addCourse(course2Tch2);

        System.out.printf("\nThe information for course %s taught by teacher %s changes as follows:\n", teacher1Gr1.getCourse(1234).getName(), teacher1Gr1.getName());
        System.out.print("Course ID: " + teacher1Gr1.getCourse(1234).getId() + " Course name: " + teacher1Gr1.getCourse(1234).getName());
        teacher1Gr1.updateCourse(course1Tch1, 7777, "Botanical science.");
        System.out.print("--changes to->" + "New ID: " + teacher1Gr1.getCourse(7777).getId() + " New course name: " + teacher1Gr1.getCourse(7777).getName() + "\n");

        System.out.printf("\nThe information for course %s taught by teacher %s changes as follows:\n", teacher3Gr2.getCourse(234544).getName(), teacher3Gr2.getName());
        System.out.print("Course ID: " + teacher3Gr2.getCourse(234544).getId() + " Course name: " + teacher3Gr2.getCourse(234544).getName());
        teacher3Gr2.updateCourse(course2Tch2, 6666, "Rock climbing");
        System.out.print("--changes to->" + "New ID: " + teacher3Gr2.getCourse(6666).getId() + " New course name: " + teacher3Gr2.getCourse(6666).getName() + "\n");

        //updating 2 teachers from different groups and showing how info changed
        //group1.addTeacher(teacher2Gr1); group2.addTeacher(teacher3Gr2);

        System.out.printf("\nThe information for teacher %s in group %s changes as follows:\n", group1.getTeacher(8983).getName(), group1.getName());
        System.out.print("Teacher ID: " + group1.getTeacher(8983).getId() + " Teacher name: " + group1.getTeacher(8983).getName());
        group1.updateTeacher(teacher2Gr1, 747474, "Agheorghesei");
        System.out.print("--changes to->" + "New ID: " + group1.getTeacher(747474).getId() + " New teacher name: " + group1.getTeacher(747474).getName() + "\n");

        System.out.printf("\nThe information for teacher %s in group %s changes as follows:\n", group2.getTeacher(673338).getName(), group2.getName());
        System.out.print("Teacher ID: " + group2.getTeacher(673338).getId() + " Teacher name: " + group2.getTeacher(673338).getName());
        group2.updateTeacher(teacher3Gr2, 636363, "Ceaunescu");
        System.out.print("--changes to->" + "New ID: " + group2.getTeacher(636363).getId() + " New teacher name: " + group2.getTeacher(636363).getName() + "\n");

        //updating 2 students from different groups
        //group1.addStudent(student2Gr1); group2.addStudent(student3Gr2);

        System.out.printf("\nThe information for student %s in group %s changes as follows:\n", group1.getStudent(8984).getName(), group1.getName());
        System.out.print("Teacher ID: " + group1.getStudent(8984).getId() + " Student name: " + group1.getStudent(8984).getName());
        group1.updateStudent(student2Gr1, 333333, "Niculaescov");
        System.out.print("--changes to->" + "New ID: " + group1.getStudent(333333).getId() + " New student name: " + group1.getStudent(333333).getName() + "\n");

        System.out.printf("\nThe information for student %s in group %s changes as follows:\n", group2.getStudent(2894311).getName(), group2.getName());
        System.out.print("Teacher ID: " + group2.getStudent(2894311).getId() + " Student name: " + group2.getStudent(2894311).getName());
        group2.updateStudent(student3Gr2, 222222, "Dana");
        System.out.print("--changes to->" + "New ID: " + group2.getStudent(222222).getId() + " New student name: " + group2.getStudent(222222).getName() + "\n");

        //removing 2 courses from different teachers and showing how the elements of those sets have changed
        //teacher1Gr2.addCourse(course1Tch4); teacher4Gr2.addCourse(course2Tch3);

        Set<Course> coursesTeacher = teacher1Gr2.getCourses();
        System.out.printf("\nTeacher %s teaches the following courses at the moment:\n", teacher1Gr2.getName());
        Iterator<Course> itr = coursesTeacher.iterator();
        while (itr.hasNext()){
            Course currentCourse = itr.next();
            System.out.printf("\n\t\tCourse ID: %d Course name: %s", currentCourse.getId(), currentCourse.getName() + "\n");
        }
        System.out.printf("\nAfter removing course %s, teacher %s will teach:", teacher1Gr2.getCourse(124234).getName(), teacher1Gr2.getName());
        teacher1Gr2.removeCourse(124234);
        coursesTeacher = teacher1Gr2.getCourses();
        itr = coursesTeacher.iterator();
        while (itr.hasNext()){
            Course currentCourse = itr.next();
            System.out.printf("\n\t\tCourse ID: %d Course name: %s", currentCourse.getId(), currentCourse.getName() + "\n");
        }

        System.out.printf("\nTeacher %s teaches the following courses at the moment:\n", teacher4Gr2.getName());
        coursesTeacher = teacher4Gr2.getCourses();
        itr = coursesTeacher.iterator();
        while (itr.hasNext()){
            Course currentCourse = itr.next();
            System.out.printf("\n\t\tCourse ID: %d Course name: %s", currentCourse.getId(), currentCourse.getName() + "\n");
        }
        System.out.printf("\nAfter removing course %s, teacher %s will teach:\n", teacher4Gr2.getCourse(23454499).getName(), teacher4Gr2.getName());
        teacher4Gr2.removeCourse(23454499);
        coursesTeacher = teacher4Gr2.getCourses();
        itr = coursesTeacher.iterator();
        while (itr.hasNext()){
            Course currentCourse = itr.next();
            System.out.printf("\n\t\tCourse ID: %d Course name: %s", currentCourse.getId(), currentCourse.getName() + "\n");
        }

        //removing 2 teachers from different groups and showing how the elements of those sets have changed
        //group1.addTeacher(teacher3Gr1);group2.addTeacher(teacher2Gr2);

        System.out.printf("\n\nGroup %s has the following teachers at the moment:\n", group1.getName());
        Set<Teacher> teachersGroup = group1.getTeachers();
        Iterator<Teacher> itr1 = teachersGroup.iterator();
        while (itr1.hasNext()){
            Teacher currentTeacher = itr1.next();
            System.out.printf("\n\t\tTeacher ID: %d Teacher name: %s", currentTeacher.getId(), currentTeacher.getName());
        }
        System.out.printf("\n\nGroup %s has the following teachers after removing teacher %s:\n", group1.getName(), group1.getTeacher(6738).getName());
        group1.removeTeacher(6738);
        teachersGroup = group1.getTeachers();
        itr1 = teachersGroup.iterator();
        while (itr1.hasNext()){
            Teacher currentTeacher = itr1.next();
            System.out.printf("\n\t\tTeacher ID: %d Teacher name: %s", currentTeacher.getId(), currentTeacher.getName());
        }
        System.out.printf("\n\nGroup %s has the following teachers at the moment:\n", group2.getName());
        teachersGroup = group2.getTeachers();
        itr1 = teachersGroup.iterator();
        while (itr1.hasNext()){
            Teacher currentTeacher = itr1.next();
            System.out.printf("\n\t\tTeacher ID: %d Teacher name: %s", currentTeacher.getId(), currentTeacher.getName());
        }
        System.out.printf("\n\nGroup %s has the following teachers after removing teacher %s:\n", group2.getName(), group2.getTeacher(892283).getName());
        group2.removeTeacher(892283);
        teachersGroup = group2.getTeachers();
        itr1 = teachersGroup.iterator();
        while (itr1.hasNext()){
            Teacher currentTeacher = itr1.next();
            System.out.printf("\n\t\tTeacher ID: %d Teacher name: %s", currentTeacher.getId(), currentTeacher.getName());
        }

        //removing 2 students from different groups and showing how the elements of those sets have changed
        //group1.addStudent(student1Gr1);group2.addStudent(student2Gr2);

        System.out.printf("\n\nGroup %s has the following students at the moment:\n", group1.getName());
        Set<Student> studentsGroup = group1.getStudents();
        Iterator<Student> itr2 = studentsGroup.iterator();
        while (itr2.hasNext()){
            Student currentStudent = itr2.next();
            System.out.printf("\n\t\tStudent ID: %d Student name: %s", currentStudent.getId(), currentStudent.getName());
        }
        System.out.printf("\n\nGroup %s has the following students after removing student %s:\n", group1.getName(), group1.getStudent(44841).getName());
        group1.removeStudent(44841);
        studentsGroup = group1.getStudents();
        itr2 = studentsGroup.iterator();
        while (itr2.hasNext()){
            Student currentStudent = itr2.next();
            System.out.printf("\n\t\tStudent ID: %d Student name: %s", currentStudent.getId(), currentStudent.getName());
        }

        System.out.printf("\n\nGroup %s has the following students at the moment:\n", group2.getName());
        studentsGroup = group2.getStudents();
        itr2 = studentsGroup.iterator();
        while (itr2.hasNext()){
            Student currentStudent = itr2.next();
            System.out.printf("\n\t\tStudent ID: %d Student name: %s", currentStudent.getId(), currentStudent.getName());
        }
        System.out.printf("\n\nGroup %s has the following students after removing student %s:\n", group2.getName(), group2.getStudent(893384).getName());
        group2.removeStudent(893384);
        studentsGroup = group2.getStudents();
        itr2 = studentsGroup.iterator();
        while (itr2.hasNext()){
            Student currentStudent = itr2.next();
            System.out.printf("\n\t\tStudent ID: %d Student name: %s", currentStudent.getId(), currentStudent.getName());
        }
    }
}
