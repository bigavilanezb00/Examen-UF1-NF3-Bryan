import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

@XmlRootElement(name = "equip")
public class Equipo {
    String equipo;
    String estadio;
    String presidente;
    LocalDate fundacion;
    int codi;

    ListaJugadores listajugadores;

    public int getCodi() {
        return codi;
    }

    @XmlAttribute(name = "codi")
    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getEquipo() {
        return equipo;
    }

    @XmlElement(name = "equip")
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getEstadio() {
        return estadio;
    }

    @XmlElement(name = "estadi")
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getPresidente() {
        return presidente;
    }

    @XmlElement(name = "president")
    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public LocalDate getFundacion() {
        return fundacion;
    }

    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlElement(name = "fundacio")
    public void setFundacion(LocalDate fundacion) {
        this.fundacion = fundacion;
    }

    public ListaJugadores getJugadores() {
        return listajugadores;
    }

    @XmlElement(name = "jugadores")
    public void setJugadores(ListaJugadores listajugadores) {
        this.listajugadores = listajugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "equipo='" + equipo + '\'' +
                ", estadio='" + estadio + '\'' +
                ", presidente='" + presidente + '\'' +
                ", fundacion=" + fundacion +
                ", codi=" + codi +
                ", jugadores=" + listajugadores +
                '}';
    }

}
