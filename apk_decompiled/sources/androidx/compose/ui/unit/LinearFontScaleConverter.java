package androidx.compose.ui.unit;

import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class LinearFontScaleConverter implements FontScaleConverter {
    private final float fontScale;

    public LinearFontScaleConverter(float f) {
        this.fontScale = f;
    }

    private final float component1() {
        return this.fontScale;
    }

    public static /* synthetic */ LinearFontScaleConverter copy$default(LinearFontScaleConverter linearFontScaleConverter, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = linearFontScaleConverter.fontScale;
        }
        return linearFontScaleConverter.copy(f);
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertDpToSp(float f) {
        return f / this.fontScale;
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertSpToDp(float f) {
        return f * this.fontScale;
    }

    public final LinearFontScaleConverter copy(float f) {
        return new LinearFontScaleConverter(f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LinearFontScaleConverter) && Float.compare(this.fontScale, ((LinearFontScaleConverter) obj).fontScale) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.fontScale);
    }

    public String toString() {
        return k4.g(new StringBuilder("LinearFontScaleConverter(fontScale="), this.fontScale, ')');
    }
}
