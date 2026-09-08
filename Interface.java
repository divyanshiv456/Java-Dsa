public class Interface {
    public static void main(String[] args){
        queen Q = new queen();
        Q.moves();

        bear b = new bear();
        b.eat();
    }

    interface herbivores {
        void eat();
    }
    interface carnivores {
        void eat();
    }

    static class bear implements herbivores,carnivores {
        public void eat(){
            System.out.println("eat both plant and animals");
        }
    }

    interface chessPlayer {
        void moves();
    }

    static class queen implements chessPlayer{
        public void moves(){
            System.out.println("up, down, right, left, diagonal (in all 4 dir)");
        }
    }
    class rook implements chessPlayer{
        public void moves(){
            System.out.println("up, down, right, left");
        }
    }
    class king implements chessPlayer{
        public void moves(){
            System.out.println("up, down, right, left, diagonal (in one dir)");
        }
    }
}
