/**
 * CreateTransactionService Implementa el UseCase, orquesta el flujo y usa el repository
 */
public class CreateTransactionService implements CreateTransactionUseCase {

    private final TransactionRepository repository;

    public TransactionRepository( TransactionRepository repository ) {
        this.repository = repository;
    }

    @override
    public Transaction create(CreateTransactionCommand command){

        TransactionType type = TransactionType.valueOf(command.getType());

        Transaction transaction = new Transaction(
                command.getAmount(),
                type,
                command.getDescription()
        );

        return repository.save(transaction);
    }
}