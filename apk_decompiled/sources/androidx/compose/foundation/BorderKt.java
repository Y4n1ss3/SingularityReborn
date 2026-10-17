package androidx.compose.foundation;

import androidx.compose.foundation.BorderKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import defpackage.ed;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BorderKt {
    public static final Modifier border(Modifier modifier, BorderStroke borderStroke, Shape shape) {
        return m240borderziNgDLE(modifier, borderStroke.m252getWidthD9Ej5fM(), borderStroke.getBrush(), shape);
    }

    public static /* synthetic */ Modifier border$default(Modifier modifier, BorderStroke borderStroke, Shape shape, int i, Object obj) {
        if ((i & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return border(modifier, borderStroke, shape);
    }

    /* renamed from: border-xT4_qwU, reason: not valid java name */
    public static final Modifier m238borderxT4_qwU(Modifier modifier, float f, long j, Shape shape) {
        return m240borderziNgDLE(modifier, f, new SolidColor(j, null), shape);
    }

    /* renamed from: border-xT4_qwU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m239borderxT4_qwU$default(Modifier modifier, float f, long j, Shape shape, int i, Object obj) {
        if ((i & 4) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m238borderxT4_qwU(modifier, f, j, shape);
    }

    /* renamed from: border-ziNgDLE, reason: not valid java name */
    public static final Modifier m240borderziNgDLE(Modifier modifier, float f, Brush brush, Shape shape) {
        return modifier.then(new BorderModifierNodeElement(f, brush, shape, null));
    }

    private static final RoundRect createInsetRoundedRect(float f, RoundRect roundRect) {
        return new RoundRect(f, f, roundRect.getWidth() - f, roundRect.getHeight() - f, m242shrinkKibmq7A(roundRect.m4566getTopLeftCornerRadiuskKHJgLs(), f), m242shrinkKibmq7A(roundRect.m4567getTopRightCornerRadiuskKHJgLs(), f), m242shrinkKibmq7A(roundRect.m4565getBottomRightCornerRadiuskKHJgLs(), f), m242shrinkKibmq7A(roundRect.m4564getBottomLeftCornerRadiuskKHJgLs(), f), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path createRoundRectPath(Path path, RoundRect roundRect, float f, boolean z) {
        path.reset();
        Path.addRoundRect$default(path, roundRect, null, 2, null);
        if (!z) {
            Path Path = AndroidPath_androidKt.Path();
            Path.addRoundRect$default(Path, createInsetRoundedRect(f, roundRect), null, 2, null);
            path.mo4650opN5in7k0(path, Path, PathOperation.Companion.m5067getDifferenceb3I0S0c());
        }
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawContentWithoutBorder(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(new ed(5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 drawContentWithoutBorder$lambda$0(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRectBorder-NsqcLGU, reason: not valid java name */
    public static final DrawResult m241drawRectBorderNsqcLGU(CacheDrawScope cacheDrawScope, final Brush brush, long j, long j2, boolean z, float f) {
        final long m4532getZeroF1C5BW0 = z ? Offset.Companion.m4532getZeroF1C5BW0() : j;
        final long m4293getSizeNHjbRc = z ? cacheDrawScope.m4293getSizeNHjbRc() : j2;
        final DrawStyle stroke = z ? Fill.INSTANCE : new Stroke(f, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.onDrawWithContent(new ky() { // from class: te
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 drawRectBorder_NsqcLGU$lambda$0;
                drawRectBorder_NsqcLGU$lambda$0 = BorderKt.drawRectBorder_NsqcLGU$lambda$0(Brush.this, m4532getZeroF1C5BW0, m4293getSizeNHjbRc, stroke, (ContentDrawScope) obj);
                return drawRectBorder_NsqcLGU$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 drawRectBorder_NsqcLGU$lambda$0(Brush brush, long j, long j2, DrawStyle drawStyle, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        DrawScope.m5328drawRectAsUm42w$default(contentDrawScope, brush, j, j2, 0.0f, drawStyle, null, 0, 104, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shrink-Kibmq7A, reason: not valid java name */
    public static final long m242shrinkKibmq7A(long j, float f) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L));
    }
}
