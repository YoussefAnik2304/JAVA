public class Robot {
    private int Abs ;
    private int Ord;
    private String Orientation;
    Robot(int Abs, int Ord, String Orientation){
        this.Abs=Abs;
        this.Ord=Ord;
        this.Orientation=Orientation;
    }
    Robot(){}
    public void avancer(){
       switch (Orientation){
           case "haut" : Ord++;
                        break;
           case "bas" : Ord--;break;
           case "droite" : Abs++;break;
           case "gauche" : Abs--;break;
           default:
               System.out.println("error input ");
       }
    }

    public void tounerDroite(){
        Orientation="droite";
    }
    public void tournerGauche(){
        Orientation="gauche";
    }
}
