import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "equips")
public class ListaEquipos {

    List<Equipo> equipos;

    @XmlElement(name = "equip")
    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void add(Equipo equipo) {
        if (this.equipos == null) {
            this.equipos = new ArrayList<Equipo>();
        }
        this.equipos.add(equipo);
    }

    @Override
    public String toString() {
        return "Equipos{" +
                "equipos=" + equipos +
                '}';
    }
}
