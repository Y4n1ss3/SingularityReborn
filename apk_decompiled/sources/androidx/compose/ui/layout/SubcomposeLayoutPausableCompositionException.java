package androidx.compose.ui.layout;

import androidx.compose.ui.layout.SLOperation;
import defpackage.e10;
import defpackage.es0;
import defpackage.j50;
import defpackage.m50;
import defpackage.y80;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class SubcomposeLayoutPausableCompositionException extends IllegalStateException {
    private final e10 operations;
    private final Object slotId;

    public SubcomposeLayoutPausableCompositionException(e10 e10Var, Object obj, Throwable th) {
        super(th);
        this.operations = e10Var;
        this.slotId = obj;
    }

    private final List<String> operationsList() {
        m50 o = y80.o();
        for (int i = this.operations.b - 1; i >= 0; i += -1) {
            int b = this.operations.b(i);
            int m6320constructorimpl = SLOperation.m6320constructorimpl(b);
            SLOperation.Companion companion = SLOperation.Companion;
            o.add(i + ": " + (SLOperation.m6322equalsimpl0(m6320constructorimpl, companion.m6327getCancelPausedPrecompositionNjRlDlw()) ? "CancelPausedPrecomposition" : SLOperation.m6322equalsimpl0(m6320constructorimpl, companion.m6333getReuseForceSyncDeactivationNjRlDlw()) ? "ReuseForceSyncDeactivation" : SLOperation.m6322equalsimpl0(m6320constructorimpl, companion.m6334getReuseScheduleOutOfFrameDeactivationNjRlDlw()) ? "ReuseScheduleOutOfFrameDeactivation" : SLOperation.m6322equalsimpl0(m6320constructorimpl, companion.m6335getReuseSyncDeactivationNjRlDlw()) ? "ReuseSyncDeactivation" : SLOperation.m6322equalsimpl0(m6320constructorimpl, companion.m6332getReuseDeactivationViaHostNjRlDlw()) ? "ReuseDeactivationViaHost" : SLOperation.m6322equalsimpl0(m6320constructorimpl, companion.m6343getTookFromPrecomposeMapNjRlDlw()) ? "TookFromPrecomposeMap" : SLOperation.m6322equalsimpl0(m6320constructorimpl, companion.m6339getSubcomposeNjRlDlw()) ? "Subcompose" : SLOperation.m6322equalsimpl0(m6320constructorimpl, companion.m6341getSubcomposeNewNjRlDlw()) ? "SubcomposeNew" : SLOperation.m6322equalsimpl0(m6320constructorimpl, companion.m6342getSubcomposePausableNjRlDlw()) ? "SubcomposePausable" : SLOperation.m6322equalsimpl0(m6320constructorimpl, companion.m6340getSubcomposeForceReuseNjRlDlw()) ? "SubcomposeForceReuse" : SLOperation.m6322equalsimpl0(m6320constructorimpl, companion.m6328getDeactivateOutOfFrameNjRlDlw()) ? "DeactivateOutOfFrame" : SLOperation.m6322equalsimpl0(m6320constructorimpl, companion.m6329getDeactivateOutOfFrameCancelledNjRlDlw()) ? "DeactivateOutOfFrameCancelled" : SLOperation.m6322equalsimpl0(m6320constructorimpl, companion.m6337getSlotToReusedFromOnDeactivateNjRlDlw()) ? "SlotToReusedFromOnDeactivate" : SLOperation.m6322equalsimpl0(m6320constructorimpl, companion.m6338getSlotToReusedFromOnReuseNjRlDlw()) ? "SlotToReusedFromOnReuse" : SLOperation.m6322equalsimpl0(m6320constructorimpl, companion.m6336getReusedNjRlDlw()) ? "Reused" : SLOperation.m6322equalsimpl0(m6320constructorimpl, companion.m6331getResumePausedNjRlDlw()) ? "ResumePaused" : SLOperation.m6322equalsimpl0(m6320constructorimpl, companion.m6330getPausePausedNjRlDlw()) ? "PausePaused" : SLOperation.m6322equalsimpl0(m6320constructorimpl, companion.m6326getApplyPausedNjRlDlw()) ? "ApplyPaused" : j50.h(b, "Unexpected ")));
        }
        return y80.d(o);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return es0.X("\n            |slotid=" + this.slotId + ". Last operations:\n            |" + yi.u0(operationsList(), "\n", null, null, null, 62) + "\n            ");
    }

    public static /* synthetic */ void getMessage$annotations() {
    }
}
