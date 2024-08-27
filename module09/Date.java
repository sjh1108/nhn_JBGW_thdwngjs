public class Date {
    private int year, month, day;

    public Date(){
        this.year = 1971;
        this.month = 4; 
        this.day = 28;
    }

    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString(){
        return this.year + "-" + this.month + "-" + this.day; 
    }
}

class Test{
    public static void main(String[] args){
        Date date = new Date(1993, 1, 1);

        System.out.println(date);
    }
}