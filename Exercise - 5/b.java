class Transaction {

    Transaction(int accountNumber, double amount) {

        System.out.println("Transferred Rs." + amount +
                           " to Account Number: " +
                           accountNumber);
    }

    Transaction(long phoneNumber, double amount) {

        System.out.println("Transferred Rs." + amount +
                           " to Phone Number: " +
                           phoneNumber);
    }

    Transaction(String qrCode, double amount) {

        System.out.println("Transferred Rs." + amount +
                           " using QR Code: " +
                           qrCode);
    }

    public static void main(String[] args) {

        Transaction t1 =
            new Transaction(123456, 5000);

        Transaction t2 =
            new Transaction(9876543210L, 2500);

        Transaction t3 =
            new Transaction("QR123ABC", 1000);
    }
}
