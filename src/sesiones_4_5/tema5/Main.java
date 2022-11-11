package sesiones_4_5.tema5;

public class Main {
    public static void main(String[] args) {
        Coche toyota = new Coche("celica", 2003, "gray", 3421, 4, 44);
        Coche mercedes = new Coche("AMG", 2020, "black", 3453, 2, 550);
        Coche ferrari = new Coche("Purosangue", 2022, "read", 4444, 4, 666);
        Coche pepitas = new Coche();

        CocheCRUD cocheCrud = new CocheCRUDImpl();

       cocheCrud.save(toyota);
       cocheCrud.save(mercedes);
       cocheCrud.save(ferrari);
       cocheCrud.save(pepitas);
       
       cocheCrud.delete(pepitas);

       String showData = cocheCrud.findAll().toString();
       System.out.println(showData);

    }
}
