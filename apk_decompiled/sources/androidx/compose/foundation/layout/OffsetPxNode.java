package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.unit.IntOffset;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class OffsetPxNode extends Modifier.Node implements LayoutModifierNode {
    private ky offset;
    private boolean rtlAware;
    private final boolean shouldAutoInvalidate;

    public OffsetPxNode(ky kyVar, boolean z) {
        this.offset = kyVar;
        this.rtlAware = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(OffsetPxNode offsetPxNode, Placeable placeable, Placeable.PlacementScope placementScope) {
        long m7748unboximpl = ((IntOffset) offsetPxNode.offset.invoke(placementScope)).m7748unboximpl();
        if (offsetPxNode.rtlAware) {
            Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable, IntOffset.m7739getXimpl(m7748unboximpl), IntOffset.m7740getYimpl(m7748unboximpl), 0.0f, (ky) null, 12, (Object) null);
        } else {
            Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, IntOffset.m7739getXimpl(m7748unboximpl), IntOffset.m7740getYimpl(m7748unboximpl), 0.0f, (ky) null, 12, (Object) null);
        }
        return w01.a;
    }

    public final ky getOffset() {
        return this.offset;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new h(this, mo6234measureBRTryo0, 1), 4, null);
    }

    public final void setOffset(ky kyVar) {
        this.offset = kyVar;
    }

    public final void setRtlAware(boolean z) {
        this.rtlAware = z;
    }

    public final void update(ky kyVar, boolean z) {
        if (this.offset != kyVar || this.rtlAware != z) {
            LayoutModifierNodeKt.invalidatePlacement(this);
        }
        this.offset = kyVar;
        this.rtlAware = z;
    }
}
