public class Protagonist {
  public String name;
  public int hp;
  public int dmg;
  public protagonist(){
    hp = 50;
    name = "pat";
  }
  public protagonist(name){
    hp = 50;
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
  public int attack(monster){
    monster.takeDMG(dmg);
  }
}
