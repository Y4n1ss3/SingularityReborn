package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.MatrixKt;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayerMatrixCache<T> {
    public static final int $stable = 8;
    private Matrix androidMatrixCache;
    private final my getMatrix;
    private boolean isDirty;
    private boolean isInverseDirty;
    private float[] matrixCache = androidx.compose.ui.graphics.Matrix.m5005constructorimpl$default(null, 1, null);
    private float[] inverseMatrixCache = androidx.compose.ui.graphics.Matrix.m5005constructorimpl$default(null, 1, null);
    private boolean isInverseValid = true;
    private boolean isIdentity = true;

    public LayerMatrixCache(my myVar) {
        this.getMatrix = myVar;
    }

    /* renamed from: calculateInverseMatrix-bWbORWo, reason: not valid java name */
    public final float[] m6764calculateInverseMatrixbWbORWo(T t) {
        float[] fArr = this.inverseMatrixCache;
        if (this.isInverseDirty) {
            this.isInverseValid = InvertMatrixKt.m6762invertToJiSxe2E(m6765calculateMatrixGrdbGEg(t), fArr);
            this.isInverseDirty = false;
        }
        if (this.isInverseValid) {
            return fArr;
        }
        return null;
    }

    /* renamed from: calculateMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m6765calculateMatrixGrdbGEg(T t) {
        float[] fArr = this.matrixCache;
        if (!this.isDirty) {
            return fArr;
        }
        Matrix matrix = this.androidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.androidMatrixCache = matrix;
        }
        this.getMatrix.invoke(t, matrix);
        AndroidMatrixConversions_androidKt.m4629setFromtUYjHk(fArr, matrix);
        this.isDirty = false;
        this.isIdentity = MatrixKt.m5030isIdentity58bKbWc(fArr);
        return fArr;
    }

    public final void invalidate() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }

    public final void map(T t, MutableRect mutableRect) {
        float[] m6765calculateMatrixGrdbGEg = m6765calculateMatrixGrdbGEg(t);
        if (this.isIdentity) {
            return;
        }
        androidx.compose.ui.graphics.Matrix.m5013mapimpl(m6765calculateMatrixGrdbGEg, mutableRect);
    }

    /* renamed from: map-R5De75A, reason: not valid java name */
    public final long m6766mapR5De75A(T t, long j) {
        return !this.isIdentity ? androidx.compose.ui.graphics.Matrix.m5011mapMKHz9U(m6765calculateMatrixGrdbGEg(t), j) : j;
    }

    public final void mapInverse(T t, MutableRect mutableRect) {
        float[] m6764calculateInverseMatrixbWbORWo = m6764calculateInverseMatrixbWbORWo(t);
        if (m6764calculateInverseMatrixbWbORWo == null) {
            mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            if (this.isIdentity) {
                return;
            }
            androidx.compose.ui.graphics.Matrix.m5013mapimpl(m6764calculateInverseMatrixbWbORWo, mutableRect);
        }
    }

    /* renamed from: mapInverse-R5De75A, reason: not valid java name */
    public final long m6767mapInverseR5De75A(T t, long j) {
        float[] m6764calculateInverseMatrixbWbORWo = m6764calculateInverseMatrixbWbORWo(t);
        return m6764calculateInverseMatrixbWbORWo == null ? Offset.Companion.m4530getInfiniteF1C5BW0() : !this.isIdentity ? androidx.compose.ui.graphics.Matrix.m5011mapMKHz9U(m6764calculateInverseMatrixbWbORWo, j) : j;
    }

    public final void reset() {
        this.isDirty = false;
        this.isInverseDirty = false;
        this.isIdentity = true;
        this.isInverseValid = true;
        androidx.compose.ui.graphics.Matrix.m5014resetimpl(this.matrixCache);
        androidx.compose.ui.graphics.Matrix.m5014resetimpl(this.inverseMatrixCache);
    }
}
