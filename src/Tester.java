public class Tester {
    public Tester(){
    }
        public static void main(String[] args){

        String string = "x3z ? xYz ! R1 && __";

        System.out.println(string.replaceAll("[a-z0-9]", "*"));

        }

}
