package Text_Editor;

public class EditorRun {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.write("Hai, ");
        editor.show();

        editor.write("Semua");
        editor.show();

        editor.undo();
        editor.show();

        editor.redo();
        editor.show();

        editor.undo();
        editor.show();

        editor.write("Apa kabar?");
        editor.show();
    }
}
