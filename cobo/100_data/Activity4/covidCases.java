import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class covidCases {
   public static void main(String[] args) {
      DataSource ds = DataSource.connect("https://www.kaggle.com/datasets/imdevskp/corona-virus-report").load();
      ArrayList<covidCases> allstns = ds.fetchList("Country/Region", "Confirmed", "Recovered", "Deaths");
      System.out.println("Total countries " + allstns.size());

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a country: ");
      String userCountry = sc.next();
      System.out.println("Number of confirmed cases in " + userCountry);


      for (covidCases ws : allstns) {
         if (ws.getCountry().equals(userCountry)) {
            System.out.println("  " + ws.getConfirmed());
         }
       }
     }// end main
}
