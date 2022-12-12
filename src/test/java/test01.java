import Miniprojet.PageAccueil;
import commun.ClassMere;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class test01 extends ClassMere {


    @Test
    public void test01(){
        PageAccueil p =new PageAccueil(driver);
        String val1="standard_user";
        p.saisirlogin(val1);

        String val2="secret_sauc";
        p.saisirMdp(val2);

        p.cliquerBoutonLogin();

        p.SEEConnecter("Epic sadface: Username and password do not match any user in this service");
    }


}
