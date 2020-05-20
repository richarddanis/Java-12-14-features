package com.richard.danis.www.java.twelve;

import com.richard.danis.www.java.fourteen.model.Person;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Calendar;
import java.util.Date;

public class FileMismatchTest {

    @Test
    public void testFileMistmatchFunction() throws IOException {
        Path filePath1 = Files.createTempFile("testFile1", ".txt");
        Path filePath2 = Files.createTempFile("testFile2", ".txt");
        Files.writeString(filePath1,"No Mismatch");
        Files.writeString(filePath2,"No Mismatch");

        long mismatch = Files.mismatch(filePath1, filePath2);
        System.out.println("If no mismatch then the return value'll be -1 -->>> " + mismatch);

        filePath1.toFile().deleteOnExit();
        filePath2.toFile().deleteOnExit();

        Path filePath3 = Files.createTempFile("testFile3", ".txt");
        Path filePath4 = Files.createTempFile("testFile4", ".txt");
        Files.writeString(filePath3,"mismatch?");
        Files.writeString(filePath4,"mis?match?");

        long mismatch2 = Files.mismatch(filePath3, filePath4);

        System.out.println("Position mismatch -->>> " + mismatch2);

        filePath3.toFile().deleteOnExit();
        filePath4.toFile().deleteOnExit();
    }
}
