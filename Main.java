/*
Main Author: Diana S Islava
Primary controller for chess movement verifier
Changelog
12/09 - Created main class
 */
import java.util.Scanner;
public class Main{
    enum PieceType{
        KING,
        QUEEN,
        ROOK,
        BISHOP,
        KNIGHT,
        PAWN
    }

    enum X_Coord{
        a,b,c,d,e,f,g,h
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("This programs seeks to help a user check if a given chess move is valid.");
        System.out.println("To utilize this program, typed the specified information of the piece");
        System.out.println("Then, push enter to move to the next requirement");
        boolean start=true;
        while (start){
            System.out.println("Please type the chesspiece ");
                String piece_name=input.nextLine();
                piece_name.toUpperCase();
                switch (piece_name) {
                    case "PAWN":
                        //PieceType new_piece=PieceType.PAWN;
                    break;
                    default:
                    break;
                }
            System.out.println("Please type the color of the piece ");
                String color=input.nextLine();
            System.out.println("Please enter the row at which the piece is at");
                int pos_y=input.nextInt();
            System.out.println("Please enter the column at which the piece is at");
                char pos_x=input.nextLine().charAt(0);
            
        }
        input.close();
    }
}