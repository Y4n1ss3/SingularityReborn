package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface PointerInputModifier extends Modifier.Element {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(PointerInputModifier pointerInputModifier, ky kyVar) {
            return PointerInputModifier.super.all(kyVar);
        }

        @Deprecated
        public static boolean any(PointerInputModifier pointerInputModifier, ky kyVar) {
            return PointerInputModifier.super.any(kyVar);
        }

        @Deprecated
        public static <R> R foldIn(PointerInputModifier pointerInputModifier, R r, my myVar) {
            return (R) PointerInputModifier.super.foldIn(r, myVar);
        }

        @Deprecated
        public static <R> R foldOut(PointerInputModifier pointerInputModifier, R r, my myVar) {
            return (R) PointerInputModifier.super.foldOut(r, myVar);
        }

        @Deprecated
        public static Modifier then(PointerInputModifier pointerInputModifier, Modifier modifier) {
            return PointerInputModifier.super.then(modifier);
        }
    }

    PointerInputFilter getPointerInputFilter();
}
