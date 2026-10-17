package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.LayoutModifierNode;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SystemInsetsPaddingModifierNode extends InsetsPaddingModifierNode implements LayoutModifierNode {
    private ky insetsGetter;
    private WindowInsetsHolder windowInsetsHolder;

    public SystemInsetsPaddingModifierNode(ky kyVar) {
        super(WindowInsetsKt.WindowInsets());
        this.insetsGetter = kyVar;
    }

    public final WindowInsetsHolder getWindowInsetsHolder() {
        return this.windowInsetsHolder;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode, androidx.compose.ui.Modifier.Node
    public void onAttach() {
        View requireView = DelegatableNode_androidKt.requireView(this);
        WindowInsetsHolder orCreateFor = WindowInsetsHolder.Companion.getOrCreateFor(requireView);
        orCreateFor.incrementAccessors(requireView);
        update((WindowInsets) this.insetsGetter.invoke(orCreateFor));
        this.windowInsetsHolder = orCreateFor;
        super.onAttach();
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode, androidx.compose.ui.Modifier.Node
    public void onDetach() {
        View requireView = DelegatableNode_androidKt.requireView(this);
        WindowInsetsHolder windowInsetsHolder = this.windowInsetsHolder;
        if (windowInsetsHolder != null) {
            windowInsetsHolder.decrementAccessors(requireView);
        }
        super.onDetach();
    }

    public final void setWindowInsetsHolder(WindowInsetsHolder windowInsetsHolder) {
        this.windowInsetsHolder = windowInsetsHolder;
    }

    public final void update(ky kyVar) {
        if (this.insetsGetter != kyVar) {
            this.insetsGetter = kyVar;
            WindowInsetsHolder windowInsetsHolder = this.windowInsetsHolder;
            if (windowInsetsHolder != null) {
                update((WindowInsets) kyVar.invoke(windowInsetsHolder));
            }
        }
    }
}
