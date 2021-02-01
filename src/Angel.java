public interface Angel {

    void saveLife();
    void inspire();
    void cure();
    default void serve(){
       // sing();
        System.out.println("I am serving!");
    }
    static void fly(){
        System.out.println("Angel say: - I am flying"); //static method
    }
//    private void sing(){
//        System.out.println("I am singin ispiring song!");
//    }

}
