package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import defpackage.k4;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class BrushStyle implements TextForegroundStyle {
    private final float alpha;
    private final ShaderBrush value;

    public BrushStyle(ShaderBrush shaderBrush, float f) {
        this.value = shaderBrush;
        this.alpha = f;
    }

    public static /* synthetic */ BrushStyle copy$default(BrushStyle brushStyle, ShaderBrush shaderBrush, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            shaderBrush = brushStyle.value;
        }
        if ((i & 2) != 0) {
            f = brushStyle.alpha;
        }
        return brushStyle.copy(shaderBrush, f);
    }

    public final ShaderBrush component1() {
        return this.value;
    }

    public final float component2() {
        return this.alpha;
    }

    public final BrushStyle copy(ShaderBrush shaderBrush, float f) {
        return new BrushStyle(shaderBrush, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrushStyle)) {
            return false;
        }
        BrushStyle brushStyle = (BrushStyle) obj;
        return q10.b(this.value, brushStyle.value) && Float.compare(this.alpha, brushStyle.alpha) == 0;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public Brush getBrush() {
        return this.value;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public long mo7369getColor0d7_KjU() {
        return Color.Companion.m4797getUnspecified0d7_KjU();
    }

    public final ShaderBrush getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.hashCode(this.alpha) + (this.value.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.value);
        sb.append(", alpha=");
        return k4.g(sb, this.alpha, ')');
    }
}
