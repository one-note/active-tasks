## ACID Properties

### Atomicity:

The transactions should be atomic in nature which means either the whole transaction gets executed or none of the
transaction
gets executed. If a transaction fails midway than it should be able to roll back to the precious consistent state. This
avoids
correction of data and ensures data consistency before and after any transaction.

### Consistency:

It refers to the state where the data in the database satisfies predefined integrity constraints, business rules, and
relationships. It ensures that the data remains accurate, valid, and reliable over time, even as transactions and
operations are performed on the database.

To ensure Consistency in a Database we should follow the below concepts.

- Define and Enforce Integrity Constraints
- Transaction Management
- Isolation Levels
- Concurrency Control
- Avoid Anomalies
- Data Validation
- Use Stored Procedures and Triggers
- Logging and Auditing
- Regular Maintenance and Monitoring
- Testing and Quality Assurance

### Isolation:

This ensures that the transactions happening in the database are visble to other transaction in other words it ensures
the safety
of concurrent database access.
Problems that arise due to lack of isolation in a database:

- Dirty Read
- Non-Repeatable Read
- Phantom Read
- Lost Update
- Concurrency Anomalies
- Inconsistent Aggregates
- Uncommitted Data Exposure
- Ineffective Locking

To avoid the above problems we can implement isolation levels in our database.

Isolation Levels :

- **Read Uncommitted**: Allows transactions to read uncommitted changes made by other transactions.
- **Read Committed:** Ensures that a transaction sees only committed changes made by other transactions.
- **Repeatable Read:** Guarantees that if a transaction reads a value, it will see the same value throughout the
  transaction, even if other transactions update the data.
- **Serializable:** Provides the highest level of isolation, ensuring that the results of concurrent transactions are as
  if they had executed serially.

### Durability:

Durability in database management refers to the ability of a database system to withstand failures or crashes while
ensuring that committed transactions survive and are permanently stored, even in the face of system crashes or power
outages.

To ensure durability in database we shoud follow the below concepts

- Transaction Commitment
- Log-Based Recovery
- Write-Ahead Logging (WAL)
- Redo and Undo Logs
- Non-Volatile Storage
- Commit Acknowledgment
- Impact on Performance
- Recovery Manager
