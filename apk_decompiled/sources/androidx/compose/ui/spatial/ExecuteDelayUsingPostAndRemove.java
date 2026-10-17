package androidx.compose.ui.spatial;

import androidx.compose.ui.Actual_androidKt;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class ExecuteDelayUsingPostAndRemove implements ExecuteDelayed {
    public static final ExecuteDelayUsingPostAndRemove INSTANCE = new ExecuteDelayUsingPostAndRemove();

    private ExecuteDelayUsingPostAndRemove() {
    }

    @Override // androidx.compose.ui.spatial.ExecuteDelayed
    public Object executeDelayed(long j, iy iyVar) {
        return Actual_androidKt.postDelayed(j, iyVar);
    }

    @Override // androidx.compose.ui.spatial.ExecuteDelayed
    public void removeDelayedExecution(Object obj) {
        Actual_androidKt.removePost(obj);
    }
}
