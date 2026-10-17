package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class BorderCache {
    private Path borderPath;
    private Canvas canvas;
    private CanvasDrawScope canvasDrawScope;
    private ImageBitmap imageBitmap;

    public /* synthetic */ BorderCache(ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path, int i, dq dqVar) {
        this((i & 1) != 0 ? null : imageBitmap, (i & 2) != 0 ? null : canvas, (i & 4) != 0 ? null : canvasDrawScope, (i & 8) != 0 ? null : path);
    }

    private final ImageBitmap component1() {
        return this.imageBitmap;
    }

    private final Canvas component2() {
        return this.canvas;
    }

    private final CanvasDrawScope component3() {
        return this.canvasDrawScope;
    }

    private final Path component4() {
        return this.borderPath;
    }

    public static /* synthetic */ BorderCache copy$default(BorderCache borderCache, ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path, int i, Object obj) {
        if ((i & 1) != 0) {
            imageBitmap = borderCache.imageBitmap;
        }
        if ((i & 2) != 0) {
            canvas = borderCache.canvas;
        }
        if ((i & 4) != 0) {
            canvasDrawScope = borderCache.canvasDrawScope;
        }
        if ((i & 8) != 0) {
            path = borderCache.borderPath;
        }
        return borderCache.copy(imageBitmap, canvas, canvasDrawScope, path);
    }

    public final BorderCache copy(ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path) {
        return new BorderCache(imageBitmap, canvas, canvasDrawScope, path);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (androidx.compose.ui.graphics.ImageBitmapConfig.m4986equalsimpl(r9, r1 != null ? androidx.compose.ui.graphics.ImageBitmapConfig.m4984boximpl(r1.mo4625getConfig_sVssgQ()) : null) != false) goto L17;
     */
    /* renamed from: drawBorderCache-EMwLDEs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ImageBitmap m235drawBorderCacheEMwLDEs(CacheDrawScope cacheDrawScope, long j, int i, ky kyVar) {
        int i2;
        ImageBitmap imageBitmap = this.imageBitmap;
        Canvas canvas = this.canvas;
        ImageBitmapConfig m4984boximpl = imageBitmap != null ? ImageBitmapConfig.m4984boximpl(imageBitmap.mo4625getConfig_sVssgQ()) : null;
        boolean z = false;
        if (m4984boximpl == null ? false : ImageBitmapConfig.m4987equalsimpl0(m4984boximpl.m4990unboximpl(), ImageBitmapConfig.Companion.m4992getArgb8888_sVssgQ())) {
            i2 = i;
        } else {
            i2 = i;
        }
        z = true;
        if (imageBitmap == null || canvas == null || Float.intBitsToFloat((int) (cacheDrawScope.m4293getSizeNHjbRc() >> 32)) > imageBitmap.getWidth() || Float.intBitsToFloat((int) (cacheDrawScope.m4293getSizeNHjbRc() & 4294967295L)) > imageBitmap.getHeight() || !z) {
            imageBitmap = ImageBitmapKt.m4997ImageBitmapx__hDU$default((int) (j >> 32), (int) (j & 4294967295L), i2, false, null, 24, null);
            this.imageBitmap = imageBitmap;
            canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(imageBitmap);
            this.canvas = canvas;
        }
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            this.canvasDrawScope = canvasDrawScope;
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        long m7794toSizeozmzZPI = IntSizeKt.m7794toSizeozmzZPI(j);
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m5252component4NHjbRc = drawParams.m5252component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m5255setSizeuvyYCjk(m7794toSizeozmzZPI);
        canvas.save();
        ImageBitmap imageBitmap2 = imageBitmap;
        DrawScope.m5329drawRectnJ9OG0$default(canvasDrawScope2, Color.Companion.m4787getBlack0d7_KjU(), 0L, m7794toSizeozmzZPI, 0.0f, null, null, BlendMode.Companion.m4674getClear0nO6VwU(), 58, null);
        kyVar.invoke(canvasDrawScope2);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m5255setSizeuvyYCjk(m5252component4NHjbRc);
        imageBitmap2.prepareToDraw();
        return imageBitmap2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderCache)) {
            return false;
        }
        BorderCache borderCache = (BorderCache) obj;
        return q10.b(this.imageBitmap, borderCache.imageBitmap) && q10.b(this.canvas, borderCache.canvas) && q10.b(this.canvasDrawScope, borderCache.canvasDrawScope) && q10.b(this.borderPath, borderCache.borderPath);
    }

    public int hashCode() {
        ImageBitmap imageBitmap = this.imageBitmap;
        int hashCode = (imageBitmap == null ? 0 : imageBitmap.hashCode()) * 31;
        Canvas canvas = this.canvas;
        int hashCode2 = (hashCode + (canvas == null ? 0 : canvas.hashCode())) * 31;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        int hashCode3 = (hashCode2 + (canvasDrawScope == null ? 0 : canvasDrawScope.hashCode())) * 31;
        Path path = this.borderPath;
        return hashCode3 + (path != null ? path.hashCode() : 0);
    }

    public final Path obtainPath() {
        Path path = this.borderPath;
        if (path != null) {
            return path;
        }
        Path Path = AndroidPath_androidKt.Path();
        this.borderPath = Path;
        return Path;
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.imageBitmap + ", canvas=" + this.canvas + ", canvasDrawScope=" + this.canvasDrawScope + ", borderPath=" + this.borderPath + ')';
    }

    public BorderCache(ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path) {
        this.imageBitmap = imageBitmap;
        this.canvas = canvas;
        this.canvasDrawScope = canvasDrawScope;
        this.borderPath = path;
    }

    public BorderCache() {
        this(null, null, null, null, 15, null);
    }
}
