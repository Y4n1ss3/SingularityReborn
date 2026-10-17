package androidx.compose.ui.layout;

import androidx.compose.ui.layout.RectRulers;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class RectRulersKt {
    public static final RectRulers RectRulers() {
        return new RectRulersImpl(null);
    }

    public static final RectRulers innermostOf(RectRulers.Companion companion, RectRulers... rectRulersArr) {
        return new InnerRectRulers(rectRulersArr);
    }

    public static final RectRulers outermostOf(RectRulers.Companion companion, RectRulers... rectRulersArr) {
        return new OuterRectRulers(rectRulersArr);
    }

    public static final RectRulers RectRulers(String str) {
        return new RectRulersImpl(str);
    }
}
