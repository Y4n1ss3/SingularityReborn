package defpackage;

import android.content.SharedPreferences;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class qx0 implements ny {
    public final /* synthetic */ int d = 3;
    public final /* synthetic */ un e;
    public final /* synthetic */ MutableState f;
    public final /* synthetic */ SharedPreferences g;
    public final /* synthetic */ ky h;
    public final /* synthetic */ boolean i;

    public /* synthetic */ qx0(un unVar, ky kyVar, boolean z, MutableState mutableState, SharedPreferences sharedPreferences) {
        this.e = unVar;
        this.h = kyVar;
        this.i = z;
        this.f = mutableState;
        this.g = sharedPreferences;
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
                        ComposerKt.traceEventStart(-234164862, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2739)");
                    }
                    o01.a("Fix Controllers", "Use this if your controllers are broken after rooting", null, ComposableLambdaKt.rememberComposableLambda(382565684, true, new ay0(this.e, this.h, this.i, this.f, this.g), composer, 54), composer, 3126, 4);
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
                        ComposerKt.traceEventStart(2088165608, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3486)");
                    }
                    o01.a("Simultaneous Hands & Controllers", "Enables using hand tracking and controllers at the same time", null, ComposableLambdaKt.rememberComposableLambda(-1779075686, true, new ay0(this.e, this.f, this.g, this.h, this.i), composer2, 54), composer2, 3126, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer3.shouldExecute((intValue3 & 17) != 16, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632877629, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3611)");
                    }
                    o01.a("Teleport Anywhere", "Teleport anywhere in the home environment", null, ComposableLambdaKt.rememberComposableLambda(-16147083, true, new ay0(this.f, this.g, this.e, this.h, this.i), composer3, 54), composer3, 3126, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer4.shouldExecute((intValue4 & 17) != 16, intValue4 & 1)) {
                    composer4.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(68841448, intValue4, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:1874)");
                    }
                    o01.a("Disable Meta Backdoor", "Disables the companion server's remote wipe, device lock, and disable job/receiver components (verified via pm)", null, ComposableLambdaKt.rememberComposableLambda(41409306, true, new ay0(this.g, this.e, this.h, this.i, this.f), composer4, 54), composer4, 3126, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ qx0(un unVar, MutableState mutableState, SharedPreferences sharedPreferences, ky kyVar, boolean z) {
        this.e = unVar;
        this.f = mutableState;
        this.g = sharedPreferences;
        this.h = kyVar;
        this.i = z;
    }

    public /* synthetic */ qx0(SharedPreferences sharedPreferences, un unVar, ky kyVar, boolean z, MutableState mutableState) {
        this.g = sharedPreferences;
        this.e = unVar;
        this.h = kyVar;
        this.i = z;
        this.f = mutableState;
    }

    public /* synthetic */ qx0(MutableState mutableState, SharedPreferences sharedPreferences, un unVar, ky kyVar, boolean z) {
        this.f = mutableState;
        this.g = sharedPreferences;
        this.e = unVar;
        this.h = kyVar;
        this.i = z;
    }
}
