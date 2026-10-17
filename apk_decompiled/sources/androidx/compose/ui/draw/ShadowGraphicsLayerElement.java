package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.fc;
import defpackage.j50;
import defpackage.kp0;
import defpackage.ky;
import defpackage.q10;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {
    public static final int $stable = 0;
    private final long ambientColor;
    private final boolean clip;
    private final float elevation;
    private final Shape shape;
    private final long spotColor;

    private ShadowGraphicsLayerElement(float f, Shape shape, boolean z, long j, long j2) {
        this.elevation = f;
        this.shape = shape;
        this.clip = z;
        this.ambientColor = j;
        this.spotColor = j2;
    }

    /* renamed from: copy-gNMxBKI$default, reason: not valid java name */
    public static /* synthetic */ ShadowGraphicsLayerElement m4347copygNMxBKI$default(ShadowGraphicsLayerElement shadowGraphicsLayerElement, float f, Shape shape, boolean z, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = shadowGraphicsLayerElement.elevation;
        }
        if ((i & 2) != 0) {
            shape = shadowGraphicsLayerElement.shape;
        }
        if ((i & 4) != 0) {
            z = shadowGraphicsLayerElement.clip;
        }
        if ((i & 8) != 0) {
            j = shadowGraphicsLayerElement.ambientColor;
        }
        if ((i & 16) != 0) {
            j2 = shadowGraphicsLayerElement.spotColor;
        }
        long j3 = j2;
        boolean z2 = z;
        return shadowGraphicsLayerElement.m4351copygNMxBKI(f, shape, z2, j, j3);
    }

    private final ky createBlock() {
        return new ShadowGraphicsLayerElement$createBlock$1(this);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m4348component1D9Ej5fM() {
        return this.elevation;
    }

    public final Shape component2() {
        return this.shape;
    }

    public final boolean component3() {
        return this.clip;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m4349component40d7_KjU() {
        return this.ambientColor;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name */
    public final long m4350component50d7_KjU() {
        return this.spotColor;
    }

    /* renamed from: copy-gNMxBKI, reason: not valid java name */
    public final ShadowGraphicsLayerElement m4351copygNMxBKI(float f, Shape shape, boolean z, long j, long j2) {
        return new ShadowGraphicsLayerElement(f, shape, z, j, j2, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BlockGraphicsLayerModifier create() {
        return new BlockGraphicsLayerModifier(createBlock());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return Dp.m7616equalsimpl0(this.elevation, shadowGraphicsLayerElement.elevation) && q10.b(this.shape, shadowGraphicsLayerElement.shape) && this.clip == shadowGraphicsLayerElement.clip && Color.m4762equalsimpl0(this.ambientColor, shadowGraphicsLayerElement.ambientColor) && Color.m4762equalsimpl0(this.spotColor, shadowGraphicsLayerElement.spotColor);
    }

    /* renamed from: getAmbientColor-0d7_KjU, reason: not valid java name */
    public final long m4352getAmbientColor0d7_KjU() {
        return this.ambientColor;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m4353getElevationD9Ej5fM() {
        return this.elevation;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getSpotColor-0d7_KjU, reason: not valid java name */
    public final long m4354getSpotColor0d7_KjU() {
        return this.spotColor;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Color.m4768hashCodeimpl(this.spotColor) + kp0.d(this.ambientColor, kp0.c((this.shape.hashCode() + (Dp.m7617hashCodeimpl(this.elevation) * 31)) * 31, 31, this.clip), 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("shadow");
        j50.g(this.elevation, inspectorInfo.getProperties(), "elevation", inspectorInfo).set("shape", this.shape);
        uf.d(this.clip, inspectorInfo.getProperties(), "clip", inspectorInfo).set("ambientColor", Color.m4751boximpl(this.ambientColor));
        inspectorInfo.getProperties().set("spotColor", Color.m4751boximpl(this.spotColor));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        fc.i(this.elevation, sb, ", shape=");
        sb.append(this.shape);
        sb.append(", clip=");
        sb.append(this.clip);
        sb.append(", ambientColor=");
        kp0.i(this.ambientColor, sb, ", spotColor=");
        sb.append((Object) Color.m4769toStringimpl(this.spotColor));
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        blockGraphicsLayerModifier.setLayerBlock(createBlock());
        blockGraphicsLayerModifier.invalidateLayerBlock();
    }

    public /* synthetic */ ShadowGraphicsLayerElement(float f, Shape shape, boolean z, long j, long j2, dq dqVar) {
        this(f, shape, z, j, j2);
    }
}
