//package Browser_History;
//
//import java.util.Scanner;
//public class Run {
//    public static void main(String[] args) {
//        BrowserHistory browserHistory = new BrowserHistory();
//        Scanner sc = new Scanner(System.in);
//        String input;
//
//        while (true) {
//            System.out.println("\n(1) Browse | (2) Back | (3) View | (4) Exit");
//            input = sc.nextLine();
//
//            switch (input) {
//                case "1":
//                    System.out.print("Enter website URL: ");
//                    String website = sc.nextLine();
//                    browserHistory.browse(website);
//                    break;
//                case "2":
//                    browserHistory.back();
//                    break;
//                case "3":
//                    browserHistory.view();
//                    break;
//                case "4":
//                    System.out.println("Exiting program.");
//                    sc.close();
//                    return;
//                default:
//                    System.out.println("Invalid, please try again.");
//            }
//        }
//    }
//}
