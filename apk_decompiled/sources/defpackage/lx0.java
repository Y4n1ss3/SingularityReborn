package defpackage;

import android.content.SharedPreferences;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class lx0 implements ny {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ SharedPreferences f;
    public final /* synthetic */ un g;
    public final /* synthetic */ rw0 h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ Object j;

    public /* synthetic */ lx0(un unVar, ky kyVar, rw0 rw0Var, SharedPreferences sharedPreferences, MutableState mutableState, MutableState mutableState2) {
        this.e = mutableState;
        this.f = sharedPreferences;
        this.g = unVar;
        this.h = rw0Var;
        this.j = kyVar;
        this.i = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        Composer composer;
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer2.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2046269406, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2383)");
                    }
                    MutableState mutableState2 = this.e;
                    if (((String) mutableState2.getValue()).length() == 0) {
                        str = "";
                    } else {
                        MutableState mutableState3 = this.i;
                        if (((String) mutableState3.getValue()).length() > 0) {
                            str = ((String) mutableState2.getValue()) + " · " + ((String) mutableState3.getValue());
                        } else {
                            str = (String) mutableState2.getValue();
                        }
                    }
                    o01.a("Charging Status", str, null, ComposableLambdaKt.rememberComposableLambda(-1631967344, true, new q8(mutableState, this.f, this.g, this.h), composer2, 54), composer2, 3078, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                ky kyVar = (ky) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (!composer3.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-942757304, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2442)");
                    }
                    Iterator it = ce.a.iterator();
                    while (it.hasNext()) {
                        int intValue3 = ((Number) it.next()).intValue();
                        PaddingValues m756PaddingValuesYgX7TsA = PaddingKt.m756PaddingValuesYgX7TsA(Dp.m7611constructorimpl(12.0f), Dp.m7611constructorimpl(0.0f));
                        ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(608782432, true, new k40(intValue3, 1), composer3, 54);
                        MutableState mutableState4 = this.e;
                        boolean changed = composer3.changed(mutableState4) | composer3.changed(intValue3);
                        SharedPreferences sharedPreferences = this.f;
                        boolean changedInstance = changed | composer3.changedInstance(sharedPreferences);
                        un unVar = this.g;
                        boolean changedInstance2 = changedInstance | composer3.changedInstance(unVar);
                        rw0 rw0Var = this.h;
                        boolean changedInstance3 = changedInstance2 | composer3.changedInstance(rw0Var) | composer3.changed(kyVar);
                        Object rememberedValue = composer3.rememberedValue();
                        if (changedInstance3 || rememberedValue == Composer.Companion.getEmpty()) {
                            composer = composer3;
                            aq aqVar = new aq(intValue3, sharedPreferences, unVar, mutableState4, this.i, rw0Var, kyVar);
                            composer.updateRememberedValue(aqVar);
                            rememberedValue = aqVar;
                        } else {
                            composer = composer3;
                        }
                        Composer composer4 = composer;
                        AndroidMenu_androidKt.DropdownMenuItem(rememberComposableLambda, (iy) rememberedValue, null, null, null, false, null, m756PaddingValuesYgX7TsA, null, composer4, 12582918, 380);
                        composer3 = composer4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ lx0(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, SharedPreferences sharedPreferences, un unVar, rw0 rw0Var) {
        this.e = mutableState;
        this.i = mutableState2;
        this.j = mutableState3;
        this.f = sharedPreferences;
        this.g = unVar;
        this.h = rw0Var;
    }
}
