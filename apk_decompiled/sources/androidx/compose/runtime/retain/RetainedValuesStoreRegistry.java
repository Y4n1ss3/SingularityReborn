package androidx.compose.runtime.retain;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.retain.impl.PreconditionsKt;
import androidx.compose.ui.graphics.Fields;
import defpackage.fb0;
import defpackage.je0;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;
import defpackage.z5;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RetainedValuesStoreRegistry {
    public static final int $stable = 8;
    private final fb0 childStores = new fb0();
    private boolean isDisposed;

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LocalRetainedValuesStoreProvider$lambda$0(RetainedValuesStoreRegistry retainedValuesStoreRegistry, Object obj, my myVar, int i, Composer composer, int i2) {
        retainedValuesStoreRegistry.LocalRetainedValuesStoreProvider(obj, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dispose$lambda$0(Object obj) {
        return true;
    }

    private final RetainedValuesStore getOrCreateRetainedValuesStoreForChild(Object obj) {
        if (this.isDisposed) {
            PreconditionsKt.throwIllegalStateException("Cannot get a RetainedValuesStore after a RetainedValuesStoreRegistry has been disposed.");
        }
        fb0 fb0Var = this.childStores;
        Object d = fb0Var.d(obj);
        if (d == null) {
            d = new ManagedRetainedValuesStore();
            fb0Var.l(obj, d);
        }
        return (RetainedValuesStore) d;
    }

    public final void LocalRetainedValuesStoreProvider(Object obj, my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1626630244);
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
                ComposerKt.traceEventStart(-1626630244, i2, -1, "androidx.compose.runtime.retain.RetainedValuesStoreRegistry.LocalRetainedValuesStoreProvider (RetainedValuesStoreRegistry.kt:70)");
            }
            LocalRetainedValuesStoreKt.LocalRetainedValuesStoreProvider(getOrCreateRetainedValuesStoreForChild(obj), myVar, startRestartGroup, i2 & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new z5(i, 10, this, obj, myVar));
        }
    }

    public final void clearChild(Object obj) {
        ManagedRetainedValuesStore managedRetainedValuesStore = (ManagedRetainedValuesStore) this.childStores.j(obj);
        if (managedRetainedValuesStore != null) {
            managedRetainedValuesStore.dispose();
        }
    }

    public final void clearChildren(ky kyVar) {
        fb0 fb0Var = this.childStores;
        long[] jArr = fb0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = fb0Var.b[i4];
                        ManagedRetainedValuesStore managedRetainedValuesStore = (ManagedRetainedValuesStore) fb0Var.c[i4];
                        Boolean bool = (Boolean) kyVar.invoke(obj);
                        if (bool.booleanValue()) {
                            managedRetainedValuesStore.dispose();
                        }
                        if (bool.booleanValue()) {
                            fb0Var.k(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void dispose() {
        this.isDisposed = true;
        clearChildren(new je0(13));
    }
}
