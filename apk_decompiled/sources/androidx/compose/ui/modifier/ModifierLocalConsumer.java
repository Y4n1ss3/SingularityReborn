package androidx.compose.ui.modifier;

import androidx.compose.ui.Modifier;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface ModifierLocalConsumer extends Modifier.Element {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(ModifierLocalConsumer modifierLocalConsumer, ky kyVar) {
            return ModifierLocalConsumer.super.all(kyVar);
        }

        @Deprecated
        public static boolean any(ModifierLocalConsumer modifierLocalConsumer, ky kyVar) {
            return ModifierLocalConsumer.super.any(kyVar);
        }

        @Deprecated
        public static <R> R foldIn(ModifierLocalConsumer modifierLocalConsumer, R r, my myVar) {
            return (R) ModifierLocalConsumer.super.foldIn(r, myVar);
        }

        @Deprecated
        public static <R> R foldOut(ModifierLocalConsumer modifierLocalConsumer, R r, my myVar) {
            return (R) ModifierLocalConsumer.super.foldOut(r, myVar);
        }

        @Deprecated
        public static Modifier then(ModifierLocalConsumer modifierLocalConsumer, Modifier modifier) {
            return ModifierLocalConsumer.super.then(modifier);
        }
    }

    void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope);
}
