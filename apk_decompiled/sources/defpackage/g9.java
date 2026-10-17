package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class g9 implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ SharedPreferences f;
    public final /* synthetic */ un g;
    public final /* synthetic */ Context h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;

    public /* synthetic */ g9(un unVar, Context context, SharedPreferences sharedPreferences, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.g = unVar;
        this.h = context;
        this.f = sharedPreferences;
        this.e = mutableState;
        this.i = mutableState2;
        this.j = mutableState3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1718324283, intValue, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:1160)");
                    }
                    un unVar = this.g;
                    boolean changedInstance = composer.changedInstance(unVar);
                    Context context = this.h;
                    boolean changedInstance2 = changedInstance | composer.changedInstance(context);
                    SharedPreferences sharedPreferences = this.f;
                    boolean changedInstance3 = changedInstance2 | composer.changedInstance(sharedPreferences);
                    Object rememberedValue = composer.rememberedValue();
                    if (changedInstance3 || rememberedValue == Composer.Companion.getEmpty()) {
                        n9 n9Var = new n9(unVar, context, this.e, this.i, sharedPreferences, this.j, 1);
                        composer.updateRememberedValue(n9Var);
                        rememberedValue = n9Var;
                    }
                    ButtonKt.Button((iy) rememberedValue, null, false, RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, null, null, wk.t, composer, 805306368, 502);
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
                        ComposerKt.traceEventStart(-1437018591, intValue2, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:950)");
                    }
                    MutableState mutableState = this.e;
                    boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    boolean changed = composer2.changed(mutableState);
                    SharedPreferences sharedPreferences2 = this.f;
                    boolean changedInstance4 = changed | composer2.changedInstance(sharedPreferences2);
                    un unVar2 = this.g;
                    boolean changedInstance5 = changedInstance4 | composer2.changedInstance(unVar2);
                    Context context2 = this.h;
                    boolean changedInstance6 = changedInstance5 | composer2.changedInstance(context2);
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (changedInstance6 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        l8 l8Var = new l8(sharedPreferences2, unVar2, mutableState, context2, this.i, this.j);
                        composer2.updateRememberedValue(l8Var);
                        rememberedValue2 = l8Var;
                    }
                    SwitchKt.Switch(booleanValue, (ky) rememberedValue2, null, null, false, null, null, composer2, 0, 124);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ g9(MutableState mutableState, SharedPreferences sharedPreferences, un unVar, Context context, MutableState mutableState2, MutableState mutableState3) {
        this.e = mutableState;
        this.f = sharedPreferences;
        this.g = unVar;
        this.h = context;
        this.i = mutableState2;
        this.j = mutableState3;
    }
}
