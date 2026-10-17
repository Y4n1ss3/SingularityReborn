package defpackage;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.lumi.singularity.ui.activities.ControllerInfoActivity;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class lm implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ ControllerInfoActivity e;

    public /* synthetic */ lm(ControllerInfoActivity controllerInfoActivity, int i) {
        this.d = i;
        this.e = controllerInfoActivity;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        ControllerInfoActivity controllerInfoActivity = this.e;
        int i2 = 2;
        char c = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = ControllerInfoActivity.v;
                if (!composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-509190802, intValue, -1, "com.lumi.singularity.ui.activities.ControllerInfoActivity.onCreate.<anonymous> (ControllerInfoActivity.kt:52)");
                    }
                    MaterialThemeKt.MaterialTheme(y90.a(composer), null, null, ComposableLambdaKt.rememberComposableLambda(-1009377470, true, new lm(controllerInfoActivity, c == true ? 1 : 0), composer, 54), composer, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i4 = ControllerInfoActivity.v;
                if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1009377470, intValue2, -1, "com.lumi.singularity.ui.activities.ControllerInfoActivity.onCreate.<anonymous>.<anonymous> (ControllerInfoActivity.kt:54)");
                    }
                    SurfaceKt.m2464SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).m1747getBackground0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(164631559, true, new lm(controllerInfoActivity, i2), composer2, 54), composer2, 12582918, 122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i5 = ControllerInfoActivity.v;
                if (!composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(164631559, intValue3, -1, "com.lumi.singularity.ui.activities.ControllerInfoActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ControllerInfoActivity.kt:55)");
                    }
                    boolean changedInstance = composer3.changedInstance(controllerInfoActivity);
                    Object rememberedValue = composer3.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new i2(controllerInfoActivity, 8);
                        composer3.updateRememberedValue(rememberedValue);
                    }
                    um.b(controllerInfoActivity, (iy) rememberedValue, composer3, 0);
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
