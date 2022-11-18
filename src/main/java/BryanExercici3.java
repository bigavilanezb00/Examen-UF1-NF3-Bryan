import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.time.LocalDate;

public class BryanExercici3 {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo();
        equipo1.setCodi(20);
        equipo1.setEquipo("FC Barcelona");
        equipo1.setEstadio("Camp Nou");
        equipo1.setPresidente("Joan laporta");
        equipo1.setFundacion(LocalDate.of(1899,11,29));

        Jugador jugador1 = new Jugador();
        jugador1.setNom("Jordi Alba");
        jugador1.setEdat(30);

        Jugador jugador2 = new Jugador();
        jugador2.setNom("Eric Garcia");
        jugador2.setEdat(21);

        ListaJugadores jugadores = new ListaJugadores();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        equipo1.setJugadores(jugadores);

        Equipo equipo2 = new Equipo();
        equipo2.setCodi(80);
        equipo2.setEquipo("Real Club Deportivo de la Coruña");
        equipo2.setEstadio("Riazor");
        equipo2.setPresidente("Antonio Couceneiro");
        equipo2.setFundacion(LocalDate.of(1906, 3, 2));

        Jugador jugador3 = new Jugador();
        jugador3.setNom("Ibai Gomez");
        jugador3.setEdat(33);

        ListaJugadores jugadores2 = new ListaJugadores();
        jugadores2.add(jugador3);
        equipo2.setJugadores(jugadores2);

        ListaEquipos equipos = new ListaEquipos();
        equipos.add(equipo1);
        equipos.add(equipo2);

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ListaEquipos.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(equipos, new File("exercici3.xml"));

            jaxbMarshaller.marshal(equipos, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
