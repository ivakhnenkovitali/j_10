public enum AbxtractDixcount {
    UNDISCOUNTED{
        @Override
        public double discout() {
            return 1.0;
        }
    },
    DISCOUNTED{
        @Override
        public double discout() {
            return 0.9;
        }
    },
    REDDISCOUNTED{
        @Override
        public double discout() {
            return 0.75;
        }
    };


    public abstract double discout();
}
