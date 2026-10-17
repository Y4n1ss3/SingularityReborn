package androidx.compose.runtime.saveable;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import defpackage.cq;
import defpackage.er;
import defpackage.iy;
import defpackage.mb0;
import defpackage.o;
import defpackage.w01;
import defpackage.w5;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RememberSaveableKt {
    private static final int MaxSupportedRadix = 36;

    public static final String generateCannotBeSavedErrorMessage(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(Saver<T, ? extends Object> saver) {
        saver.getClass();
        return SaverKt.Saver(new w5(saver, 9), new mb0(saver, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState mutableStateSaver$lambda$0$0(Saver saver, SaverScope saverScope, MutableState mutableState) {
        if (!(mutableState instanceof SnapshotMutableState)) {
            o.m("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
            return null;
        }
        SnapshotMutableState snapshotMutableState = (SnapshotMutableState) mutableState;
        Object save = saver.save(saverScope, snapshotMutableState.getValue());
        if (save == null) {
            return null;
        }
        SnapshotMutationPolicy policy = snapshotMutableState.getPolicy();
        policy.getClass();
        return SnapshotStateKt.mutableStateOf(save, policy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState mutableStateSaver$lambda$0$1(Saver saver, MutableState mutableState) {
        Object obj = null;
        if (!(mutableState instanceof SnapshotMutableState)) {
            o.m("Failed requirement.");
            return null;
        }
        SnapshotMutableState snapshotMutableState = (SnapshotMutableState) mutableState;
        if (snapshotMutableState.getValue() != 0) {
            T value = snapshotMutableState.getValue();
            value.getClass();
            obj = saver.restore(value);
        }
        SnapshotMutationPolicy policy = snapshotMutableState.getPolicy();
        policy.getClass();
        MutableState mutableStateOf = SnapshotStateKt.mutableStateOf(obj, policy);
        mutableStateOf.getClass();
        return mutableStateOf;
    }

    @er
    /* renamed from: rememberSaveable, reason: collision with other method in class */
    public static final <T> T m4147rememberSaveable(Object[] objArr, Saver<T, ? extends Object> saver, String str, iy iyVar, Composer composer, int i, int i2) {
        Object[] objArr2;
        final T t;
        Object consumeRestored;
        if ((i2 & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        final Saver<T, ? extends Object> saver2 = saver;
        int i3 = i2 & 4;
        Object obj = null;
        if (i3 != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441892779, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:79)");
        }
        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
        if (str == null || str.length() == 0) {
            int i4 = MaxSupportedRadix;
            cq.f(i4);
            str = Long.toString(currentCompositeKeyHashCode, i4);
            str.getClass();
        }
        final String str2 = str;
        saver2.getClass();
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            if (saveableStateRegistry != null && (consumeRestored = saveableStateRegistry.consumeRestored(str2)) != null) {
                obj = saver2.restore(consumeRestored);
            }
            if (obj == null) {
                obj = iyVar.invoke();
            }
            objArr2 = objArr;
            Object saveableHolder = new SaveableHolder(saver2, saveableStateRegistry, str2, obj, objArr2);
            composer.updateRememberedValue(saveableHolder);
            rememberedValue = saveableHolder;
        } else {
            objArr2 = objArr;
        }
        final SaveableHolder saveableHolder2 = (SaveableHolder) rememberedValue;
        Object valueIfInputsDidntChange = saveableHolder2.getValueIfInputsDidntChange(objArr2);
        if (valueIfInputsDidntChange == null) {
            valueIfInputsDidntChange = iyVar.invoke();
        }
        boolean changedInstance = composer.changedInstance(saveableHolder2) | ((((i & 112) ^ 48) > 32 && composer.changedInstance(saver2)) || (i & 48) == 32) | composer.changedInstance(saveableStateRegistry) | composer.changed(str2) | composer.changedInstance(valueIfInputsDidntChange) | composer.changedInstance(objArr2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            final Object[] objArr3 = objArr2;
            t = (T) valueIfInputsDidntChange;
            Object obj2 = new iy() { // from class: androidx.compose.runtime.saveable.a
                @Override // defpackage.iy
                public final Object invoke() {
                    w01 rememberSaveable$lambda$1$0;
                    rememberSaveable$lambda$1$0 = RememberSaveableKt.rememberSaveable$lambda$1$0(SaveableHolder.this, saver2, saveableStateRegistry, str2, t, objArr3);
                    return rememberSaveable$lambda$1$0;
                }
            };
            composer.updateRememberedValue(obj2);
            rememberedValue2 = obj2;
        } else {
            t = (T) valueIfInputsDidntChange;
        }
        EffectsKt.SideEffect((iy) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 rememberSaveable$lambda$1$0(SaveableHolder saveableHolder, Saver saver, SaveableStateRegistry saveableStateRegistry, String str, Object obj, Object[] objArr) {
        saveableHolder.update(saver, saveableStateRegistry, str, obj, objArr);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requireCanBeSaved(SaveableStateRegistry saveableStateRegistry, Object obj) {
        String generateCannotBeSavedErrorMessage;
        if (obj == null || saveableStateRegistry.canBeSaved(obj)) {
            return;
        }
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() == SnapshotStateKt.neverEqualPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.structuralEqualityPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.referentialEqualityPolicy()) {
                generateCannotBeSavedErrorMessage = "MutableState containing " + snapshotMutableState.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                generateCannotBeSavedErrorMessage = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            generateCannotBeSavedErrorMessage = generateCannotBeSavedErrorMessage(obj);
        }
        throw new IllegalArgumentException(generateCannotBeSavedErrorMessage);
    }

    public static final <T> T rememberSaveable(Object[] objArr, iy iyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1564532345, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:135)");
        }
        T t = (T) m4147rememberSaveable(Arrays.copyOf(objArr, objArr.length), SaverKt.autoSaver(), (String) null, iyVar, composer, ((i << 6) & 7168) | 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return t;
    }

    /* renamed from: rememberSaveable, reason: collision with other method in class */
    public static final <T> T m4146rememberSaveable(Object[] objArr, Saver<T, ? extends Object> saver, iy iyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(674689872, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:175)");
        }
        T t = (T) m4147rememberSaveable(Arrays.copyOf(objArr, objArr.length), (Saver) saver, (String) null, iyVar, composer, (i & 112) | 384 | ((i << 3) & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return t;
    }

    public static final <T> MutableState<T> rememberSaveable(Object[] objArr, Saver<T, ? extends Object> saver, iy iyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-746165481, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:203)");
        }
        MutableState<T> mutableState = (MutableState) m4147rememberSaveable(Arrays.copyOf(objArr, objArr.length), mutableStateSaver(saver), (String) null, iyVar, composer, ((i << 3) & 7168) | 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    @er
    public static final <T> MutableState<T> rememberSaveable(Object[] objArr, Saver<T, ? extends Object> saver, String str, iy iyVar, Composer composer, int i, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-202053668, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:243)");
        }
        MutableState<T> mutableState = (MutableState) m4147rememberSaveable(Arrays.copyOf(objArr, objArr.length), mutableStateSaver(saver), str2, iyVar, composer, i & 8064, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}
