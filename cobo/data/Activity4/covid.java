/*
Team Elmo :: Courtney Huang, Jun Hong Wang, Raven (Ruiwen) Tang
APCS pd6
LAB08 -- America's Next Top Data Scientist / cobo data lab
2022-04-06
time spent: 2.0 hrs
*/
public class covid{

  private String country;
  private int confirmed;
  private int recovered;
  private int deaths;

  covid(String country, int confirmed, int recovered, int deaths) {
     this.country = country;
     this.confirmed = confirmed;
     this.recovered = recovered;
     this.deaths = deaths;
  }

  /* Produce the name of this state */
  public String getCountry() {
     return country;
  }

  /* Produce the name of this station */
  public int getConfirmed() {
     return confirmed;
  }

  public int getRecovred() {
     return confirmed;
  }

  public int getDeaths() {
     return deaths;
  }


}
