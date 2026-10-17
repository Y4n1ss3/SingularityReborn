package defpackage;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.TextUnitKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class g3 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ MutableState f;
    public final /* synthetic */ MutableState g;

    public /* synthetic */ g3(boolean z, MutableState mutableState, MutableState mutableState2, int i) {
        this.d = i;
        this.e = z;
        this.f = mutableState;
        this.g = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        w01 w01Var = w01.a;
        MutableState mutableState = this.g;
        MutableState mutableState2 = this.f;
        boolean z = this.e;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1103642065, intValue, -1, "com.lumi.singularity.ui.activities.AdbConnectScreen.<anonymous>.<anonymous>.<anonymous> (AdbRootActivity.kt:620)");
                    }
                    TextKt.m2607TextNvy7gAk(!z ? "5. Patch boot.img — LOCKED" : !((Boolean) mutableState2.getValue()).booleanValue() ? "5. Patch boot.img (Requires Root)" : j4.b(mutableState) ? "Processing..." : "5. Patch boot.img", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1052006590, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3336)");
                    }
                    TextKt.m2607TextNvy7gAk(((Boolean) mutableState2.getValue()).booleanValue() ? "..." : !((Boolean) mutableState.getValue()).booleanValue() ? "Install" : z ? "Update" : "Store", null, 0L, null, TextUnitKt.getSp(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 24576, 0, 262126);
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
