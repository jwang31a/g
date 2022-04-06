/*
Team Elmo :: Courtney Huang, Jun Hong Wang, Raven (Ruiwen) Tang
APCS pd6
LAB08 -- America's Next Top Data Scientist / cobo data lab
2022-04-06
time spent: 2.0 hrs
*/
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class covidCases {
   public static void main(String[] args) {
     ArrayList<covid> data = new ArrayList<>();
         try {
             Scanner input = new Scanner(new File("country_wise_latest.csv"));
             input.nextLine();
             while (input.hasNextLine()) {
                 String[] temp = input.nextLine().split(",");

                 String country = temp[0];
                 int confirmed = Integer.parseInt(temp[1]);
                 int recovered = Integer.parseInt(temp[3]);
                 int deaths = Integer.parseInt(temp[2]);

                 data.add(new covid(country, confirmed, recovered, deaths));
             }
             input.close();
         } catch (Exception e) {
             System.out.println("cannot find csv file");
         }


      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a country: ");
      String userCountry = sc.next();

      for (covid ws: data){
        if (ws.getCountry().equals(userCountry)) {
           System.out.println("Number of confirmed cases in " + userCountry);
           System.out.println("  " + ws.getConfirmed());
           System.out.println("Number of deaths due to covid in " + userCountry);
           System.out.println("  " + ws.getDeaths());
           System.out.println("Number of recovered cases in " + userCountry);
           System.out.println("  " + ws.getRecovred());
        }
      }


     }// end main
}
