package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FocusEventNode extends Modifier.Node implements FocusEventModifierNode {
    private ky onFocusEvent;

    public FocusEventNode(ky kyVar) {
        this.onFocusEvent = kyVar;
    }

    public final ky getOnFocusEvent() {
        return this.onFocusEvent;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        this.onFocusEvent.invoke(focusState);
    }

    public final void setOnFocusEvent(ky kyVar) {
        this.onFocusEvent = kyVar;
    }
}
