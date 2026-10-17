package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LineHeightStyleSpan implements android.text.style.LineHeightSpan {
    public static final int $stable = 8;
    private int ascent;
    private int descent;
    private final int endIndex;
    private int firstAscent;
    private int firstAscentDiff;
    private int lastDescent;
    private int lastDescentDiff;
    private final float lineHeight;
    private final int mode;
    private final int startIndex;
    private final float topRatio;
    private final boolean trimFirstLineTop;
    private final boolean trimLastLineBottom;

    private LineHeightStyleSpan(float f, int i, int i2, boolean z, boolean z2, float f2, int i3) {
        this.lineHeight = f;
        this.startIndex = i;
        this.endIndex = i2;
        this.trimFirstLineTop = z;
        this.trimLastLineBottom = z2;
        this.topRatio = f2;
        this.mode = i3;
        this.firstAscent = Integer.MIN_VALUE;
        this.ascent = Integer.MIN_VALUE;
        this.descent = Integer.MIN_VALUE;
        this.lastDescent = Integer.MIN_VALUE;
        if ((0.0f <= f2 && f2 <= 1.0f) || f2 == -1.0f) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("topRatio should be in [0..1] range or -1");
    }

    private final void calculateTargetMetrics(Paint.FontMetricsInt fontMetricsInt) {
        int ceil = (int) Math.ceil(this.lineHeight);
        int lineHeight = ceil - LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt);
        int i = this.mode;
        LineHeightStyle.Mode.Companion companion = LineHeightStyle.Mode.Companion;
        if (LineHeightStyle.Mode.m7462equalsimpl0(i, companion.m7467getMinimumlzQqcRY()) && lineHeight <= 0) {
            int i2 = fontMetricsInt.ascent;
            this.ascent = i2;
            int i3 = fontMetricsInt.descent;
            this.descent = i3;
            this.firstAscent = i2;
            this.lastDescent = i3;
            this.firstAscentDiff = 0;
            this.lastDescentDiff = 0;
            return;
        }
        float f = this.topRatio;
        if (f == -1.0f) {
            f = Math.abs(fontMetricsInt.ascent) / LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt);
        }
        int ceil2 = fontMetricsInt.descent + ((int) (lineHeight <= 0 ? Math.ceil(lineHeight * f) : Math.ceil((1.0f - f) * lineHeight)));
        this.descent = ceil2;
        this.ascent = ceil2 - ceil;
        if (LineHeightStyle.Mode.m7462equalsimpl0(this.mode, companion.m7466getFixedlzQqcRY()) || lineHeight >= 0) {
            int i4 = this.trimFirstLineTop ? fontMetricsInt.ascent : this.ascent;
            this.firstAscent = i4;
            int i5 = this.trimLastLineBottom ? fontMetricsInt.descent : this.descent;
            this.lastDescent = i5;
            this.firstAscentDiff = fontMetricsInt.ascent - i4;
            this.lastDescentDiff = i5 - fontMetricsInt.descent;
            return;
        }
        if (LineHeightStyle.Mode.m7462equalsimpl0(this.mode, companion.m7468getTightlzQqcRY())) {
            boolean z = this.trimFirstLineTop;
            int i6 = fontMetricsInt.ascent;
            this.firstAscent = z ? Math.max(i6, this.ascent) : Math.min(i6, this.ascent);
            boolean z2 = this.trimLastLineBottom;
            int i7 = fontMetricsInt.descent;
            this.lastDescent = z2 ? Math.min(i7, this.descent) : Math.max(i7, this.descent);
            this.firstAscentDiff = 0;
            this.lastDescentDiff = 0;
        }
    }

    public static /* synthetic */ LineHeightStyleSpan copy$ui_text$default(LineHeightStyleSpan lineHeightStyleSpan, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = lineHeightStyleSpan.trimFirstLineTop;
        }
        return lineHeightStyleSpan.copy$ui_text(i, i2, z);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt) <= 0) {
            return;
        }
        boolean z = i == this.startIndex;
        boolean z2 = i2 == this.endIndex;
        if (z && z2 && this.trimFirstLineTop && this.trimLastLineBottom && !LineHeightStyle.Mode.m7462equalsimpl0(this.mode, LineHeightStyle.Mode.Companion.m7468getTightlzQqcRY())) {
            return;
        }
        if (this.firstAscent == Integer.MIN_VALUE) {
            calculateTargetMetrics(fontMetricsInt);
        }
        fontMetricsInt.ascent = z ? this.firstAscent : this.ascent;
        fontMetricsInt.descent = z2 ? this.lastDescent : this.descent;
    }

    public final LineHeightStyleSpan copy$ui_text(int i, int i2, boolean z) {
        return new LineHeightStyleSpan(this.lineHeight, i, i2, z, this.trimLastLineBottom, this.topRatio, this.mode, null);
    }

    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    /* renamed from: getMode-lzQqcRY, reason: not valid java name */
    public final int m7116getModelzQqcRY() {
        return this.mode;
    }

    public final boolean getTrimFirstLineTop() {
        return this.trimFirstLineTop;
    }

    public final boolean getTrimLastLineBottom() {
        return this.trimLastLineBottom;
    }

    public /* synthetic */ LineHeightStyleSpan(float f, int i, int i2, boolean z, boolean z2, float f2, int i3, dq dqVar) {
        this(f, i, i2, z, z2, f2, i3);
    }
}
