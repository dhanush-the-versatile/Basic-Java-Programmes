/*Class named Transaction to transfer amount (double) in different ways
using Account Number(int) , Phone Number(Long) and qr Code (String) as
parameter into a method transferAmount() to achieve Method or Constructor
OverLoading*/
class Transaction 
{

    // Transfer using Account Number
    void transferAmount(int accountNumber, double amount) {
        System.out.println("Transfer using Account Number");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Amount Transferred: " + amount);
    }

    // Transfer using Phone Number
    void transferAmount(long phoneNumber, double amount) {
        System.out.println("\nTransfer using Phone Number");
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Amount Transferred: " + amount);
    }

    // Transfer using QR Code
    void transferAmount(String qrCode, double amount) {
        System.out.println("\nTransfer using QR Code");
        System.out.println("QR Code: " + qrCode);
        System.out.println("Amount Transferred: " + amount);
    }

}

class Main {
    public static void main(String[] args) {

        Transaction t = new Transaction();

        // Calling overloaded methods
        t.transferAmount(12345678, 5000.75);        // Account Number
        t.transferAmount(9876543210L, 2500.50);     // Phone Number
        t.transferAmount("QR123ABC", 1000.00);      // QR Code
    }
}
