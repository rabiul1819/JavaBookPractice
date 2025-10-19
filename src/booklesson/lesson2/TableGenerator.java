package booklesson.lesson2;

public class TableGenerator {
    public static void main(String[] args) {

        String table = """
                +------------------------+----------------------+
                |Info                    |Cursor                |
                +------------------------+----------------------+
                | Date: 2025-10-16       |Xyz Distributors      |
                |Time: 12:42PM           | Mob:01720596970      |
                |Bill No:12              |Address: N0 25,Main st|
                |Invoice No: 458-80-108  |reet, on, CA          |
                +------------------------+----------------------+
                |              Selling details                  |
                +------------------------+---------+------+------+
                |Item                    | Price($)| Qty | Value |
                +------------------------+---------+-----+-------|
                |Optical Mouse           | 120.0   |20   |2400.00|
                |Gaming keyboard         |550.00   |30   |16500.0|
                +------------------------+---------+-----+-------+
                                          Gross:18900.00
                                          Discount (5%) 945.00
                                          payable 17955.60
                
                """;
        System.out.println(table);

    }
}
