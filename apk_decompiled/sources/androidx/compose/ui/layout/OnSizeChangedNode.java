package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.MeasuredSizeAwareModifierNode;
import androidx.compose.ui.unit.IntSize;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class OnSizeChangedNode extends Modifier.Node implements MeasuredSizeAwareModifierNode {
    public static final int $stable = 8;
    private ky onSizeChanged;
    private final boolean shouldAutoInvalidate = true;
    private long previousSize = IntSize.m7777constructorimpl(-9223372034707292160L);

    public OnSizeChangedNode(ky kyVar) {
        this.onSizeChanged = kyVar;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo356onRemeasuredozmzZPI(long j) {
        if (IntSize.m7780equalsimpl0(this.previousSize, j)) {
            return;
        }
        this.onSizeChanged.invoke(IntSize.m7774boximpl(j));
        this.previousSize = j;
    }

    public final void update(ky kyVar) {
        this.onSizeChanged = kyVar;
        this.previousSize = IntSize.m7777constructorimpl(-9223372034707292160L);
    }
}
