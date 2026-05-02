/**
 * CreateTransactionService Representa la entrada del caso de uso
 */
public class CreateTransactionCommand {
    private double amount;
    private String type;
    private String description;

    public CreateTransactionCommand(double amount, String type, String description) {
        this.amount = amount;
        this.type = type;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}