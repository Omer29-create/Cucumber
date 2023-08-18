package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.N11page;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;
import static utilities.Driver.getDriver;

public class N11step {

    N11page n11page = new N11page();


    @Given("Kullanıcı Anasayfaya gider.")
    public void kullanıcıAnasayfayaGider() {


    }

    @When("Ana sayfanın yüklendiği doğrulanır.")
    public void anaSayfanınYüklendiğiDoğrulanır() {

        String actualTitle = getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        String expectedTitle = "";
        Assert.assertEquals(expectedTitle, actualTitle);


    }

    @And("Kullanıcı ana sayfada Giriş Yap butonunu bulur ve tıklar.")
    public void kullanıcıAnaSayfadaGirişYapButonunuBulurVeTıklar() throws InterruptedException {
        Thread.sleep(2000);
        n11page.btnGirisYap.click();


    }

    @And("Giriş sayfasının yüklendiği doğrulanır.")
    public void girişSayfasınınYüklendiğiDoğrulanır() {

        String actualUrl = getDriver().getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);
        String expectedUrl = "https://www.n11.com/giris-yap";


        Assert.assertEquals(actualUrl, expectedUrl);

    }

    @And("Kullanıcı giriş sayfasında geçerli bir kullanıcı adı  girer.")
    public void kullanıcıGirişSayfasındaGeçerliBirKullanıcıAdıGirer() {
        n11page.btnEmail.sendKeys(ConfigReader.getProperty("email"));


    }

    @And("Kullanıcı giriş sayfasında geçerli bir şifre girer.")
    public void kullanıcıGirişSayfasındaGeçerliBirŞifreGirer() {
        n11page.btnPassword.sendKeys(ConfigReader.getProperty("sifre"));

    }

    @And("Kullanıcı 'Giris yap' butonuna tıklar.")
    public void kullanıcıButonunaTıklar(String arg0) {
        n11page.loginButton.click();

    }

    @And("Hesaba basarili sekilde girer")
    public void basariliSekildeGirer() {

    }

    @Then("Ana sayfada istedigi islemi gerceklestirir")
    public void anaSayfadaIstedigiIslemiGerceklestirir() {
    }

    @And("Islemin basariyla tamamlandigini dogrular")
    public void isleminBasariylaTamamlandiginiDogrular() {
    }
}
