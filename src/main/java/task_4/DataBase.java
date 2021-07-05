package task_4;

public class DataBase {

    public String getFirstRequest(){
        return "SELECT account_id, customer_id, avail_balance" +
                "FROM account JOIN customer" +
                "WHERE account.status = 'ACTIVE', account.avail_balance > 1000";
    }

    public String getSecondRequest(){
        return "";
    }
}
