package com.cs;

import com.aspose.words.Document;
import com.aspose.words.examples.Utils;

public class Doc2PDF {
    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(Doc2PDF.class);

        //ExStart:Doc2Pdf
        // Load the document from disk.
        Document doc = new Document(dataDir + "Template.doc");

        // Save the document in PDF format.
        dataDir = dataDir + "output.pdf";
        doc.save(dataDir);
        //ExEnd:Doc2Pdf

        System.out.println("\nDocument converted to PDF successfully.\nFile saved at " + dataDir);
    }
}

