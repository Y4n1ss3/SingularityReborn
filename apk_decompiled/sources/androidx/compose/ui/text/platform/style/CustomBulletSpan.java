package androidx.compose.ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.platform.style.CustomBulletSpan;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.iy;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class CustomBulletSpan implements LeadingMarginSpan {
    public static final int $stable = DrawStyle.$stable;
    private final float alpha;
    private final Brush brush;
    private final float bulletHeightPx;
    private final float bulletWidthPx;
    private final Density density;
    private final int diff;
    private final DrawStyle drawStyle;
    private final int minimumRequiredIndent;
    private final Shape shape;

    public CustomBulletSpan(Shape shape, float f, float f2, float f3, Brush brush, float f4, DrawStyle drawStyle, Density density, float f5) {
        this.shape = shape;
        this.bulletWidthPx = f;
        this.bulletHeightPx = f2;
        this.brush = brush;
        this.alpha = f4;
        this.drawStyle = drawStyle;
        this.density = density;
        int P = y80.P(f + f3);
        this.minimumRequiredIndent = P;
        this.diff = y80.P(f5) - P;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 drawLeadingMargin$lambda$0$0(CustomBulletSpan customBulletSpan, long j, int i, Canvas canvas, Paint paint, int i2, float f) {
        BulletSpan_androidKt.draw(customBulletSpan.shape.mo283createOutlinePq9zytI(j, i > 0 ? LayoutDirection.Ltr : LayoutDirection.Rtl, customBulletSpan.density), canvas, paint, i2, f, i);
        return w01.a;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(final Canvas canvas, final Paint paint, int i, final int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (canvas == null) {
            return;
        }
        final float f = (i3 + i5) / 2.0f;
        int i8 = i - this.minimumRequiredIndent;
        if (i8 < 0) {
            i8 = 0;
        }
        final int i9 = i8;
        charSequence.getClass();
        if (((Spanned) charSequence).getSpanStart(this) != i6 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        BulletSpan_androidKt.setDrawStyle(paint, this.drawStyle);
        float f2 = this.bulletWidthPx;
        float f3 = this.bulletHeightPx;
        final long m4576constructorimpl = Size.m4576constructorimpl((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        BulletSpan_androidKt.m7346setBrushAndDrawyzxVdVo(paint, this.brush, this.alpha, m4576constructorimpl, new iy() { // from class: zo
            @Override // defpackage.iy
            public final Object invoke() {
                w01 drawLeadingMargin$lambda$0$0;
                drawLeadingMargin$lambda$0$0 = CustomBulletSpan.drawLeadingMargin$lambda$0$0(CustomBulletSpan.this, m4576constructorimpl, i2, canvas, paint, i9, f);
                return drawLeadingMargin$lambda$0$0;
            }
        });
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        int i = this.diff;
        if (i >= 0) {
            return 0;
        }
        return Math.abs(i);
    }
}
