import Miniprojet.PageAccueil;
import Miniprojet.PageChekoutOv;
import Miniprojet.PageProduct;
import Miniprojet.Pageyourcart;
import commun.ClassMere;
import org.testng.annotations.Test;

public class test03 extends ClassMere {



        @Test
        public void test03() {
            PageAccueil p = new PageAccueil(driver);
            String val1 = "standard_user";
            p.saisirlogin(val1);

            String val2 = "secret_sauce";
            p.saisirMdp(val2);

            p.cliquerBoutonLogin();

            PageProduct p2 = new PageProduct(driver);
            p2.TitreProduct();
            p2.addtocart();
            p2.ad();

            Pageyourcart p3 = new Pageyourcart(driver);
            p3.TitreYOURCART();
            p3.Presence1();
            p3.Presence2();
            p3.CHEKOUT();


            MiniProjet.PageChekout p4 = new MiniProjet.PageChekout(driver);
            String nom="Trabelsi";
            p4.saisirnom(nom);

            String prenom="Emna";
            p4.saisirprenom(prenom);
            String code="75018";
            p4.codepostal(code);

            p4.CONTINUE();
            //p4.CHECKOUTYOURINFORMATION();
            PageChekoutOv p5 = new PageChekoutOv(driver);
            p5.CHECKOUTOVERVIEW();
            p5.cliquerBoutonFinish();

        }
    }



