package androidx.compose.material3;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.j50;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class RippleNodeFactory implements IndicationNodeFactory {
    private final boolean bounded;
    private final long color;
    private final ColorProducer colorProducer;
    private final float radius;

    private RippleNodeFactory(boolean z, float f, ColorProducer colorProducer) {
        this(z, f, colorProducer, Color.Companion.m4797getUnspecified0d7_KjU());
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public DelegatableNode create(InteractionSource interactionSource) {
        ColorProducer colorProducer = this.colorProducer;
        if (colorProducer == null) {
            colorProducer = new ColorProducer() { // from class: androidx.compose.material3.RippleNodeFactory$create$colorProducer$1
                @Override // androidx.compose.ui.graphics.ColorProducer
                /* renamed from: invoke-0d7_KjU */
                public final long mo1922invoke0d7_KjU() {
                    long j;
                    j = RippleNodeFactory.this.color;
                    return j;
                }
            };
        }
        return new DelegatingThemeAwareRippleNode(interactionSource, this.bounded, this.radius, colorProducer, null);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleNodeFactory)) {
            return false;
        }
        RippleNodeFactory rippleNodeFactory = (RippleNodeFactory) obj;
        if (this.bounded == rippleNodeFactory.bounded && Dp.m7616equalsimpl0(this.radius, rippleNodeFactory.radius) && q10.b(this.colorProducer, rippleNodeFactory.colorProducer)) {
            return Color.m4762equalsimpl0(this.color, rippleNodeFactory.color);
        }
        return false;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public int hashCode() {
        int a = j50.a(this.radius, Boolean.hashCode(this.bounded) * 31, 31);
        ColorProducer colorProducer = this.colorProducer;
        return Color.m4768hashCodeimpl(this.color) + ((a + (colorProducer != null ? colorProducer.hashCode() : 0)) * 31);
    }

    public /* synthetic */ RippleNodeFactory(boolean z, float f, ColorProducer colorProducer, dq dqVar) {
        this(z, f, colorProducer);
    }

    private RippleNodeFactory(boolean z, float f, ColorProducer colorProducer, long j) {
        this.bounded = z;
        this.radius = f;
        this.colorProducer = colorProducer;
        this.color = j;
    }

    public /* synthetic */ RippleNodeFactory(boolean z, float f, long j, dq dqVar) {
        this(z, f, j);
    }

    private RippleNodeFactory(boolean z, float f, long j) {
        this(z, f, (ColorProducer) null, j);
    }
}
