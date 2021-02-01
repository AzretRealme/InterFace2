public class Main {
    public static void main(String[] args) {

        Angel rescuer = new Rescuer();
        Angel batman = new Batman();
        Angel programmerImpl = new ProgrammerImpl();

        batman.serve();
        rescuer.serve();
        programmerImpl.serve();
        Angel.fly();

        SuperHero rescuer2 = new SuperHero(rescuer);
        SuperHero batman2 = new SuperHero(batman);
        SuperHero programmerImpl2 = new SuperHero(programmerImpl);

        rescuer2.protect();
        batman2.protect();
        programmerImpl2.protect();


    }
}
