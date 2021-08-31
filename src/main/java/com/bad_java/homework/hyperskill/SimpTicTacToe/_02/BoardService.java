package main.java.com.bad_java.homework.hyperskill.SimpTicTacToe._02;

import main.java.com.bad_java.homework.hyperskill.SimpTicTacToe._02.domain.Board;

public class BoardService {
  private final Board board = new Board();

  public String printBoard() {
    return board.toString();
  }

  public Board save (char[][] board) {
    this.board.setBoard(board);
    return this.board;
  }

}
