public class Team {
    private String teamName;
    private int played;
    private int won;
    private int lost;

    public Team(String name1) {
            this.teamName = name1;
            this.played = 0;
            this.won = 0;
            this.lost = 0;
    }
    public void played(Boolean won) {
        this.played ++ ;
        if (won) {
            setWon();
        } else {
            setLost();
        }
    }
    public String getName() {
        return this.teamName;
    }
    public int getWon(){
        return this.won;
    }
    public int getLost() {
        return this.lost;
    }
    public int getPlayed() {
        return this.played;
    }

    private void setWon() {
        this.won ++ ;
    }
    private void setLost() {
        this.lost ++ ;
    }
    public String toString() {
        return "Games: " + this.played;
    }
}