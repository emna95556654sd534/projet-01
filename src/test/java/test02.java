import Miniprojet.PageAccueil;
import Miniprojet.PageProduct;
import commun.ClassMere;
import org.testng.annotations.Test;

public class test02 extends ClassMere {


        @Test
        public void test02(){
            PageAccueil p =new PageAccueil(driver);
            String val1="standard_user";
            p.saisirlogin(val1);
            String val2="secret_sauce";
            p.saisirMdp(val2);
            p.cliquerBoutonLogin();


            PageProduct p1=new PageProduct(driver);
            p1.TitreProduct();
            p1.addtocart();
            p1.ad();


        }


    }


