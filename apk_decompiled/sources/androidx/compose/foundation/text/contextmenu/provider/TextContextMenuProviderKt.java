package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import defpackage.sn0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextContextMenuProviderKt {
    private static final ProvidableCompositionLocal<TextContextMenuProvider> LocalTextContextMenuDropdownProvider = CompositionLocalKt.compositionLocalOf$default(null, new sn0(7), 1, null);
    private static final ProvidableCompositionLocal<TextContextMenuProvider> LocalTextContextMenuToolbarProvider = CompositionLocalKt.compositionLocalOf$default(null, new sn0(8), 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextContextMenuProvider LocalTextContextMenuDropdownProvider$lambda$0() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextContextMenuProvider LocalTextContextMenuToolbarProvider$lambda$0() {
        return null;
    }

    public static final ProvidableCompositionLocal<TextContextMenuProvider> getLocalTextContextMenuDropdownProvider() {
        return LocalTextContextMenuDropdownProvider;
    }

    public static final ProvidableCompositionLocal<TextContextMenuProvider> getLocalTextContextMenuToolbarProvider() {
        return LocalTextContextMenuToolbarProvider;
    }
}
