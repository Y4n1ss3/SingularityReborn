package androidx.compose.animation;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import defpackage.q10;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedTransitionStateMachineKt {
    public static final boolean SharedTransitionDebug = false;

    public static final long calculateOffsetFromDirectManipulation(TargetData targetData, Rect rect) {
        return Offset.m4521plusMKHz9U(Offset.m4520minusMKHz9U(rect.m4551getTopLeftF1C5BW0(), targetData.m111getInitialMfrOffsetF1C5BW0()), targetData.m110getCurrentMfrOffsetF1C5BW0());
    }

    public static final Rect getTargetBounds(TargetData targetData) {
        return RectKt.m4556Recttz77jQw(Offset.m4521plusMKHz9U(targetData.m111getInitialMfrOffsetF1C5BW0(), targetData.m113getTargetStructuralOffsetF1C5BW0()), targetData.m112getSizeNHjbRc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect obtainBoundsFromLastTarget(SharedElement sharedElement, BoundsProvider boundsProvider) {
        if (boundsProvider == null) {
            return null;
        }
        List<SharedElementEntry> allEntries = sharedElement.getAllEntries();
        int size = allEntries.size();
        for (int i = 0; i < size; i++) {
            if (q10.b(allEntries.get(i).getBoundsProvider(), boundsProvider)) {
                return boundsProvider.getLastBoundsInSharedTransitionScope();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateTargetData-BGTQxF0, reason: not valid java name */
    public static final void m97updateTargetDataBGTQxF0(TargetData targetData, long j, long j2, long j3, boolean z) {
        if (!Offset.m4513equalsimpl0(targetData.m113getTargetStructuralOffsetF1C5BW0(), j3) || !Size.m4581equalsimpl0(targetData.m112getSizeNHjbRc(), j) || z) {
            targetData.m116setSizeuvyYCjk(j);
            targetData.m117setTargetStructuralOffsetk4lQ0M(j3);
            if (z) {
                targetData.m115setInitialMfrOffsetk4lQ0M(Offset.m4520minusMKHz9U(Offset.m4520minusMKHz9U(j2, j3), Offset.m4520minusMKHz9U(targetData.m110getCurrentMfrOffsetF1C5BW0(), targetData.m111getInitialMfrOffsetF1C5BW0())));
            }
        }
        targetData.m114setCurrentMfrOffsetk4lQ0M(Offset.m4520minusMKHz9U(j2, j3));
    }
}
