package FilmKod.HögreOrdningensFunktioner;

public class Car {

    protected String regnr;
    protected String owner;
    protected String model;
    protected String color;

    public Car(String regnr, String owner, String model,
               String color){
        this.regnr = regnr;
        this.owner = owner;
        this.model = model;
        this.color = color;
    }

    public String getRegNr(){
        return regnr;
    }

    public String getRegnr() {
        return regnr;
    }

    public void setRegnr(String regnr) {
        this.regnr = regnr;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getData(){
        return "Regnummer: "+regnr+", Owner: "+owner
                +", Modell: "+model +", Färg: "+color;
    }

}