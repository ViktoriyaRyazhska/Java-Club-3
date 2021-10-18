package urban_andrii;

public class Task48 {
        public static final Task48 IDENTITY = new Task48(0);
        public static final Task48 ROTATE_90_ANTICLOCKWISE = new Task48(1);
        public static final Task48 ROTATE_180 = new Task48 (2);
        public static final Task48 ROTATE_90_CLOCKWISE = new Task48 (3);
        public static final Task48 REFLECT_VERTICAL = new Task48 (4);
        public static final Task48 REFLECT_FORWARD_DIAGONAL = new Task48 (5);
        public static final Task48 REFLECT_HORIZONTAL = new Task48 (6);
        public static final Task48 REFLECT_REVERSE_DIAGONAL = new Task48 (7);

        private final int index;
        private static int[][] matrix = {{0, 1, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, 0, 5, 6, 7, 4},
                {2, 3, 0, 1, 6, 7, 4, 5},
                {3, 0, 1, 2, 7, 4, 5, 6},
                {4, 7, 6, 5, 0, 3, 2, 1},
                {5, 4, 7, 6, 1, 0, 3, 2},
                {6, 5, 4, 7, 2, 1, 0, 3},
                {7, 6, 5, 4, 3, 2, 1, 0}};

        private Task48(int index) {
            this.index = index;
        }

        // dummy constructor required for inheriting
        public Task48() {
            this.index = -1;
        }

        public Task48 then(Task48 f) {
            return new Task48(matrix[this.index][f.index]);
        }

        public Task48 inv() {
            switch (index) {
                case 1: return new Task48(3);
                case 3: return new Task48(1);
                default: return this;
            }
        }

        public boolean is_rotation() {
            return index < 4;
        }

        public boolean is_reflection() {
            return index >= 4;
        }

        public boolean equals(Task48 other) {
            return this.index == other.index;
        }

    }

