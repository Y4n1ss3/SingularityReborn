package androidx.compose.ui.input.pointer;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class PointerInputFilter {
    public static final int $stable = 8;
    private boolean isAttached;
    private LayoutCoordinates layoutCoordinates;

    public boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    public final LayoutCoordinates getLayoutCoordinates$ui() {
        return this.layoutCoordinates;
    }

    public boolean getShareWithSiblings() {
        return false;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m6125getSizeYbymL2g() {
        LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        return layoutCoordinates != null ? layoutCoordinates.mo6242getSizeYbymL2g() : IntSize.Companion.m7787getZeroYbymL2g();
    }

    public final boolean isAttached$ui() {
        return this.isAttached;
    }

    public abstract void onCancel();

    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public abstract void mo6126onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j);

    public final void setAttached$ui(boolean z) {
        this.isAttached = z;
    }

    public final void setLayoutCoordinates$ui(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }
}
