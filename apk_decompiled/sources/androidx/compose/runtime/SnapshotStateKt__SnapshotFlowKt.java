package androidx.compose.runtime;

import defpackage.iw;
import defpackage.iy;
import defpackage.kn;
import defpackage.my;
import defpackage.pw;
import defpackage.st;
import defpackage.ur0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {
    public static final <T extends R, R> State<R> collectAsState(iw iwVar, R r, kn knVar, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            knVar = st.d;
        }
        kn knVar2 = knVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-606625098, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:69)");
        }
        boolean changedInstance = composer.changedInstance(knVar2) | composer.changedInstance(iwVar);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(knVar2, iwVar, null);
            composer.updateRememberedValue(rememberedValue);
        }
        State<R> produceState = SnapshotStateKt.produceState(r, iwVar, knVar2, (my) rememberedValue, composer, ((i >> 3) & 14) | ((i << 3) & 112) | (i & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return produceState;
    }

    public static final <T> iw snapshotFlow(iy iyVar) {
        return snapshotFlowImpl$SnapshotStateKt__SnapshotFlowKt(null, iyVar);
    }

    private static final <T> iw snapshotFlowImpl$SnapshotStateKt__SnapshotFlowKt(SnapshotFlowManager snapshotFlowManager, iy iyVar) {
        return new pw(new SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(snapshotFlowManager, iyVar, null), 2);
    }

    public static final <T> iw snapshotFlow(SnapshotFlowManager snapshotFlowManager, iy iyVar) {
        return snapshotFlowImpl$SnapshotStateKt__SnapshotFlowKt(snapshotFlowManager, iyVar);
    }

    public static final <T> State<T> collectAsState(ur0 ur0Var, kn knVar, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            knVar = st.d;
        }
        kn knVar2 = knVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1439883919, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:53)");
        }
        State<T> collectAsState = SnapshotStateKt.collectAsState(ur0Var, ur0Var.getValue(), knVar2, composer, (i & 14) | ((i << 3) & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return collectAsState;
    }
}
