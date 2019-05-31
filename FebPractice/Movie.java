package FebPractice;

public class Movie {

    private String name, actor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getReleaseYr() {
        return releaseYr;
    }

    public void setReleaseYr(int releaseYr) {
        this.releaseYr = releaseYr;
    }

    private int releaseYr;
}
