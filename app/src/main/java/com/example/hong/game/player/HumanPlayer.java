package com.example.hong.game.player;

import com.example.hong.game.game.GameInfo;
import com.example.hong.game.game.GameState;
import com.example.hong.game.game.Move;

public class HumanPlayer extends  Player {
    private Move move;

    public HumanPlayer(GameInfo info) {
        super(info);
    }

    public void setMove(Move move) {
        this.move = move;
    }

    @Override
    public Move getMove(GameState state) {
        // Suspend until the user clicks a valid move (handled by the game)
        try {
            synchronized(this) {
                this.wait();
            }
        } catch(InterruptedException e) {
            return null;
        }
        return move;
    }
}
