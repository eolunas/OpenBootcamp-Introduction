public class App {
    public static void main(String[] args) throws Exception {
        // First part:
        int numeroIf = 0;
        if (numeroIf > 0) {
            System.out.println("Number is positive");
        } else {
            if (numeroIf < 0) {
                System.out.println("Number is negative");
            } else {
                System.out.println("Number equals to zero");
            }

        }

        // Second part:
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("while:" + numeroWhile);
        }

        // Third part:
        numeroWhile = 3;
        do {
            numeroWhile++;
            System.out.println("do-while:" + numeroWhile);
        } while (numeroWhile < 3);

        // Four part:
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("for:" + numeroFor);
        }

        // Fift part:
        String season = "summer";
        switch (season) {
            case "summer":
                System.out.println("The season is summer");
                break;

            case "winter":
                System.out.println("The season is winter");
                break;
            case "spring":
                System.out.println("The season is spring");
                break;
            case "fall":
                System.out.println("The season is fall");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
