package androidx.compose.ui.semantics;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class InputTextSuggestionState {
    public static final int $stable = 0;
    private final boolean isCommittedByInputMethodEditor;

    public /* synthetic */ InputTextSuggestionState(boolean z, int i, dq dqVar) {
        this((i & 1) != 0 ? false : z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InputTextSuggestionState) && this.isCommittedByInputMethodEditor == ((InputTextSuggestionState) obj).isCommittedByInputMethodEditor;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isCommittedByInputMethodEditor) * 31;
    }

    public final boolean isCommittedByInputMethodEditor() {
        return this.isCommittedByInputMethodEditor;
    }

    public String toString() {
        return "InputTextSuggestionState(isCommittedByInputMethodEditor=" + this.isCommittedByInputMethodEditor;
    }

    public InputTextSuggestionState(boolean z) {
        this.isCommittedByInputMethodEditor = z;
    }

    public InputTextSuggestionState() {
        this(false, 1, null);
    }
}
