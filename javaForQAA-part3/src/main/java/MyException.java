public class MyException extends Exception {
    public MyException(Teacher teacher) {
        super("Teacher " + teacher.toString() + " returned a null object");
    }

    public MyException(Group group) {
        super("Teacher " + group.toString() + " returned a null object");
    }
}
