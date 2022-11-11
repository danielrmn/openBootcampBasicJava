package sesiones_4_5.tema5;
import java.util.ArrayList;
import java.util.List;

public interface CocheCRUD {
    List<Coche> coches = new ArrayList<>();

    void save(Coche coche);
    List<Coche> findAll();
    void delete(Coche coche);


}
