package androidx.compose.material3.internal;

import androidx.compose.material3.internal.BackEventProgress;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Fields;
import defpackage.iy;
import defpackage.my;
import defpackage.nc;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BasicEdgeToEdgeDialogKt {
    public static final void PredictiveBackStateHandler(PredictiveBackState predictiveBackState, boolean z, iy iyVar, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(698755635);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(predictiveBackState) : startRestartGroup.changedInstance(predictiveBackState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(iyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        boolean z2 = true;
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                z = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(698755635, i3, -1, "androidx.compose.material3.internal.PredictiveBackStateHandler (BasicEdgeToEdgeDialog.kt:90)");
            }
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(iyVar, startRestartGroup, (i3 >> 6) & 14);
            startRestartGroup.startMovableGroup(1489276985, predictiveBackState);
            predictiveBackState.getClass();
            boolean z3 = z && !(((PredictiveBackStateImpl) predictiveBackState).getValue() instanceof BackEventProgress.Completed);
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !startRestartGroup.changedInstance(predictiveBackState))) {
                z2 = false;
            }
            boolean changed = startRestartGroup.changed(rememberUpdatedState) | z2;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1(predictiveBackState, rememberUpdatedState, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            BackHandler_androidKt.PredictiveBackHandler(z3, (my) rememberedValue, startRestartGroup, 0, 0);
            startRestartGroup.endMovableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        boolean z4 = z;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new nc(predictiveBackState, z4, iyVar, i, i2, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iy PredictiveBackStateHandler$lambda$1(State<? extends iy> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 PredictiveBackStateHandler$lambda$3(PredictiveBackState predictiveBackState, boolean z, iy iyVar, int i, int i2, Composer composer, int i3) {
        PredictiveBackStateHandler(predictiveBackState, z, iyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    public static final PredictiveBackState rememberPredictiveBackState(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1883443352, i, -1, "androidx.compose.material3.internal.rememberPredictiveBackState (BasicEdgeToEdgeDialog.kt:77)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PredictiveBackStateImpl();
            composer.updateRememberedValue(rememberedValue);
        }
        PredictiveBackStateImpl predictiveBackStateImpl = (PredictiveBackStateImpl) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return predictiveBackStateImpl;
    }
}
