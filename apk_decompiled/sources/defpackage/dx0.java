package defpackage;

import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class dx0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ rw0 e;

    public /* synthetic */ dx0(rw0 rw0Var, int i) {
        this.d = i;
        this.e = rw0Var;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        rw0 rw0Var = this.e;
        int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1275674709, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous> (TweaksActivity.kt:1418)");
                    }
                    AppBarKt.m1624TopAppBarGHTll3U(gl.a, null, ComposableLambdaKt.rememberComposableLambda(-953376177, true, new dx0(rw0Var, i2), composer, 54), null, 0.0f, null, null, null, composer, 390, ProgressIndicatorKt.FirstLineTailDelay);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-953376177, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous> (TweaksActivity.kt:1421)");
                    }
                    boolean changedInstance = composer2.changedInstance(rw0Var);
                    Object rememberedValue = composer2.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new hm0(rw0Var, 19);
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    IconButtonKt.IconButton((iy) rememberedValue, null, false, null, null, null, gl.b, composer2, 1572864, 62);
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
