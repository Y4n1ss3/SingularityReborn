package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {
    private final int[] tmpLocation;
    private final float[] tmpMatrix;

    private CalculateMatrixToWindowApi21(float[] fArr) {
        this.tmpMatrix = fArr;
        this.tmpLocation = new int[2];
    }

    /* renamed from: preConcat-tU-YjHk, reason: not valid java name */
    private final void m6722preConcattUYjHk(float[] fArr, Matrix matrix) {
        AndroidMatrixConversions_androidKt.m4629setFromtUYjHk(this.tmpMatrix, matrix);
        AndroidComposeView_androidKt.m6707preTransformJiSxe2E(fArr, this.tmpMatrix);
    }

    /* renamed from: preTranslate-3XD1CNM, reason: not valid java name */
    private final void m6723preTranslate3XD1CNM(float[] fArr, float f, float f2) {
        AndroidComposeView_androidKt.m6708preTranslatecG2Xzmc(fArr, f, f2, this.tmpMatrix);
    }

    /* renamed from: transformMatrixToWindow-EL8BTi8, reason: not valid java name */
    private final void m6724transformMatrixToWindowEL8BTi8(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            m6724transformMatrixToWindowEL8BTi8((View) parent, fArr);
            m6723preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m6723preTranslate3XD1CNM(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.tmpLocation);
            m6723preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m6723preTranslate3XD1CNM(fArr, r0[0], r0[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        m6722preConcattUYjHk(fArr, matrix);
    }

    @Override // androidx.compose.ui.platform.CalculateMatrixToWindow
    /* renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo6721calculateMatrixToWindowEL8BTi8(View view, float[] fArr) {
        androidx.compose.ui.graphics.Matrix.m5014resetimpl(fArr);
        m6724transformMatrixToWindowEL8BTi8(view, fArr);
    }

    public /* synthetic */ CalculateMatrixToWindowApi21(float[] fArr, dq dqVar) {
        this(fArr);
    }
}
