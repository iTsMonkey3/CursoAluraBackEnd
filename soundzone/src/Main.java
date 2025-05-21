import com.alura.sounzone.models.Audio;
import com.alura.sounzone.models.Cancion;

public class Main {
    public static void main(String[] args) {

        Audio audio = new Audio();

        Cancion hableDeTi = new Cancion();

        hableDeTi.setTitulo("Hablé de ti");
        hableDeTi.setDuracion(3);
        hableDeTi.setTotalDeReproducciones(200);
        hableDeTi.setClasificacion(8);
        hableDeTi.setNombreAlbum("La leyenda");
        hableDeTi.setArtista("Yandel");
        hableDeTi.setDiscografica("Real gansta");

        hableDeTi.reproduce();
        hableDeTi.reproduce();
        hableDeTi.reproduce();
        hableDeTi.reproduce();

        hableDeTi.detalleCancion();

    }
}