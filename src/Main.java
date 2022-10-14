import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] colour = new String[]{"Красный", "Оранжевый", "Красный", "Синий"};
        System.out.println(Arrays.toString(remove(colour)));

    }
    public static String[] remove (String[] colour){
        int m = 0;
        String[] duplicates = new String[colour.length];
        for (int i = 0; i < colour.length; i++){
            boolean colourDuplicates = false;
            String logic = colour[i];
            for (int j = i + 1; j < colour.length; j++){
                if ( logic.equals(colour[j])){
                    colourDuplicates = true;
                    break;
                }
            }
            if (!colourDuplicates){
                duplicates[m] = logic;
                m++;
            }
        }
        return duplicates;
    }
}