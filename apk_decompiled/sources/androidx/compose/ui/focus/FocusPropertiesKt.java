package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusPropertiesKt {
    public static final Modifier focusProperties(Modifier modifier, ky kyVar) {
        return modifier.then(new FocusPropertiesElement(new FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0(kyVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky toUsingEnterExitScope(ky kyVar) {
        return new FocusPropertiesKt$toUsingEnterExitScope$1(kyVar);
    }
}
