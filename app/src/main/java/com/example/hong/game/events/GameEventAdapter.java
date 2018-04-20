package com.example.hong.game.events;


import com.example.hong.game.game.Move;

public class GameEventAdapter implements GameListener {

        @Override
        public void moveAdded(int playerIndex, Move move) {
        }

        @Override
        public void moveRemoved(Move move) {
        }

        @Override
        public void gameTimeChanged(int playerIndex, long timeMillis) {
        }

        @Override
        public void moveTimeChanged(int playerIndex, long timeMillis) {
        }

        @Override
        public void turnStarted(int playerIndex) {
        }

        @Override
        public void userMoveRequested(int playerIndex) {
        }

        @Override
        public void gameStarted() {
        }

        @Override
        public void gameResumed() {
        }

        @Override
        public void gameFinished() {
        }
    }


