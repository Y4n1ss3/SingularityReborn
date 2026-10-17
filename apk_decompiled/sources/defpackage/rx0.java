package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class rx0 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ SharedPreferences f;
    public final /* synthetic */ un g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ rw0 i;
    public final /* synthetic */ Context j;
    public final /* synthetic */ ky k;

    public /* synthetic */ rx0(un unVar, ky kyVar, rw0 rw0Var, Context context, SharedPreferences sharedPreferences, MutableState mutableState, boolean z) {
        this.d = 0;
        this.f = sharedPreferences;
        this.g = unVar;
        this.h = z;
        this.j = context;
        this.i = rw0Var;
        this.k = kyVar;
        this.e = mutableState;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        w01 w01Var = w01.a;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(249797524, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2872)");
                    }
                    o01.a("Disable Proximity Sensor", "Prevents the headset from waking or sleeping automatically", null, ComposableLambdaKt.rememberComposableLambda(-523590074, true, new fy0(this.g, this.k, this.i, this.j, this.f, this.e, this.h), composer, 54), composer, 3126, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1045567717, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:1809)");
                    }
                    o01.a("Disable Meta Telemetry", "Mounts over telemetry binaries and pauses/stops the processes", null, ComposableLambdaKt.rememberComposableLambda(527577623, true, new fy0(0, this.g, this.k, this.i, this.j, this.f, this.e, this.h), composer2, 54), composer2, 3126, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer3.shouldExecute((intValue3 & 17) != 16, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1334717833, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:1841)");
                    }
                    o01.a("Disable Update Engine", "Mounts over update_engine/update_verifier binaries and pauses/stops the processes", null, ComposableLambdaKt.rememberComposableLambda(1307285691, true, new fy0(2, this.g, this.k, this.i, this.j, this.f, this.e, this.h), composer3, 54), composer3, 3126, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ rx0(int i, un unVar, ky kyVar, rw0 rw0Var, Context context, SharedPreferences sharedPreferences, MutableState mutableState, boolean z) {
        this.d = i;
        this.e = mutableState;
        this.f = sharedPreferences;
        this.g = unVar;
        this.h = z;
        this.i = rw0Var;
        this.j = context;
        this.k = kyVar;
    }
}
