package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ot implements TextWatcher {
    public final l7 a;
    public nt b;
    public boolean c = true;

    public ot(l7 l7Var) {
        this.a = l7Var;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            at a = at.a();
            if (editableText == null) {
                length = 0;
            } else {
                a.getClass();
                length = editableText.length();
            }
            a.g(editableText, 0, length, 0);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        l7 l7Var = this.a;
        if (!l7Var.isInEditMode() && this.c && at.d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int c = at.a().c();
            if (c != 0) {
                if (c == 1) {
                    at.a().g((Spannable) charSequence, i, i3 + i, 0);
                    return;
                } else if (c != 3) {
                    return;
                }
            }
            at a = at.a();
            nt ntVar = this.b;
            if (ntVar == null) {
                ntVar = new nt(l7Var);
                this.b = ntVar;
            }
            a.h(ntVar);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
