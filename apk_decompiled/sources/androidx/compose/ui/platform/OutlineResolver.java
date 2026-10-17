package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import defpackage.lu0;
import defpackage.o;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OutlineResolver {
    public static final int $stable = 8;
    private boolean cacheIsDirty;
    private final Outline cachedOutline;
    private Path cachedRrectPath;
    private boolean isSupportedOutline = true;
    private androidx.compose.ui.graphics.Outline outline;
    private boolean outlineNeeded;
    private Path outlinePath;
    private long rectSize;
    private long rectTopLeft;
    private float roundedCornerRadius;
    private Path tmpOpPath;
    private Path tmpPath;
    private RoundRect tmpRoundRect;
    private Path tmpTouchPointPath;
    private boolean usePathForClip;

    public OutlineResolver() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        this.rectTopLeft = Offset.Companion.m4532getZeroF1C5BW0();
        this.rectSize = Size.Companion.m4594getZeroNHjbRc();
    }

    /* renamed from: isSameBounds-4L21HEs, reason: not valid java name */
    private final boolean m6794isSameBounds4L21HEs(RoundRect roundRect, long j, long j2, float f) {
        if (roundRect == null || !RoundRectKt.isSimple(roundRect)) {
            return false;
        }
        int i = (int) (j >> 32);
        if (roundRect.getLeft() != Float.intBitsToFloat(i)) {
            return false;
        }
        int i2 = (int) (j & 4294967295L);
        if (roundRect.getTop() != Float.intBitsToFloat(i2)) {
            return false;
        }
        if (roundRect.getRight() == Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i)) {
            return roundRect.getBottom() == Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2) && Float.intBitsToFloat((int) (roundRect.m4566getTopLeftCornerRadiuskKHJgLs() >> 32)) == f;
        }
        return false;
    }

    private final void updateCache() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = Offset.Companion.m4532getZeroF1C5BW0();
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            androidx.compose.ui.graphics.Outline outline = this.outline;
            if (outline == null || !this.outlineNeeded || Float.intBitsToFloat((int) (this.rectSize >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.rectSize & 4294967295L)) <= 0.0f) {
                this.cachedOutline.setEmpty();
                return;
            }
            this.isSupportedOutline = true;
            if (outline instanceof Outline.Rectangle) {
                updateCacheWithRect(((Outline.Rectangle) outline).getRect());
                return;
            }
            if (outline instanceof Outline.Rounded) {
                updateCacheWithRoundRect(((Outline.Rounded) outline).getRoundRect());
            } else if (outline instanceof Outline.Generic) {
                updateCacheWithPath(((Outline.Generic) outline).getPath());
            } else {
                o.n();
            }
        }
    }

    private final void updateCacheWithPath(Path path) {
        if (Build.VERSION.SDK_INT >= 30) {
            OutlineVerificationHelper.INSTANCE.setPath(this.cachedOutline, path);
        } else {
            android.graphics.Outline outline = this.cachedOutline;
            if (!(path instanceof AndroidPath)) {
                lu0.a("Unable to obtain android.graphics.Path");
                return;
            }
            outline.setConvexPath(((AndroidPath) path).getInternalPath());
        }
        this.usePathForClip = !this.cachedOutline.canClip();
        this.outlinePath = path;
    }

    private final void updateCacheWithRect(Rect rect) {
        float left = rect.getLeft();
        float top = rect.getTop();
        this.rectTopLeft = Offset.m4508constructorimpl((Float.floatToRawIntBits(top) & 4294967295L) | (Float.floatToRawIntBits(left) << 32));
        float right = rect.getRight() - rect.getLeft();
        float bottom = rect.getBottom() - rect.getTop();
        this.rectSize = Size.m4576constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
        this.cachedOutline.setRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getRight()), Math.round(rect.getBottom()));
    }

    private final void updateCacheWithRoundRect(RoundRect roundRect) {
        float intBitsToFloat = Float.intBitsToFloat((int) (roundRect.m4566getTopLeftCornerRadiuskKHJgLs() >> 32));
        float left = roundRect.getLeft();
        float top = roundRect.getTop();
        this.rectTopLeft = Offset.m4508constructorimpl((Float.floatToRawIntBits(top) & 4294967295L) | (Float.floatToRawIntBits(left) << 32));
        float width = roundRect.getWidth();
        float height = roundRect.getHeight();
        this.rectSize = Size.m4576constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        if (RoundRectKt.isSimple(roundRect)) {
            this.cachedOutline.setRoundRect(Math.round(roundRect.getLeft()), Math.round(roundRect.getTop()), Math.round(roundRect.getRight()), Math.round(roundRect.getBottom()), intBitsToFloat);
            this.roundedCornerRadius = intBitsToFloat;
            return;
        }
        Path path = this.cachedRrectPath;
        if (path == null) {
            path = AndroidPath_androidKt.Path();
            this.cachedRrectPath = path;
        }
        path.reset();
        Path.addRoundRect$default(path, roundRect, null, 2, null);
        updateCacheWithPath(path);
    }

    public final void clipToOutline(Canvas canvas) {
        Path clipPath = getClipPath();
        if (clipPath != null) {
            Canvas.m4732clipPathmtrdDE$default(canvas, clipPath, 0, 2, null);
            return;
        }
        float f = this.roundedCornerRadius;
        if (f <= 0.0f) {
            Canvas.m4733clipRectN_I0leg$default(canvas, Float.intBitsToFloat((int) (this.rectTopLeft >> 32)), Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L)), Float.intBitsToFloat((int) (this.rectTopLeft >> 32)) + Float.intBitsToFloat((int) (this.rectSize >> 32)), Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L)) + Float.intBitsToFloat((int) (this.rectSize & 4294967295L)), 0, 16, null);
            return;
        }
        Path path = this.tmpPath;
        RoundRect roundRect = this.tmpRoundRect;
        if (path == null || !m6794isSameBounds4L21HEs(roundRect, this.rectTopLeft, this.rectSize, f)) {
            float intBitsToFloat = Float.intBitsToFloat((int) (this.rectTopLeft >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L));
            float intBitsToFloat3 = Float.intBitsToFloat((int) (this.rectSize >> 32)) + Float.intBitsToFloat((int) (this.rectTopLeft >> 32));
            float intBitsToFloat4 = Float.intBitsToFloat((int) (this.rectSize & 4294967295L)) + Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L));
            float f2 = this.roundedCornerRadius;
            RoundRect m4570RoundRectgG7oq9Y = RoundRectKt.m4570RoundRectgG7oq9Y(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)));
            if (path == null) {
                path = AndroidPath_androidKt.Path();
            } else {
                path.reset();
            }
            Path.addRoundRect$default(path, m4570RoundRectgG7oq9Y, null, 2, null);
            this.tmpRoundRect = m4570RoundRectgG7oq9Y;
            this.tmpPath = path;
        }
        Canvas.m4732clipPathmtrdDE$default(canvas, path, 0, 2, null);
    }

    public final android.graphics.Outline getAndroidOutline() {
        updateCache();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    public final boolean getCacheIsDirty$ui() {
        return this.cacheIsDirty;
    }

    public final Path getClipPath() {
        updateCache();
        return this.outlinePath;
    }

    public final boolean getOutlineClipSupported() {
        return !this.usePathForClip;
    }

    /* renamed from: isInOutline-k-4lQ0M, reason: not valid java name */
    public final boolean m6795isInOutlinek4lQ0M(long j) {
        androidx.compose.ui.graphics.Outline outline;
        if (this.outlineNeeded && (outline = this.outline) != null) {
            return ShapeContainingUtilKt.isInOutline(outline, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    /* renamed from: update-S_szKao, reason: not valid java name */
    public final boolean m6796updateS_szKao(androidx.compose.ui.graphics.Outline outline, float f, boolean z, float f2, long j) {
        this.cachedOutline.setAlpha(f);
        boolean b = q10.b(this.outline, outline);
        boolean z2 = !b;
        if (!b) {
            this.outline = outline;
            this.cacheIsDirty = true;
        }
        this.rectSize = j;
        boolean z3 = outline != null && (z || f2 > 0.0f);
        if (this.outlineNeeded != z3) {
            this.outlineNeeded = z3;
            this.cacheIsDirty = true;
        }
        return z2;
    }
}
