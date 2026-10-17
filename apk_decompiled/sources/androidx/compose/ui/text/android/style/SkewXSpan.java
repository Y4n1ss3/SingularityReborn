package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class SkewXSpan extends MetricAffectingSpan {
    public static final int $stable = 8;
    private final float skewX;

    public SkewXSpan(float f) {
        this.skewX = f;
    }

    public final float getSkewX() {
        return this.skewX;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.skewX);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.skewX);
    }
}
