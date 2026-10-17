package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface OnRemeasuredModifier extends Modifier.Element {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(OnRemeasuredModifier onRemeasuredModifier, ky kyVar) {
            return OnRemeasuredModifier.super.all(kyVar);
        }

        @Deprecated
        public static boolean any(OnRemeasuredModifier onRemeasuredModifier, ky kyVar) {
            return OnRemeasuredModifier.super.any(kyVar);
        }

        @Deprecated
        public static <R> R foldIn(OnRemeasuredModifier onRemeasuredModifier, R r, my myVar) {
            return (R) OnRemeasuredModifier.super.foldIn(r, myVar);
        }

        @Deprecated
        public static <R> R foldOut(OnRemeasuredModifier onRemeasuredModifier, R r, my myVar) {
            return (R) OnRemeasuredModifier.super.foldOut(r, myVar);
        }

        @Deprecated
        public static Modifier then(OnRemeasuredModifier onRemeasuredModifier, Modifier modifier) {
            return OnRemeasuredModifier.super.then(modifier);
        }
    }

    /* renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    void m6292onRemeasuredozmzZPI(long j);
}
