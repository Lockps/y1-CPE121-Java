import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ChessGame extends Application {
    private Board board;
    private Player whitePlayer;
    private Player blackPlayer;
    private Player currentPlayer;
    private GridPane boardPane;

    public ChessGame() {
        board = new Board();
        whitePlayer = new Player(Color.WHITE);
        blackPlayer = new Player(Color.BLACK);
        currentPlayer = whitePlayer;
    }

    public void play() {
        while (!isGameOver()) {
            Move move = currentPlayer.getMove(board);
            if (board.isLegalMove(move)) {
                board.makeMove(move);
                currentPlayer = (currentPlayer == whitePlayer) ? blackPlayer : whitePlayer;
                updateBoard();
            }
        }
        // game over, determine winner and display result
    }

    private boolean isGameOver() {
        // check for checkmate, stalemate, or other end-of-game conditions
    }

    private void updateBoard() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Square square = board.getSquare(row, col);
                Rectangle squarePane = (Rectangle) boardPane.getChildren().get(row * 8 + col);
                squarePane.setFill(square.getColor());
                Piece piece = square.getPiece();
                if (piece != null) {
                    // render the piece
                }
            }
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        boardPane = new GridPane();
        boardPane.setHgap(2);
        boardPane.setVgap(2);
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Rectangle squarePane = new Rectangle(40, 40);
                squarePane.setFill((row + col) % 2 == 0 ? Color.WHITE : Color.LIGHTGRAY);
                boardPane.add(squarePane, col, row);
            }
        }
        Scene scene
