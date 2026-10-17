package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import defpackage.dq;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragHandleColors {
    public static final int $stable = 0;
    private final long color;
    private final long draggedColor;
    private final long pressedColor;

    private DragHandleColors(long j, long j2, long j3) {
        this.color = j;
        this.pressedColor = j2;
        this.draggedColor = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DragHandleColors)) {
            return false;
        }
        DragHandleColors dragHandleColors = (DragHandleColors) obj;
        return Color.m4762equalsimpl0(this.color, dragHandleColors.color) && Color.m4762equalsimpl0(this.pressedColor, dragHandleColors.pressedColor) && Color.m4762equalsimpl0(this.draggedColor, dragHandleColors.draggedColor);
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m1936getColor0d7_KjU() {
        return this.color;
    }

    /* renamed from: getDraggedColor-0d7_KjU, reason: not valid java name */
    public final long m1937getDraggedColor0d7_KjU() {
        return this.draggedColor;
    }

    /* renamed from: getPressedColor-0d7_KjU, reason: not valid java name */
    public final long m1938getPressedColor0d7_KjU() {
        return this.pressedColor;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.draggedColor) + kp0.d(this.pressedColor, Color.m4768hashCodeimpl(this.color) * 31, 31);
    }

    public /* synthetic */ DragHandleColors(long j, long j2, long j3, dq dqVar) {
        this(j, j2, j3);
    }
}
