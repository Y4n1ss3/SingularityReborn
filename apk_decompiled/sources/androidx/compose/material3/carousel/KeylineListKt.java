package androidx.compose.material3.carousel;

import androidx.compose.ui.util.MathHelpersKt;
import defpackage.ky;
import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeylineListKt {
    public static final KeylineList emptyKeylineList() {
        return KeylineList.Companion.getEmpty();
    }

    public static final KeylineList keylineListOf(float f, float f2, int i, float f3, ky kyVar) {
        KeylineListScopeImpl keylineListScopeImpl = new KeylineListScopeImpl();
        kyVar.invoke(keylineListScopeImpl);
        return keylineListScopeImpl.createWithPivot(f, f2, i, f3);
    }

    /* renamed from: keylineListOf-WNYm7Xg, reason: not valid java name */
    public static final KeylineList m2875keylineListOfWNYm7Xg(float f, float f2, int i, ky kyVar) {
        KeylineListScopeImpl keylineListScopeImpl = new KeylineListScopeImpl();
        kyVar.invoke(keylineListScopeImpl);
        return keylineListScopeImpl.m2876createWithAlignmentwaks0t8(f, f2, i);
    }

    public static final Keyline lerp(Keyline keyline, Keyline keyline2, float f) {
        return new Keyline(MathHelpersKt.lerp(keyline.getSize(), keyline2.getSize(), f), MathHelpersKt.lerp(keyline.getOffset(), keyline2.getOffset(), f), MathHelpersKt.lerp(keyline.getUnadjustedOffset(), keyline2.getUnadjustedOffset(), f), f < 0.5f ? keyline.isFocal() : keyline2.isFocal(), f < 0.5f ? keyline.isAnchor() : keyline2.isAnchor(), f < 0.5f ? keyline.isPivot() : keyline2.isPivot(), MathHelpersKt.lerp(keyline.getCutoff(), keyline2.getCutoff(), f));
    }

    public static final KeylineList lerp(KeylineList keylineList, KeylineList keylineList2, float f) {
        ArrayList arrayList = new ArrayList(keylineList.size());
        int size = keylineList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(lerp(keylineList.get(i), keylineList2.get(i), f));
        }
        return new KeylineList(arrayList);
    }
}
