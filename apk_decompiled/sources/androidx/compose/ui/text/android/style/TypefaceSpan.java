package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TypefaceSpan extends MetricAffectingSpan {
    public static final int $stable = 8;
    private final Typeface typeface;

    public TypefaceSpan(Typeface typeface) {
        this.typeface = typeface;
    }

    private final void updateTypeface(Paint paint) {
        paint.setTypeface(this.typeface);
    }

    public final Typeface getTypeface() {
        return this.typeface;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        updateTypeface(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        updateTypeface(textPaint);
    }
}
