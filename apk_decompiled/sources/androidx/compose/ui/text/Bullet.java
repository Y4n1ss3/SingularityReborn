package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import defpackage.bv;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class Bullet implements AnnotatedString.Annotation {
    private static final Bullet Default;
    private static final long DefaultPadding;
    private static final long DefaultSize;
    private final float alpha;
    private final Brush brush;
    private final DrawStyle drawStyle;
    private final long height;
    private final long padding;
    private final Shape shape;
    private final long width;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = DrawStyle.$stable;
    private static final long DefaultIndentation = TextUnitKt.getEm(1);

    static {
        long em = TextUnitKt.getEm(0.25d);
        DefaultSize = em;
        long em2 = TextUnitKt.getEm(0.25d);
        DefaultPadding = em2;
        Default = new Bullet(CircleShape.INSTANCE, em, em, em2, null, 0.0f, null, 112, null);
    }

    public /* synthetic */ Bullet(Shape shape, long j, long j2, long j3, Brush brush, float f, DrawStyle drawStyle, int i, dq dqVar) {
        this(shape, j, j2, j3, (i & 16) != 0 ? null : brush, (i & 32) != 0 ? Float.NaN : f, (i & 64) != 0 ? Fill.INSTANCE : drawStyle, null);
    }

    /* renamed from: copy-w_4Rhrw$default, reason: not valid java name */
    public static /* synthetic */ Bullet m6899copyw_4Rhrw$default(Bullet bullet, Shape shape, long j, long j2, long j3, Brush brush, float f, DrawStyle drawStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            shape = bullet.shape;
        }
        if ((i & 2) != 0) {
            j = bullet.width;
        }
        if ((i & 4) != 0) {
            j2 = bullet.height;
        }
        if ((i & 8) != 0) {
            j3 = bullet.padding;
        }
        if ((i & 16) != 0) {
            brush = bullet.brush;
        }
        if ((i & 32) != 0) {
            f = bullet.alpha;
        }
        if ((i & 64) != 0) {
            drawStyle = bullet.drawStyle;
        }
        DrawStyle drawStyle2 = drawStyle;
        Brush brush2 = brush;
        long j4 = j3;
        long j5 = j2;
        return bullet.m6900copyw_4Rhrw(shape, j, j5, j4, brush2, f, drawStyle2);
    }

    /* renamed from: copy-w_4Rhrw, reason: not valid java name */
    public final Bullet m6900copyw_4Rhrw(Shape shape, long j, long j2, long j3, Brush brush, float f, DrawStyle drawStyle) {
        return new Bullet(shape, j, j2, j3, brush, f, drawStyle, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Bullet)) {
            Bullet bullet = (Bullet) obj;
            return q10.b(this.shape, bullet.shape) && TextUnit.m7802equalsimpl0(this.width, bullet.width) && TextUnit.m7802equalsimpl0(this.height, bullet.height) && TextUnit.m7802equalsimpl0(this.padding, bullet.padding) && q10.b(this.brush, bullet.brush) && this.alpha == bullet.alpha && q10.b(this.drawStyle, bullet.drawStyle);
        }
        return false;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    /* renamed from: getHeight-XSAIIZE, reason: not valid java name */
    public final long m6901getHeightXSAIIZE() {
        return this.height;
    }

    /* renamed from: getPadding-XSAIIZE, reason: not valid java name */
    public final long m6902getPaddingXSAIIZE() {
        return this.padding;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getWidth-XSAIIZE, reason: not valid java name */
    public final long m6903getWidthXSAIIZE() {
        return this.width;
    }

    public int hashCode() {
        int m7806hashCodeimpl = (TextUnit.m7806hashCodeimpl(this.padding) + ((TextUnit.m7806hashCodeimpl(this.height) + ((TextUnit.m7806hashCodeimpl(this.width) + (this.shape.hashCode() * 31)) * 31)) * 31)) * 31;
        Brush brush = this.brush;
        return this.drawStyle.hashCode() + bv.a(this.alpha, (m7806hashCodeimpl + (brush != null ? brush.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        return "Bullet(shape=" + this.shape + ", size=(" + ((Object) TextUnit.m7812toStringimpl(this.width)) + ", " + ((Object) TextUnit.m7812toStringimpl(this.height)) + "), padding=" + ((Object) TextUnit.m7812toStringimpl(this.padding)) + ", brush=" + this.brush + ", alpha=" + this.alpha + ", drawStyle=" + this.drawStyle + ')';
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final Bullet getDefault() {
            return Bullet.Default;
        }

        /* renamed from: getDefaultIndentation-XSAIIZE, reason: not valid java name */
        public final long m6904getDefaultIndentationXSAIIZE() {
            return Bullet.DefaultIndentation;
        }

        /* renamed from: getDefaultPadding-XSAIIZE, reason: not valid java name */
        public final long m6905getDefaultPaddingXSAIIZE() {
            return Bullet.DefaultPadding;
        }

        /* renamed from: getDefaultSize-XSAIIZE, reason: not valid java name */
        public final long m6906getDefaultSizeXSAIIZE() {
            return Bullet.DefaultSize;
        }

        private Companion() {
        }
    }

    private Bullet(Shape shape, long j, long j2, long j3, Brush brush, float f, DrawStyle drawStyle) {
        this.shape = shape;
        this.width = j;
        this.height = j2;
        this.padding = j3;
        this.brush = brush;
        this.alpha = f;
        this.drawStyle = drawStyle;
    }

    public /* synthetic */ Bullet(Shape shape, long j, long j2, long j3, Brush brush, float f, DrawStyle drawStyle, dq dqVar) {
        this(shape, j, j2, j3, brush, f, drawStyle);
    }
}
