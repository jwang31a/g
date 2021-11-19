public class Protagonist {
  public String proName = "";
  public int health = 100;
  public boolean alive;

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

    }
  }

  public void normalize() {
    if (Math.random() >= 0.5) {

    }
  }

  /*
  public int attack() {
    Monster.
  }
  */
}
