package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DrawModifierKt {
    public static final CacheDrawModifierNode CacheDrawModifierNode(ky kyVar) {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), kyVar);
    }

    public static final Modifier drawBehind(Modifier modifier, ky kyVar) {
        return modifier.then(new DrawBehindElement(kyVar));
    }

    public static final Modifier drawWithCache(Modifier modifier, ky kyVar) {
        return modifier.then(new DrawWithCacheElement(kyVar));
    }

    public static final Modifier drawWithContent(Modifier modifier, ky kyVar) {
        return modifier.then(new DrawWithContentElement(kyVar));
    }
}
