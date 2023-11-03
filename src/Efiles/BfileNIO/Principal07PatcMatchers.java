package Efiles.BfileNIO;

import java.nio.file.*;

public class Principal07PatcMatchers {

    public static void main(String[] args) {

        Path txt = Paths.get("arquivos/file.txt");
        Path bkp = Paths.get("arquivos/file.bkp");
        Path java = Paths.get("arquivos/file.java");

        matchers(bkp, "glob:*.bkp"); //termia com .bkp
        matchers(txt, "glob:**/*.txt"); //termia com .txt ignorando as pastas.
        matchers(bkp, "glob:**/*.bkp"); ////termia com .bkp ignorando as pastas.
        matchers(java, "glob:**/*.java"); ////termia com .java ignorando as pastas.

        System.out.println("-----------------");
        matchers(java, "glob:**/*.{java,txt,bkp}"); //termia ou com "txt,java,bkp"
        matchers(txt, "glob:**/*.???"); //termina com 3 digitos apenas a extensão
    }

    public static void matchers(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " +  matcher.matches(path));
    }

}
