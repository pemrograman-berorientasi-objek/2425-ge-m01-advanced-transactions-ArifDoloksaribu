package fintech.driver;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

import fintech.model.Account;
import fintech.model.Transaction;

/**
 * @author 12S23004 Poppy Sibuea
 * @author 12S23026 Arif Doloksaribu
 */
public class Driver1 {

    public static void main(String[] _args) {

        // codes
        Scanner sc = new Scanner(System.in);  
        sc.useLocale(Locale.US);
        List<Account> akun = new ArrayList<>();
        List<String> inputs = new ArrayList<>();
        List<Transaction> trans = new ArrayList<>();


        while(true){
            String command = sc.nextLine();
            if(command.equals("---")){
                break;
            }
            inputs.add(command);


            String data[] = command.split("#");
            switch (data[0]) {
                case "create-account":
                    akun.add(new Account(data[1], data[2]));
                    break;
                
                case "create-transaction":
                    trans.add(new Transaction(data[1], Double.parseDouble(data[2]), data[3], data[4]));
                    break;
                default:
                    break;
            }
        }
        sc.close();

        for (Account k : akun){
            System.out.println(k.toString());
        }

        for(Transaction t : trans){
            for (Account k : akun){
                if(t.getAkunm().equals(k.getAccountName()) && t.getAmount() - k.getBalance() > 0){
            System.out.println(t.toString());
                }
            }
        }
    }

}