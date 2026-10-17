package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.bv;
import defpackage.dq;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class BackgroundElement extends ModifierNodeElement<BackgroundNode> {
    private final float alpha;
    private final Brush brush;
    private final long color;
    private final ky inspectorInfo;
    private final Shape shape;

    public /* synthetic */ BackgroundElement(long j, Brush brush, float f, Shape shape, ky kyVar, int i, dq dqVar) {
        this((i & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j, (i & 2) != 0 ? null : brush, f, shape, kyVar, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BackgroundNode create() {
        return new BackgroundNode(this.color, this.brush, this.alpha, this.shape, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && Color.m4762equalsimpl0(this.color, backgroundElement.color) && q10.b(this.brush, backgroundElement.brush) && this.alpha == backgroundElement.alpha && q10.b(this.shape, backgroundElement.shape);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int m4768hashCodeimpl = Color.m4768hashCodeimpl(this.color) * 31;
        Brush brush = this.brush;
        return this.shape.hashCode() + bv.a(this.alpha, (m4768hashCodeimpl + (brush != null ? brush.hashCode() : 0)) * 31, 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BackgroundNode backgroundNode) {
        backgroundNode.m229setColor8_81llA(this.color);
        backgroundNode.setBrush(this.brush);
        backgroundNode.setAlpha(this.alpha);
        if (!q10.b(backgroundNode.getShape(), this.shape)) {
            backgroundNode.setShape(this.shape);
            SemanticsModifierNodeKt.invalidateSemantics(backgroundNode);
        }
        DrawModifierNodeKt.invalidateDraw(backgroundNode);
    }

    private BackgroundElement(long j, Brush brush, float f, Shape shape, ky kyVar) {
        this.color = j;
        this.brush = brush;
        this.alpha = f;
        this.shape = shape;
        this.inspectorInfo = kyVar;
    }

    public /* synthetic */ BackgroundElement(long j, Brush brush, float f, Shape shape, ky kyVar, dq dqVar) {
        this(j, brush, f, shape, kyVar);
    }
}
