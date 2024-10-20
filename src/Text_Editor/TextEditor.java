package Text_Editor;

import java.util.Stack;

public class TextEditor {
    private String currentText;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public TextEditor() {
        currentText = "";
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void write(String text) {
        undoStack.push(currentText);
        redoStack.clear();
        currentText += text;
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(currentText);
            currentText = undoStack.pop();
        } else {
            System.out.println("Tidak ada yang perlu di-undo.");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(currentText);
            currentText = redoStack.pop();
        } else {
            System.out.println("Tidak ada yang perlu di-redo.");
        }
    }

    public void show() {
        System.out.println(currentText.isEmpty() ? "(Kosong)" : currentText);
    }
}


