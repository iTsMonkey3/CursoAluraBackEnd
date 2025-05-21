import com.alura.screenmatch.calculos.CalculadoraDeTiempo;
import com.alura.screenmatch.calculos.FiltroRecomendacion;
import com.alura.screenmatch.models.Episodio;
import com.alura.screenmatch.models.Pelicula;
import com.alura.screenmatch.models.Serie;

public class Principal {

    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();

        miPelicula.setNombre("Spirit");
        miPelicula.setFechaDeLanzamiento(2003);
        miPelicula.setDuracionEnMinutos(87);
        miPelicula.setIncluidoEnElPlan(true);
        miPelicula.muestraFichaTecnica();

        miPelicula.evalua(10);
        miPelicula.evalua(8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDePapel = new Serie();

        casaDePapel.setNombre("La casa de papel");
        casaDePapel.setFechaDeLanzamiento(2017);
        casaDePapel.setTemporadas(6);
        casaDePapel.setEpisodiosPorTemporada(8);
        casaDePapel.setMinutosPorEpisodio(45);
        System.out.println(casaDePapel.getDuracionEnMinutos());

        CalculadoraDeTiempo calcula = new CalculadoraDeTiempo();
        calcula.incluye(miPelicula);
        calcula.incluye(casaDePapel);
        System.out.println("Necesitas " + calcula.getTiempoTotal() + " minutos para qcabar con la lista");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();

        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setNombre("La casa imprenta");
        episodio.setSerie(casaDePapel);
        episodio.setTotalDeVisualizaciones(101);

        filtroRecomendacion.filtra(episodio);

    }

}
