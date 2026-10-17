package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import defpackage.iy;
import defpackage.ms;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SaveableStateHolderKt {
    public static final SaveableStateHolder rememberSaveableStateHolder(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(15454635, i, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:57)");
        }
        composer.startReplaceGroup(1967007413);
        Object[] objArr = new Object[0];
        Saver<SaveableStateHolderImpl, ?> saver = SaveableStateHolderImpl.Companion.getSaver();
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ms(26);
            composer.updateRememberedValue(rememberedValue);
        }
        SaveableStateHolderImpl saveableStateHolderImpl = (SaveableStateHolderImpl) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) saver, (iy) rememberedValue, composer, 384);
        saveableStateHolderImpl.setParentSaveableStateRegistry((SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry()));
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return saveableStateHolderImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final SaveableStateHolderImpl rememberSaveableStateHolder$lambda$0$0() {
        return new SaveableStateHolderImpl(null, 1, 0 == true ? 1 : 0);
    }
}
