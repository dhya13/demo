package justfor.tests;

import java.io.File;

public class FileFinder {
    public static void main(String[] args) {


    }

    static String rechercheFichier(File fichier, String fileName) {
        File[] files = fichier.listFiles();
        for (File fi : files) {
            if (fi.isDirectory()) {
                return rechercheFichier(fi, fileName);
            } else if (fileName.equals(fi.getName())) {
                return fi.getAbsolutePath();
            }
        }
        return null;
    }

    static String locateUniverseFormula() {
        File f = new File("/tmp/documents/");
        if (!f.exists())
            return null;
        return rechercheFichier(f, "universe-formula");
    }

}
