package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class qi implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ ty j;
    public final /* synthetic */ Object k;

    public /* synthetic */ qi(MutableState mutableState, AtomicLong atomicLong, SharedPreferences sharedPreferences, un unVar, my myVar, ky kyVar, boolean z) {
        this.d = 4;
        this.f = mutableState;
        this.g = atomicLong;
        this.h = sharedPreferences;
        this.i = unVar;
        this.j = myVar;
        this.k = kyVar;
        this.e = z;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier combinedClickable_cJG_KMw$lambda$1;
        int i = this.d;
        w01 w01Var = w01.a;
        int i2 = 1;
        Object obj4 = this.k;
        ty tyVar = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.f;
        switch (i) {
            case 0:
                combinedClickable_cJG_KMw$lambda$1 = ClickableKt.combinedClickable_cJG_KMw$lambda$1(this.e, (String) obj8, (Role) obj6, (String) obj7, (iy) obj5, (iy) tyVar, (iy) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                break;
            case 1:
                MutableState mutableState = (MutableState) obj8;
                MutableState mutableState2 = (MutableState) obj7;
                MutableState mutableState3 = (MutableState) obj6;
                SharedPreferences sharedPreferences = (SharedPreferences) obj5;
                ky kyVar = (ky) tyVar;
                un unVar = (un) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(530302568, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2012)");
                    }
                    o01.a("Wireless ADB", "Enables connecting to ADB over Wi-Fi", ComposableLambdaKt.rememberComposableLambda(951961641, true, new t2(mutableState, mutableState2, i2), composer, 54), ComposableLambdaKt.rememberComposableLambda(502870426, true, new q70(mutableState3, sharedPreferences, kyVar, this.e, unVar, mutableState), composer, 54), composer, 3510, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 2:
                MutableState mutableState4 = (MutableState) obj8;
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj7;
                un unVar2 = (un) obj6;
                Context context = (Context) obj5;
                ky kyVar2 = (ky) tyVar;
                MutableState mutableState5 = (MutableState) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1038580127, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2792)");
                    }
                    o01.a("Double Tap for Passthrough", "Double tap the left or right side of your headset to turn passthrough on or off.", null, ComposableLambdaKt.rememberComposableLambda(-421849581, true, new ey0(unVar2, kyVar2, context, sharedPreferences2, mutableState4, mutableState5, this.e), composer2, 54), composer2, 3126, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 3:
                AtomicLong atomicLong = (AtomicLong) obj8;
                SharedPreferences sharedPreferences3 = (SharedPreferences) obj7;
                un unVar3 = (un) obj6;
                rw0 rw0Var = (rw0) obj5;
                ky kyVar3 = (ky) tyVar;
                MutableState mutableState6 = (MutableState) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer3.shouldExecute((intValue3 & 17) != 16, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-172387059, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3188)");
                    }
                    o01.a("USB Interceptor", "Automatically enables MTP when USB is connected", null, ComposableLambdaKt.rememberComposableLambda(255338943, true, new ey0(atomicLong, sharedPreferences3, unVar3, rw0Var, kyVar3, this.e, mutableState6), composer3, 54), composer3, 3126, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 4:
                MutableState mutableState7 = (MutableState) obj8;
                AtomicLong atomicLong2 = (AtomicLong) obj7;
                SharedPreferences sharedPreferences4 = (SharedPreferences) obj6;
                un unVar4 = (un) obj5;
                my myVar = (my) tyVar;
                ky kyVar4 = (ky) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer4.shouldExecute((intValue4 & 17) != 16, intValue4 & 1)) {
                    composer4.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-148915243, intValue4, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3557)");
                    }
                    o01.a("UI Switching", "Switches between Navigator and Dock without rebooting", null, ComposableLambdaKt.rememberComposableLambda(-922302841, true, new ey0(mutableState7, atomicLong2, sharedPreferences4, unVar4, myVar, kyVar4, this.e), composer4, 54), composer4, 3126, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                MutableState mutableState8 = (MutableState) obj8;
                SharedPreferences sharedPreferences5 = (SharedPreferences) obj7;
                un unVar5 = (un) obj6;
                rw0 rw0Var2 = (rw0) obj5;
                ky kyVar5 = (ky) tyVar;
                MutableState mutableState9 = (MutableState) obj4;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer5.shouldExecute((intValue5 & 17) != 16, intValue5 & 1)) {
                    composer5.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-639867360, intValue5, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:1756)");
                    }
                    o01.a("Protect Persist", "Locks the persist partition to read-only\nBackup is stored at /sdcard", null, ComposableLambdaKt.rememberComposableLambda(-23136814, true, new cy0(mutableState8, sharedPreferences5, unVar5, this.e, rw0Var2, kyVar5, mutableState9), composer5, 54), composer5, 3126, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ qi(MutableState mutableState, SharedPreferences sharedPreferences, un unVar, boolean z, Object obj, ky kyVar, MutableState mutableState2, int i) {
        this.d = i;
        this.f = mutableState;
        this.g = sharedPreferences;
        this.h = unVar;
        this.e = z;
        this.i = obj;
        this.j = kyVar;
        this.k = mutableState2;
    }

    public /* synthetic */ qi(Object obj, Object obj2, Object obj3, Object obj4, ky kyVar, boolean z, Object obj5, int i) {
        this.d = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = kyVar;
        this.e = z;
        this.k = obj5;
    }

    public /* synthetic */ qi(boolean z, String str, Role role, iy iyVar, iy iyVar2, iy iyVar3, String str2) {
        this.d = 0;
        this.e = z;
        this.f = str;
        this.h = role;
        this.g = str2;
        this.i = iyVar;
        this.j = iyVar2;
        this.k = iyVar3;
    }
}
