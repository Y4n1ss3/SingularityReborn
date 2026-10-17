package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.j50;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class MarqueeModifierElement extends ModifierNodeElement<MarqueeModifierNode> {
    private final int animationMode;
    private final int delayMillis;
    private final int initialDelayMillis;
    private final int iterations;
    private final MarqueeSpacing spacing;
    private final float velocity;

    private MarqueeModifierElement(int i, int i2, int i3, int i4, MarqueeSpacing marqueeSpacing, float f) {
        this.iterations = i;
        this.animationMode = i2;
        this.delayMillis = i3;
        this.initialDelayMillis = i4;
        this.spacing = marqueeSpacing;
        this.velocity = f;
    }

    private final int component1() {
        return this.iterations;
    }

    /* renamed from: component2-ZbEOnfQ, reason: not valid java name */
    private final int m307component2ZbEOnfQ() {
        return this.animationMode;
    }

    private final int component3() {
        return this.delayMillis;
    }

    private final int component4() {
        return this.initialDelayMillis;
    }

    private final MarqueeSpacing component5() {
        return this.spacing;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name */
    private final float m308component6D9Ej5fM() {
        return this.velocity;
    }

    /* renamed from: copy-lWfNwf4$default, reason: not valid java name */
    public static /* synthetic */ MarqueeModifierElement m309copylWfNwf4$default(MarqueeModifierElement marqueeModifierElement, int i, int i2, int i3, int i4, MarqueeSpacing marqueeSpacing, float f, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marqueeModifierElement.iterations;
        }
        if ((i5 & 2) != 0) {
            i2 = marqueeModifierElement.animationMode;
        }
        if ((i5 & 4) != 0) {
            i3 = marqueeModifierElement.delayMillis;
        }
        if ((i5 & 8) != 0) {
            i4 = marqueeModifierElement.initialDelayMillis;
        }
        if ((i5 & 16) != 0) {
            marqueeSpacing = marqueeModifierElement.spacing;
        }
        if ((i5 & 32) != 0) {
            f = marqueeModifierElement.velocity;
        }
        MarqueeSpacing marqueeSpacing2 = marqueeSpacing;
        float f2 = f;
        return marqueeModifierElement.m310copylWfNwf4(i, i2, i3, i4, marqueeSpacing2, f2);
    }

    /* renamed from: copy-lWfNwf4, reason: not valid java name */
    public final MarqueeModifierElement m310copylWfNwf4(int i, int i2, int i3, int i4, MarqueeSpacing marqueeSpacing, float f) {
        return new MarqueeModifierElement(i, i2, i3, i4, marqueeSpacing, f, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public MarqueeModifierNode create() {
        return new MarqueeModifierNode(this.iterations, this.animationMode, this.delayMillis, this.initialDelayMillis, this.spacing, this.velocity, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarqueeModifierElement)) {
            return false;
        }
        MarqueeModifierElement marqueeModifierElement = (MarqueeModifierElement) obj;
        return this.iterations == marqueeModifierElement.iterations && MarqueeAnimationMode.m300equalsimpl0(this.animationMode, marqueeModifierElement.animationMode) && this.delayMillis == marqueeModifierElement.delayMillis && this.initialDelayMillis == marqueeModifierElement.initialDelayMillis && q10.b(this.spacing, marqueeModifierElement.spacing) && Dp.m7616equalsimpl0(this.velocity, marqueeModifierElement.velocity);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Dp.m7617hashCodeimpl(this.velocity) + ((this.spacing.hashCode() + j50.b(this.initialDelayMillis, j50.b(this.delayMillis, (MarqueeAnimationMode.m301hashCodeimpl(this.animationMode) + (Integer.hashCode(this.iterations) * 31)) * 31, 31), 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("basicMarquee");
        inspectorInfo.getProperties().set("iterations", Integer.valueOf(this.iterations));
        inspectorInfo.getProperties().set("animationMode", MarqueeAnimationMode.m297boximpl(this.animationMode));
        inspectorInfo.getProperties().set("delayMillis", Integer.valueOf(this.delayMillis));
        inspectorInfo.getProperties().set("initialDelayMillis", Integer.valueOf(this.initialDelayMillis));
        inspectorInfo.getProperties().set("spacing", this.spacing);
        inspectorInfo.getProperties().set("velocity", Dp.m7609boximpl(this.velocity));
    }

    public String toString() {
        return "MarqueeModifierElement(iterations=" + this.iterations + ", animationMode=" + ((Object) MarqueeAnimationMode.m302toStringimpl(this.animationMode)) + ", delayMillis=" + this.delayMillis + ", initialDelayMillis=" + this.initialDelayMillis + ", spacing=" + this.spacing + ", velocity=" + ((Object) Dp.m7622toStringimpl(this.velocity)) + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(MarqueeModifierNode marqueeModifierNode) {
        marqueeModifierNode.m313updatelWfNwf4(this.iterations, this.animationMode, this.delayMillis, this.initialDelayMillis, this.spacing, this.velocity);
    }

    public /* synthetic */ MarqueeModifierElement(int i, int i2, int i3, int i4, MarqueeSpacing marqueeSpacing, float f, dq dqVar) {
        this(i, i2, i3, i4, marqueeSpacing, f);
    }
}
