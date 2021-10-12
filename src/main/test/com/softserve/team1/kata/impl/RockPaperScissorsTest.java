package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsTest {
    @Test
    public void test1() {
//        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", RockPaperScissors.rps("rock", "scissors"));
        assertEquals("Player 1 won!", RockPaperScissors.rps("scissors", "paper"));
        assertEquals("Player 1 won!", RockPaperScissors.rps("paper", "rock"));
    }
    @Test
    public void test2() {
//        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", RockPaperScissors.rps("scissors", "rock"));
        assertEquals("Player 2 won!", RockPaperScissors.rps("paper", "scissors"));
        assertEquals("Player 2 won!", RockPaperScissors.rps("rock", "paper"));
    }
    @Test
    public void test3() {
//        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", RockPaperScissors.rps("scissors", "scissors"));
        assertEquals("Draw!", RockPaperScissors.rps("paper", "paper"));
        assertEquals("Draw!", RockPaperScissors.rps("rock", "rock"));
    }

}