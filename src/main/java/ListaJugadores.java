import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "jugadors")
public class ListaJugadores {

    List<Jugador> jugadors;

    @XmlElement(name = "jugador")
    public void setJugadors(List<Jugador> jugadors) {
        this.jugadors = jugadors;
    }

    public List<Jugador> getJugadors() {
        return jugadors;
    }

    public void add(Jugador jugador) {
        if (this.jugadors == null) {
            this.jugadors = new ArrayList<Jugador>();
        }
        this.jugadors.add(jugador);
    }

    @Override
    public String toString() {
        return "Jugadores{" +
                "jugadors=" + jugadors +
                '}';
    }
}
