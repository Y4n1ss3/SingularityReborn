package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bv;
import defpackage.dq;
import defpackage.fb0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AndroidShadowContext implements PlatformShadowContext, DropShadowRendererProvider, InnerShadowRendererProvider {
    private fb0 dropShadowCache;
    private fb0 innerShadowCache;
    private ShadowKey shadowKey;

    private final fb0 obtainDropShadowCache() {
        fb0 fb0Var = this.dropShadowCache;
        if (fb0Var != null) {
            return fb0Var;
        }
        fb0 fb0Var2 = new fb0();
        this.dropShadowCache = fb0Var2;
        return fb0Var2;
    }

    private final fb0 obtainInnerShadowCache() {
        fb0 fb0Var = this.innerShadowCache;
        if (fb0Var != null) {
            return fb0Var;
        }
        fb0 fb0Var2 = new fb0();
        this.innerShadowCache = fb0Var2;
        return fb0Var2;
    }

    private final ShadowKey obtainShadowKey() {
        ShadowKey shadowKey = this.shadowKey;
        if (shadowKey != null) {
            return shadowKey;
        }
        ShadowKey shadowKey2 = new ShadowKey(null, 0L, null, 0.0f, null, 31, null);
        this.shadowKey = shadowKey2;
        return shadowKey2;
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowContext
    public void clearCache() {
        synchronized (this) {
            try {
                fb0 fb0Var = this.dropShadowCache;
                if (fb0Var != null) {
                    fb0Var.f();
                }
                fb0 fb0Var2 = this.innerShadowCache;
                if (fb0Var2 != null) {
                    fb0Var2.f();
                }
                this.shadowKey = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowContext
    public DropShadowPainter createDropShadowPainter(Shape shape, Shadow shadow) {
        return new DropShadowPainter(shape, shadow, this);
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowContext
    public InnerShadowPainter createInnerShadowPainter(Shape shape, Shadow shadow) {
        return new InnerShadowPainter(shape, shadow, this);
    }

    @Override // androidx.compose.ui.graphics.shadow.DropShadowRendererProvider
    /* renamed from: obtainDropShadowRenderer-eZhPAX0, reason: not valid java name */
    public DropShadowRenderer mo5462obtainDropShadowRenderereZhPAX0(Shape shape, long j, LayoutDirection layoutDirection, Density density, Shadow shadow) {
        DropShadowRenderer dropShadowRenderer;
        synchronized (this) {
            ShadowKey obtainShadowKey = obtainShadowKey();
            obtainShadowKey.setShape(shape);
            obtainShadowKey.m5468setSizeuvyYCjk(j);
            obtainShadowKey.setLayoutDirection(layoutDirection);
            obtainShadowKey.setDensity(density.getDensity());
            obtainShadowKey.setShadow(shadow.copyWithoutOffset$ui_graphics());
            dropShadowRenderer = (DropShadowRenderer) obtainDropShadowCache().d(obtainShadowKey);
            if (dropShadowRenderer == null) {
                DropShadowRenderer dropShadowRenderer2 = new DropShadowRenderer(shadow, shape.mo283createOutlinePq9zytI(j, layoutDirection, density));
                obtainDropShadowCache().l(ShadowKey.m5464copyeZhPAX0$default(obtainShadowKey, null, 0L, null, 0.0f, null, 31, null), dropShadowRenderer2);
                dropShadowRenderer = dropShadowRenderer2;
            }
        }
        return dropShadowRenderer;
    }

    @Override // androidx.compose.ui.graphics.shadow.InnerShadowRendererProvider
    /* renamed from: obtainInnerShadowRenderer-eZhPAX0, reason: not valid java name */
    public InnerShadowRenderer mo5463obtainInnerShadowRenderereZhPAX0(Shape shape, long j, LayoutDirection layoutDirection, Density density, Shadow shadow) {
        InnerShadowRenderer innerShadowRenderer;
        synchronized (this) {
            ShadowKey obtainShadowKey = obtainShadowKey();
            obtainShadowKey.setShape(shape);
            obtainShadowKey.m5468setSizeuvyYCjk(j);
            obtainShadowKey.setLayoutDirection(layoutDirection);
            obtainShadowKey.setDensity(density.getDensity());
            obtainShadowKey.setShadow(shadow);
            innerShadowRenderer = (InnerShadowRenderer) obtainInnerShadowCache().d(obtainShadowKey);
            if (innerShadowRenderer == null) {
                InnerShadowRenderer innerShadowRenderer2 = new InnerShadowRenderer(shadow, shape.mo283createOutlinePq9zytI(j, layoutDirection, density));
                obtainInnerShadowCache().l(ShadowKey.m5464copyeZhPAX0$default(obtainShadowKey, null, 0L, null, 0.0f, null, 31, null), innerShadowRenderer2);
                innerShadowRenderer = innerShadowRenderer2;
            }
        }
        return innerShadowRenderer;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ShadowKey {
        public static final int $stable = 8;
        private float density;
        private LayoutDirection layoutDirection;
        private Shadow shadow;
        private Shape shape;
        private long size;

        public /* synthetic */ ShadowKey(Shape shape, long j, LayoutDirection layoutDirection, float f, Shadow shadow, int i, dq dqVar) {
            this((i & 1) != 0 ? RectangleShapeKt.getRectangleShape() : shape, (i & 2) != 0 ? Size.Companion.m4594getZeroNHjbRc() : j, (i & 4) != 0 ? LayoutDirection.Ltr : layoutDirection, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? null : shadow, null);
        }

        /* renamed from: copy-eZhPAX0$default, reason: not valid java name */
        public static /* synthetic */ ShadowKey m5464copyeZhPAX0$default(ShadowKey shadowKey, Shape shape, long j, LayoutDirection layoutDirection, float f, Shadow shadow, int i, Object obj) {
            if ((i & 1) != 0) {
                shape = shadowKey.shape;
            }
            if ((i & 2) != 0) {
                j = shadowKey.size;
            }
            if ((i & 4) != 0) {
                layoutDirection = shadowKey.layoutDirection;
            }
            if ((i & 8) != 0) {
                f = shadowKey.density;
            }
            if ((i & 16) != 0) {
                shadow = shadowKey.shadow;
            }
            Shadow shadow2 = shadow;
            LayoutDirection layoutDirection2 = layoutDirection;
            return shadowKey.m5466copyeZhPAX0(shape, j, layoutDirection2, f, shadow2);
        }

        public final Shape component1() {
            return this.shape;
        }

        /* renamed from: component2-NH-jbRc, reason: not valid java name */
        public final long m5465component2NHjbRc() {
            return this.size;
        }

        public final LayoutDirection component3() {
            return this.layoutDirection;
        }

        public final float component4() {
            return this.density;
        }

        public final Shadow component5() {
            return this.shadow;
        }

        /* renamed from: copy-eZhPAX0, reason: not valid java name */
        public final ShadowKey m5466copyeZhPAX0(Shape shape, long j, LayoutDirection layoutDirection, float f, Shadow shadow) {
            return new ShadowKey(shape, j, layoutDirection, f, shadow, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShadowKey)) {
                return false;
            }
            ShadowKey shadowKey = (ShadowKey) obj;
            return q10.b(this.shape, shadowKey.shape) && Size.m4581equalsimpl0(this.size, shadowKey.size) && this.layoutDirection == shadowKey.layoutDirection && Float.compare(this.density, shadowKey.density) == 0 && q10.b(this.shadow, shadowKey.shadow);
        }

        public final float getDensity() {
            return this.density;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public final Shadow getShadow() {
            return this.shadow;
        }

        public final Shape getShape() {
            return this.shape;
        }

        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long m5467getSizeNHjbRc() {
            return this.size;
        }

        public int hashCode() {
            int a = bv.a(this.density, (this.layoutDirection.hashCode() + ((Size.m4586hashCodeimpl(this.size) + (this.shape.hashCode() * 31)) * 31)) * 31, 31);
            Shadow shadow = this.shadow;
            return a + (shadow == null ? 0 : shadow.hashCode());
        }

        public final void setDensity(float f) {
            this.density = f;
        }

        public final void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        public final void setShadow(Shadow shadow) {
            this.shadow = shadow;
        }

        public final void setShape(Shape shape) {
            this.shape = shape;
        }

        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void m5468setSizeuvyYCjk(long j) {
            this.size = j;
        }

        public String toString() {
            return "ShadowKey(shape=" + this.shape + ", size=" + ((Object) Size.m4589toStringimpl(this.size)) + ", layoutDirection=" + this.layoutDirection + ", density=" + this.density + ", shadow=" + this.shadow + ')';
        }

        private ShadowKey(Shape shape, long j, LayoutDirection layoutDirection, float f, Shadow shadow) {
            this.shape = shape;
            this.size = j;
            this.layoutDirection = layoutDirection;
            this.density = f;
            this.shadow = shadow;
        }

        public /* synthetic */ ShadowKey(Shape shape, long j, LayoutDirection layoutDirection, float f, Shadow shadow, dq dqVar) {
            this(shape, j, layoutDirection, f, shadow);
        }
    }
}
