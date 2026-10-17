package androidx.compose.runtime.saveable;

import android.os.Bundle;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import defpackage.a50;
import defpackage.el0;
import defpackage.fl0;
import defpackage.gl0;
import defpackage.hl0;
import defpackage.i2;
import defpackage.iy;
import defpackage.p10;
import defpackage.xe0;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SaveableStateRegistryWrapper implements SaveableStateRegistry, hl0 {
    public static final int $stable = 8;
    private final /* synthetic */ SaveableStateRegistry $$delegate_0;
    private fl0 _controller;
    private a50 _lifecycle;

    public SaveableStateRegistryWrapper(SaveableStateRegistry saveableStateRegistry) {
        this.$$delegate_0 = saveableStateRegistry;
        Object consumeRestored = consumeRestored("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = consumeRestored instanceof Bundle ? (Bundle) consumeRestored : null;
        if (bundle != null) {
            getOrInitController(bundle);
        }
        registerProvider("androidx.savedstate.SavedStateRegistry", new i2(this, 27));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0(SaveableStateRegistryWrapper saveableStateRegistryWrapper) {
        fl0 fl0Var = saveableStateRegistryWrapper._controller;
        if (fl0Var == null) {
            return null;
        }
        xe0[] xe0VarArr = new xe0[0];
        Bundle g = p10.g((xe0[]) Arrays.copyOf(xe0VarArr, xe0VarArr.length));
        fl0Var.b(g);
        if (g.isEmpty()) {
            return null;
        }
        return g;
    }

    private final fl0 getController() {
        return getOrInitController(null);
    }

    private final fl0 getOrInitController(Bundle bundle) {
        fl0 fl0Var = this._controller;
        if (fl0Var != null) {
            return fl0Var;
        }
        fl0 fl0Var2 = new fl0(new gl0(this, new i2(this, 28)));
        this._controller = fl0Var2;
        fl0Var2.a(bundle);
        return fl0Var2;
    }

    private final a50 getOrInitLifecycle() {
        a50 a50Var = this._lifecycle;
        if (a50Var != null) {
            return a50Var;
        }
        a50 a50Var2 = new a50(this, false);
        this._lifecycle = a50Var2;
        return a50Var2;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object obj) {
        return this.$$delegate_0.canBeSaved(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String str) {
        return this.$$delegate_0.consumeRestored(str);
    }

    @Override // defpackage.hl0
    public el0 getSavedStateRegistry() {
        return getController().b;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Map<String, List<Object>> performSave() {
        return this.$$delegate_0.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(String str, iy iyVar) {
        return this.$$delegate_0.registerProvider(str, iyVar);
    }

    @Override // defpackage.y40
    public a50 getLifecycle() {
        return getOrInitLifecycle();
    }
}
