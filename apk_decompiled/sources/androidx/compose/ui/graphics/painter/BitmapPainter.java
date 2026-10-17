package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.dq;
import defpackage.o;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BitmapPainter extends Painter {
    public static final int $stable = 8;
    private float alpha;
    private ColorFilter colorFilter;
    private int filterQuality;
    private final ImageBitmap image;
    private final long size;
    private final long srcOffset;
    private final long srcSize;

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j, long j2, int i, dq dqVar) {
        this(imageBitmap, (i & 2) != 0 ? IntOffset.Companion.m7750getZeronOccac() : j, (i & 4) != 0 ? IntSize.m7777constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j2, null);
    }

    /* renamed from: validateSize-N5eqBDc, reason: not valid java name */
    private final long m5453validateSizeN5eqBDc(long j, long j2) {
        int i;
        int i2;
        if (IntOffset.m7739getXimpl(j) >= 0 && IntOffset.m7740getYimpl(j) >= 0 && (i = (int) (j2 >> 32)) >= 0 && (i2 = (int) (4294967295L & j2)) >= 0 && i <= this.image.getWidth() && i2 <= this.image.getHeight()) {
            return j2;
        }
        o.m("Failed requirement.");
        return 0L;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return q10.b(this.image, bitmapPainter.image) && IntOffset.m7738equalsimpl0(this.srcOffset, bitmapPainter.srcOffset) && IntSize.m7780equalsimpl0(this.srcSize, bitmapPainter.srcSize) && FilterQuality.m4856equalsimpl0(this.filterQuality, bitmapPainter.filterQuality);
    }

    /* renamed from: getFilterQuality-f-v9h1I$ui_graphics, reason: not valid java name */
    public final int m5454getFilterQualityfv9h1I$ui_graphics() {
        return this.filterQuality;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo5455getIntrinsicSizeNHjbRc() {
        return IntSizeKt.m7794toSizeozmzZPI(this.size);
    }

    public int hashCode() {
        return FilterQuality.m4857hashCodeimpl(this.filterQuality) + ((IntSize.m7783hashCodeimpl(this.srcSize) + ((IntOffset.m7741hashCodeimpl(this.srcOffset) + (this.image.hashCode() * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        DrawScope.m5318drawImageAZ2fEMs$default(drawScope, this.image, this.srcOffset, this.srcSize, 0L, IntSize.m7777constructorimpl((Math.round(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32))) << 32)), this.alpha, null, this.colorFilter, 0, this.filterQuality, 328, null);
    }

    /* renamed from: setFilterQuality-vDHp3xo$ui_graphics, reason: not valid java name */
    public final void m5456setFilterQualityvDHp3xo$ui_graphics(int i) {
        this.filterQuality = i;
    }

    public String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + ((Object) IntOffset.m7746toStringimpl(this.srcOffset)) + ", srcSize=" + ((Object) IntSize.m7785toStringimpl(this.srcSize)) + ", filterQuality=" + ((Object) FilterQuality.m4858toStringimpl(this.filterQuality)) + ')';
    }

    private BitmapPainter(ImageBitmap imageBitmap, long j, long j2) {
        this.image = imageBitmap;
        this.srcOffset = j;
        this.srcSize = j2;
        this.filterQuality = FilterQuality.Companion.m4861getLowfv9h1I();
        this.size = m5453validateSizeN5eqBDc(j, j2);
        this.alpha = 1.0f;
    }

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j, long j2, dq dqVar) {
        this(imageBitmap, j, j2);
    }
}
