package definitions;

import Base.Base;
import Pages.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Cart extends Base {
    CartPage cart = new CartPage();

    @And("Cart is not empty")
    public void cart_Is_Not_Empty() {
        cart.emptyCart();
    }

    @And("I click delete item from cart")
    public void i_Click_Delete_Item_From_Cart() {
        cart.clickDelete();
    }

    @Then("Cart is empty")
    public void cart_Is_Empty() {
        cart.emptyCart();
    }
}
