package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.lumi.singularity.ui.activities.MainActivity;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class v60 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ MainActivity e;
    public final /* synthetic */ SharedPreferences f;

    public /* synthetic */ v60(MainActivity mainActivity, SharedPreferences sharedPreferences, int i) {
        this.d = i;
        this.e = mainActivity;
        this.f = sharedPreferences;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        MainActivity mainActivity = this.e;
        w01 w01Var = w01.a;
        SharedPreferences sharedPreferences = this.f;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                Set set = MainActivity.w;
                if (!composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2078199090, intValue, -1, "com.lumi.singularity.ui.activities.MainActivity.onCreate.<anonymous> (MainActivity.kt:453)");
                    }
                    MaterialThemeKt.MaterialTheme(y90.a(composer), null, null, ComposableLambdaKt.rememberComposableLambda(-1843583326, true, new v60(mainActivity, sharedPreferences, i3), composer, 54), composer, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                Set set2 = MainActivity.w;
                if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1843583326, intValue2, -1, "com.lumi.singularity.ui.activities.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:456)");
                    }
                    SurfaceKt.m2464SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).m1747getBackground0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(534474727, true, new v60(mainActivity, sharedPreferences, i2), composer2, 54), composer2, 12582918, 122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                Set set3 = MainActivity.w;
                if (!composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(534474727, intValue3, -1, "com.lumi.singularity.ui.activities.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:457)");
                    }
                    MainActivity mainActivity2 = this.e;
                    Intent intent = mainActivity2.getIntent();
                    boolean z = (intent != null ? intent.getBooleanExtra("auto_root", false) : false) || sharedPreferences.getBoolean("root_on_boot", false);
                    Intent intent2 = mainActivity2.getIntent();
                    boolean booleanExtra = intent2 != null ? intent2.getBooleanExtra("open_magisk", false) : false;
                    Intent intent3 = mainActivity2.getIntent();
                    boolean booleanExtra2 = intent3 != null ? intent3.getBooleanExtra("start_dns_blocker", false) : false;
                    boolean changedInstance = composer3.changedInstance(mainActivity2);
                    Object rememberedValue = composer3.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new i2(mainActivity2, 20);
                        composer3.updateRememberedValue(rememberedValue);
                    }
                    e80.c(z, booleanExtra, booleanExtra2, (iy) rememberedValue, mainActivity2.getIntent(), mainActivity2, composer3, 0);
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
