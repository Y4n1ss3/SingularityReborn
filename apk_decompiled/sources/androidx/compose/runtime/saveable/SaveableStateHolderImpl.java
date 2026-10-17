package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Fields;
import defpackage.dq;
import defpackage.fb0;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.ql0;
import defpackage.w01;
import defpackage.z50;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SaveableStateHolderImpl implements SaveableStateHolder {
    public static final Companion Companion = new Companion(null);
    private static final Saver<SaveableStateHolderImpl, ?> Saver = SaverKt.Saver(new f(), new g());
    private final ky canBeSaved;
    private SaveableStateRegistry parentSaveableStateRegistry;
    private final fb0 registries;
    private final Map<Object, Map<String, List<Object>>> savedStates;

    public SaveableStateHolderImpl(Map<Object, Map<String, List<Object>>> map) {
        this.savedStates = map;
        long[] jArr = ql0.a;
        this.registries = new fb0();
        this.canBeSaved = new ky() { // from class: androidx.compose.runtime.saveable.c
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                boolean canBeSaved$lambda$0;
                canBeSaved$lambda$0 = SaveableStateHolderImpl.canBeSaved$lambda$0(SaveableStateHolderImpl.this, obj);
                return Boolean.valueOf(canBeSaved$lambda$0);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult SaveableStateProvider$lambda$0$1$0(final SaveableStateHolderImpl saveableStateHolderImpl, final Object obj, final SaveableStateRegistryWrapper saveableStateRegistryWrapper, DisposableEffectScope disposableEffectScope) {
        if (saveableStateHolderImpl.registries.a(obj)) {
            o.h("Key ", obj, " was used multiple times ");
            return null;
        }
        saveableStateHolderImpl.savedStates.remove(obj);
        saveableStateHolderImpl.registries.l(obj, saveableStateRegistryWrapper);
        return new DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$lambda$0$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                fb0 fb0Var;
                Map map;
                fb0Var = SaveableStateHolderImpl.this.registries;
                Object j = fb0Var.j(obj);
                SaveableStateRegistryWrapper saveableStateRegistryWrapper2 = saveableStateRegistryWrapper;
                if (j == saveableStateRegistryWrapper2) {
                    SaveableStateHolderImpl saveableStateHolderImpl2 = SaveableStateHolderImpl.this;
                    map = saveableStateHolderImpl2.savedStates;
                    saveableStateHolderImpl2.saveTo(saveableStateRegistryWrapper2, map, obj);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SaveableStateProvider$lambda$1(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, my myVar, int i, Composer composer, int i2) {
        saveableStateHolderImpl.SaveableStateProvider(obj, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map Saver$lambda$0(SaverScope saverScope, SaveableStateHolderImpl saveableStateHolderImpl) {
        return saveableStateHolderImpl.saveAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SaveableStateHolderImpl Saver$lambda$1(Map map) {
        return new SaveableStateHolderImpl(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canBeSaved$lambda$0(SaveableStateHolderImpl saveableStateHolderImpl, Object obj) {
        SaveableStateRegistry saveableStateRegistry = saveableStateHolderImpl.parentSaveableStateRegistry;
        if (saveableStateRegistry != null) {
            return saveableStateRegistry.canBeSaved(obj);
        }
        return true;
    }

    private final Map<Object, Map<String, List<Object>>> saveAll() {
        Map<Object, Map<String, List<Object>>> map = this.savedStates;
        fb0 fb0Var = this.registries;
        Object[] objArr = fb0Var.b;
        Object[] objArr2 = fb0Var.c;
        long[] jArr = fb0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            saveTo((SaveableStateRegistry) objArr2[i4], map, objArr[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveTo(SaveableStateRegistry saveableStateRegistry, Map<Object, Map<String, List<Object>>> map, Object obj) {
        Map<String, List<Object>> performSave = saveableStateRegistry.performSave();
        if (performSave.isEmpty()) {
            map.remove(obj);
        } else {
            map.put(obj, performSave);
        }
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void SaveableStateProvider(final Object obj, final my myVar, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(533563200);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(this) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(533563200, i2, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:70)");
            }
            startRestartGroup.startReusableGroup(ComposerKt.reuseKey, obj);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                if (!((Boolean) this.canBeSaved.invoke(obj)).booleanValue()) {
                    o.h("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                } else {
                    rememberedValue = new SaveableStateRegistryWrapper(SaveableStateRegistryKt.SaveableStateRegistry(this.savedStates.get(obj), this.canBeSaved));
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
            }
            final SaveableStateRegistryWrapper saveableStateRegistryWrapper = (SaveableStateRegistryWrapper) rememberedValue;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(saveableStateRegistryWrapper), z50.a.provides(saveableStateRegistryWrapper)}, myVar, startRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            boolean changedInstance = startRestartGroup.changedInstance(this) | startRestartGroup.changedInstance(obj) | startRestartGroup.changedInstance(saveableStateRegistryWrapper);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new ky() { // from class: androidx.compose.runtime.saveable.d
                    @Override // defpackage.ky
                    public final Object invoke(Object obj2) {
                        DisposableEffectResult SaveableStateProvider$lambda$0$1$0;
                        SaveableStateProvider$lambda$0$1$0 = SaveableStateHolderImpl.SaveableStateProvider$lambda$0$1$0(SaveableStateHolderImpl.this, obj, saveableStateRegistryWrapper, (DisposableEffectScope) obj2);
                        return SaveableStateProvider$lambda$0$1$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            EffectsKt.DisposableEffect(w01.a, (ky) rememberedValue2, startRestartGroup, 6);
            startRestartGroup.endReusableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: androidx.compose.runtime.saveable.e
                @Override // defpackage.my
                public final Object invoke(Object obj2, Object obj3) {
                    w01 SaveableStateProvider$lambda$1;
                    int intValue = ((Integer) obj3).intValue();
                    SaveableStateProvider$lambda$1 = SaveableStateHolderImpl.SaveableStateProvider$lambda$1(SaveableStateHolderImpl.this, obj, myVar, i, (Composer) obj2, intValue);
                    return SaveableStateProvider$lambda$1;
                }
            });
        }
    }

    public final SaveableStateRegistry getParentSaveableStateRegistry() {
        return this.parentSaveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(Object obj) {
        if (this.registries.j(obj) == null) {
            this.savedStates.remove(obj);
        }
    }

    public final void setParentSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry) {
        this.parentSaveableStateRegistry = saveableStateRegistry;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final Saver<SaveableStateHolderImpl, ?> getSaver() {
            return SaveableStateHolderImpl.Saver;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SaveableStateHolderImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ SaveableStateHolderImpl(Map map, int i, dq dqVar) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }
}
