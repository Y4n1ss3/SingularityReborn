package androidx.compose.ui;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CompositionLocalMapInjectionNode extends Modifier.Node {
    public static final int $stable = 8;
    private CompositionLocalMap map;

    public CompositionLocalMapInjectionNode(CompositionLocalMap compositionLocalMap) {
        this.map = compositionLocalMap;
    }

    public final CompositionLocalMap getMap() {
        return this.map;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        DelegatableNodeKt.requireLayoutNode(this).setCompositionLocalMap(this.map);
    }

    public final void setMap(CompositionLocalMap compositionLocalMap) {
        this.map = compositionLocalMap;
        DelegatableNodeKt.requireLayoutNode(this).setCompositionLocalMap(compositionLocalMap);
    }
}
