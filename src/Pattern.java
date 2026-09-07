public class Pattern {
    static void createPattern() {
        int i = 0;
        while(i<20){
            System.out.print("*");
            int j = 0;
            while(j<i){
                System.out.print(" *");
                j++;}
            System.out.println();
            i++;
        }
    }
    public static void main(String[] args) {
        System.out.println("Creating the first Pattern");
        createPattern();
    }
}
