package androidx.compose.runtime.saveable;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import defpackage.cq;
import defpackage.fb0;
import defpackage.ky;
import defpackage.ms;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SaveableStateRegistryKt {
    private static final ProvidableCompositionLocal<SaveableStateRegistry> LocalSaveableStateRegistry = CompositionLocalKt.staticCompositionLocalOf(new ms(27));

    /* JADX INFO: Access modifiers changed from: private */
    public static final SaveableStateRegistry LocalSaveableStateRegistry$lambda$0() {
        return null;
    }

    public static final SaveableStateRegistry SaveableStateRegistry(Map<String, ? extends List<? extends Object>> map, ky kyVar) {
        return new SaveableStateRegistryImpl(map, kyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fastIsBlank(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!cq.y(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final ProvidableCompositionLocal<SaveableStateRegistry> getLocalSaveableStateRegistry() {
        return LocalSaveableStateRegistry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> fb0 toMutableScatterMap(Map<K, ? extends V> map) {
        fb0 fb0Var = new fb0(map.size());
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            fb0Var.l(entry.getKey(), entry.getValue());
        }
        return fb0Var;
    }
}
