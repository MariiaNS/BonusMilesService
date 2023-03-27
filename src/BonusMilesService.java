public class BonusMilesService {
    public int calculate(int price) {
        int bonus = 20;
        int bonusMile = price / bonus;
        return bonusMile;
    }
}
