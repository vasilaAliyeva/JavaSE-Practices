package testTask;

public final class ImmutableDocument {
    private final int id;
    private final String content;

    public ImmutableDocument(int id, String content) {
        this.id = id;
        this.content = content;
    }
}
