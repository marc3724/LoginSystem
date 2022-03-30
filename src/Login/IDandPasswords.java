package Login;

import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String,String>();

    //user and password database
    IDandPasswords() {
        logininfo.put("Bro","pizza");
        logininfo.put("Marcus", "trick");
        logininfo.put("hey","hey");

        Customers account = new Customers();
        account.Create("marc", "us");

    }

    protected HashMap getlogininfo() {
    return logininfo;
    }
}
