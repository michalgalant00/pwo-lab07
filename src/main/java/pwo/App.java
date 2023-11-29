package pwo;

import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class App {
    public static void main(String[] args) throws IOException {
        try (PDDocument doc = new PDDocument()) {
            PDPage myPage = new PDPage();
            doc.addPage(myPage);
            try (PDPageContentStream cont = new PDPageContentStream(doc, myPage)) {
                cont.beginText();
                cont.setFont(PDType1Font.TIMES_ROMAN, 12);
                cont.setLeading(14.5f);
                cont.newLineAtOffset(25, 700);
                String line1 = "Maven is a build automation tool used primarily for Java projects.";
                cont.showText(line1);
                cont.newLine();
                String line2 = "Maven is built using a plugin-based architecture.";
                cont.showText(line2);
                cont.newLine();
                String line3 = "Maven addresses two aspects of building software:";
                cont.showText(line3);
                cont.newLine();
                String line4 = "how software is built, and its dependencies.";
                cont.showText(line4);
                cont.newLine();
                cont.endText();
            }
            doc.save("plik.pdf");
        }
    }
}