package com.example.hong.game.player;

import com.example.hong.game.game.GameInfo;
import com.example.hong.game.game.GameState;
import com.example.hong.game.game.Move;

/**
 * Abstract class for a Gomoku player. Players are constructed with a game
 * information object containing timeouts, board size, etc.
 */
public abstract class Player {

    protected final GameInfo info;

    /**
     * Create a new player.
     * @param info Game information
     */
    public Player(GameInfo info) {
        this.info = info;
    }

    /**
     * Request a move from this player.
     * @param state Current game state
     * @return Move the player wants to make
     */
    public abstract Move getMove(GameState state);

}
