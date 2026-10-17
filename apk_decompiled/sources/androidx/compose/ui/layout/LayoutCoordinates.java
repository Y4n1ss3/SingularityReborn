package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import defpackage.lu0;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface LayoutCoordinates {
    static /* synthetic */ Rect localBoundingBoxOf$default(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, boolean z, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
            return null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, z);
    }

    /* renamed from: localPositionOf-S_NoaFU$default, reason: not valid java name */
    static /* synthetic */ long m6241localPositionOfS_NoaFU$default(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: localPositionOf-S_NoaFU");
            return 0L;
        }
        if ((i & 2) != 0) {
            j = Offset.Companion.m4532getZeroF1C5BW0();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return layoutCoordinates.mo6244localPositionOfS_NoaFU(layoutCoordinates2, j, z);
    }

    int get(AlignmentLine alignmentLine);

    default boolean getIntroducesMotionFrameOfReference() {
        return false;
    }

    LayoutCoordinates getParentCoordinates();

    LayoutCoordinates getParentLayoutCoordinates();

    Set<AlignmentLine> getProvidedAlignmentLines();

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo6242getSizeYbymL2g();

    boolean isAttached();

    Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z);

    /* renamed from: localPositionOf-R5De75A, reason: not valid java name */
    long mo6243localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j);

    /* renamed from: localPositionOf-S_NoaFU, reason: not valid java name */
    default long mo6244localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, long j, boolean z) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    /* renamed from: localToRoot-MK-Hz9U, reason: not valid java name */
    long mo6245localToRootMKHz9U(long j);

    /* renamed from: localToScreen-MK-Hz9U, reason: not valid java name */
    default long mo6246localToScreenMKHz9U(long j) {
        return Offset.Companion.m4531getUnspecifiedF1C5BW0();
    }

    /* renamed from: localToWindow-MK-Hz9U, reason: not valid java name */
    long mo6247localToWindowMKHz9U(long j);

    /* renamed from: screenToLocal-MK-Hz9U, reason: not valid java name */
    default long mo6248screenToLocalMKHz9U(long j) {
        return Offset.Companion.m4531getUnspecifiedF1C5BW0();
    }

    /* renamed from: transformFrom-EL8BTi8, reason: not valid java name */
    default void mo6249transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        InlineClassHelperKt.throwUnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    /* renamed from: transformToScreen-58bKbWc, reason: not valid java name */
    default void mo6250transformToScreen58bKbWc(float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    /* renamed from: windowToLocal-MK-Hz9U, reason: not valid java name */
    long mo6251windowToLocalMKHz9U(long j);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean getIntroducesMotionFrameOfReference(LayoutCoordinates layoutCoordinates) {
            return LayoutCoordinates.super.getIntroducesMotionFrameOfReference();
        }

        @Deprecated
        /* renamed from: localPositionOf-S_NoaFU, reason: not valid java name */
        public static long m6252localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j, boolean z) {
            return LayoutCoordinates.super.mo6244localPositionOfS_NoaFU(layoutCoordinates2, j, z);
        }

        @Deprecated
        /* renamed from: localToScreen-MK-Hz9U, reason: not valid java name */
        public static long m6254localToScreenMKHz9U(LayoutCoordinates layoutCoordinates, long j) {
            return LayoutCoordinates.super.mo6246localToScreenMKHz9U(j);
        }

        @Deprecated
        /* renamed from: screenToLocal-MK-Hz9U, reason: not valid java name */
        public static long m6255screenToLocalMKHz9U(LayoutCoordinates layoutCoordinates, long j) {
            return LayoutCoordinates.super.mo6248screenToLocalMKHz9U(j);
        }

        @Deprecated
        /* renamed from: transformFrom-EL8BTi8, reason: not valid java name */
        public static void m6256transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, float[] fArr) {
            LayoutCoordinates.super.mo6249transformFromEL8BTi8(layoutCoordinates2, fArr);
        }

        @Deprecated
        /* renamed from: transformToScreen-58bKbWc, reason: not valid java name */
        public static void m6257transformToScreen58bKbWc(LayoutCoordinates layoutCoordinates, float[] fArr) {
            LayoutCoordinates.super.mo6250transformToScreen58bKbWc(fArr);
        }

        public static /* synthetic */ void getIntroducesMotionFrameOfReference$annotations() {
        }
    }
}
