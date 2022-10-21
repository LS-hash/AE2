public class Score {
    public class score extends Player {
        private double score;

        public score(String name, int age, double score) {
            super(name, age);
            this.score = score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        public double getScore() {
            return score;
        }

        public String toString() {
            String output = super.toString(); // call the Player toString method
            output += String.format(" GPA = %4.2f", score);
            return output;
        }
    }
}
