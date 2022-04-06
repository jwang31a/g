/*
Team Elmo :: Courtney Huang, Jun Hong Wang, Raven (Ruiwen) Tang
APCS pd6
LAB08 -- America's Next Top Data Scientist / cobo data lab
2022-04-06
time spent: 2.0 hrs
*/

/*
 * Arrays of objects
 */

import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Welcome03_List {
   public static void main(String[] args) {
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
      ArrayList<WeatherStation> allstns = ds.fetchList("WeatherStation", "station/station_name",
             "station/station_id", "station/state",
             "station/latitude", "station/longitude");
      System.out.println("Total stations: " + allstns.size());
      /*
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a state abbreviation: ");
      String state = sc.next();
      System.out.println("Stations in " + state);
      for (WeatherStation ws : allstns) {
         if (ws.isLocatedInState(state)) {
            System.out.println("  " + ws.getId() + ": " + ws.getName());
         }
      }
      */
      WeatherReporter test = new WeatherReporter(allstns, "NY");
      test.report();
   }

   public static class WeatherReporter {
     private ArrayList<WeatherStation> filtered;

     public WeatherReporter(ArrayList<WeatherStation> wstations, String abrev){
       filtered = new ArrayList<WeatherStation>();
       for (WeatherStation ws : wstations) {
          if (ws.isLocatedInState(abrev)) {
             filtered.add(ws);
          }
       }
     }

     public void report(){
       float avgtemp = 0;
       WeatherStation curColdest = filtered.get(0);
       for(WeatherStation ws : filtered){
         Observation obs = ws.currentWeather();
         System.out.println(" " + ws.getId() + ": " + obs);
         avgtemp += obs.temp;
         if(obs.colderThan(curColdest.currentWeather())){
           curColdest = ws;
         }
       }
       System.out.println(" avg temp " + avgtemp/filtered.size());
       System.out.println(" coldest station " + curColdest.getName());
     }
   }
}

class Observation{
   float temp;
   int windDir;
   String description;

   Observation(String description, float temp, int windDir) {
      this.description = description;
      this.temp = temp;
      this.windDir = windDir;
   }

   public String toString() {
      return (temp + " degrees; " + description + " (wind: " + windDir + " degrees)");
   }

   public boolean colderThan(Observation obj2){
      return (this.temp < obj2.temp);
   }
}
