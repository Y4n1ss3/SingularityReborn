package androidx.compose.foundation;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import defpackage.bv;
import defpackage.dq;
import defpackage.j50;
import defpackage.kp0;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MagnifierElement extends ModifierNodeElement<MagnifierNode> {
    public static final int $stable = 0;
    private final boolean clippingEnabled;
    private final float cornerRadius;
    private final float elevation;
    private final ky magnifierCenter;
    private final ky onSizeChanged;
    private final PlatformMagnifierFactory platformMagnifierFactory;
    private final long size;
    private final ky sourceCenter;
    private final boolean useTextDefault;
    private final float zoom;

    public /* synthetic */ MagnifierElement(ky kyVar, ky kyVar2, ky kyVar3, float f, boolean z, long j, float f2, float f3, boolean z2, PlatformMagnifierFactory platformMagnifierFactory, int i, dq dqVar) {
        this(kyVar, (i & 2) != 0 ? null : kyVar2, (i & 4) != 0 ? null : kyVar3, (i & 8) != 0 ? Float.NaN : f, (i & 16) != 0 ? false : z, (i & 32) != 0 ? DpSize.Companion.m7718getUnspecifiedMYxV2XQ() : j, (i & 64) != 0 ? Dp.Companion.m7631getUnspecifiedD9Ej5fM() : f2, (i & Fields.SpotShadowColor) != 0 ? Dp.Companion.m7631getUnspecifiedD9Ej5fM() : f3, (i & Fields.RotationX) != 0 ? true : z2, platformMagnifierFactory, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public MagnifierNode create() {
        return new MagnifierNode(this.sourceCenter, this.magnifierCenter, this.onSizeChanged, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.platformMagnifierFactory, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        return this.sourceCenter == magnifierElement.sourceCenter && this.magnifierCenter == magnifierElement.magnifierCenter && this.zoom == magnifierElement.zoom && this.useTextDefault == magnifierElement.useTextDefault && DpSize.m7706equalsimpl0(this.size, magnifierElement.size) && Dp.m7616equalsimpl0(this.cornerRadius, magnifierElement.cornerRadius) && Dp.m7616equalsimpl0(this.elevation, magnifierElement.elevation) && this.clippingEnabled == magnifierElement.clippingEnabled && this.onSizeChanged == magnifierElement.onSizeChanged && q10.b(this.platformMagnifierFactory, magnifierElement.platformMagnifierFactory);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.sourceCenter.hashCode() * 31;
        ky kyVar = this.magnifierCenter;
        int c = kp0.c(j50.a(this.elevation, j50.a(this.cornerRadius, (DpSize.m7711hashCodeimpl(this.size) + kp0.c(bv.a(this.zoom, (hashCode + (kyVar != null ? kyVar.hashCode() : 0)) * 31, 31), 31, this.useTextDefault)) * 31, 31), 31), 31, this.clippingEnabled);
        ky kyVar2 = this.onSizeChanged;
        return this.platformMagnifierFactory.hashCode() + ((c + (kyVar2 != null ? kyVar2.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("magnifier");
        inspectorInfo.getProperties().set("sourceCenter", this.sourceCenter);
        inspectorInfo.getProperties().set("magnifierCenter", this.magnifierCenter);
        inspectorInfo.getProperties().set("zoom", Float.valueOf(this.zoom));
        inspectorInfo.getProperties().set("size", DpSize.m7697boximpl(this.size));
        j50.g(this.elevation, j50.g(this.cornerRadius, inspectorInfo.getProperties(), "cornerRadius", inspectorInfo), "elevation", inspectorInfo).set("clippingEnabled", Boolean.valueOf(this.clippingEnabled));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(MagnifierNode magnifierNode) {
        magnifierNode.m292update5F03MCQ(this.sourceCenter, this.magnifierCenter, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.onSizeChanged, this.platformMagnifierFactory);
    }

    private MagnifierElement(ky kyVar, ky kyVar2, ky kyVar3, float f, boolean z, long j, float f2, float f3, boolean z2, PlatformMagnifierFactory platformMagnifierFactory) {
        this.sourceCenter = kyVar;
        this.magnifierCenter = kyVar2;
        this.onSizeChanged = kyVar3;
        this.zoom = f;
        this.useTextDefault = z;
        this.size = j;
        this.cornerRadius = f2;
        this.elevation = f3;
        this.clippingEnabled = z2;
        this.platformMagnifierFactory = platformMagnifierFactory;
    }

    public /* synthetic */ MagnifierElement(ky kyVar, ky kyVar2, ky kyVar3, float f, boolean z, long j, float f2, float f3, boolean z2, PlatformMagnifierFactory platformMagnifierFactory, dq dqVar) {
        this(kyVar, kyVar2, kyVar3, f, z, j, f2, f3, z2, platformMagnifierFactory);
    }
}
