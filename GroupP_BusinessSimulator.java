public class homecomfort2 {

    // Method 1: Calculates the discounted subtotal
    public static double calculateSubtotal(double price, int quantity, int itemIndex) {
        double subtotal = price * quantity;

        // Chair: 5% discount when buying 4 or more
        if (itemIndex == 0 && quantity >= 4) {
            subtotal = subtotal * 0.95;
        }

        // Bed: UGX 20,000 discount when buying 2 or more
        else if (itemIndex == 2 && quantity >= 2) {
            subtotal = subtotal - 20000;
        }

        // Sofa: 10% discount when buying 2 or more
        else if (itemIndex == 3 && quantity >= 2) {
            subtotal = subtotal * 0.90;
        }

        return subtotal;
    }

    // Method 2: Calculates the Total Amount
    public static double calculateTotalAmount(double[] subtotals) {
        double totalAmount = 0;
        for (double subtotal : subtotals) {
            totalAmount += subtotal;
        }
        return totalAmount;
    }

    // Method 3: Prints Receipt
    public static void printReceipt(String[] items, int[] quantities, double[] subtotals) {
        System.out.println("\n================ RECEIPT ================\n");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " x " + quantities[i] + " = UGX " + subtotals[i]);
        }
    }

    public static void main(String[] args) {

        System.out.println("===== Welcome to Home Comfort Furniture! =====\n");

        // Arrays for item names and prices
        String[] items = {"Chair", "Table", "Bed", "Sofa"};
        double[] prices = {45000.00, 120000.00, 350000.00, 500000.00};

        // Quantities purchased
        int[] quantities = {3, 2, 1, 2};

        // Display price list
        System.out.println("Available Items:");

        // Print items with their prices
        for (int i = 0; i < items.length; i++) {
            System.out.println((i+1) + ". " + items[i] + "     UGX " + prices[i]);
        }

        // Calculate subtotals
        double[] subtotals = new double[items.length];
        double totalAmount = 0;

        // Calculate subtotals and total amount
        for (int i = 0; i < items.length; i++) {
            subtotals[i] = calculateSubtotal(
                    prices[i],
                    quantities[i],
                    i
            );

            totalAmount += subtotals[i];
        }

        // Print receipt
        printReceipt(items, quantities, subtotals);

        System.out.println("\n------------------------------------------");
        System.out.printf("Total Amount: UGX %,.2f%n", totalAmount);
        
    }
}