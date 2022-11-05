
public class pruebas {
    public static void main(String[] args) {
        String variable = String.valueOf(toCamelCase("hola_caca"));
    }

    static String toCamelCase(String s){
        char[] caracteres = s.toCharArray();
        caracteres[0] = Character.toUpperCase(caracteres[0]);
        for (int i = 0; i < s.length()- 2; i++)
            // Es 'palabra'
            if (caracteres[i] == ' ' || caracteres[i] == '.' || caracteres[i] == ','|| caracteres[i] == '_')
                // Reemplazamos
                caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
        System.out.println(caracteres);

        return "";
    }
}
