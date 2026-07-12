DECLARE
    CURSOR loan_cursor IS
        SELECT l.LoanID, c.CustomerName, l.DueDate 
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
    FOR loan_rec IN loan_cursor LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Customer ' || loan_rec.CustomerName || 
                             ', your loan ' || loan_rec.LoanID || 
                             ' is due on ' || TO_CHAR(loan_rec.DueDate, 'YYYY-MM-DD'));
    END LOOP;
END;
/
