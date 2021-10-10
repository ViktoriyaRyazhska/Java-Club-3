package com.softserve.team1;

public class Dih4 {

    public static final Dih4 IDENTITY = new Dih4(0);
    public static final Dih4 ROTATE_90_ANTICLOCKWISE = new Dih4(1);
    public static final Dih4 ROTATE_180 = new Dih4(2);
    public static final Dih4 ROTATE_90_CLOCKWISE = new Dih4(3);
    public static final Dih4 REFLECT_VERTICAL = new Dih4(4);
    public static final Dih4 REFLECT_FORWARD_DIAGONAL = new Dih4(5);
    public static final Dih4 REFLECT_HORIZONTAL = new Dih4(6);
    public static final Dih4 REFLECT_REVERSE_DIAGONAL = new Dih4(7);

    private final int index;
    private static int[][] matrix = {{0, 1, 2, 3, 4, 5, 6, 7},
            {1, 2, 3, 0, 5, 6, 7, 4},
            {2, 3, 0, 1, 6, 7, 4, 5},
            {3, 0, 1, 2, 7, 4, 5, 6},
            {4, 7, 6, 5, 0, 3, 2, 1},
            {5, 4, 7, 6, 1, 0, 3, 2},
            {6, 5, 4, 7, 2, 1, 0, 3},
            {7, 6, 5, 4, 3, 2, 1, 0}};

    private Dih4(int index) {
        this.index = index;
    }

    // dummy constructor required for inheriting
    public Dih4() {
        this.index = -1;
    }

    public Dih4 then(Dih4 f) {
        return new Dih4(matrix[this.index][f.index]);
    }

    public Dih4 inv() {
        switch (index) {
            case 1: return new Dih4(3);
            case 3: return new Dih4(1);
            default: return this;
        }
    }

    public boolean is_rotation() {
        return index < 4;
    }

    public boolean is_reflection() {
        return index >= 4;
    }

    public boolean equals(Dih4 other) {
        return this.index == other.index;
    }

}



