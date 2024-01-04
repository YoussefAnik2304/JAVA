public class Main {
    public static float divisionParZero(){
        return 10/0;
    }
    public static float divisionexeption(float x,float y){
        try{
            return x/y;
        }catch (ArithmeticException a){
            System.out.println("erreur "+a.getMessage());
            return x;
        }
    }


    public static void main(String[] args) {

        //System.out.println(divisionParZero());
        System.out.println(divisionexeption(1,2));
    }
}