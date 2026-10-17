package androidx.compose.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TargetData {
    public static final int $stable = 0;
    private final MutableState currentMfrOffset$delegate;
    private final MutableState initialMfrOffset$delegate;
    private final MutableState size$delegate;
    private final MutableState targetStructuralOffset$delegate;

    private TargetData(long j, long j2, long j3) {
        this.size$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m4573boximpl(j), null, 2, null);
        this.initialMfrOffset$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4505boximpl(j2), null, 2, null);
        this.targetStructuralOffset$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4505boximpl(j3), null, 2, null);
        this.currentMfrOffset$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4505boximpl(j2), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentMfrOffset-F1C5BW0, reason: not valid java name */
    public final long m110getCurrentMfrOffsetF1C5BW0() {
        return ((Offset) this.currentMfrOffset$delegate.getValue()).m4526unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getInitialMfrOffset-F1C5BW0, reason: not valid java name */
    public final long m111getInitialMfrOffsetF1C5BW0() {
        return ((Offset) this.initialMfrOffset$delegate.getValue()).m4526unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m112getSizeNHjbRc() {
        return ((Size) this.size$delegate.getValue()).m4590unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getTargetStructuralOffset-F1C5BW0, reason: not valid java name */
    public final long m113getTargetStructuralOffsetF1C5BW0() {
        return ((Offset) this.targetStructuralOffset$delegate.getValue()).m4526unboximpl();
    }

    /* renamed from: setCurrentMfrOffset-k-4lQ0M, reason: not valid java name */
    public final void m114setCurrentMfrOffsetk4lQ0M(long j) {
        this.currentMfrOffset$delegate.setValue(Offset.m4505boximpl(j));
    }

    /* renamed from: setInitialMfrOffset-k-4lQ0M, reason: not valid java name */
    public final void m115setInitialMfrOffsetk4lQ0M(long j) {
        this.initialMfrOffset$delegate.setValue(Offset.m4505boximpl(j));
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public final void m116setSizeuvyYCjk(long j) {
        this.size$delegate.setValue(Size.m4573boximpl(j));
    }

    /* renamed from: setTargetStructuralOffset-k-4lQ0M, reason: not valid java name */
    public final void m117setTargetStructuralOffsetk4lQ0M(long j) {
        this.targetStructuralOffset$delegate.setValue(Offset.m4505boximpl(j));
    }

    public /* synthetic */ TargetData(long j, long j2, long j3, dq dqVar) {
        this(j, j2, j3);
    }
}
