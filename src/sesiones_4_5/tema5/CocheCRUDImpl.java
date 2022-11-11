package sesiones_4_5.tema5;
import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save(Coche coche) {
        coches.add(coche);
    }

    @Override
    public List<Coche> findAll() {
        return coches;
    }

    @Override
    public void delete(Coche coche) {
        coches.remove(coche);
    }


}