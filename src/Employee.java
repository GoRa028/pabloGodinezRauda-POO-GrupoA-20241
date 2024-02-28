public class Employee {

    public double calculateSalary(double bSalary) {
        return bSalary;
    }

    public double calculateSalary(double bSalary, double bon) {
        double ans;
        return ans=bSalary+bon;
    }

    public double calculateSalary(double bSalary, int hours) {
        double ans;
        return ans=bSalary+(hours*20);
    }

    public double calculateSalary(double bSalary, double bon, int hours) {
        double ans;
        return ans=bSalary+bon+(hours*20);
    }

}
