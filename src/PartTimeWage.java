public class PartTimeWage {
    public static void main(String[] args) {
        int PartTime = 1;
        int FullTime = 2;
        int wageperHour = 20;
        int workingHour = 8;
        int empwage = 0;
        int attendance = (int) (Math.random()*100)%3;
        if (attendance == PartTime) {
            workingHour = 8;
        }
        else if (attendance == FullTime ) {
            workingHour = 8;
        }
        else {
            workingHour = 0;
        }
        empwage = workingHour*wageperHour ;
        System.out.println("Employee Wage : "+ empwage);
    }
}
