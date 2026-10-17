package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class ox0 implements ny {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState f;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ SharedPreferences h;
    public final /* synthetic */ rw0 i;
    public final /* synthetic */ ky j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ un m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ox0(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, SharedPreferences sharedPreferences, rw0 rw0Var, ky kyVar, MutableState mutableState4, boolean z, un unVar, MutableState mutableState5) {
        this.e = mutableState;
        this.f = mutableState2;
        this.g = mutableState3;
        this.h = sharedPreferences;
        this.i = rw0Var;
        this.j = kyVar;
        this.k = mutableState4;
        this.l = z;
        this.m = unVar;
        this.n = mutableState5;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj4 = this.n;
        switch (i) {
            case 0:
                Context context = (Context) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1539989082, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2519)");
                    }
                    o01.a("Frida Server", "Dynamic instrumentation toolkit. Use at your own risk.", null, ComposableLambdaKt.rememberComposableLambda(-1567421224, true, new ky0(this.e, this.f, this.g, this.l, this.i, this.h, this.j, this.m, context, this.k), composer, 54), composer, 3126, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                MutableState mutableState = (MutableState) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1657358081, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3815)");
                    }
                    MutableState mutableState2 = this.e;
                    boolean changed = composer2.changed((List) mutableState2.getValue());
                    Object rememberedValue = composer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = ((List) mutableState2.getValue()).isEmpty() ? "Detecting available frequencies..." : yi.u0(yi.C0((List) mutableState2.getValue()), "\n", null, null, new qu0(15), 30);
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    o01.a("Set Max Frequency", (String) rememberedValue, null, ComposableLambdaKt.rememberComposableLambda(-1853497551, true, new ky0(mutableState2, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, mutableState), composer2, 54), composer2, 3078, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ ox0(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, boolean z, rw0 rw0Var, SharedPreferences sharedPreferences, ky kyVar, un unVar, Context context, MutableState mutableState4) {
        this.e = mutableState;
        this.f = mutableState2;
        this.g = mutableState3;
        this.l = z;
        this.i = rw0Var;
        this.h = sharedPreferences;
        this.j = kyVar;
        this.m = unVar;
        this.n = context;
        this.k = mutableState4;
    }
}
