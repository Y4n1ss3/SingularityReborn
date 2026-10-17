package androidx.compose.ui.spatial;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import defpackage.dq;
import defpackage.m50;
import defpackage.q10;
import defpackage.ut;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class RelativeLayoutBounds {
    public static final int $stable = 8;
    private final long bottomRight;
    private final DelegatableNode node;
    private final long screenOffset;
    private final long topLeft;
    private final float[] viewToWindowMatrix;
    private final long windowOffset;
    private final long windowSize;

    private RelativeLayoutBounds(long j, long j2, long j3, long j4, long j5, float[] fArr, DelegatableNode delegatableNode) {
        this.topLeft = j;
        this.bottomRight = j2;
        this.windowOffset = j3;
        this.screenOffset = j4;
        this.windowSize = j5;
        this.viewToWindowMatrix = fArr;
        this.node = delegatableNode;
    }

    public final List<IntRect> calculateOcclusions() {
        int i;
        int i2;
        RectManager rectManager = DelegatableNodeKt.requireOwner(this.node).getRectManager();
        int semanticsId = DelegatableNodeKt.requireLayoutNode(this.node).getSemanticsId();
        RectList rects = rectManager.getRects();
        int indexOf = rects.indexOf(semanticsId);
        if (indexOf < 0) {
            return ut.d;
        }
        m50 o = y80.o();
        long[] jArr = rects.items;
        int i3 = rects.itemsSize;
        long j = jArr[indexOf];
        long j2 = jArr[indexOf + 1];
        int i4 = 0;
        while (i4 < jArr.length - 2 && i4 < i3) {
            if (i4 == indexOf) {
                i4 += 3;
            } else {
                long j3 = jArr[i4];
                long j4 = jArr[i4 + 1];
                if (((((j2 - j3) - InlineClassHelperKt.Uint64Low32) | ((j4 - j) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    i = i3;
                    i2 = indexOf;
                    int i5 = (int) (j3 >> 32);
                    int i6 = (int) j3;
                    int i7 = (int) (j4 >> 32);
                    int i8 = (int) j4;
                    if (rectManager.isTargetDrawnFirst$ui(semanticsId, ((int) jArr[i4 + 2]) & 33554431)) {
                        o.add(new IntRect(i5, i6, i7, i8));
                    }
                } else {
                    i = i3;
                    i2 = indexOf;
                }
                i4 += 3;
                indexOf = i2;
                i3 = i;
            }
        }
        return y80.d(o);
    }

    public boolean equals(Object obj) {
        boolean m5007equalsimpl0;
        if (this == obj) {
            return true;
        }
        if (obj == null || RelativeLayoutBounds.class != obj.getClass()) {
            return false;
        }
        RelativeLayoutBounds relativeLayoutBounds = (RelativeLayoutBounds) obj;
        if (this.topLeft != relativeLayoutBounds.topLeft || this.bottomRight != relativeLayoutBounds.bottomRight || this.windowSize != relativeLayoutBounds.windowSize || !IntOffset.m7738equalsimpl0(this.windowOffset, relativeLayoutBounds.windowOffset) || !IntOffset.m7738equalsimpl0(this.screenOffset, relativeLayoutBounds.screenOffset)) {
            return false;
        }
        float[] fArr = this.viewToWindowMatrix;
        float[] fArr2 = relativeLayoutBounds.viewToWindowMatrix;
        if (fArr == null) {
            if (fArr2 == null) {
                m5007equalsimpl0 = true;
            }
            m5007equalsimpl0 = false;
        } else {
            if (fArr2 != null) {
                m5007equalsimpl0 = Matrix.m5007equalsimpl0(fArr, fArr2);
            }
            m5007equalsimpl0 = false;
        }
        return m5007equalsimpl0 && q10.b(this.node, relativeLayoutBounds.node);
    }

    public final float fractionVisibleIn(RelativeLayoutBounds relativeLayoutBounds) {
        long j = relativeLayoutBounds.topLeft;
        long j2 = relativeLayoutBounds.bottomRight;
        return fractionVisibleInRect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
    }

    public final float fractionVisibleInRect(int i, int i2, int i3, int i4) {
        int min = Math.min(Math.max((int) (this.topLeft >> 32), i), i3);
        int min2 = Math.min(Math.max((int) this.topLeft, i2), i4);
        int max = Math.max(Math.min((int) (this.bottomRight >> 32), i3), i);
        int max2 = Math.max(Math.min((int) this.bottomRight, i4), i2);
        return Math.max((max2 - min2) * (max - min), 0) / Math.min((i4 - i2) * (i3 - i), (r8 - r3) * (r2 - r0));
    }

    public final float fractionVisibleInWindow() {
        long j = this.windowSize;
        return fractionVisibleInRect(0, 0, (int) (j >> 32), (int) j);
    }

    /* renamed from: fractionVisibleInWindowWithInsets-E1MhUcY, reason: not valid java name */
    public final float m6859fractionVisibleInWindowWithInsetsE1MhUcY(long j, long j2) {
        long j3 = this.windowSize;
        int m7739getXimpl = IntOffset.m7739getXimpl(this.windowOffset);
        int m7740getYimpl = IntOffset.m7740getYimpl(this.windowOffset);
        return fractionVisibleInRect(IntOffset.m7739getXimpl(j) + m7739getXimpl, IntOffset.m7740getYimpl(j) + m7740getYimpl, (m7739getXimpl + ((int) (j3 >> 32))) - IntOffset.m7739getXimpl(j2), (m7740getYimpl + ((int) j3)) - IntOffset.m7740getYimpl(j2));
    }

    public final IntRect getBoundsInRoot() {
        long j = this.topLeft;
        long j2 = this.bottomRight;
        return new IntRect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
    }

    public final IntRect getBoundsInScreen() {
        if (this.viewToWindowMatrix == null) {
            long j = this.topLeft;
            int i = (int) (j >> 32);
            long j2 = this.bottomRight;
            int i2 = (int) (j2 >> 32);
            int i3 = (int) j2;
            int m7739getXimpl = IntOffset.m7739getXimpl(this.screenOffset);
            int m7740getYimpl = IntOffset.m7740getYimpl(this.screenOffset);
            return new IntRect(i + m7739getXimpl, ((int) j) + m7740getYimpl, i2 + m7739getXimpl, i3 + m7740getYimpl);
        }
        IntRect boundsInWindow = getBoundsInWindow();
        long j3 = this.windowOffset;
        return new IntRect(IntOffset.m7739getXimpl(j3) + boundsInWindow.getLeft(), IntOffset.m7740getYimpl(j3) + boundsInWindow.getTop(), IntOffset.m7739getXimpl(j3) + boundsInWindow.getRight(), IntOffset.m7740getYimpl(j3) + boundsInWindow.getBottom());
    }

    public final IntRect getBoundsInWindow() {
        long j = this.topLeft;
        int i = (int) (j >> 32);
        int i2 = (int) j;
        long j2 = this.bottomRight;
        int i3 = (int) (j2 >> 32);
        int i4 = (int) j2;
        float[] fArr = this.viewToWindowMatrix;
        if (fArr != null) {
            return IntRectKt.roundToIntRect(Matrix.m5012mapimpl(fArr, new Rect(i, i2, i3, i4)));
        }
        int m7739getXimpl = IntOffset.m7739getXimpl(this.screenOffset) - IntOffset.m7739getXimpl(this.windowOffset);
        int m7740getYimpl = IntOffset.m7740getYimpl(this.screenOffset) - IntOffset.m7740getYimpl(this.windowOffset);
        return new IntRect(i + m7739getXimpl, i2 + m7740getYimpl, i3 + m7739getXimpl, i4 + m7740getYimpl);
    }

    public final int getHeight() {
        return ((int) this.bottomRight) - ((int) this.topLeft);
    }

    /* renamed from: getPositionInRoot-nOcc-ac, reason: not valid java name */
    public final long m6860getPositionInRootnOccac() {
        return IntOffset.m7733constructorimpl(this.topLeft);
    }

    /* renamed from: getPositionInScreen-nOcc-ac, reason: not valid java name */
    public final long m6861getPositionInScreennOccac() {
        int m7739getXimpl = IntOffset.m7739getXimpl(this.screenOffset);
        int m7740getYimpl = IntOffset.m7740getYimpl(this.screenOffset);
        long j = this.topLeft;
        return IntOffset.m7733constructorimpl(((((int) (j >> 32)) + m7739getXimpl) << 32) | ((((int) j) + m7740getYimpl) & 4294967295L));
    }

    /* renamed from: getPositionInWindow-nOcc-ac, reason: not valid java name */
    public final long m6862getPositionInWindownOccac() {
        int m7739getXimpl = IntOffset.m7739getXimpl(this.screenOffset) - IntOffset.m7739getXimpl(this.windowOffset);
        int m7740getYimpl = IntOffset.m7740getYimpl(this.screenOffset) - IntOffset.m7740getYimpl(this.windowOffset);
        long j = this.topLeft;
        return IntOffset.m7733constructorimpl(((((int) (j >> 32)) + m7739getXimpl) << 32) | ((((int) j) + m7740getYimpl) & 4294967295L));
    }

    public final int getWidth() {
        return ((int) (this.bottomRight >> 32)) - ((int) (this.topLeft >> 32));
    }

    public int hashCode() {
        int m7741hashCodeimpl = (IntOffset.m7741hashCodeimpl(this.screenOffset) + ((IntOffset.m7741hashCodeimpl(this.windowOffset) + ((Long.hashCode(this.windowSize) + ((Long.hashCode(this.bottomRight) + (Long.hashCode(this.topLeft) * 31)) * 31)) * 31)) * 31)) * 31;
        float[] fArr = this.viewToWindowMatrix;
        return this.node.hashCode() + ((m7741hashCodeimpl + (fArr != null ? Matrix.m5009hashCodeimpl(fArr) : 0)) * 31);
    }

    public /* synthetic */ RelativeLayoutBounds(long j, long j2, long j3, long j4, long j5, float[] fArr, DelegatableNode delegatableNode, dq dqVar) {
        this(j, j2, j3, j4, j5, fArr, delegatableNode);
    }
}
