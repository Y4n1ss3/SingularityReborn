package androidx.compose.material3;

import androidx.compose.ui.unit.DpSize;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragHandleSizes {
    public static final int $stable = 0;
    private final long draggedSize;
    private final long pressedSize;
    private final long size;

    private DragHandleSizes(long j, long j2, long j3) {
        this.size = j;
        this.pressedSize = j2;
        this.draggedSize = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DragHandleSizes)) {
            return false;
        }
        DragHandleSizes dragHandleSizes = (DragHandleSizes) obj;
        return DpSize.m7706equalsimpl0(this.size, dragHandleSizes.size) && DpSize.m7706equalsimpl0(this.pressedSize, dragHandleSizes.pressedSize) && DpSize.m7706equalsimpl0(this.draggedSize, dragHandleSizes.draggedSize);
    }

    /* renamed from: getDraggedSize-MYxV2XQ, reason: not valid java name */
    public final long m1939getDraggedSizeMYxV2XQ() {
        return this.draggedSize;
    }

    /* renamed from: getPressedSize-MYxV2XQ, reason: not valid java name */
    public final long m1940getPressedSizeMYxV2XQ() {
        return this.pressedSize;
    }

    /* renamed from: getSize-MYxV2XQ, reason: not valid java name */
    public final long m1941getSizeMYxV2XQ() {
        return this.size;
    }

    public int hashCode() {
        return DpSize.m7711hashCodeimpl(this.draggedSize) + ((DpSize.m7711hashCodeimpl(this.pressedSize) + (DpSize.m7711hashCodeimpl(this.size) * 31)) * 31);
    }

    public /* synthetic */ DragHandleSizes(long j, long j2, long j3, dq dqVar) {
        this(j, j2, j3);
    }
}
