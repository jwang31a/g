/*
Team Elmo :: Courtney Huang, Jun Hong Wang, Raven (Ruiwen) Tang
APCS pd6
LAB08 -- America's Next Top Data Scientist / cobo data lab
2022-04-06
time spent: 2.0 hrs
*/

import core.data.*;

public class Welcome01 {
   public static void main(String[] args) {
      String id = "KBVX";
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/" + id + ".xml");
      ds.setCacheTimeout(15 * 60);
      ds.load();
      ds.printUsageString();
      float temp = ds.fetchFloat("temp_f");
      String loc = ds.fetchString("location");
      System.out.println("The temperature at " + loc + " is " + temp + "F");

      String id2 = "KBPK";
      DataSource ds2 = DataSource.connect("http://weather.gov/xml/current_obs/" + id2 + ".xml");
      ds2.setCacheTimeout(15 * 60);
      ds2.load();
      ds2.printUsageString();
      float temp2 = ds2.fetchFloat("temp_f");
      String loc2 = ds2.fetchString("location");
      System.out.println("The temperature at " + loc2 + " is " + temp2 + "F");

      Observation ob1 = ds.fetch("Observation", "weather", "temp_f", "wind_degrees");
      System.out.println(id + ": " + ob1);

      Observation ob2 = ds2.fetch("Observation", "weather", "temp_f", "wind_degrees");
      System.out.println(id2 + ": " + ob2);

      System.out.println(loc1 + " colder than " + loc2 + ":" + ob1.colderThan(ob2));
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
