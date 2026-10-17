package defpackage;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ht extends InputConnectionWrapper {
    public final l7 a;

    public ht(l7 l7Var, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        this.a = l7Var;
        if (at.d()) {
            at.a().i(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return c8.g(this, this.a.getEditableText(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return c8.g(this, this.a.getEditableText(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
