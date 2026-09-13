/*
Main Author: Diana S Islava
Primary controller for chess movement verifier
Changelog
12/09 - Created main class, temp enum for pieces (testing), switch to get specified piece
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("This programs seeks to help a user check if a given chess move is valid.");
        System.out.println("To utilize this program, typed the specified information of the piece");
        System.out.println("Then, push enter to move to the next requirement");

        boolean start=true;
        PieceType piece_name;

        while (start){
            System.out.println("Please type the chesspiece ");
                String name=input.nextLine();
                piece_name = PieceType.valueOf(name);
            System.out.println("Please type the color of the piece ");
                String color=input.nextLine();
            System.out.println("Please enter the row at which the piece is at");
                int pos_y=input.nextInt();
            System.out.println("Please enter the column at which the piece is at");
                char pos_x=input.nextLine().charAt(0);
            
            switch (piece_name) {
                    case PieceType.PAWN:
                        //Pawn pawn=new Pawn(attributes)
                    break;
                    case PieceType.ROOK:
                        //Rook rook=new Rook(attributes)
                    break;
                    case PieceType.BISHOP:
                        //Bishop bishop=new Bishop(attributes)
                    break;
                    case PieceType.KNIGHT:
                        //Knight knight=new Knight(attributes)
                    break;
                    case PieceType.QUEEN:
                        //Queen queen=new Queen(attributes)
                    break;
                    case PieceType.KING:
                        //King king=new King(attributes)
                    break;
                    default:
                    break;
                }
            
        }
        input.close();
    }
}