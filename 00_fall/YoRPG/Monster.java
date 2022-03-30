public class Monster{
  public String name;
  public int hp;
  public int dmg;
  public Monster(){
    hp = 100;
    name = "smaug";
  }
  public Monster(String name){
    hp = 100;
    name = name;
  }
  public boolean isAlive(){
    if (hp > 0){
      return true;
    }
    else {
      return false;
    }
  }
  public String getName(){
    return name;
  }
  public int specialize(){
    if ((int) (Math.random() * 100) > 80){
      dmg =  20;
    }
    else {
      dmg =  10;
    }
    return dmg;
  }
  public int normalize(){
    dmg = 10;
    return dmg;
  }
  public int getHP(){
    return hp;
  }
  public int takeDMG(int dmg){
    hp -= dmg;
    return hp;
  }
  /*public int attack(protag){
    protag
  }*/
  public static void main(String[] args){
    Monster kek = new Monster();
    System.out.println(kek.takeDMG(20));
    System.out.println(kek.getHP());
  }
}
