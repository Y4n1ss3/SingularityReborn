package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AlphaKt {
    public static final Modifier alpha(Modifier modifier, float f) {
        return f == 1.0f ? modifier : GraphicsLayerModifierKt.m4926graphicsLayer_6ThJ44$default(modifier, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, null, 0L, 0L, 0, 0, null, 520187, null);
    }
}
