package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DropShadowPainter extends Painter {
    public static final int $stable = 8;
    private float alpha;
    private ColorFilter colorFilter;
    private LayoutDirection layoutDirection;
    private final DropShadowRendererProvider renderCreator;
    private final Shadow shadow;
    private final Shape shape;

    public DropShadowPainter(Shape shape, Shadow shadow, DropShadowRendererProvider dropShadowRendererProvider) {
        this.shape = shape;
        this.shadow = shadow;
        this.renderCreator = dropShadowRendererProvider;
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
        DropShadowRenderer mo5462obtainDropShadowRenderereZhPAX0 = this.renderCreator.mo5462obtainDropShadowRenderereZhPAX0(this.shape, drawScope.mo5335getSizeNHjbRc(), drawScope.getLayoutDirection(), drawScope, this.shadow);
        float mo367toPx0680j_4 = drawScope.mo367toPx0680j_4(DpOffset.m7672getXD9Ej5fM(this.shadow.m5480getOffsetRKDOV3M()));
        float mo367toPx0680j_42 = drawScope.mo367toPx0680j_4(DpOffset.m7674getYD9Ej5fM(this.shadow.m5480getOffsetRKDOV3M()));
        drawScope.getDrawContext().getTransform().translate(mo367toPx0680j_4, mo367toPx0680j_42);
        try {
            mo5462obtainDropShadowRenderereZhPAX0.m5484drawShadowerFMhIw(drawScope, this.colorFilter, drawScope.mo5335getSizeNHjbRc(), mo5462obtainDropShadowRenderereZhPAX0.getShadow().m5479getColor0d7_KjU(), mo5462obtainDropShadowRenderereZhPAX0.getShadow().getBrush(), y80.g(this.alpha * mo5462obtainDropShadowRenderereZhPAX0.getShadow().getAlpha(), 0.0f, 1.0f), mo5462obtainDropShadowRenderereZhPAX0.getShadow().m5478getBlendMode0nO6VwU());
        } finally {
            drawScope.getDrawContext().getTransform().translate(-mo367toPx0680j_4, -mo367toPx0680j_42);
        }
    }

    public DropShadowPainter(Shape shape, Shadow shadow) {
        this(shape, shadow, DropShadowRendererProvider.Companion.getDefault());
    }
}
