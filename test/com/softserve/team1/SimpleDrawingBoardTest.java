package com.softserve.team1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDrawingBoardTest {
    @Test
    public void drawLines() {
        SimpleDrawingBoard c = new SimpleDrawingBoard(5, 5);
        c.draw(0, 2, 4, 2).draw(2, 0, 2, 4);
        assertEquals("-------\n|  x  |\n|  x  |\n|xxxxx|\n|  x  |\n|  x  |\n-------", c.drawCanvas());
    }

    @Test
    public void drawRectangle() {
        SimpleDrawingBoard c = new SimpleDrawingBoard(7, 7);
        c.draw(1, 1, 5, 4);
        assertEquals("---------\n|       |\n| xxxxx |\n| x   x |\n| x   x |\n| xxxxx |\n|       |\n|       |\n---------", c.drawCanvas());
    }

    @Test
    public void fill() {
        SimpleDrawingBoard c = new SimpleDrawingBoard(7, 7);
        c.draw(1, 1, 5, 4).fill(3, 3, 'o');
        assertEquals("---------\n|       |\n| xxxxx |\n| xooox |\n| xooox |\n| xxxxx |\n|       |\n|       |\n---------", c.drawCanvas());
    }
}