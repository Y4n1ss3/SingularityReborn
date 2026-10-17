package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import defpackage.iy;
import defpackage.ny;
import defpackage.oi;
import defpackage.v4;
import defpackage.vt;
import defpackage.w01;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazySaveableStateHolderKt {
    public static final void LazySaveableStateHolderProvider(ny nyVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-709502251);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(nyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = 1;
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-709502251, i2, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:39)");
            }
            SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) startRestartGroup.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
            SaveableStateHolder rememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(startRestartGroup, 0);
            Object[] objArr = {saveableStateRegistry};
            Saver<LazySaveableStateHolder, Map<String, List<Object>>> saver = LazySaveableStateHolder.Companion.saver(saveableStateRegistry, rememberSaveableStateHolder);
            boolean changedInstance = startRestartGroup.changedInstance(saveableStateRegistry) | startRestartGroup.changedInstance(rememberSaveableStateHolder);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new v4(20, saveableStateRegistry, rememberSaveableStateHolder);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            LazySaveableStateHolder lazySaveableStateHolder = (LazySaveableStateHolder) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) saver, (iy) rememberedValue, startRestartGroup, 0);
            CompositionLocalKt.CompositionLocalProvider(SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(lazySaveableStateHolder), ComposableLambdaKt.rememberComposableLambda(-412824043, true, new c(i4, nyVar, lazySaveableStateHolder), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new oi(nyVar, i, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazySaveableStateHolder LazySaveableStateHolderProvider$lambda$0$0(SaveableStateRegistry saveableStateRegistry, SaveableStateHolder saveableStateHolder) {
        return new LazySaveableStateHolder(saveableStateRegistry, vt.d, saveableStateHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazySaveableStateHolderProvider$lambda$1(ny nyVar, LazySaveableStateHolder lazySaveableStateHolder, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-412824043, i, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
            }
            nyVar.invoke(lazySaveableStateHolder, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazySaveableStateHolderProvider$lambda$2(ny nyVar, int i, Composer composer, int i2) {
        LazySaveableStateHolderProvider(nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }
}
