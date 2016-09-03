package ais;

import board.GameState;
import board.Move;

import java.util.LinkedList;

/**
 * Dummy AI that performs a random move
 */
public class DummyAI {

    public static GameState performMove(GameState state) {
        LinkedList<Move> moves = state.getAllMoves(state.activePlayer);
        if(moves.size() > 0) {
            Move move = moves.get((int) (Math.random() * moves.size()));
            return state.performMove(move);
        } else {
            state.gameWinner = 5;
        }
        return state;
    }
}
