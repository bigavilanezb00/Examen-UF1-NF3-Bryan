import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "jugador")
public class Jugador {
    String nom;
    int edat;

    public String getNom() {
        return nom;
    }

    @XmlElement(name = "nom")
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    @XmlElement(name = "edat")
    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                '}';
    }
}
