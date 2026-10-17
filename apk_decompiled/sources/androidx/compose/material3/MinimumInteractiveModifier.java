package androidx.compose.material3;

import androidx.compose.material3.internal.System_jvmKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MinimumInteractiveModifier extends ModifierNodeElement<MinimumInteractiveModifierNode> {
    public static final int $stable = 0;
    public static final MinimumInteractiveModifier INSTANCE = new MinimumInteractiveModifier();

    private MinimumInteractiveModifier() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public MinimumInteractiveModifierNode create() {
        return new MinimumInteractiveModifierNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return System_jvmKt.identityHashCode(this);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("minimumInteractiveComponentSize");
        inspectorInfo.getProperties().set("README", "Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(MinimumInteractiveModifierNode minimumInteractiveModifierNode) {
    }
}
