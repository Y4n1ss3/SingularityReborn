package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import defpackage.ky;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class RectListNode extends Modifier.Node implements GlobalPositionAwareModifierNode {
    public static final int $stable = 8;
    private Rect androidRect;
    private ky rect;

    public RectListNode(ky kyVar) {
        this.rect = kyVar;
    }

    private final Rect calcBounds(LayoutCoordinates layoutCoordinates, androidx.compose.ui.geometry.Rect rect) {
        LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates);
        long mo6243localPositionOfR5De75A = findRootCoordinates.mo6243localPositionOfR5De75A(layoutCoordinates, rect.m4551getTopLeftF1C5BW0());
        long mo6243localPositionOfR5De75A2 = findRootCoordinates.mo6243localPositionOfR5De75A(layoutCoordinates, rect.m4552getTopRightF1C5BW0());
        long mo6243localPositionOfR5De75A3 = findRootCoordinates.mo6243localPositionOfR5De75A(layoutCoordinates, rect.m4544getBottomLeftF1C5BW0());
        long mo6243localPositionOfR5De75A4 = findRootCoordinates.mo6243localPositionOfR5De75A(layoutCoordinates, rect.m4545getBottomRightF1C5BW0());
        int i = (int) (mo6243localPositionOfR5De75A >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (mo6243localPositionOfR5De75A2 >> 32);
        int i3 = (int) (mo6243localPositionOfR5De75A3 >> 32);
        int i4 = (int) (mo6243localPositionOfR5De75A4 >> 32);
        boolean z = true;
        float[] fArr = {Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)};
        int i5 = 0;
        while (i5 < 3) {
            intBitsToFloat = Math.min(intBitsToFloat, fArr[i5]);
            i5++;
            z = z;
        }
        boolean z2 = z;
        int i6 = (int) (mo6243localPositionOfR5De75A & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i6);
        int i7 = (int) (mo6243localPositionOfR5De75A2 & 4294967295L);
        float intBitsToFloat3 = Float.intBitsToFloat(i7);
        int i8 = (int) (mo6243localPositionOfR5De75A3 & 4294967295L);
        float intBitsToFloat4 = Float.intBitsToFloat(i8);
        int i9 = (int) (mo6243localPositionOfR5De75A4 & 4294967295L);
        float intBitsToFloat5 = Float.intBitsToFloat(i9);
        float[] fArr2 = new float[3];
        fArr2[0] = intBitsToFloat3;
        fArr2[z2 ? 1 : 0] = intBitsToFloat4;
        fArr2[2] = intBitsToFloat5;
        for (int i10 = 0; i10 < 3; i10++) {
            intBitsToFloat2 = Math.min(intBitsToFloat2, fArr2[i10]);
        }
        float intBitsToFloat6 = Float.intBitsToFloat(i);
        float intBitsToFloat7 = Float.intBitsToFloat(i2);
        float intBitsToFloat8 = Float.intBitsToFloat(i3);
        float intBitsToFloat9 = Float.intBitsToFloat(i4);
        float[] fArr3 = new float[3];
        fArr3[0] = intBitsToFloat7;
        fArr3[z2 ? 1 : 0] = intBitsToFloat8;
        fArr3[2] = intBitsToFloat9;
        for (int i11 = 0; i11 < 3; i11++) {
            intBitsToFloat6 = Math.max(intBitsToFloat6, fArr3[i11]);
        }
        float intBitsToFloat10 = Float.intBitsToFloat(i6);
        float intBitsToFloat11 = Float.intBitsToFloat(i7);
        float intBitsToFloat12 = Float.intBitsToFloat(i8);
        float intBitsToFloat13 = Float.intBitsToFloat(i9);
        float[] fArr4 = new float[3];
        fArr4[0] = intBitsToFloat11;
        fArr4[z2 ? 1 : 0] = intBitsToFloat12;
        fArr4[2] = intBitsToFloat13;
        for (int i12 = 0; i12 < 3; i12++) {
            intBitsToFloat10 = Math.max(intBitsToFloat10, fArr4[i12]);
        }
        return new Rect(y80.P(intBitsToFloat), y80.P(intBitsToFloat2), y80.P(intBitsToFloat6), y80.P(intBitsToFloat10));
    }

    private final void replaceRect(Rect rect) {
        MutableVector<Rect> currentRects = currentRects();
        Rect rect2 = this.androidRect;
        if (rect2 != null) {
            currentRects.remove(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            currentRects.add(rect);
        }
        updateRects(currentRects);
        this.androidRect = rect;
    }

    public abstract MutableVector<Rect> currentRects();

    public ky getRect() {
        return this.rect;
    }

    public final View getView() {
        return DelegatableNode_androidKt.requireView(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        replaceRect(null);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        Rect calcBounds;
        if (getRect() == null) {
            androidx.compose.ui.geometry.Rect boundsInRoot = LayoutCoordinatesKt.boundsInRoot(layoutCoordinates);
            calcBounds = new Rect(y80.P(boundsInRoot.getLeft()), y80.P(boundsInRoot.getTop()), y80.P(boundsInRoot.getRight()), y80.P(boundsInRoot.getBottom()));
        } else {
            ky rect = getRect();
            rect.getClass();
            calcBounds = calcBounds(layoutCoordinates, (androidx.compose.ui.geometry.Rect) rect.invoke(layoutCoordinates));
        }
        replaceRect(calcBounds);
    }

    public void setRect(ky kyVar) {
        this.rect = kyVar;
    }

    public abstract void updateRects(MutableVector<Rect> mutableVector);
}
