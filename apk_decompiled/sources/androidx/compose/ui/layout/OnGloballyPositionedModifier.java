package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface OnGloballyPositionedModifier extends Modifier.Element {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(OnGloballyPositionedModifier onGloballyPositionedModifier, ky kyVar) {
            return OnGloballyPositionedModifier.super.all(kyVar);
        }

        @Deprecated
        public static boolean any(OnGloballyPositionedModifier onGloballyPositionedModifier, ky kyVar) {
            return OnGloballyPositionedModifier.super.any(kyVar);
        }

        @Deprecated
        public static <R> R foldIn(OnGloballyPositionedModifier onGloballyPositionedModifier, R r, my myVar) {
            return (R) OnGloballyPositionedModifier.super.foldIn(r, myVar);
        }

        @Deprecated
        public static <R> R foldOut(OnGloballyPositionedModifier onGloballyPositionedModifier, R r, my myVar) {
            return (R) OnGloballyPositionedModifier.super.foldOut(r, myVar);
        }

        @Deprecated
        public static Modifier then(OnGloballyPositionedModifier onGloballyPositionedModifier, Modifier modifier) {
            return OnGloballyPositionedModifier.super.then(modifier);
        }
    }

    void onGloballyPositioned(LayoutCoordinates layoutCoordinates);
}
