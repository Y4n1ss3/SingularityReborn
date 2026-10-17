package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import defpackage.my;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OutlineKt {
    public static final void addOutline(Path path, Outline outline) {
        if (outline instanceof Outline.Rectangle) {
            Path.addRect$default(path, ((Outline.Rectangle) outline).getRect(), null, 2, null);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Path.addRoundRect$default(path, ((Outline.Rounded) outline).getRoundRect(), null, 2, null);
        } else if (outline instanceof Outline.Generic) {
            Path.m5045addPathUv8p0NA$default(path, ((Outline.Generic) outline).getPath(), 0L, 2, null);
        } else {
            o.n();
        }
    }

    public static final void drawOutline(Canvas canvas, Outline outline, Paint paint) {
        if (outline instanceof Outline.Rectangle) {
            canvas.drawRect(((Outline.Rectangle) outline).getRect(), paint);
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (outline instanceof Outline.Generic) {
                canvas.drawPath(((Outline.Generic) outline).getPath(), paint);
                return;
            } else {
                o.n();
                return;
            }
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        Path roundRectPath$ui_graphics = rounded.getRoundRectPath$ui_graphics();
        if (roundRectPath$ui_graphics != null) {
            canvas.drawPath(roundRectPath$ui_graphics, paint);
        } else {
            canvas.drawRoundRect(rounded.getRoundRect().getLeft(), rounded.getRoundRect().getTop(), rounded.getRoundRect().getRight(), rounded.getRoundRect().getBottom(), Float.intBitsToFloat((int) (rounded.getRoundRect().m4564getBottomLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m4564getBottomLeftCornerRadiuskKHJgLs() & 4294967295L)), paint);
        }
    }

    /* renamed from: drawOutline-hn5TExg, reason: not valid java name */
    public static final void m5031drawOutlinehn5TExg(DrawScope drawScope, Outline outline, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo5247drawRectAsUm42w(brush, topLeft(rect), size(rect), f, drawStyle, colorFilter, i);
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (outline instanceof Outline.Generic) {
                drawScope.mo5243drawPathGBMwjPU(((Outline.Generic) outline).getPath(), brush, f, drawStyle, colorFilter, i);
                return;
            } else {
                o.n();
                return;
            }
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        Path roundRectPath$ui_graphics = rounded.getRoundRectPath$ui_graphics();
        if (roundRectPath$ui_graphics != null) {
            drawScope.mo5243drawPathGBMwjPU(roundRectPath$ui_graphics, brush, f, drawStyle, colorFilter, i);
            return;
        }
        RoundRect roundRect = rounded.getRoundRect();
        float intBitsToFloat = Float.intBitsToFloat((int) (roundRect.m4564getBottomLeftCornerRadiuskKHJgLs() >> 32));
        drawScope.mo5249drawRoundRectZuiqVtQ(brush, topLeft(roundRect), size(roundRect), CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)), f, drawStyle, colorFilter, i);
    }

    /* renamed from: drawOutline-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m5032drawOutlinehn5TExg$default(DrawScope drawScope, Outline outline, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i2 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i2 & 32) != 0) {
            i = DrawScope.Companion.m5337getDefaultBlendMode0nO6VwU();
        }
        m5031drawOutlinehn5TExg(drawScope, outline, brush, f2, drawStyle2, colorFilter2, i);
    }

    /* renamed from: drawOutline-wDX37Ww, reason: not valid java name */
    public static final void m5033drawOutlinewDX37Ww(DrawScope drawScope, Outline outline, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo5248drawRectnJ9OG0(j, topLeft(rect), size(rect), f, drawStyle, colorFilter, i);
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (outline instanceof Outline.Generic) {
                drawScope.mo5244drawPathLG529CI(((Outline.Generic) outline).getPath(), j, f, drawStyle, colorFilter, i);
                return;
            } else {
                o.n();
                return;
            }
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        Path roundRectPath$ui_graphics = rounded.getRoundRectPath$ui_graphics();
        if (roundRectPath$ui_graphics != null) {
            drawScope.mo5244drawPathLG529CI(roundRectPath$ui_graphics, j, f, drawStyle, colorFilter, i);
            return;
        }
        RoundRect roundRect = rounded.getRoundRect();
        float intBitsToFloat = Float.intBitsToFloat((int) (roundRect.m4564getBottomLeftCornerRadiuskKHJgLs() >> 32));
        drawScope.mo5250drawRoundRectuAw5IA(j, topLeft(roundRect), size(roundRect), CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)), drawStyle, f, colorFilter, i);
    }

    /* renamed from: drawOutline-wDX37Ww$default, reason: not valid java name */
    public static /* synthetic */ void m5034drawOutlinewDX37Ww$default(DrawScope drawScope, Outline outline, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i2 & 16) != 0) {
            colorFilter = null;
        }
        m5033drawOutlinewDX37Ww(drawScope, outline, j, f2, drawStyle2, colorFilter, (i2 & 32) != 0 ? DrawScope.Companion.m5337getDefaultBlendMode0nO6VwU() : i);
    }

    private static final void drawOutlineHelper(DrawScope drawScope, Outline outline, my myVar, my myVar2, my myVar3) {
        if (outline instanceof Outline.Rectangle) {
            myVar.invoke(drawScope, ((Outline.Rectangle) outline).getRect());
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (outline instanceof Outline.Generic) {
                myVar3.invoke(drawScope, ((Outline.Generic) outline).getPath());
                return;
            } else {
                o.n();
                return;
            }
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        Path roundRectPath$ui_graphics = rounded.getRoundRectPath$ui_graphics();
        if (roundRectPath$ui_graphics != null) {
            myVar3.invoke(drawScope, roundRectPath$ui_graphics);
        } else {
            myVar2.invoke(drawScope, rounded.getRoundRect());
        }
    }

    private static final boolean hasSameCornerRadius(RoundRect roundRect) {
        return ((Float.intBitsToFloat((int) (roundRect.m4564getBottomLeftCornerRadiuskKHJgLs() >> 32)) > Float.intBitsToFloat((int) (roundRect.m4565getBottomRightCornerRadiuskKHJgLs() >> 32)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m4564getBottomLeftCornerRadiuskKHJgLs() >> 32)) == Float.intBitsToFloat((int) (roundRect.m4565getBottomRightCornerRadiuskKHJgLs() >> 32)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (roundRect.m4565getBottomRightCornerRadiuskKHJgLs() >> 32)) > Float.intBitsToFloat((int) (roundRect.m4567getTopRightCornerRadiuskKHJgLs() >> 32)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m4565getBottomRightCornerRadiuskKHJgLs() >> 32)) == Float.intBitsToFloat((int) (roundRect.m4567getTopRightCornerRadiuskKHJgLs() >> 32)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (roundRect.m4567getTopRightCornerRadiuskKHJgLs() >> 32)) > Float.intBitsToFloat((int) (roundRect.m4566getTopLeftCornerRadiuskKHJgLs() >> 32)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m4567getTopRightCornerRadiuskKHJgLs() >> 32)) == Float.intBitsToFloat((int) (roundRect.m4566getTopLeftCornerRadiuskKHJgLs() >> 32)) ? 0 : -1)) == 0) && ((Float.intBitsToFloat((int) (roundRect.m4564getBottomLeftCornerRadiuskKHJgLs() & 4294967295L)) > Float.intBitsToFloat((int) (roundRect.m4565getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m4564getBottomLeftCornerRadiuskKHJgLs() & 4294967295L)) == Float.intBitsToFloat((int) (roundRect.m4565getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (roundRect.m4565getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) > Float.intBitsToFloat((int) (roundRect.m4567getTopRightCornerRadiuskKHJgLs() & 4294967295L)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m4565getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) == Float.intBitsToFloat((int) (roundRect.m4567getTopRightCornerRadiuskKHJgLs() & 4294967295L)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (roundRect.m4567getTopRightCornerRadiuskKHJgLs() & 4294967295L)) > Float.intBitsToFloat((int) (roundRect.m4566getTopLeftCornerRadiuskKHJgLs() & 4294967295L)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m4567getTopRightCornerRadiuskKHJgLs() & 4294967295L)) == Float.intBitsToFloat((int) (roundRect.m4566getTopLeftCornerRadiuskKHJgLs() & 4294967295L)) ? 0 : -1)) == 0);
    }

    private static final long size(Rect rect) {
        float right = rect.getRight() - rect.getLeft();
        float bottom = rect.getBottom() - rect.getTop();
        return Size.m4576constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    private static final long topLeft(Rect rect) {
        float left = rect.getLeft();
        float top = rect.getTop();
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(top) & 4294967295L));
    }

    private static final long topLeft(RoundRect roundRect) {
        float left = roundRect.getLeft();
        float top = roundRect.getTop();
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(top) & 4294967295L));
    }

    private static final long size(RoundRect roundRect) {
        float width = roundRect.getWidth();
        float height = roundRect.getHeight();
        return Size.m4576constructorimpl((Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & 4294967295L));
    }
}
