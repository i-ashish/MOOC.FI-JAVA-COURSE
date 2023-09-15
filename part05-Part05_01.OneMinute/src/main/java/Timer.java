public class Timer {
    public ClockHand seconds;
    public ClockHand hundredthsOfaSecond;

    public Timer() {
        this.hundredthsOfaSecond = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundredthsOfaSecond.advance();

        if (this.hundredthsOfaSecond.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + ":" + this.hundredthsOfaSecond;
    }
}