package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.shadow.DropShadowPainter;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import defpackage.dq;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BlockDropShadowNode extends Modifier.Node implements DrawModifierNode, ObserverModifierNode, DropShadowScope {
    public static final int $stable = 0;
    private ky block;
    private boolean blockRead;
    private Brush brush;
    private Density densityObject;
    private float radius;
    private DropShadowPainter shadowPainter;
    private Shape shape;
    private float spread;
    private Shadow targetShadow;
    private long offset = Offset.Companion.m4532getZeroF1C5BW0();
    private long color = Color.Companion.m4787getBlack0d7_KjU();
    private float alpha = 1.0f;
    private int blendMode = BlendMode.Companion.m4701getSrcOver0nO6VwU();

    public BlockDropShadowNode(Shape shape, ky kyVar) {
        this.shape = shape;
        this.block = kyVar;
    }

    private final void invalidateShadow() {
        this.targetShadow = null;
        this.shadowPainter = null;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    private final DropShadowPainter obtainPainter() {
        if (!this.blockRead) {
            this.blockRead = true;
            ShadowKt.resetShadow(this);
            ObserverModifierNodeKt.observeReads(this, new BlockDropShadowNode$obtainPainter$1(this));
        }
        Shadow shadow = this.targetShadow;
        DropShadowPainter dropShadowPainter = this.shadowPainter;
        Brush brush = getBrush();
        float mo363toDpu2uoSUM = mo363toDpu2uoSUM(getRadius());
        float mo363toDpu2uoSUM2 = mo363toDpu2uoSUM(getSpread());
        float mo363toDpu2uoSUM3 = mo363toDpu2uoSUM(Float.intBitsToFloat((int) (mo4271getOffsetF1C5BW0() >> 32)));
        long m7667constructorimpl = DpOffset.m7667constructorimpl((Float.floatToRawIntBits(mo363toDpu2uoSUM(Float.intBitsToFloat((int) (mo4271getOffsetF1C5BW0() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(mo363toDpu2uoSUM3) << 32));
        if (dropShadowPainter != null && shadow != null && Dp.m7616equalsimpl0(shadow.m5481getRadiusD9Ej5fM(), mo363toDpu2uoSUM) && Dp.m7616equalsimpl0(shadow.m5482getSpreadD9Ej5fM(), mo363toDpu2uoSUM2) && Color.m4762equalsimpl0(shadow.m5479getColor0d7_KjU(), mo4270getColor0d7_KjU()) && q10.b(shadow.getBrush(), brush) && shadow.getAlpha() == getAlpha() && BlendMode.m4670equalsimpl0(shadow.m5478getBlendMode0nO6VwU(), mo4269getBlendMode0nO6VwU()) && DpOffset.m7671equalsimpl0(shadow.m5480getOffsetRKDOV3M(), m7667constructorimpl)) {
            return dropShadowPainter;
        }
        Shadow shadow2 = brush != null ? new Shadow(mo363toDpu2uoSUM, brush, mo363toDpu2uoSUM2, m7667constructorimpl, getAlpha(), mo4269getBlendMode0nO6VwU(), (dq) null) : new Shadow(mo363toDpu2uoSUM, mo4270getColor0d7_KjU(), mo363toDpu2uoSUM2, m7667constructorimpl, getAlpha(), mo4269getBlendMode0nO6VwU(), (dq) null);
        this.targetShadow = shadow2;
        DropShadowPainter createDropShadowPainter = DelegatableNodeKt.requireGraphicsContext(this).getShadowContext().createDropShadowPainter(this.shape, shadow2);
        this.shadowPainter = createDropShadowPainter;
        return createDropShadowPainter;
    }

    private final void setBlock(ky kyVar) {
        if (this.block != kyVar) {
            this.block = kyVar;
            this.blockRead = false;
            DrawModifierNodeKt.invalidateDraw(this);
        }
    }

    private final void setShape(Shape shape) {
        if (q10.b(this.shape, shape)) {
            return;
        }
        this.shape = shape;
        invalidateShadow();
    }

    private final void updateDensity() {
        Density requireDensity = DelegatableNodeKt.requireDensity(this);
        if (q10.b(this.densityObject, requireDensity)) {
            return;
        }
        this.densityObject = requireDensity;
        this.blockRead = false;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        Painter.m5460drawx_KDEd0$default(obtainPainter(), contentDrawScope, contentDrawScope.mo5335getSizeNHjbRc(), 0.0f, null, 6, null);
        contentDrawScope.drawContent();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof BlockDropShadowNode)) {
            BlockDropShadowNode blockDropShadowNode = (BlockDropShadowNode) obj;
            return getAlpha() == blockDropShadowNode.getAlpha() && q10.b(this.shape, blockDropShadowNode.shape) && this.block == blockDropShadowNode.block && getRadius() == blockDropShadowNode.getRadius() && getSpread() == blockDropShadowNode.getSpread() && Offset.m4513equalsimpl0(mo4271getOffsetF1C5BW0(), blockDropShadowNode.mo4271getOffsetF1C5BW0()) && Color.m4762equalsimpl0(mo4270getColor0d7_KjU(), blockDropShadowNode.mo4270getColor0d7_KjU()) && q10.b(getBrush(), blockDropShadowNode.getBrush()) && BlendMode.m4670equalsimpl0(mo4269getBlendMode0nO6VwU(), blockDropShadowNode.mo4269getBlendMode0nO6VwU());
        }
        return false;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public int mo4269getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public Brush getBrush() {
        return this.brush;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public long mo4270getColor0d7_KjU() {
        return this.color;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        Density density = this.densityObject;
        if (density != null) {
            return density.getDensity();
        }
        return 1.0f;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        Density density = this.densityObject;
        if (density != null) {
            return density.getFontScale();
        }
        return 1.0f;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public long mo4271getOffsetF1C5BW0() {
        return this.offset;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public float getRadius() {
        return this.radius;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public float getSpread() {
        return this.spread;
    }

    public int hashCode() {
        int m4768hashCodeimpl = (Color.m4768hashCodeimpl(mo4270getColor0d7_KjU()) + ((Offset.m4518hashCodeimpl(mo4271getOffsetF1C5BW0()) + ((Float.hashCode(getSpread()) + ((Float.hashCode(getRadius()) + ((this.block.hashCode() + ((this.shape.hashCode() + (Float.hashCode(getAlpha()) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Brush brush = getBrush();
        return BlendMode.m4671hashCodeimpl(mo4269getBlendMode0nO6VwU()) + ((m4768hashCodeimpl + (brush != null ? brush.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        updateDensity();
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        if (isAttached()) {
            updateDensity();
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        this.blockRead = false;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public void setAlpha(float f) {
        if (this.alpha == f) {
            return;
        }
        this.alpha = f;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public void mo4272setBlendModes9anfk8(int i) {
        if (BlendMode.m4670equalsimpl0(this.blendMode, i)) {
            return;
        }
        this.blendMode = i;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public void setBrush(Brush brush) {
        if (q10.b(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public void mo4273setColor8_81llA(long j) {
        if (j == 16) {
            j = Color.Companion.m4787getBlack0d7_KjU();
        }
        if (Color.m4762equalsimpl0(this.color, j)) {
            return;
        }
        this.color = j;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* renamed from: setOffset-k-4lQ0M, reason: not valid java name */
    public void mo4274setOffsetk4lQ0M(long j) {
        if (Offset.m4513equalsimpl0(this.offset, j)) {
            return;
        }
        this.offset = j;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public void setRadius(float f) {
        if (this.radius == f) {
            return;
        }
        this.radius = f;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public void setSpread(float f) {
        if (this.spread == f) {
            return;
        }
        this.spread = f;
        invalidateShadow();
    }

    public final void update(Shape shape, ky kyVar) {
        setShape(shape);
        setBlock(kyVar);
    }
}
