package defpackage;

import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class h8 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ SnackbarHostState e;

    public /* synthetic */ h8(SnackbarHostState snackbarHostState, int i) {
        this.d = i;
        this.e = snackbarHostState;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-996868902, intValue, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous> (AppsActivity.kt:668)");
                    }
                    SnackbarHostKt.SnackbarHost(this.e, null, null, composer, 6, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(82383234, intValue2, -1, "com.lumi.singularity.ui.activities.ControllerInfoScreen.<anonymous> (ControllerInfoActivity.kt:123)");
                    }
                    SnackbarHostKt.SnackbarHost(this.e, null, null, composer2, 6, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (!composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1389105141, intValue3, -1, "com.lumi.singularity.ui.activities.DomainBlockerScreen.<anonymous> (DomainBlockerActivity.kt:74)");
                    }
                    SnackbarHostKt.SnackbarHost(this.e, null, null, composer3, 6, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (!composer4.shouldExecute((intValue4 & 3) != 2, intValue4 & 1)) {
                    composer4.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(730802135, intValue4, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous> (TweaksActivity.kt:1416)");
                    }
                    SnackbarHostKt.SnackbarHost(this.e, null, null, composer4, 6, 6);
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
