package androidx.compose.ui.layout;

import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class SLOperation {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int CancelPausedPrecomposition = m6320constructorimpl(0);
    private static final int ReuseForceSyncDeactivation = m6320constructorimpl(1);
    private static final int ReuseScheduleOutOfFrameDeactivation = m6320constructorimpl(2);
    private static final int ReuseSyncDeactivation = m6320constructorimpl(3);
    private static final int ReuseDeactivationViaHost = m6320constructorimpl(4);
    private static final int TookFromPrecomposeMap = m6320constructorimpl(5);
    private static final int Subcompose = m6320constructorimpl(6);
    private static final int SubcomposeNew = m6320constructorimpl(7);
    private static final int SubcomposePausable = m6320constructorimpl(8);
    private static final int SubcomposeForceReuse = m6320constructorimpl(9);
    private static final int DeactivateOutOfFrame = m6320constructorimpl(10);
    private static final int DeactivateOutOfFrameCancelled = m6320constructorimpl(11);
    private static final int SlotToReusedFromOnDeactivate = m6320constructorimpl(12);
    private static final int SlotToReusedFromOnReuse = m6320constructorimpl(13);
    private static final int Reused = m6320constructorimpl(14);
    private static final int ResumePaused = m6320constructorimpl(15);
    private static final int PausePaused = m6320constructorimpl(16);
    private static final int ApplyPaused = m6320constructorimpl(17);

    private /* synthetic */ SLOperation(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SLOperation m6319boximpl(int i) {
        return new SLOperation(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6321equalsimpl(int i, Object obj) {
        return (obj instanceof SLOperation) && i == ((SLOperation) obj).m6325unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6322equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6323hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6324toStringimpl(int i) {
        return r6.b("SLOperation(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m6321equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m6323hashCodeimpl(this.value);
    }

    public String toString() {
        return m6324toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6325unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getApplyPaused-NjRlDlw, reason: not valid java name */
        public final int m6326getApplyPausedNjRlDlw() {
            return SLOperation.ApplyPaused;
        }

        /* renamed from: getCancelPausedPrecomposition-NjRlDlw, reason: not valid java name */
        public final int m6327getCancelPausedPrecompositionNjRlDlw() {
            return SLOperation.CancelPausedPrecomposition;
        }

        /* renamed from: getDeactivateOutOfFrame-NjRlDlw, reason: not valid java name */
        public final int m6328getDeactivateOutOfFrameNjRlDlw() {
            return SLOperation.DeactivateOutOfFrame;
        }

        /* renamed from: getDeactivateOutOfFrameCancelled-NjRlDlw, reason: not valid java name */
        public final int m6329getDeactivateOutOfFrameCancelledNjRlDlw() {
            return SLOperation.DeactivateOutOfFrameCancelled;
        }

        /* renamed from: getPausePaused-NjRlDlw, reason: not valid java name */
        public final int m6330getPausePausedNjRlDlw() {
            return SLOperation.PausePaused;
        }

        /* renamed from: getResumePaused-NjRlDlw, reason: not valid java name */
        public final int m6331getResumePausedNjRlDlw() {
            return SLOperation.ResumePaused;
        }

        /* renamed from: getReuseDeactivationViaHost-NjRlDlw, reason: not valid java name */
        public final int m6332getReuseDeactivationViaHostNjRlDlw() {
            return SLOperation.ReuseDeactivationViaHost;
        }

        /* renamed from: getReuseForceSyncDeactivation-NjRlDlw, reason: not valid java name */
        public final int m6333getReuseForceSyncDeactivationNjRlDlw() {
            return SLOperation.ReuseForceSyncDeactivation;
        }

        /* renamed from: getReuseScheduleOutOfFrameDeactivation-NjRlDlw, reason: not valid java name */
        public final int m6334getReuseScheduleOutOfFrameDeactivationNjRlDlw() {
            return SLOperation.ReuseScheduleOutOfFrameDeactivation;
        }

        /* renamed from: getReuseSyncDeactivation-NjRlDlw, reason: not valid java name */
        public final int m6335getReuseSyncDeactivationNjRlDlw() {
            return SLOperation.ReuseSyncDeactivation;
        }

        /* renamed from: getReused-NjRlDlw, reason: not valid java name */
        public final int m6336getReusedNjRlDlw() {
            return SLOperation.Reused;
        }

        /* renamed from: getSlotToReusedFromOnDeactivate-NjRlDlw, reason: not valid java name */
        public final int m6337getSlotToReusedFromOnDeactivateNjRlDlw() {
            return SLOperation.SlotToReusedFromOnDeactivate;
        }

        /* renamed from: getSlotToReusedFromOnReuse-NjRlDlw, reason: not valid java name */
        public final int m6338getSlotToReusedFromOnReuseNjRlDlw() {
            return SLOperation.SlotToReusedFromOnReuse;
        }

        /* renamed from: getSubcompose-NjRlDlw, reason: not valid java name */
        public final int m6339getSubcomposeNjRlDlw() {
            return SLOperation.Subcompose;
        }

        /* renamed from: getSubcomposeForceReuse-NjRlDlw, reason: not valid java name */
        public final int m6340getSubcomposeForceReuseNjRlDlw() {
            return SLOperation.SubcomposeForceReuse;
        }

        /* renamed from: getSubcomposeNew-NjRlDlw, reason: not valid java name */
        public final int m6341getSubcomposeNewNjRlDlw() {
            return SLOperation.SubcomposeNew;
        }

        /* renamed from: getSubcomposePausable-NjRlDlw, reason: not valid java name */
        public final int m6342getSubcomposePausableNjRlDlw() {
            return SLOperation.SubcomposePausable;
        }

        /* renamed from: getTookFromPrecomposeMap-NjRlDlw, reason: not valid java name */
        public final int m6343getTookFromPrecomposeMapNjRlDlw() {
            return SLOperation.TookFromPrecomposeMap;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6320constructorimpl(int i) {
        return i;
    }
}
