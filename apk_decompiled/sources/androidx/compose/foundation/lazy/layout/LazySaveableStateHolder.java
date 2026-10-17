package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.graphics.Fields;
import defpackage.dq;
import defpackage.gb0;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.sl0;
import defpackage.w01;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazySaveableStateHolder implements SaveableStateRegistry, SaveableStateHolder {
    public static final Companion Companion = new Companion(null);
    private final gb0 previouslyComposedKeys;
    private final SaveableStateHolder wrappedHolder;
    private final SaveableStateRegistry wrappedRegistry;

    public LazySaveableStateHolder(SaveableStateRegistry saveableStateRegistry, SaveableStateHolder saveableStateHolder) {
        this.wrappedRegistry = saveableStateRegistry;
        this.wrappedHolder = saveableStateHolder;
        gb0 gb0Var = sl0.a;
        this.previouslyComposedKeys = new gb0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult SaveableStateProvider$lambda$0$0(final LazySaveableStateHolder lazySaveableStateHolder, final Object obj, DisposableEffectScope disposableEffectScope) {
        lazySaveableStateHolder.previouslyComposedKeys.j(obj);
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$lambda$0$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                gb0 gb0Var;
                gb0Var = LazySaveableStateHolder.this.previouslyComposedKeys;
                gb0Var.l(obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SaveableStateProvider$lambda$1(LazySaveableStateHolder lazySaveableStateHolder, Object obj, my myVar, int i, Composer composer, int i2) {
        lazySaveableStateHolder.SaveableStateProvider(obj, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(SaveableStateRegistry saveableStateRegistry, Object obj) {
        if (saveableStateRegistry != null) {
            return saveableStateRegistry.canBeSaved(obj);
        }
        return true;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void SaveableStateProvider(final Object obj, final my myVar, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-858296452);
        int i3 = 2;
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
                ComposerKt.traceEventStart(-858296452, i2, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:74)");
            }
            int i4 = i2 & 14;
            this.wrappedHolder.SaveableStateProvider(obj, myVar, startRestartGroup, i2 & 126);
            boolean changedInstance = startRestartGroup.changedInstance(this) | startRestartGroup.changedInstance(obj);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(i3, this, obj);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EffectsKt.DisposableEffect(obj, (ky) rememberedValue, startRestartGroup, i4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: androidx.compose.foundation.lazy.layout.g
                @Override // defpackage.my
                public final Object invoke(Object obj2, Object obj3) {
                    w01 SaveableStateProvider$lambda$1;
                    int intValue = ((Integer) obj3).intValue();
                    SaveableStateProvider$lambda$1 = LazySaveableStateHolder.SaveableStateProvider$lambda$1(LazySaveableStateHolder.this, obj, myVar, i, (Composer) obj2, intValue);
                    return SaveableStateProvider$lambda$1;
                }
            });
        }
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object obj) {
        return this.wrappedRegistry.canBeSaved(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String str) {
        return this.wrappedRegistry.consumeRestored(str);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Map<String, List<Object>> performSave() {
        gb0 gb0Var = this.previouslyComposedKeys;
        Object[] objArr = gb0Var.b;
        long[] jArr = gb0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.wrappedHolder.removeState(objArr[(i << 3) + i3]);
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
        return this.wrappedRegistry.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(String str, iy iyVar) {
        return this.wrappedRegistry.registerProvider(str, iyVar);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(Object obj) {
        this.wrappedHolder.removeState(obj);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map saver$lambda$0(SaverScope saverScope, LazySaveableStateHolder lazySaveableStateHolder) {
            Map<String, List<Object>> performSave = lazySaveableStateHolder.performSave();
            if (performSave.isEmpty()) {
                return null;
            }
            return performSave;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LazySaveableStateHolder saver$lambda$1(SaveableStateRegistry saveableStateRegistry, SaveableStateHolder saveableStateHolder, Map map) {
            return new LazySaveableStateHolder(saveableStateRegistry, map, saveableStateHolder);
        }

        public final Saver<LazySaveableStateHolder, Map<String, List<Object>>> saver(SaveableStateRegistry saveableStateRegistry, SaveableStateHolder saveableStateHolder) {
            return SaverKt.Saver(new h(), new defpackage.g(25, saveableStateRegistry, saveableStateHolder));
        }

        private Companion() {
        }
    }

    public LazySaveableStateHolder(SaveableStateRegistry saveableStateRegistry, Map<String, ? extends List<? extends Object>> map, SaveableStateHolder saveableStateHolder) {
        this(SaveableStateRegistryKt.SaveableStateRegistry(map, new d(saveableStateRegistry, 2)), saveableStateHolder);
    }
}
