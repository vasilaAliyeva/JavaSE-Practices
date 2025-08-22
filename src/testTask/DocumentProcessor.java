package testTask;

public interface DocumentProcessor {
    void processDocument(String doc);
    default void validate(String doc){
        if (doc == null){
            System.out.println("sened boshdur");
        }else {
            System.out.println("sened doludur");
        }
    }
    static void log(String msg){
        System.out.println("Logs");
    }
}
