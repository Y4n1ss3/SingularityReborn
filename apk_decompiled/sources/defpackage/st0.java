package defpackage;

import android.app.Activity;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class st0 {
    public static final void a(String str, my myVar, Composer composer, int i, int i2) {
        String str2;
        int i3;
        Composer composer2;
        String str3;
        String str4;
        SnapshotStateList snapshotStateList;
        Composer startRestartGroup = composer.startRestartGroup(164397485);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 6) == 0) {
            str2 = str;
            i3 = (startRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                str4 = i4 != 0 ? "Root Shell" : str2;
            } else {
                startRestartGroup.skipToGroupEnd();
                str4 = str2;
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(164397485, i3, -1, "com.lumi.singularity.ui.activities.TerminalScreen (TerminalActivity.kt:85)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            un unVar = (un) rememberedValue;
            Object consume = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Activity activity = consume instanceof Activity ? (Activity) consume : null;
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) rememberedValue3;
            boolean changedInstance = startRestartGroup.changedInstance(unVar) | startRestartGroup.changedInstance(myVar) | startRestartGroup.changed(rememberLazyListState);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == companion.getEmpty()) {
                snapshotStateList = snapshotStateList2;
                o9 o9Var = new o9(snapshotStateList, unVar, mutableState, myVar, rememberLazyListState);
                startRestartGroup.updateRememberedValue(o9Var);
                rememberedValue4 = o9Var;
            } else {
                snapshotStateList = snapshotStateList2;
            }
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1822867599, true, new m6(str4, activity, snapshotStateList, 6), startRestartGroup, 54);
            ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1102198020, true, new pm(snapshotStateList, rememberLazyListState, (iy) rememberedValue4, mutableState), startRestartGroup, 54);
            composer2 = startRestartGroup;
            str3 = str4;
            ScaffoldKt.m2300ScaffoldTvnljyQ(null, rememberComposableLambda, null, null, null, 0, 0L, 0L, null, rememberComposableLambda2, composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            str3 = str2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new re0(str3, myVar, i, i2));
        }
    }
}
