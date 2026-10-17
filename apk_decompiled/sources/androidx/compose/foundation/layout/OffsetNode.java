package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class OffsetNode extends Modifier.Node implements LayoutModifierNode {
    private boolean rtlAware;
    private final boolean shouldAutoInvalidate;
    private float x;
    private float y;

    private OffsetNode(float f, float f2, boolean z) {
        this.x = f;
        this.y = f2;
        this.rtlAware = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(OffsetNode offsetNode, Placeable placeable, Placeable.PlacementScope placementScope) {
        boolean z = offsetNode.rtlAware;
        float f = offsetNode.x;
        if (z) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, placementScope.mo361roundToPx0680j_4(f), placementScope.mo361roundToPx0680j_4(offsetNode.y), 0.0f, 4, null);
        } else {
            Placeable.PlacementScope.place$default(placementScope, placeable, placementScope.mo361roundToPx0680j_4(f), placementScope.mo361roundToPx0680j_4(offsetNode.y), 0.0f, 4, null);
        }
        return w01.a;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public final float m723getXD9Ej5fM() {
        return this.x;
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public final float m724getYD9Ej5fM() {
        return this.y;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new h(this, mo6234measureBRTryo0, 0), 4, null);
    }

    public final void setRtlAware(boolean z) {
        this.rtlAware = z;
    }

    /* renamed from: setX-0680j_4, reason: not valid java name */
    public final void m725setX0680j_4(float f) {
        this.x = f;
    }

    /* renamed from: setY-0680j_4, reason: not valid java name */
    public final void m726setY0680j_4(float f) {
        this.y = f;
    }

    /* renamed from: update-Md-fbLM, reason: not valid java name */
    public final void m727updateMdfbLM(float f, float f2, boolean z) {
        if (!Dp.m7616equalsimpl0(this.x, f) || !Dp.m7616equalsimpl0(this.y, f2) || this.rtlAware != z) {
            LayoutModifierNodeKt.invalidatePlacement(this);
        }
        this.x = f;
        this.y = f2;
        this.rtlAware = z;
    }

    public /* synthetic */ OffsetNode(float f, float f2, boolean z, dq dqVar) {
        this(f, f2, z);
    }
}
