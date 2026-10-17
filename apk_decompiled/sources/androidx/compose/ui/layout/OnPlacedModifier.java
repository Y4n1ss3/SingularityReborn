package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface OnPlacedModifier extends Modifier.Element {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(OnPlacedModifier onPlacedModifier, ky kyVar) {
            return OnPlacedModifier.super.all(kyVar);
        }

        @Deprecated
        public static boolean any(OnPlacedModifier onPlacedModifier, ky kyVar) {
            return OnPlacedModifier.super.any(kyVar);
        }

        @Deprecated
        public static <R> R foldIn(OnPlacedModifier onPlacedModifier, R r, my myVar) {
            return (R) OnPlacedModifier.super.foldIn(r, myVar);
        }

        @Deprecated
        public static <R> R foldOut(OnPlacedModifier onPlacedModifier, R r, my myVar) {
            return (R) OnPlacedModifier.super.foldOut(r, myVar);
        }

        @Deprecated
        public static Modifier then(OnPlacedModifier onPlacedModifier, Modifier modifier) {
            return OnPlacedModifier.super.then(modifier);
        }
    }

    void onPlaced(LayoutCoordinates layoutCoordinates);
}
