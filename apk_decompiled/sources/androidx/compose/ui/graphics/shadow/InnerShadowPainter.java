package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InnerShadowPainter extends Painter {
    public static final int $stable = 8;
    private float alpha;
    private ColorFilter colorFilter;
    private LayoutDirection layoutDirection;
    private final InnerShadowRendererProvider renderCreator;
    private final Shadow shadow;
    private final Shape shape;

    public InnerShadowPainter(Shape shape, Shadow shadow, InnerShadowRendererProvider innerShadowRendererProvider) {
        this.shape = shape;
        this.shadow = shadow;
        this.renderCreator = innerShadowRendererProvider;
        this.alpha = 1.0f;
        this.layoutDirection = LayoutDirection.Ltr;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f) {
        this.alpha = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo5455getIntrinsicSizeNHjbRc() {
        return Size.Companion.m4593getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        this.renderCreator.mo5463obtainInnerShadowRenderereZhPAX0(this.shape, drawScope.mo5335getSizeNHjbRc(), drawScope.getLayoutDirection(), drawScope, this.shadow).m5484drawShadowerFMhIw(drawScope, this.colorFilter, drawScope.mo5335getSizeNHjbRc(), this.shadow.m5479getColor0d7_KjU(), this.shadow.getBrush(), y80.g(this.shadow.getAlpha() * this.alpha, 0.0f, 1.0f), this.shadow.m5478getBlendMode0nO6VwU());
    }

    public /* synthetic */ InnerShadowPainter(Shape shape, Shadow shadow, InnerShadowRendererProvider innerShadowRendererProvider, int i, dq dqVar) {
        this(shape, shadow, (i & 4) != 0 ? InnerShadowRendererProvider.Companion.getDefault() : innerShadowRendererProvider);
    }

    public InnerShadowPainter(Shape shape, Shadow shadow) {
        this(shape, shadow, InnerShadowRendererProvider.Companion.getDefault());
    }
}
