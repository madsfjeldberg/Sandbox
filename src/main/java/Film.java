public class Film {

    String titel;
    int år;
    String producer;

    public Film(String titel, int år) {
        this.titel = titel;
        this.år = år;
    }

    public Film(String titel) {
        this.titel = titel;
        år = 2023;
    }

    public void addProducer(Producer producer) {
        this.producer = producer.getNavn();
    }

    @Override
    public String toString() {
        return "Film{" +
                "titel='" + titel + '\'' +
                ", år=" + år +
                ", producer='" + producer + '\'' +
                '}';
    }
}
