package defpackage;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ka implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ka(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Number) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1616165823, intValue, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:1293)");
                    }
                    TextKt.m2607TextNvy7gAk((String) obj4, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Number) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-463794246, intValue2, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:938)");
                    }
                    TextKt.m2607TextNvy7gAk((String) obj4, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Number) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer3.shouldExecute((intValue3 & 17) != 16, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(889452311, intValue3, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:1188)");
                    }
                    sa saVar = (sa) obj4;
                    TextKt.m2607TextNvy7gAk(saVar.c ? "Processing..." : saVar.g ? "Update" : saVar.d ? "Reinstall" : "Install", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }
}
