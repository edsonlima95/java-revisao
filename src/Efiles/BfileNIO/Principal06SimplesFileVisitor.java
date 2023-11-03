package Efiles.BfileNIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {

        if (file.getFileName().toString().endsWith(".java")) {
            System.out.println(file.getFileName());
        }

        return FileVisitResult.CONTINUE;
    }

}

public class Principal06SimplesFileVisitor {

    public static void main(String[] args) throws IOException {

        /**
         * SimpleFileVisitor - lista todos os arquivos existentes dentro dos diretorios.
         */

        Path root = Paths.get(".");

        Files.walkFileTree(root, new ListAllFiles());


    }

}
