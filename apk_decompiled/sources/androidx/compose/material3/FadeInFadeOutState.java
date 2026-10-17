package androidx.compose.material3;

import androidx.compose.runtime.RecomposeScope;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FadeInFadeOutState<T> {
    private Object current = new Object();
    private List<FadeInFadeOutAnimationItem<T>> items = new ArrayList();
    private RecomposeScope scope;

    public final Object getCurrent() {
        return this.current;
    }

    public final List<FadeInFadeOutAnimationItem<T>> getItems() {
        return this.items;
    }

    public final RecomposeScope getScope() {
        return this.scope;
    }

    public final void setCurrent(Object obj) {
        this.current = obj;
    }

    public final void setItems(List<FadeInFadeOutAnimationItem<T>> list) {
        this.items = list;
    }

    public final void setScope(RecomposeScope recomposeScope) {
        this.scope = recomposeScope;
    }
}
