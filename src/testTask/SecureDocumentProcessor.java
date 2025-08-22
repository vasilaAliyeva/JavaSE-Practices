package testTask;

import java.io.IOException;

public class SecureDocumentProcessor implements DocumentProcessor {
    @Override
    public void processDocument(String doc) {
        System.out.println(doc.toUpperCase());
    }

    @Override
    public void validate(String doc) {
        try {
            if(doc==null){
                throw new IOException();
            }
        } catch (IOException e) {
            System.out.println("IO exception caught");        }
    }
}
