public class EmployeeMonthWage implements Salary {
    @Override
    public void Salary ( ) {
        int salaryPerMonth = 18000;
        int result;
        result = 12 * salaryPerMonth;

        System.out.println( "Worker salary is " + salaryPerMonth + " hryvnias per one Month" );
        System.out.println( "Workers salary " + result + " hryvnias for all Year" );
    }
}
