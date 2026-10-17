package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class PaddingNode extends Modifier.Node implements LayoutModifierNode {
    private float bottom;
    private float end;
    private boolean rtlAware;
    private float start;
    private float top;

    public /* synthetic */ PaddingNode(float f, float f2, float f3, float f4, boolean z, int i, dq dqVar) {
        this((i & 1) != 0 ? Dp.m7611constructorimpl(0.0f) : f, (i & 2) != 0 ? Dp.m7611constructorimpl(0.0f) : f2, (i & 4) != 0 ? Dp.m7611constructorimpl(0.0f) : f3, (i & 8) != 0 ? Dp.m7611constructorimpl(0.0f) : f4, z, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(PaddingNode paddingNode, Placeable placeable, Placeable.PlacementScope placementScope) {
        boolean z = paddingNode.rtlAware;
        float f = paddingNode.start;
        if (z) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, placementScope.mo361roundToPx0680j_4(f), placementScope.mo361roundToPx0680j_4(paddingNode.top), 0.0f, 4, null);
        } else {
            Placeable.PlacementScope.place$default(placementScope, placeable, placementScope.mo361roundToPx0680j_4(f), placementScope.mo361roundToPx0680j_4(paddingNode.top), 0.0f, 4, null);
        }
        return w01.a;
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m767getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m768getEndD9Ej5fM() {
        return this.end;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m769getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m770getTopD9Ej5fM() {
        return this.top;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int mo361roundToPx0680j_4 = measureScope.mo361roundToPx0680j_4(this.end) + measureScope.mo361roundToPx0680j_4(this.start);
        int mo361roundToPx0680j_42 = measureScope.mo361roundToPx0680j_4(this.bottom) + measureScope.mo361roundToPx0680j_4(this.top);
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(ConstraintsKt.m7583offsetNN6EwU(j, -mo361roundToPx0680j_4, -mo361roundToPx0680j_42));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m7581constrainWidthK40F9xA(j, mo6234measureBRTryo0.getWidth() + mo361roundToPx0680j_4), ConstraintsKt.m7580constrainHeightK40F9xA(j, mo6234measureBRTryo0.getHeight() + mo361roundToPx0680j_42), null, new h(this, mo6234measureBRTryo0, 2), 4, null);
    }

    /* renamed from: setBottom-0680j_4, reason: not valid java name */
    public final void m771setBottom0680j_4(float f) {
        this.bottom = f;
    }

    /* renamed from: setEnd-0680j_4, reason: not valid java name */
    public final void m772setEnd0680j_4(float f) {
        this.end = f;
    }

    public final void setRtlAware(boolean z) {
        this.rtlAware = z;
    }

    /* renamed from: setStart-0680j_4, reason: not valid java name */
    public final void m773setStart0680j_4(float f) {
        this.start = f;
    }

    /* renamed from: setTop-0680j_4, reason: not valid java name */
    public final void m774setTop0680j_4(float f) {
        this.top = f;
    }

    private PaddingNode(float f, float f2, float f3, float f4, boolean z) {
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
        this.rtlAware = z;
    }

    public /* synthetic */ PaddingNode(float f, float f2, float f3, float f4, boolean z, dq dqVar) {
        this(f, f2, f3, f4, z);
    }
}
