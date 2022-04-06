/*
Team Elmo :: Courtney Huang, Jun Hong Wang, Raven (Ruiwen) Tang
APCS pd6
LAB08 -- America's Next Top Data Scientist / cobo data lab
2022-04-06
time spent: 2.0 hrs
*/

import core.data.*;
/*
 Represents information about a NWS weather station
*/

public class WeatherStation {
   private String name;
   private String id;
   private String state;
   private double lat;
   private double lng;

   WeatherStation(String name, String id, String state, double lat, double lng) {
      this.name = name;
      this.id = id;
      this.lat = lat;
      this.lng = lng;
      this.state = state;
   }

   /* Produce the id of this station */
   public String getId() {
      return id;
   }

   /* Produce the name of this station */
   public String getName() {
      return name;
   }

   /* Produce the latitude of this station */
   public double getLat(){
      return lat;
   }

   /* Determine if this weather station is located in the given state */
   public boolean isLocatedInState(String st) {
      return this.state.equals(st);
   }

   /* Connects to a DataSource */
   public Observation currentWeather(){
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/" + id + ".xml");
      return ds.fetch("Observation", "weather", "temp_f", "wind_degrees");
   }

}
