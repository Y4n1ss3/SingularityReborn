package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClipKt {
    public static final Modifier clip(Modifier modifier, Shape shape) {
        return GraphicsLayerModifierKt.m4926graphicsLayer_6ThJ44$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, shape, true, null, 0L, 0L, 0, 0, null, 518143, null);
    }

    public static final Modifier clipToBounds(Modifier modifier) {
        return GraphicsLayerModifierKt.m4926graphicsLayer_6ThJ44$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, null, 0L, 0L, 0, 0, null, 520191, null);
    }
}
