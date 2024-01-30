START TRANSACTION;

UPDATE Account SET balance = balance - 100 WHERE account_number = '123';
UPDATE Account SET balance = balance + 100 WHERE account_number = '456';
INSERT INTO TransactionHistory (from_account, to_account, amount, transaction_type)
VALUES ('123', '456', 100, 'Transfer');

SAVEPOINT TransEnd;

DECLARE CheckTrans INT;
SELECT COUNT(*) INTO CheckTrans FROM Account WHERE account_number = '123' AND balance >= 100;

IF CheckTrans = 1 THEN
COMMIT;
ELSE
ROLLBACK TO TransEnd;
END IF;
COMMIT;



START TRANSACTION;

UPDATE Account SET balance = balance - 100 WHERE account_number = '123';

SAVEPOINT WithdrawalSavepoint;

UPDATE Account SET balance = balance + 100 WHERE account_number = '456';

SELECT COUNT(*) INTO @depositSuccess FROM Account WHERE account_number = '456';

COMMIT;
ROLLBACK TO WithdrawalSavepoint;


