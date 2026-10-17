package androidx.compose.ui.modifier;

import androidx.compose.ui.Modifier;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface ModifierLocalProvider<T> extends Modifier.Element {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> boolean all(ModifierLocalProvider<T> modifierLocalProvider, ky kyVar) {
            return ModifierLocalProvider.super.all(kyVar);
        }

        @Deprecated
        public static <T> boolean any(ModifierLocalProvider<T> modifierLocalProvider, ky kyVar) {
            return ModifierLocalProvider.super.any(kyVar);
        }

        @Deprecated
        public static <T, R> R foldIn(ModifierLocalProvider<T> modifierLocalProvider, R r, my myVar) {
            return (R) ModifierLocalProvider.super.foldIn(r, myVar);
        }

        @Deprecated
        public static <T, R> R foldOut(ModifierLocalProvider<T> modifierLocalProvider, R r, my myVar) {
            return (R) ModifierLocalProvider.super.foldOut(r, myVar);
        }

        @Deprecated
        public static <T> Modifier then(ModifierLocalProvider<T> modifierLocalProvider, Modifier modifier) {
            return ModifierLocalProvider.super.then(modifier);
        }
    }

    ProvidableModifierLocal<T> getKey();

    T getValue();
}
