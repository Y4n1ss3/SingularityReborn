package defpackage;

import android.content.SharedPreferences;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.lumi.singularity.ui.activities.AdbActivity;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class h2 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ SharedPreferences f;
    public final /* synthetic */ AdbActivity g;

    public /* synthetic */ h2(String str, SharedPreferences sharedPreferences, AdbActivity adbActivity, int i) {
        this.d = i;
        this.e = str;
        this.f = sharedPreferences;
        this.g = adbActivity;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        SharedPreferences sharedPreferences = this.f;
        String str = this.e;
        hm hmVar = null;
        w01 w01Var = w01.a;
        AdbActivity adbActivity = this.g;
        int i2 = 2;
        char c = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = AdbActivity.w;
                if (!composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152582398, intValue, -1, "com.lumi.singularity.ui.activities.AdbActivity.onCreate.<anonymous> (AdbActivity.kt:45)");
                    }
                    MaterialThemeKt.MaterialTheme(y90.a(composer), null, null, ComposableLambdaKt.rememberComposableLambda(1869025746, true, new h2(str, sharedPreferences, adbActivity, c == true ? 1 : 0), composer, 54), composer, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i4 = AdbActivity.w;
                if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1869025746, intValue2, -1, "com.lumi.singularity.ui.activities.AdbActivity.onCreate.<anonymous>.<anonymous> (AdbActivity.kt:48)");
                    }
                    SurfaceKt.m2464SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).m1747getBackground0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-868161449, true, new h2(str, sharedPreferences, adbActivity, i2), composer2, 54), composer2, 12582918, 122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i5 = AdbActivity.w;
                if (!composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-868161449, intValue3, -1, "com.lumi.singularity.ui.activities.AdbActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (AdbActivity.kt:49)");
                    }
                    SharedPreferences sharedPreferences2 = this.f;
                    sharedPreferences2.getClass();
                    boolean changedInstance = composer3.changedInstance(adbActivity);
                    Object rememberedValue = composer3.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new k2(adbActivity, hmVar, r13 ? 1 : 0);
                        composer3.updateRememberedValue(rememberedValue);
                    }
                    ky kyVar = (ky) rememberedValue;
                    boolean changedInstance2 = composer3.changedInstance(adbActivity);
                    Object rememberedValue2 = composer3.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new i2(adbActivity, r13 ? 1 : 0);
                        composer3.updateRememberedValue(rememberedValue2);
                    }
                    b3.a(this.e, sharedPreferences2, kyVar, (iy) rememberedValue2, composer3, 0);
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
