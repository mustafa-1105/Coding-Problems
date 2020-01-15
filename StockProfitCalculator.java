import java.util.*;

class Transaction {
    String stockName, transacType;
    int qty;
    double price;
}

public class StockProfitCalculator {

    private static HashMap<String, Queue<Transaction>> parseInput(ArrayList<String> transactions) {
        HashMap<String, Queue<Transaction>> map = new HashMap<>();
        String[] vals = new String[4];

        Transaction trnc;

        for (int i=0; i<transactions.size(); i++) {
            vals = transactions.get(i).split(" ");
            trnc = new Transaction();
            trnc.stockName = vals[0];
            trnc.transacType = vals[1];
            trnc.qty = Integer.parseInt(vals[2]);
            trnc.price = Double.parseDouble(vals[3]);

            if (map.containsKey(trnc.stockName)) {
                
            }
        }

        return map;
    }

    public static double CalcProfit(ArrayList<String> transactions) {
        HashMap<String, Queue<Transaction>> map = parseInput(transactions);


        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<String> transactions = new ArrayList<String>();

        for (int i=0; i<n; i++) {
            transactions.add(scanner.nextLine());
        }

        System.out.println(CalcProfit(transactions));

    }
}
