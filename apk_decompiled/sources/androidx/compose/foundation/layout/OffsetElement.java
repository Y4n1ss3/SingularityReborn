package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.fc;
import defpackage.j50;
import defpackage.ky;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class OffsetElement extends ModifierNodeElement<OffsetNode> {
    private final ky inspectorInfo;
    private final boolean rtlAware;
    private final float x;
    private final float y;

    private OffsetElement(float f, float f2, boolean z, ky kyVar) {
        this.x = f;
        this.y = f2;
        this.rtlAware = z;
        this.inspectorInfo = kyVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OffsetNode create() {
        return new OffsetNode(this.x, this.y, this.rtlAware, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && Dp.m7616equalsimpl0(this.x, offsetElement.x) && Dp.m7616equalsimpl0(this.y, offsetElement.y) && this.rtlAware == offsetElement.rtlAware;
    }

    public final ky getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public final float m717getXD9Ej5fM() {
        return this.x;
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public final float m718getYD9Ej5fM() {
        return this.y;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.rtlAware) + j50.a(this.y, Dp.m7617hashCodeimpl(this.x) * 31, 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OffsetModifierElement(x=");
        fc.i(this.x, sb, ", y=");
        fc.i(this.y, sb, ", rtlAware=");
        return uf.e(sb, this.rtlAware, ')');
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OffsetNode offsetNode) {
        offsetNode.m727updateMdfbLM(this.x, this.y, this.rtlAware);
    }

    public /* synthetic */ OffsetElement(float f, float f2, boolean z, ky kyVar, dq dqVar) {
        this(f, f2, z, kyVar);
    }
}
