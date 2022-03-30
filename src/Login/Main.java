package Login;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        IDandPasswords IDandPass = new IDandPasswords();


        LoginPage Login = new LoginPage(IDandPass.getlogininfo());


/*
        Customers account = new Customers();

        account.Create("marcus", "piz");

        ArrayList<String> list = new ArrayList<String>();
        list.contains(account);
        list.toString();
        System.out.println(list);

 */
            }

}
