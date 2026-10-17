package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import defpackage.sn0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextSelectionColorsKt {
    private static final long DefaultSelectionColor;
    private static final TextSelectionColors DefaultTextSelectionColors;
    private static final ProvidableCompositionLocal<TextSelectionColors> LocalTextSelectionColors = CompositionLocalKt.compositionLocalOf$default(null, new sn0(13), 1, null);

    static {
        long Color = ColorKt.Color(4282550004L);
        DefaultSelectionColor = Color;
        DefaultTextSelectionColors = new TextSelectionColors(Color, Color.m4760copywmQWz5c$default(Color, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    public static final ProvidableCompositionLocal<TextSelectionColors> getLocalTextSelectionColors() {
        return LocalTextSelectionColors;
    }

    private static /* synthetic */ void getDefaultTextSelectionColors$annotations() {
    }
}
