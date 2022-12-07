public class AppInterfaces {
      public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();
        System.out.println(cocheCrud);

    }
  
  public interface CocheCRUD {

        void save();

        void findAll();

        void delete();

    }

    public static class CocheCRUDImpl implements CocheCRUD {

        @Override
        public void save() {
        }

        @Override
        public void findAll() {
        }

        @Override
        public void delete() {
        }

        String save = "Guardar";
        String findAll = "Buscar todo";
        String delete = "Borrar";

        @Override
        public String toString() {
            return "CocheCRUDImpl " +
                    "\n save=" + save +
                    ",\n findAll=" + findAll +
                    ",\n  delete=" + delete;
        }
    }


}
