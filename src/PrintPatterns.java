//SOLID RECTANGLE     * * * * *
//                    * * * * *
//                    * * * * *
//                    * * * * *

//public class PrintPatterns {
//    public static void main(String[]args){
//        for(int i=1; i<=4; i++){
//            for(int j=1; j<=5; j++) {
//                System.out.println(" * ");
//            }
//            System.out.println();
//        }
//
//    }
//}

//public class PrintPatterns {
//    public static void main(String[] args) {
//        for(int i=1; i<=4; i++){
//            for(int j = 1; j<=5; j++){
//                if(i == 1 || j == 1 || i == 4 || j == 5){
//                    System.out.print(" * ");
//                }else {
//                    System.out.print("   ");
//                }
//
//                }
//            System.out.println();
//            }
//
//
//        }
//    }

//public class PrintPatterns {
////    public static void main(String [] args) {
////        for(int i = 1; i<=5; i++) {
////            for(int j = 1; j<=i; j++){
////                System.out.print(" * ");
////            }
////            System.out.println();
////        }
////    }
////}

public class PrintPatterns {
    public static void main(String [] args) {
        for(int i=5; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

}
