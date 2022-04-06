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
