package androidx.compose.foundation.selection;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.kl0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectableGroupKt {
    public static final Modifier selectableGroup(Modifier modifier) {
        return SemanticsModifierKt.semantics$default(modifier, false, new kl0(25), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 selectableGroup$lambda$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.selectableGroup(semanticsPropertyReceiver);
        return w01.a;
    }
}
