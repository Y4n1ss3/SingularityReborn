package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import defpackage.er;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes.dex */
public interface FocusOrderModifier extends Modifier.Element {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusOrderModifier focusOrderModifier, ky kyVar) {
            return FocusOrderModifier.super.all(kyVar);
        }

        @Deprecated
        public static boolean any(FocusOrderModifier focusOrderModifier, ky kyVar) {
            return FocusOrderModifier.super.any(kyVar);
        }

        @Deprecated
        public static <R> R foldIn(FocusOrderModifier focusOrderModifier, R r, my myVar) {
            return (R) FocusOrderModifier.super.foldIn(r, myVar);
        }

        @Deprecated
        public static <R> R foldOut(FocusOrderModifier focusOrderModifier, R r, my myVar) {
            return (R) FocusOrderModifier.super.foldOut(r, myVar);
        }

        @Deprecated
        public static Modifier then(FocusOrderModifier focusOrderModifier, Modifier modifier) {
            return FocusOrderModifier.super.then(modifier);
        }
    }

    void populateFocusOrder(FocusOrder focusOrder);
}
