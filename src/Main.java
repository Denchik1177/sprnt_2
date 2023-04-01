import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MonthlyReport monthlyReport = new MonthlyReport();
        YearlyReport yearlyReport = new YearlyReport("resources/y.2021.csv");
    Checker checker= new Checker(monthlyReport, yearlyReport);
    boolean answer= checker.check();
        System.out.println("резульатат проверки"+ answer);

      }
}