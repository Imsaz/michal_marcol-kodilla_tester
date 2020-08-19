package game;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItDivided implements En {

    private int number;
    private String answer;

    public IsItDivided() {
        Given("Example number is 3", () -> {
            this.number = 3;
        });

        Given("Example number is 5", () -> {
            this.number = 5;
        });

        Given("Example number is 15", () -> {
            this.number = 15;
        });

        Given("Example number is 4", () -> {
            this.number = 4;
        });

        When("I ask whether the number is divided", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkIfDivided(this.number);
        });

        Then("I should be told {string}", (String string) -> {

            Assert.assertEquals(string, this.answer);
        });
    }
}
