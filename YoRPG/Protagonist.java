public class Protagonist {
  public String proName = "";
  public int health = 100;
  public boolean isAlive;

  public static void main(String[] args) {

  }

  public Protagonist(String name) {
    proName += name;
  }

  public boolean isAlive() {
    return alive;
  }

  public void specialize() {
    if (Math.random() < 0.5) {
      YoRPG.d1 = 30;
    }
  }

  public void normalize() {
    if (Math.random() >= 0.5) {
      YoRPG.d1 = 15;
    }
  }

  public void attack() {

  }
}
