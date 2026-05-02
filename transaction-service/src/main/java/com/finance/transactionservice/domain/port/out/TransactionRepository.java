/**
 * TransactionRepository Define lo que el dominio necesita del exterior
 */
public interface TransactionRepository {
    Transaction save(Transaction transaction);
}