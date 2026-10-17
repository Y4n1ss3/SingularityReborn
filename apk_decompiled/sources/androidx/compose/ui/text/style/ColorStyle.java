package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class ColorStyle implements TextForegroundStyle {
    private final long value;

    private ColorStyle(long j) {
        this.value = j;
        if (j != 16) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    /* renamed from: copy-8_81llA$default, reason: not valid java name */
    public static /* synthetic */ ColorStyle m7370copy8_81llA$default(ColorStyle colorStyle, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = colorStyle.value;
        }
        return colorStyle.m7372copy8_81llA(j);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m7371component10d7_KjU() {
        return this.value;
    }

    /* renamed from: copy-8_81llA, reason: not valid java name */
    public final ColorStyle m7372copy8_81llA(long j) {
        return new ColorStyle(j, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorStyle) && Color.m4762equalsimpl0(this.value, ((ColorStyle) obj).value);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public float getAlpha() {
        return Color.m4763getAlphaimpl(mo7369getColor0d7_KjU());
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public Brush getBrush() {
        return null;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    /* renamed from: getColor-0d7_KjU */
    public long mo7369getColor0d7_KjU() {
        return this.value;
    }

    /* renamed from: getValue-0d7_KjU, reason: not valid java name */
    public final long m7373getValue0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.value);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) Color.m4769toStringimpl(this.value)) + ')';
    }

    public /* synthetic */ ColorStyle(long j, dq dqVar) {
        this(j);
    }
}
