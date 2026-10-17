package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldCoreModifierKt {
    private static final float DefaultCursorThickness = Dp.m7611constructorimpl(2.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getCursorRectInScroller(Density density, Rect rect, boolean z, int i) {
        return Rect.copy$default(rect, z ? i - rect.getRight() : rect.getLeft(), 0.0f, (z ? i - rect.getRight() : rect.getLeft()) + density.mo361roundToPx0680j_4(DefaultCursorThickness), 0.0f, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSpecified(Brush brush) {
        return ((brush instanceof SolidColor) && ((SolidColor) brush).m5117getValue0d7_KjU() == 16) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToNext(float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return f;
        }
        return (float) (f > 0.0f ? Math.ceil(f) : Math.floor(f));
    }
}
