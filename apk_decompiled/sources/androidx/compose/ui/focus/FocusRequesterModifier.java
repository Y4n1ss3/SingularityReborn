package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import defpackage.er;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes.dex */
public interface FocusRequesterModifier extends Modifier.Element {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusRequesterModifier focusRequesterModifier, ky kyVar) {
            return FocusRequesterModifier.super.all(kyVar);
        }

        @Deprecated
        public static boolean any(FocusRequesterModifier focusRequesterModifier, ky kyVar) {
            return FocusRequesterModifier.super.any(kyVar);
        }

        @Deprecated
        public static <R> R foldIn(FocusRequesterModifier focusRequesterModifier, R r, my myVar) {
            return (R) FocusRequesterModifier.super.foldIn(r, myVar);
        }

        @Deprecated
        public static <R> R foldOut(FocusRequesterModifier focusRequesterModifier, R r, my myVar) {
            return (R) FocusRequesterModifier.super.foldOut(r, myVar);
        }

        @Deprecated
        public static Modifier then(FocusRequesterModifier focusRequesterModifier, Modifier modifier) {
            return FocusRequesterModifier.super.then(modifier);
        }
    }

    FocusRequester getFocusRequester();
}
