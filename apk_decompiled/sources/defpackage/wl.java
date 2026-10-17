package defpackage;

import android.content.SharedPreferences;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class wl implements ny {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ wl(un unVar, ky kyVar, rw0 rw0Var, SharedPreferences sharedPreferences, MutableState mutableState, boolean z) {
        this.f = sharedPreferences;
        this.g = unVar;
        this.h = rw0Var;
        this.i = kyVar;
        this.e = z;
        this.j = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w01 item$lambda$0;
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj4 = this.f;
        Object obj5 = this.j;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        switch (i) {
            case 0:
                item$lambda$0 = ContextMenuScope.item$lambda$0((my) obj4, (ContextMenuScope) obj8, (Modifier) obj7, this.e, (ny) obj6, (iy) obj5, (ContextMenuColors) obj, (Composer) obj2, ((Integer) obj3).intValue());
                break;
            case 1:
                SharedPreferences sharedPreferences = (SharedPreferences) obj4;
                un unVar = (un) obj8;
                rw0 rw0Var = (rw0) obj7;
                ky kyVar = (ky) obj6;
                MutableState mutableState = (MutableState) obj5;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1438263444, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3216)");
                    }
                    o01.a("Fix Oculus Link (USB-C)", "Stops Quest Link from accessing libraries while rooted, that it would otherwise not be able to access", null, ComposableLambdaKt.rememberComposableLambda(-1010537442, true, new q70(unVar, kyVar, rw0Var, sharedPreferences, mutableState, this.e), composer, 54), composer, 3126, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 2:
                un unVar2 = (un) obj8;
                my myVar = (my) obj4;
                MutableState mutableState2 = (MutableState) obj7;
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj6;
                ky kyVar2 = (ky) obj5;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(822289223, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3514)");
                    }
                    o01.a("No Controller Requirement", "Disables need for controllers when launching VR Games", null, ComposableLambdaKt.rememberComposableLambda(1250015225, true, new q70(unVar2, myVar, mutableState2, sharedPreferences2, kyVar2, this.e), composer2, 54), composer2, 3126, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                MutableState mutableState3 = (MutableState) obj8;
                MutableState mutableState4 = (MutableState) obj7;
                SharedPreferences sharedPreferences3 = (SharedPreferences) obj6;
                un unVar3 = (un) obj5;
                my myVar2 = (my) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer3.shouldExecute((intValue3 & 17) != 16, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2090839578, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3582)");
                    }
                    o01.a("Void Transition", ((Boolean) mutableState3.getValue()).booleanValue() ? "Switches between Immersive transition and Void Transition\nThis will break the passthrough toggle on Dock UI" : "Switches between Immersive transition and Void Transition", null, ComposableLambdaKt.rememberComposableLambda(-809074100, true, new q70(unVar3, myVar2, sharedPreferences3, mutableState4, mutableState3, this.e), composer3, 54), composer3, 3078, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ wl(un unVar, my myVar, SharedPreferences sharedPreferences, MutableState mutableState, MutableState mutableState2, boolean z) {
        this.g = mutableState;
        this.h = mutableState2;
        this.i = sharedPreferences;
        this.j = unVar;
        this.f = myVar;
        this.e = z;
    }

    public /* synthetic */ wl(un unVar, my myVar, MutableState mutableState, SharedPreferences sharedPreferences, ky kyVar, boolean z) {
        this.g = unVar;
        this.f = myVar;
        this.h = mutableState;
        this.i = sharedPreferences;
        this.j = kyVar;
        this.e = z;
    }

    public /* synthetic */ wl(my myVar, ContextMenuScope contextMenuScope, Modifier modifier, boolean z, ny nyVar, iy iyVar) {
        this.f = myVar;
        this.g = contextMenuScope;
        this.h = modifier;
        this.e = z;
        this.i = nyVar;
        this.j = iyVar;
    }
}
