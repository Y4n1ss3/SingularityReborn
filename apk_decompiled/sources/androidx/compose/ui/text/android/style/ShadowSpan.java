package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ShadowSpan extends CharacterStyle {
    public static final int $stable = 8;
    private final int color;
    private final float offsetX;
    private final float offsetY;
    private final float radius;

    public ShadowSpan(int i, float f, float f2, float f3) {
        this.color = i;
        this.offsetX = f;
        this.offsetY = f2;
        this.radius = f3;
    }

    public final int getColor() {
        return this.color;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final float getRadius() {
        return this.radius;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.radius, this.offsetX, this.offsetY, this.color);
    }
}
