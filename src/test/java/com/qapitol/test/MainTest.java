package com.qapitol.test;

import com.qapitol.pages.*;
import com.qapitol.screenshot.TakeScreenShot;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import jdk.jfr.Description;
import org.testng.annotations.Test;


import java.awt.*;
import java.io.IOException;

public class MainTest extends BaseTest
{
    @org.testng.annotations.DataProvider(name="Register_data-provider")
    public Object[][] dataProvFunc()
    {
        return new Object[][]
                {{"krishna11","radha","radheykrishnamukundha112@gmail.com","Krishn@143","Krishn@143"}};
    }




    BrowserLaunching bl=new BrowserLaunching();
    SignInPage hp=new SignInPage();
    RegistrationPage rp=new RegistrationPage();
    AddingToCart ap=new AddingToCart();
    AddingMoreProducts am=new AddingMoreProducts();
    RemovingFromCart rf=new RemovingFromCart();
    AddressPage addressPage=new AddressPage();
    PaymentPage paymentPage=new PaymentPage();
    PlaceOrderPage placeOrderPage=new PlaceOrderPage();
    ViewCartInformation vi=new ViewCartInformation();
    ProfilePage profilePage=new ProfilePage();
    SignInValidation sv=new SignInValidation();
    QuantityChanging qc=new QuantityChanging();
    TakeScreenShot shot=new TakeScreenShot();
    LogOut logOut=new LogOut();


    @Test(priority = 2,description = "Sign in test case")
    @Description("verify the sign in credentials")
    @Severity(SeverityLevel.BLOCKER)
     @Story("To Sign in to Book store Page")
    public void homePage() throws InterruptedException, AWTException {
     bl.openWeb();
    Thread.sleep(2000);
    hp.signIn();
    hp.pageValidate();


    }
    @Test(priority = 1,dataProvider = "Register_data-provider")
    @Description("Registration page validation")
    @Severity(SeverityLevel.BLOCKER)
    @Story("To Register as User")
   public void registration(String name,String firstName,String email,String passWord,String confirmPassword) throws InterruptedException, AWTException, IOException {
        bl.openWeb();
        rp.registerAsUser(name,firstName,email,passWord,confirmPassword);
        shot.screenshot();




   }
    @Test(priority = 3)
    @Description("Add products to the cart")
    @Severity(SeverityLevel.NORMAL)
    @Story("To add the products to cart")
    public void addingProductsToCart() throws AWTException, InterruptedException, IOException {

        bl.openWeb();
        hp.signIn();
        ap.cart();
        logOut.logOutPage();
    }
  @Test(priority=4)
  @Description("Add more products to the cart")
  @Severity(SeverityLevel.NORMAL)
  @Story("To add more books to cart")
public void moreProductsToCart() throws InterruptedException, AWTException, IOException {
      Thread.sleep(2000);
      bl.openWeb();
      hp.signIn();
        ap.cart();
        am.addingProductsToCart();
        shot.screenshot();
        logOut.logOutPage();

    }
    @Test(priority=5)
    @Description("Deleting the books ")
    @Severity(SeverityLevel.CRITICAL)
    @Story("To delete the books from list")
    public void productRemovingFromCart() throws InterruptedException, AWTException, IOException {
        bl.openWeb();

        hp.signIn();
        ap.cart();
        shot.screenshot();
        rf.deletionOfProduct();
        logOut.logOutPage();

    }


    @Test(priority =6)
    @Description("Address Page validation")
    @Severity(SeverityLevel.CRITICAL)
    @Story("To add address to the address page")
    public void setAddressPage() throws InterruptedException, AWTException, IOException {

        bl.openWeb();

        hp.signIn();
        ap.cart();
        shot.screenshot();
        addressPage.addressAdding();
        logOut.logOutPage();
    }

    @Test(priority = 6)
    @Description("Adding card details ")
    @Severity(SeverityLevel.CRITICAL)
    @Story("To verify user is able to add card details")
    public void addCardDetails() throws InterruptedException, AWTException, IOException {
        bl.openWeb();
        hp.signIn();
        ap.cart();
        addressPage.addressAdding();
        paymentPage.paymentProcess();

       logOut.logOutPage();

    }

    @Test(priority = 8)
    @Description("Place the order ")
    @Severity(SeverityLevel.CRITICAL)
    @Story("To verify user is able to place the order")
    public void placingOrder() throws InterruptedException, AWTException, IOException {


         bl.openWeb();
        hp.signIn();

        ap.cart();
        addressPage.addressAdding();
        paymentPage.paymentProcess();
        placeOrderPage.orderPlacing();
        shot.screenshot();
        logOut.logOutPage();



    }
    @Test(priority = 9)
    @Description("Cart Information")
    @Severity(SeverityLevel.NORMAL)
    @Story("To verify user is able to view the cart Info")
    public void cartInfo() throws InterruptedException, AWTException, IOException {

        bl.openWeb();

        hp.signIn();
        ap.cart();
        shot.screenshot();
        vi.cartPage();
        logOut.logOutPage();

    }

@Test(priority =10 )
@Description("Profile Page")
@Severity(SeverityLevel.NORMAL)
@Story("To verify user is able view the profile")
    public void userProfileUpdate() throws InterruptedException, AWTException, IOException {
    bl.openWeb();

    hp.signIn();
    profilePage.profileUpdate();
        shot.screenshot();
        logOut.logOutPage();
    }
    @Test(priority = 11)
    public void productQuantity() throws InterruptedException, AWTException {
        bl.openWeb();
        hp.signIn();
        ap.cart();
        qc.quantityModification();
        logOut.logOutPage();


    }

    @Test(priority = 12)
    @Description("Checking different validations")
    @Severity(SeverityLevel.NORMAL)
    @Story("To verify the validations")
    public void validations()
    {
        bl.openWeb();
        sv.pageValidation();
    }
@Test(priority = 13)
    public void screenShot() throws IOException {
        bl.openWeb();
       shot.screenshot();

    }
}
