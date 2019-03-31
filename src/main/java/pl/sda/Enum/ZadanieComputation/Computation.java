package pl.sda.Enum.ZadanieComputation;

public enum Computation {
    MULTIPLY {
        public double perform(double x, double y) {
            return x * y;
        }
    },
    DIVIDE{
        public double perform(double x, double y) {
            if (y == 0) throw new IllegalArgumentException("PAMIETAJ CHOLERO NIE DZIEL PRZEZ 0!");
            return x / y;
        }
    },
    ADD{
        public double perform(double x, double y) {
            return x + y;
        }
    },
    SUBSTRACT{
        public double perform(double x, double y) {
            return x - y;
        }
    };

    public abstract double perform(double x, double y);
}
