package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class RotaryInputNode extends Modifier.Node implements RotaryInputModifierNode {
    private ky onEvent;
    private ky onPreEvent;

    public RotaryInputNode(ky kyVar, ky kyVar2) {
        this.onEvent = kyVar;
        this.onPreEvent = kyVar2;
    }

    public final ky getOnEvent() {
        return this.onEvent;
    }

    public final ky getOnPreEvent() {
        return this.onPreEvent;
    }

    @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public boolean onPreRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent) {
        ky kyVar = this.onPreEvent;
        if (kyVar != null) {
            return ((Boolean) kyVar.invoke(rotaryScrollEvent)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public boolean onRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent) {
        ky kyVar = this.onEvent;
        if (kyVar != null) {
            return ((Boolean) kyVar.invoke(rotaryScrollEvent)).booleanValue();
        }
        return false;
    }

    public final void setOnEvent(ky kyVar) {
        this.onEvent = kyVar;
    }

    public final void setOnPreEvent(ky kyVar) {
        this.onPreEvent = kyVar;
    }
}
