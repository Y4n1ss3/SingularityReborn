package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FocusChangedNode extends Modifier.Node implements FocusEventModifierNode {
    private FocusState focusState;
    private ky onFocusChanged;

    public FocusChangedNode(ky kyVar) {
        this.onFocusChanged = kyVar;
    }

    public final ky getOnFocusChanged() {
        return this.onFocusChanged;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        if (q10.b(this.focusState, focusState)) {
            return;
        }
        this.focusState = focusState;
        this.onFocusChanged.invoke(focusState);
    }

    public final void setOnFocusChanged(ky kyVar) {
        this.onFocusChanged = kyVar;
    }
}
