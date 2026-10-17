package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import defpackage.er;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes.dex */
public interface FocusEventModifier extends Modifier.Element {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusEventModifier focusEventModifier, ky kyVar) {
            return FocusEventModifier.super.all(kyVar);
        }

        @Deprecated
        public static boolean any(FocusEventModifier focusEventModifier, ky kyVar) {
            return FocusEventModifier.super.any(kyVar);
        }

        @Deprecated
        public static <R> R foldIn(FocusEventModifier focusEventModifier, R r, my myVar) {
            return (R) FocusEventModifier.super.foldIn(r, myVar);
        }

        @Deprecated
        public static <R> R foldOut(FocusEventModifier focusEventModifier, R r, my myVar) {
            return (R) FocusEventModifier.super.foldOut(r, myVar);
        }

        @Deprecated
        public static Modifier then(FocusEventModifier focusEventModifier, Modifier modifier) {
            return FocusEventModifier.super.then(modifier);
        }
    }

    void onFocusEvent(FocusState focusState);
}
