package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface DrawCacheModifier extends DrawModifier {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(DrawCacheModifier drawCacheModifier, ky kyVar) {
            return DrawCacheModifier.super.all(kyVar);
        }

        @Deprecated
        public static boolean any(DrawCacheModifier drawCacheModifier, ky kyVar) {
            return DrawCacheModifier.super.any(kyVar);
        }

        @Deprecated
        public static <R> R foldIn(DrawCacheModifier drawCacheModifier, R r, my myVar) {
            return (R) DrawCacheModifier.super.foldIn(r, myVar);
        }

        @Deprecated
        public static <R> R foldOut(DrawCacheModifier drawCacheModifier, R r, my myVar) {
            return (R) DrawCacheModifier.super.foldOut(r, myVar);
        }

        @Deprecated
        public static Modifier then(DrawCacheModifier drawCacheModifier, Modifier modifier) {
            return DrawCacheModifier.super.then(modifier);
        }
    }

    void onBuildCache(BuildDrawCacheParams buildDrawCacheParams);
}
