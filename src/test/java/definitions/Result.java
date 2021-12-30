package definitions;

import Base.Base;
import Pages.SearchResultPage;
import io.cucumber.java.en.And;

public class Result extends Base {
    SearchResultPage result = new SearchResultPage();

    @And("I click add to cart")
    public void i_Click_Add_To_Cart() {
        result.addToCart();
    }

    @And("I click go to cart")
    public void i_Click_Go_To_Cart() {
        result.goToCart();
    }

}
