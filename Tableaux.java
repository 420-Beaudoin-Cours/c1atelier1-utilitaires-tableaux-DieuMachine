/**
 * @author France Beaudoin
 */
public class Tableaux {
    private static void permute(int[] tab, int i1, int i2){
        int transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    private static void permute(String[] tab, int i1, int i2){
        String transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    public static void trierCroissantSSS(int[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (tab[j] < tab[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierCroissantSSS(String[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (Integer.parseInt(tab[j]) < Integer.parseInt(tab[imin]))
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void triDecroissantSSS(int[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (tab[j] > tab[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void print(int[] tab){
        for (int elem : tab)
            System.out.println(elem);
    }

    public static int maximum(int[] tab){
        int index = 0;
        for(int i = 1; i < tab.length; i++){
            if (tab[i] > tab[index])
                index = i;
        }
        return tab[index];
    }
    public static int minimum(int[] tab){
        int index = 0;
        for(int i = 1; i < tab.length; i++){
            if (tab[i] < tab[index])
                index = i;
        }
        return tab[index];
    }

    public static double moyenne(int[] tab){
        double i = 0;
        for (int elem : tab)
            i+=elem;
        try {
            i/=tab.length;
        }
        catch (ArithmeticException e){

        }
        return i;
    }

    public static int fouilleSeq(int[] tab, int elem){
        int i = 0;
        while (i < tab.length && tab[i] != elem){
            i++;
        }
        if (i == tab.length)
            i = -1;
        return i;
    }

    public static void triDecroissantSSS(String[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (Integer.parseInt(tab[j]) > Integer.parseInt(tab[imin]))
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void print(String[] tab){
        for(String elem : tab)
            System.out.println(elem);
    }

    public static int maximum(String[] tab){
        int iMax = 0;
        for(int i = 1; i < tab.length; i++){
            if (Integer.parseInt(tab[i]) > Integer.parseInt(tab[iMax]))
                iMax = i;
        }
        return Integer.parseInt(tab[iMax]);
    }

    public static int minimum(String[] tab){
        int iMin = 0;
        for(int i = 1; i < tab.length; i++){
            if (Integer.parseInt(tab[i]) < Integer.parseInt(tab[iMin]))
                iMin = i;
        }
        return Integer.parseInt(tab[iMin]);
    }

    public static double moyenne(String[] tab){
        double i = 0;
        for (String elem : tab)
            i+=Integer.parseInt(elem);
        try {
            i/=tab.length;
        }
        catch (ArithmeticException e){

        }
        return i;
    }

    public static int fouilleSeq(String[] tab, String elem){
        int i = 0;
        while (i < tab.length && !tab[i].equals(elem)){
            i++;
        }
        if (i == tab.length)
            i = -1;
        return i;
    }

}
