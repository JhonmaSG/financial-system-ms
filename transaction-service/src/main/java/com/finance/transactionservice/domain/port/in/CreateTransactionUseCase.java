/**
 * CreateTransactionUseCase Define lo que el sistema puede hacer
 */
public Interface CreateTransactionUseCase {
    Transaction create(CreateTransactionCommand command);
}