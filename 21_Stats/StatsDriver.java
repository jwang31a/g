/**
Team NBJ: Nada, Brian K., Jun Hong
APCS PD6
HW ?? -- ??
2021-10-20
QCC:
- it's not guaranteed that Stats.mean will return an integer
--> same case with Stats.geoMean
**/

public class StatsDriver{
  public static void main (String[] args) {
    // should output 1.5
    System.out.println(Stats.mean(1,2));
    // should output 2.0
    System.out.println(Stats.mean(1.5,2.5));
    // should output 2
    System.out.println(Stats.max(1,2));
    // should output 2.0
    System.out.println(Stats.max(1.0,2.0));
    // should output 2
    System.out.println(Stats.geoMean(2,2));
    // should output 2.0
    System.out.println(Stats.geoMean(2.0,2.0));
  }
}
