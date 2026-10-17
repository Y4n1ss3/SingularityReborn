package androidx.compose.ui.text.android;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import defpackage.er;
import defpackage.ky;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextAndroidCanvas extends Canvas {
    public static final int $stable = 8;
    private Canvas _nativeCanvas;

    private final Canvas getNativeCanvas() {
        Canvas canvas = this._nativeCanvas;
        if (canvas != null) {
            return canvas;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Text drawing wrapper is missing a Canvas!");
        o.j();
        return null;
    }

    @Override // android.graphics.Canvas
    public boolean clipOutPath(Path path) {
        return CanvasCompatO.INSTANCE.clipOutPath(getNativeCanvas(), path);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(float f, float f2, float f3, float f4) {
        return CanvasCompatO.INSTANCE.clipOutRect(getNativeCanvas(), f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    @er
    public boolean clipPath(Path path, Region.Op op) {
        return getNativeCanvas().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    @er
    public boolean clipRect(RectF rectF, Region.Op op) {
        return getNativeCanvas().clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public void concat(Matrix matrix) {
        getNativeCanvas().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public void disableZ() {
        CanvasCompatQ.INSTANCE.disableZ(getNativeCanvas());
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int i, int i2, int i3, int i4) {
        getNativeCanvas().drawARGB(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        getNativeCanvas().drawArc(rectF, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        getNativeCanvas().drawBitmap(bitmap, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
        getNativeCanvas().drawBitmapMesh(bitmap, i, i2, fArr, i3, iArr, i4, paint);
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float f, float f2, float f3, Paint paint) {
        getNativeCanvas().drawCircle(f, f2, f3, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long j) {
        CanvasCompatQ.INSTANCE.drawColor(getNativeCanvas(), j);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        CanvasCompatQ.INSTANCE.drawDoubleRoundRect(getNativeCanvas(), rectF, f, f2, rectF2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        CanvasCompatS.INSTANCE.drawGlyphs(getNativeCanvas(), iArr, i, fArr, i2, i3, font, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        getNativeCanvas().drawLine(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, int i, int i2, Paint paint) {
        getNativeCanvas().drawLines(fArr, i, i2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(RectF rectF, Paint paint) {
        getNativeCanvas().drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(Paint paint) {
        getNativeCanvas().drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        CanvasCompatS.INSTANCE.drawPatch(getNativeCanvas(), ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        getNativeCanvas().drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture) {
        getNativeCanvas().drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float f, float f2, Paint paint) {
        getNativeCanvas().drawPoint(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        getNativeCanvas().drawPoints(fArr, i, i2, paint);
    }

    @Override // android.graphics.Canvas
    @er
    public void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
        getNativeCanvas().drawPosText(cArr, i, i2, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int i, int i2, int i3) {
        getNativeCanvas().drawRGB(i, i2, i3);
    }

    @Override // android.graphics.Canvas
    public void drawRect(RectF rectF, Paint paint) {
        getNativeCanvas().drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRenderNode(RenderNode renderNode) {
        CanvasCompatQ.INSTANCE.drawRenderNode(getNativeCanvas(), renderNode);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        getNativeCanvas().drawRoundRect(rectF, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        getNativeCanvas().drawText(cArr, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        getNativeCanvas().drawTextOnPath(cArr, i, i2, path, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        CanvasCompatM.INSTANCE.drawTextRun(getNativeCanvas(), cArr, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        getNativeCanvas().drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint);
    }

    @Override // android.graphics.Canvas
    public void enableZ() {
        CanvasCompatQ.INSTANCE.enableZ(getNativeCanvas());
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(Rect rect) {
        boolean clipBounds = getNativeCanvas().getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        return getNativeCanvas().getDensity();
    }

    @Override // android.graphics.Canvas
    public DrawFilter getDrawFilter() {
        return getNativeCanvas().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        return getNativeCanvas().getHeight();
    }

    @Override // android.graphics.Canvas
    @er
    public void getMatrix(Matrix matrix) {
        getNativeCanvas().getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        return getNativeCanvas().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        return getNativeCanvas().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        return getNativeCanvas().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        return getNativeCanvas().getWidth();
    }

    public final Canvas get_nativeCanvas$ui_text() {
        return this._nativeCanvas;
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        return getNativeCanvas().isOpaque();
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float f, float f2, float f3, float f4) {
        return CanvasCompatR.INSTANCE.quickReject(getNativeCanvas(), f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        getNativeCanvas().restore();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int i) {
        getNativeCanvas().restoreToCount(i);
    }

    @Override // android.graphics.Canvas
    public void rotate(float f) {
        getNativeCanvas().rotate(f);
    }

    @Override // android.graphics.Canvas
    public int save() {
        return getNativeCanvas().save();
    }

    @Override // android.graphics.Canvas
    @er
    public int saveLayer(RectF rectF, Paint paint, int i) {
        return getNativeCanvas().saveLayer(rectF, paint, i);
    }

    @Override // android.graphics.Canvas
    @er
    public int saveLayerAlpha(RectF rectF, int i, int i2) {
        return getNativeCanvas().saveLayerAlpha(rectF, i, i2);
    }

    @Override // android.graphics.Canvas
    public void scale(float f, float f2) {
        getNativeCanvas().scale(f, f2);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(Bitmap bitmap) {
        getNativeCanvas().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public void setDensity(int i) {
        getNativeCanvas().setDensity(i);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(DrawFilter drawFilter) {
        getNativeCanvas().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(Matrix matrix) {
        getNativeCanvas().setMatrix(matrix);
    }

    public final void set_nativeCanvas$ui_text(Canvas canvas) {
        this._nativeCanvas = canvas;
    }

    @Override // android.graphics.Canvas
    public void skew(float f, float f2) {
        getNativeCanvas().skew(f, f2);
    }

    @Override // android.graphics.Canvas
    public void translate(float f, float f2) {
        getNativeCanvas().translate(f, f2);
    }

    public final void withCanvas(Canvas canvas, ky kyVar) {
        set_nativeCanvas$ui_text(canvas);
        try {
            kyVar.invoke(this);
        } finally {
            set_nativeCanvas$ui_text(null);
        }
    }

    @Override // android.graphics.Canvas
    public void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        getNativeCanvas().drawArc(f, f2, f3, f4, f5, f6, z, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        getNativeCanvas().drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, Paint paint) {
        getNativeCanvas().drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        getNativeCanvas().drawOval(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, RectF rectF) {
        getNativeCanvas().drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, Paint paint) {
        getNativeCanvas().drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    @er
    public void drawPosText(String str, float[] fArr, Paint paint) {
        getNativeCanvas().drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(Rect rect, Paint paint) {
        getNativeCanvas().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        getNativeCanvas().drawRoundRect(f, f2, f3, f4, f5, f6, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(String str, float f, float f2, Paint paint) {
        getNativeCanvas().drawText(str, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        getNativeCanvas().drawTextOnPath(str, path, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path) {
        return getNativeCanvas().clipPath(path);
    }

    @Override // android.graphics.Canvas
    @er
    public boolean clipRect(Rect rect, Region.Op op) {
        return getNativeCanvas().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        getNativeCanvas().drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, Rect rect) {
        getNativeCanvas().drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        getNativeCanvas().drawRect(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        getNativeCanvas().drawText(str, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF rectF, Paint paint) {
        return getNativeCanvas().saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF rectF, int i) {
        return getNativeCanvas().saveLayerAlpha(rectF, i);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rectF) {
        return getNativeCanvas().clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    @er
    public void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        getNativeCanvas().drawBitmap(iArr, i, i2, f, f2, i3, i4, z, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i) {
        getNativeCanvas().drawColor(i);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        CanvasCompatS.INSTANCE.drawPatch(getNativeCanvas(), ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        getNativeCanvas().drawText(charSequence, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    @er
    public int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
        return getNativeCanvas().saveLayer(f, f2, f3, f4, paint, i);
    }

    @Override // android.graphics.Canvas
    @er
    public int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        return getNativeCanvas().saveLayerAlpha(f, f2, f3, f4, i, i2);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect) {
        return getNativeCanvas().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    @er
    public void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        getNativeCanvas().drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i, PorterDuff.Mode mode) {
        getNativeCanvas().drawColor(i, mode);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
        return getNativeCanvas().saveLayer(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        return getNativeCanvas().saveLayerAlpha(f, f2, f3, f4, i);
    }

    @Override // android.graphics.Canvas
    @er
    public boolean clipRect(float f, float f2, float f3, float f4, Region.Op op) {
        return getNativeCanvas().clipRect(f, f2, f3, f4, op);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        getNativeCanvas().drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i, BlendMode blendMode) {
        CanvasCompatQ.INSTANCE.drawColor(getNativeCanvas(), i, blendMode);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f, float f2, float f3, float f4) {
        return getNativeCanvas().clipRect(f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long j, BlendMode blendMode) {
        CanvasCompatQ.INSTANCE.drawColor(getNativeCanvas(), j, blendMode);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int i, int i2, int i3, int i4) {
        return getNativeCanvas().clipRect(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(Rect rect) {
        return CanvasCompatO.INSTANCE.clipOutRect(getNativeCanvas(), rect);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(RectF rectF) {
        return CanvasCompatR.INSTANCE.quickReject(getNativeCanvas(), rectF);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(RectF rectF) {
        return CanvasCompatO.INSTANCE.clipOutRect(getNativeCanvas(), rectF);
    }

    @Override // android.graphics.Canvas
    @er
    public boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return getNativeCanvas().quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(int i, int i2, int i3, int i4) {
        return CanvasCompatO.INSTANCE.clipOutRect(getNativeCanvas(), i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(Path path) {
        return CanvasCompatR.INSTANCE.quickReject(getNativeCanvas(), path);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        CanvasCompatQ.INSTANCE.drawDoubleRoundRect(getNativeCanvas(), rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    @er
    public boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType edgeType) {
        return getNativeCanvas().quickReject(f, f2, f3, f4, edgeType);
    }

    @Override // android.graphics.Canvas
    @er
    public boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return getNativeCanvas().quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        CanvasCompatM.INSTANCE.drawTextRun(getNativeCanvas(), charSequence, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        CanvasCompatQ.INSTANCE.drawTextRun(getNativeCanvas(), measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    public static /* synthetic */ void get_nativeCanvas$ui_text$annotations() {
    }
}
