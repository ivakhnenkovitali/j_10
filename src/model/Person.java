package model;



public class Person {
    private String name;
    private Season favoriteSeason;

    public Person() {
    }

    public Person(String name, Season favoriteSeason) {
        this.name = name;
        this.favoriteSeason = favoriteSeason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Season getFavoriteSeason() {
        return favoriteSeason;
    }

    public void setFavoriteSeason(Season favoriteSeason) {
        this.favoriteSeason = favoriteSeason;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("favoriteSeason=").append(favoriteSeason);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
