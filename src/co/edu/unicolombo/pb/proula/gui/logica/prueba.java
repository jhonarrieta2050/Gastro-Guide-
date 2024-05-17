import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class prueba {
    public static void main(String[] args) {
        String texto = "1. este es el primer paso 2. este es el segundo paso";

        ArrayList<String> numerosConPunto = separadorNumerosConPunto(texto);
        System.out.println(numerosConPunto);
    }

    private static ArrayList<String> separadorNumerosConPunto(String pasos) {
        ArrayList<String> array = new ArrayList<>();
        StringBuilder Npasos = new StringBuilder();

        Pattern expresionRegular = Pattern.compile("\\d+\\..*?(?=\\d+\\.|$)");
        Matcher findIndex = expresionRegular.matcher(pasos);

        while (findIndex.find()) {
            array.add(findIndex.group().trim());
        }

        return array;
    }
}