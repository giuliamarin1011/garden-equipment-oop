package ProiectPOO;

public class Rezultat {
    protected double produs;
    protected double curent_consumat;
    protected double functionare_ramasa;


    public Rezultat(double produs, double curent_consumat) {
        this.produs = produs;
        this.curent_consumat = curent_consumat;
        this.functionare_ramasa = 0; // default
    }

    public Rezultat(double produs, double curent_consumat, double functionare_ramasa) {
        this.produs = produs;
        this.curent_consumat = curent_consumat;
        this.functionare_ramasa = functionare_ramasa;
    }

    //  getter/setter
    public double getFunctionare_ramasa() {
        return functionare_ramasa;
    }

    public void setFunctionare_ramasa(double functionare_ramasa) {
        this.functionare_ramasa = functionare_ramasa;
    }

    @Override
    public String toString() {
        return "Rezultat{" +
                "produs=" + produs +
                ", curent_consumat=" + curent_consumat +
                ", functionare_ramasa=" + functionare_ramasa +
                '}';
    }
}
