/**
 * Transaction Representa el Negocio
 * - Contiene Reglas
 */
public class Transaction {
    private Log id;
    private double amout;
    private TransactionType type;
    private String description;

    public Transaction(double amout, TransactionType type, String description){
        if ( amout <= 0 ) {
             throw new IllegalArgumentException("La cantidad debe ser mayor a cero");
        }

        this.amout = amout;
        this.type = type;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public TransactionType getType() {
        return type;
    }

    public double getAmout() {
        return amout;
    }

    public Log getId() {
        return id;
    }
}