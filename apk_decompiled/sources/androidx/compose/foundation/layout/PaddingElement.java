package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.j50;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class PaddingElement extends ModifierNodeElement<PaddingNode> {
    private float bottom;
    private float end;
    private final ky inspectorInfo;
    private boolean rtlAware;
    private float start;
    private float top;

    private PaddingElement(float f, float f2, float f3, float f4, boolean z, ky kyVar) {
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
        this.rtlAware = z;
        this.inspectorInfo = kyVar;
        boolean z2 = true;
        boolean z3 = f >= 0.0f || Float.isNaN(f);
        float f5 = this.top;
        boolean z4 = z3 & (f5 >= 0.0f || Float.isNaN(f5));
        float f6 = this.end;
        boolean z5 = z4 & (f6 >= 0.0f || Float.isNaN(f6));
        float f7 = this.bottom;
        if (f7 < 0.0f && !Float.isNaN(f7)) {
            z2 = false;
        }
        if (!z5 || !z2) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public PaddingNode create() {
        return new PaddingNode(this.start, this.top, this.end, this.bottom, this.rtlAware, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && Dp.m7616equalsimpl0(this.start, paddingElement.start) && Dp.m7616equalsimpl0(this.top, paddingElement.top) && Dp.m7616equalsimpl0(this.end, paddingElement.end) && Dp.m7616equalsimpl0(this.bottom, paddingElement.bottom) && this.rtlAware == paddingElement.rtlAware;
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m747getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m748getEndD9Ej5fM() {
        return this.end;
    }

    public final ky getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m749getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m750getTopD9Ej5fM() {
        return this.top;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.rtlAware) + j50.a(this.bottom, j50.a(this.end, j50.a(this.top, Dp.m7617hashCodeimpl(this.start) * 31, 31), 31), 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* renamed from: setBottom-0680j_4, reason: not valid java name */
    public final void m751setBottom0680j_4(float f) {
        this.bottom = f;
    }

    /* renamed from: setEnd-0680j_4, reason: not valid java name */
    public final void m752setEnd0680j_4(float f) {
        this.end = f;
    }

    public final void setRtlAware(boolean z) {
        this.rtlAware = z;
    }

    /* renamed from: setStart-0680j_4, reason: not valid java name */
    public final void m753setStart0680j_4(float f) {
        this.start = f;
    }

    /* renamed from: setTop-0680j_4, reason: not valid java name */
    public final void m754setTop0680j_4(float f) {
        this.top = f;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(PaddingNode paddingNode) {
        paddingNode.m773setStart0680j_4(this.start);
        paddingNode.m774setTop0680j_4(this.top);
        paddingNode.m772setEnd0680j_4(this.end);
        paddingNode.m771setBottom0680j_4(this.bottom);
        paddingNode.setRtlAware(this.rtlAware);
    }

    public /* synthetic */ PaddingElement(float f, float f2, float f3, float f4, boolean z, ky kyVar, dq dqVar) {
        this(f, f2, f3, f4, z, kyVar);
    }

    public /* synthetic */ PaddingElement(float f, float f2, float f3, float f4, boolean z, ky kyVar, int i, dq dqVar) {
        this((i & 1) != 0 ? Dp.m7611constructorimpl(0.0f) : f, (i & 2) != 0 ? Dp.m7611constructorimpl(0.0f) : f2, (i & 4) != 0 ? Dp.m7611constructorimpl(0.0f) : f3, (i & 8) != 0 ? Dp.m7611constructorimpl(0.0f) : f4, z, kyVar, null);
    }
}
