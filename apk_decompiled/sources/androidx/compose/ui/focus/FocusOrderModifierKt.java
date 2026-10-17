package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import defpackage.er;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusOrderModifierKt {
    @er
    public static final Modifier focusOrder(Modifier modifier, FocusRequester focusRequester, ky kyVar) {
        return FocusPropertiesKt.focusProperties(FocusRequesterModifierKt.focusRequester(modifier, focusRequester), new FocusOrderModifierKt$focusOrder$2(new FocusOrderToProperties(kyVar)));
    }

    @er
    public static final Modifier focusOrder(Modifier modifier, FocusRequester focusRequester) {
        return FocusRequesterModifierKt.focusRequester(modifier, focusRequester);
    }

    @er
    public static final Modifier focusOrder(Modifier modifier, ky kyVar) {
        return FocusPropertiesKt.focusProperties(modifier, new FocusOrderModifierKt$focusOrder$1(new FocusOrderToProperties(kyVar)));
    }
}
