public class SuperHero {
    private Angel angel;

    public SuperHero(Angel angel) {
        this.angel = angel;
    }

    public void protect() {
        this.angel.saveLife();
        this.angel.inspire();
        this.angel.cure();
    }
}