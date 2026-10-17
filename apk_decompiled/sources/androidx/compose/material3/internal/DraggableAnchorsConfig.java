package androidx.compose.material3.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DraggableAnchorsConfig<T> {
    public static final int $stable = 8;
    private final Map<T, Float> anchors = new LinkedHashMap();

    public final void at(T t, float f) {
        this.anchors.put(t, Float.valueOf(f));
    }

    public final Map<T, Float> getAnchors$material3() {
        return this.anchors;
    }
}
