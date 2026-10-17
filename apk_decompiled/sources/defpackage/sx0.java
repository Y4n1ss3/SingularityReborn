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
public final /* synthetic */ class sx0 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ SharedPreferences e;
    public final /* synthetic */ un f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ ky h;
    public final /* synthetic */ MutableState i;

    public /* synthetic */ sx0(un unVar, ky kyVar, Context context, SharedPreferences sharedPreferences, MutableState mutableState) {
        this.d = 2;
        this.i = mutableState;
        this.f = unVar;
        this.g = context;
        this.e = sharedPreferences;
        this.h = kyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
                        ComposerKt.traceEventStart(-859932547, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2927)");
                    }
                    o01.a("Disable Guardian", "Pauses the guardian boundary system", null, ComposableLambdaKt.rememberComposableLambda(-1056072017, true, new by0(2, this.f, this.h, this.g, this.e, this.i), composer, 54), composer, 3126, 4);
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
                        ComposerKt.traceEventStart(-1664347812, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2965)");
                    }
                    o01.a("Disable Captive Portal", "Stops Quest from blocking WiFi networks without internet access, allowing auto-connection to any network", null, ComposableLambdaKt.rememberComposableLambda(-1860487282, true, new by0(0, this.f, this.h, this.g, this.e, this.i), composer2, 54), composer2, 3126, 4);
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
                        ComposerKt.traceEventStart(164547905, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:1725)");
                    }
                    MutableState mutableState = this.i;
                    o01.a("Disable OTA Updates", ((Boolean) mutableState.getValue()).booleanValue() ? "OTA URLs redirected to localhost — updates cannot download" : "Redirects OTA update URLs to localhost via Wireless ADB so firmware downloads cannot happen.", null, ComposableLambdaKt.rememberComposableLambda(781278451, true, new by0(this.f, this.h, this.g, this.e, mutableState), composer3, 54), composer3, 3078, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ sx0(int i, un unVar, ky kyVar, Context context, SharedPreferences sharedPreferences, MutableState mutableState) {
        this.d = i;
        this.e = sharedPreferences;
        this.f = unVar;
        this.g = context;
        this.h = kyVar;
        this.i = mutableState;
    }
}
