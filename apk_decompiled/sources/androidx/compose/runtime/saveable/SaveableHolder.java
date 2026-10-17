package androidx.compose.runtime.saveable;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import defpackage.iy;
import defpackage.o;
import defpackage.q10;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SaveableHolder<T> implements SaverScope, RememberObserver {
    private SaveableStateRegistry.Entry entry;
    private Object[] inputs;
    private String key;
    private SaveableStateRegistry registry;
    private Saver<T, Object> saver;
    private T value;
    private final iy valueProvider = new iy() { // from class: androidx.compose.runtime.saveable.b
        @Override // defpackage.iy
        public final Object invoke() {
            Object valueProvider$lambda$0;
            valueProvider$lambda$0 = SaveableHolder.valueProvider$lambda$0(SaveableHolder.this);
            return valueProvider$lambda$0;
        }
    };

    public SaveableHolder(Saver<T, Object> saver, SaveableStateRegistry saveableStateRegistry, String str, T t, Object[] objArr) {
        this.saver = saver;
        this.registry = saveableStateRegistry;
        this.key = str;
        this.value = t;
        this.inputs = objArr;
    }

    private final void register() {
        SaveableStateRegistry saveableStateRegistry = this.registry;
        if (this.entry != null) {
            o.h("entry(", this.entry, ") is not null");
        } else if (saveableStateRegistry != null) {
            RememberSaveableKt.requireCanBeSaved(saveableStateRegistry, this.valueProvider.invoke());
            this.entry = saveableStateRegistry.registerProvider(this.key, this.valueProvider);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object valueProvider$lambda$0(SaveableHolder saveableHolder) {
        Saver<T, Object> saver = saveableHolder.saver;
        T t = saveableHolder.value;
        if (t != null) {
            return saver.save(saveableHolder, t);
        }
        o.m("Value should be initialized");
        return null;
    }

    @Override // androidx.compose.runtime.saveable.SaverScope
    public boolean canBeSaved(Object obj) {
        SaveableStateRegistry saveableStateRegistry = this.registry;
        return saveableStateRegistry == null || saveableStateRegistry.canBeSaved(obj);
    }

    public final T getValueIfInputsDidntChange(Object[] objArr) {
        if (Arrays.equals(objArr, this.inputs)) {
            return this.value;
        }
        return null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        SaveableStateRegistry.Entry entry = this.entry;
        if (entry != null) {
            entry.unregister();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        SaveableStateRegistry.Entry entry = this.entry;
        if (entry != null) {
            entry.unregister();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        register();
    }

    public final void update(Saver<T, Object> saver, SaveableStateRegistry saveableStateRegistry, String str, T t, Object[] objArr) {
        boolean z;
        boolean z2 = true;
        if (this.registry != saveableStateRegistry) {
            this.registry = saveableStateRegistry;
            z = true;
        } else {
            z = false;
        }
        if (q10.b(this.key, str)) {
            z2 = z;
        } else {
            this.key = str;
        }
        this.saver = saver;
        this.value = t;
        this.inputs = objArr;
        SaveableStateRegistry.Entry entry = this.entry;
        if (entry == null || !z2) {
            return;
        }
        if (entry != null) {
            entry.unregister();
        }
        this.entry = null;
        register();
    }
}
