package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import defpackage.l60;
import defpackage.sn0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectionRegistrarKt {
    private static final ProvidableCompositionLocal<SelectionRegistrar> LocalSelectionRegistrar = CompositionLocalKt.compositionLocalOf$default(null, new sn0(0), 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelectionRegistrar LocalSelectionRegistrar$lambda$0() {
        return null;
    }

    public static final ProvidableCompositionLocal<SelectionRegistrar> getLocalSelectionRegistrar() {
        return LocalSelectionRegistrar;
    }

    public static final boolean hasSelection(SelectionRegistrar selectionRegistrar, long j) {
        l60 subselections;
        if (selectionRegistrar == null || (subselections = selectionRegistrar.getSubselections()) == null) {
            return false;
        }
        return subselections.a(j);
    }
}
