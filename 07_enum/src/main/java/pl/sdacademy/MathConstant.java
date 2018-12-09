package pl.sdacademy;

public enum MathConstant {
        PI(3.14), E(2.72), c(29);


        private final double value;

        MathConstant(double value) {
                this.value = value;
        }

        public double getValue(){
                return value;
        }
}
