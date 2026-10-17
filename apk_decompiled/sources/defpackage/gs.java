package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class gs {
    public static final void a(iy iyVar, Composer composer, int i) {
        int i2;
        int i3;
        iyVar.getClass();
        Composer startRestartGroup = composer.startRestartGroup(-1955379537);
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1955379537, i2, -1, "com.lumi.singularity.ui.activities.DomainBlockerScreen (DomainBlockerActivity.kt:51)");
            }
            Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = context.getSharedPreferences("singularity_prefs", 0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SharedPreferences sharedPreferences = (SharedPreferences) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            un unVar = (un) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new SnackbarHostState();
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            SnackbarHostState snackbarHostState = (SnackbarHostState) rememberedValue3;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = Boolean.valueOf(sharedPreferences.getBoolean("is_unlocked_bootloader", false));
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            boolean booleanValue = ((Boolean) rememberedValue4).booleanValue();
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            hm hmVar = null;
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = uo.a(sharedPreferences.getBoolean("root_blocker_is_running", false), null, 2, null, startRestartGroup);
            }
            MutableState mutableState = (MutableState) rememberedValue5;
            boolean changedInstance = startRestartGroup.changedInstance(context) | startRestartGroup.changedInstance(sharedPreferences);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue6 == companion.getEmpty()) {
                o3 o3Var = new o3(sharedPreferences, context, mutableState, hmVar, 6);
                startRestartGroup.updateRememberedValue(o3Var);
                rememberedValue6 = o3Var;
            }
            EffectsKt.LaunchedEffect(w01.a, (my) rememberedValue6, startRestartGroup, 6);
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(527271539, true, new l2(5, iyVar), startRestartGroup, 54);
            ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1389105141, true, new h8(snackbarHostState, i4), startRestartGroup, 54);
            ComposableLambda rememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(2113113982, true, new as(sharedPreferences, unVar, context, mutableState, booleanValue, snackbarHostState), startRestartGroup, 54);
            i3 = 0;
            ScaffoldKt.m2300ScaffoldTvnljyQ(null, rememberComposableLambda, null, rememberComposableLambda2, null, 0, 0L, 0L, null, rememberComposableLambda3, startRestartGroup, 805309488, 501);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i3 = 0;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new bs(i, i3, iyVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean b(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }
}
