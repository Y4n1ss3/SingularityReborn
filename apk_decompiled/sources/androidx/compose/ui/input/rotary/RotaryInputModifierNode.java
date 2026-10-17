package androidx.compose.ui.input.rotary;

import androidx.compose.ui.node.DelegatableNode;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface RotaryInputModifierNode extends DelegatableNode {
    boolean onPreRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent);

    boolean onRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent);
}
