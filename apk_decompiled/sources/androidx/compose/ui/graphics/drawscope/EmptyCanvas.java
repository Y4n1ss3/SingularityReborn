package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Vertices;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EmptyCanvas implements Canvas {
    public static final int $stable = 0;
    public static final EmptyCanvas INSTANCE = new EmptyCanvas();

    private EmptyCanvas() {
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipPath-mtrdD-E */
    public void mo4610clipPathmtrdDE(Path path, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipRect-N_I0leg */
    public void mo4611clipRectN_I0leg(float f, float f2, float f3, float f4, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: concat-58bKbWc */
    public void mo4612concat58bKbWc(float[] fArr) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawCircle-9KIMszo */
    public void mo4613drawCircle9KIMszo(long j, float f, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImage-d-4ec7I */
    public void mo4614drawImaged4ec7I(ImageBitmap imageBitmap, long j, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImageRect-HPBpro0 */
    public void mo4615drawImageRectHPBpro0(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawLine-Wko1d7g */
    public void mo4616drawLineWko1d7g(long j, long j2, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawPoints-O7TthRY */
    public void mo4617drawPointsO7TthRY(int i, List<Offset> list, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawRawPoints-O7TthRY */
    public void mo4618drawRawPointsO7TthRY(int i, float[] fArr, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawVertices-TPEHhCM */
    public void mo4619drawVerticesTPEHhCM(Vertices vertices, int i, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void restore() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rotate(float f) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void saveLayer(Rect rect, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void scale(float f, float f2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skew(float f, float f2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void translate(float f, float f2) {
        throw new UnsupportedOperationException();
    }
}
