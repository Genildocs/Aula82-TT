package organizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.util.Comparator;

public class ExpenseStream {

    public static void main(String[] args) {

        List<Expense> expenseList = new ArrayList<Expense>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de boletos: ");
        int qt = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < qt; i++){

            int id = i;

            System.out.print("Informe o nome do boleto ["+ i + "]: ");
            String name = scanner.nextLine();

            System.out.print("Informe o valor do boleto R$ ["+ i + "]: ");
            double amount = Double.parseDouble(scanner.nextLine());

            System.out.print("Informe a data de vencimento do boleto ["+ i + "]: ");
            String expireDate = scanner.nextLine();

            System.out.print("Informe a categoria do boleto ["+ i + "]: ");
            String category = scanner.nextLine();

            expenseList.add(new Expense(id, name, amount, expireDate, category));
        }
    }
}
