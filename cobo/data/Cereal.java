/*
Team Elmo :: Courtney Huang, Jun Hong Wang, Raven (Ruiwen) Tang
APCS pd6
LAB08 -- America's Next Top Data Scientist / cobo data lab
2022-04-06
time spent: 2.0 hrs
*/

public class Cereal{
    private String _brandName;
    private int _calorieCnt;

    public Cereal(String brandName, int calories){
        _brandName = brandName;
        _calorieCnt = calories;
    }

    public int getCal(){
        return _calorieCnt;
    }

    public String toString(){
        return _brandName + ": " + _calorieCnt + " calories";
    }

    public static void main(String[] args){
        Cereal allBran = new Cereal("All-Bran", 70);
        Cereal almondDelight = new Cereal("Almond Delight", 110);
        System.out.println(allBran);
        System.out.println(almondDelight);
        System.out.println(allBran.getCal());
        System.out.println(almondDelight.getCal());
    }
}
