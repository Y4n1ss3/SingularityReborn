package androidx.compose.material3;

import defpackage.ny;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FadeInFadeOutAnimationItem<T> {
    private final T key;
    private final ny transition;

    public FadeInFadeOutAnimationItem(T t, ny nyVar) {
        this.key = t;
        this.transition = nyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FadeInFadeOutAnimationItem copy$default(FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem, Object obj, ny nyVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = fadeInFadeOutAnimationItem.key;
        }
        if ((i & 2) != 0) {
            nyVar = fadeInFadeOutAnimationItem.transition;
        }
        return fadeInFadeOutAnimationItem.copy(obj, nyVar);
    }

    public final T component1() {
        return this.key;
    }

    public final ny component2() {
        return this.transition;
    }

    public final FadeInFadeOutAnimationItem<T> copy(T t, ny nyVar) {
        return new FadeInFadeOutAnimationItem<>(t, nyVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) obj;
        return q10.b(this.key, fadeInFadeOutAnimationItem.key) && q10.b(this.transition, fadeInFadeOutAnimationItem.transition);
    }

    public final T getKey() {
        return this.key;
    }

    public final ny getTransition() {
        return this.transition;
    }

    public int hashCode() {
        T t = this.key;
        return this.transition.hashCode() + ((t == null ? 0 : t.hashCode()) * 31);
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.key + ", transition=" + this.transition + ')';
    }
}
