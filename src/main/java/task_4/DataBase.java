package task_4;

public class DataBase {

    public String getFirstRequest(){
        return "SELECT account_id, cust_id, avail_balance" +
                "FROM account" +
                "WHERE status = 'ACTIVE' " +
                "AND avail_balance > 1000 ";

    }

    public String getSecondRequest(){
        return "SELECT account.account_id, customer.fed_id, product.name" +
                "FROM customer AS c JOIN account AS a" +
                "ON c.customer_id = a.cust_id" +
                "WHERE c.cust_type_cd = 'I'" +
                "JOIN product AS p" +
                "ON a.product_cd = p.product_cd ";
    }
}
