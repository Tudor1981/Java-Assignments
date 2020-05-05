//A Date class with some functionalities.

public class Date {

    private int month;
    private int day;
    private int year;
    private String date;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDate() {
        if (year >= 0) {
            date = month + "/" + day + "/" + year + " A.C.";
        }else{
            date = month + "/" + day + "/" + Math.abs(year) + " B.C.";
        }
        return date;
    }

    public void displayDate(){
        if (year >= 0) {
            System.out.println(month + "/" + day + "/" + year + " A.C.");
        }else{
            System.out.println(month + "/" + day + "/" + Math.abs(year) + " B.C.");
        }
    }

    @Override
    public String toString(){
        String result;
        result = "The month is: " + this.getMonth() + ";\n";
        result += "The day is: " + this.getDay() + ";\n";
        result += "The year is: " + this.getYear() + ".\n";
        return result;
    }
}
