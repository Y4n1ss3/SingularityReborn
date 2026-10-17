package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface DrawModifier extends Modifier.Element {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(DrawModifier drawModifier, ky kyVar) {
            return DrawModifier.super.all(kyVar);
        }

        @Deprecated
        public static boolean any(DrawModifier drawModifier, ky kyVar) {
            return DrawModifier.super.any(kyVar);
        }

        @Deprecated
        public static <R> R foldIn(DrawModifier drawModifier, R r, my myVar) {
            return (R) DrawModifier.super.foldIn(r, myVar);
        }

        @Deprecated
        public static <R> R foldOut(DrawModifier drawModifier, R r, my myVar) {
            return (R) DrawModifier.super.foldOut(r, myVar);
        }

        @Deprecated
        public static Modifier then(DrawModifier drawModifier, Modifier modifier) {
            return DrawModifier.super.then(modifier);
        }
    }

    void draw(ContentDrawScope contentDrawScope);
}
