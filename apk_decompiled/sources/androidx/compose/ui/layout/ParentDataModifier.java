package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface ParentDataModifier extends Modifier.Element {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(ParentDataModifier parentDataModifier, ky kyVar) {
            return ParentDataModifier.super.all(kyVar);
        }

        @Deprecated
        public static boolean any(ParentDataModifier parentDataModifier, ky kyVar) {
            return ParentDataModifier.super.any(kyVar);
        }

        @Deprecated
        public static <R> R foldIn(ParentDataModifier parentDataModifier, R r, my myVar) {
            return (R) ParentDataModifier.super.foldIn(r, myVar);
        }

        @Deprecated
        public static <R> R foldOut(ParentDataModifier parentDataModifier, R r, my myVar) {
            return (R) ParentDataModifier.super.foldOut(r, myVar);
        }

        @Deprecated
        public static Modifier then(ParentDataModifier parentDataModifier, Modifier modifier) {
            return ParentDataModifier.super.then(modifier);
        }
    }

    Object modifyParentData(Density density, Object obj);
}
