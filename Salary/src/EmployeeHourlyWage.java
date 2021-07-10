public class EmployeeHourlyWage implements Salary{
    @Override
    public void Salary ( ) {
            int salaryPerHour = 100;
            int workingHours = 8;
            int workingDays = 21;
            int result;

            result = workingDays * workingHours * salaryPerHour;

            System.out.println("Workers salary is " + result + " at the end of the month ");
            System.out.println("Workers salary " + result*12 + " hryvnias for all Year" + "\n");
    }
}
