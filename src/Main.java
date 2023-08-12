public class Main {
    public static void main(String[] args) {

        SeaBord board = new SeaBord();
        board.shoot(0, 0, "m");
        board.shoot(2, 0, "h");
        board.shoot(6, 9, "h");
        board.shoot(2, 1, "d");
        
        board.getField();



    }
}