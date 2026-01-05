package se.jensen.linkan.springdice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/dice")
public class DiceController {

    private final List<DiceRoll> rollHistory = new ArrayList<>();
    private final Random random = new Random();
    private final String version = "v2";

    @GetMapping("/roll")
    public DiceRoll rollDice() {
        int roll = random.nextInt(6) + 1;
        DiceRoll diceRoll = new DiceRoll(roll);
        rollHistory.add(diceRoll);
        return diceRoll;
    }

    @GetMapping("/history")
    public List<DiceRoll> getHistory() {
        return rollHistory;
    }

    @GetMapping("/version")
    public String getVersion() {
        return version;
    }
}
