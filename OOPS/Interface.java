package OOPS;

public class Interface {
    public static void main(String args[]){
        Queen q=new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves(); // public and abstract and no implementation
}

class Queen implements ChessPlayer{
    public void moves(){ //create public as in interface
        System.out.println("up down left right diagonal in all four direction");
    }
}

class Rook implements ChessPlayer{
    public void moves(){ //create public as in interface
        System.out.println("up down left right");
    }
}
class King implements ChessPlayer{
    public void moves(){ //create public as in interface
        System.out.println("up down left right diagonal by 1 steps");
    }
}