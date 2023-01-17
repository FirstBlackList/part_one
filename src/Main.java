public class Main {
    public static void main(String[] args) {

        int ticketPrice = 20_000;//RUB
        int parametersForTheDiscount = 20;//RUB
        int theAmountOfMiles = ticketPrice / parametersForTheDiscount;
        System.out.println("Количество начисленных бесплатных милей: " + theAmountOfMiles);

    }
}