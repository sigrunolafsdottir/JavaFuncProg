package AoC2020.Dec2;

import java.util.List;

@FunctionalInterface
public interface PasswordChecker {
    public boolean check (String password, char letter, int startRange, int stopRange);
}


