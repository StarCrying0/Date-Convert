import java.util.Scanner;
class date {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Date Format YYYY-MM-DD");
        System.out.print("Enter Short Date: ");
        String date = input.nextLine();
        String[] dateStore = date.split("-");
        String year = dateStore[0];
        String month = dateStore[1];
        String day = dateStore[2];
        switch(month){
            case "01":
                System.out.println("January "+day+", "+year);
                break;
            case "02":
                System.out.println("February "+day+", "+year);
                break;
            case "03":
                System.out.println("March "+day+", "+year);
                break;
            case "04":
                System.out.println("April "+day+", "+year);
                break;
            case "05":
                System.out.println("May "+day+", "+year);
                break;
            case "06":
                System.out.println("June "+day+", "+year);
                break;
            case "07":
                System.out.println("July "+day+", "+year);
            case "08":
                System.out.println("Auguest "+day+", "+year);
                break;
            case "09":
                System.out.println("September "+day+", "+year);
                break;
            case "10":
                System.out.println("October "+day+", "+year);
                break;
            case "11":
                System.out.println("November "+day+", "+year);
                break;
            case "12":
                System.out.println("December "+day+", "+year);
                break;
            default:
                System.out.println("Date format YYYY-MM-DD");
        }
        input.close();
    }
}