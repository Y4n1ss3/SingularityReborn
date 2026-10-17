package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import defpackage.er;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface SemanticsModifier extends Modifier.Element {
    default int getId() {
        return -1;
    }

    SemanticsConfiguration getSemanticsConfiguration();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(SemanticsModifier semanticsModifier, ky kyVar) {
            return SemanticsModifier.super.all(kyVar);
        }

        @Deprecated
        public static boolean any(SemanticsModifier semanticsModifier, ky kyVar) {
            return SemanticsModifier.super.any(kyVar);
        }

        @Deprecated
        public static <R> R foldIn(SemanticsModifier semanticsModifier, R r, my myVar) {
            return (R) SemanticsModifier.super.foldIn(r, myVar);
        }

        @Deprecated
        public static <R> R foldOut(SemanticsModifier semanticsModifier, R r, my myVar) {
            return (R) SemanticsModifier.super.foldOut(r, myVar);
        }

        @Deprecated
        public static int getId(SemanticsModifier semanticsModifier) {
            return SemanticsModifier.super.getId();
        }

        @Deprecated
        public static Modifier then(SemanticsModifier semanticsModifier, Modifier modifier) {
            return SemanticsModifier.super.then(modifier);
        }

        @er
        public static /* synthetic */ void getId$annotations() {
        }
    }
}
