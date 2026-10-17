package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.util.MathHelpersKt;
import defpackage.bv;
import defpackage.dq;
import defpackage.q10;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RadialGradient extends ShaderBrush implements Interpolatable {
    public static final int $stable = 0;
    private final long center;
    private final List<Color> colors;
    private final float radius;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ RadialGradient(List list, List list2, long j, float f, int i, int i2, dq dqVar) {
        this(list, (i2 & 2) != 0 ? null : list2, j, f, (i2 & 16) != 0 ? TileMode.Companion.m5156getClamp3opZhB0() : i, null);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo4730createShaderuvyYCjk(long j) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j2 = this.center;
        if ((androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask & j2) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            long m4595getCenteruvyYCjk = SizeKt.m4595getCenteruvyYCjk(j);
            intBitsToFloat = Float.intBitsToFloat((int) (m4595getCenteruvyYCjk >> 32));
            intBitsToFloat2 = Float.intBitsToFloat((int) (m4595getCenteruvyYCjk & 4294967295L));
        } else {
            intBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j2 >> 32)) == Float.POSITIVE_INFINITY ? j >> 32 : this.center >> 32));
            intBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.center & 4294967295L)) == Float.POSITIVE_INFINITY ? j & 4294967295L : this.center & 4294967295L));
        }
        List<Color> list = this.colors;
        List<Float> list2 = this.stops;
        long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2)));
        float f = this.radius;
        if (f == Float.POSITIVE_INFINITY) {
            f = Size.m4584getMinDimensionimpl(j) / 2.0f;
        }
        return ShaderKt.m5097RadialGradientShader8uybcMk(m4508constructorimpl, f, list, list2, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadialGradient)) {
            return false;
        }
        RadialGradient radialGradient = (RadialGradient) obj;
        return q10.b(this.colors, radialGradient.colors) && q10.b(this.stops, radialGradient.stops) && Offset.m4513equalsimpl0(this.center, radialGradient.center) && this.radius == radialGradient.radius && TileMode.m5152equalsimpl0(this.tileMode, radialGradient.tileMode);
    }

    /* renamed from: getCenter-F1C5BW0$ui_graphics, reason: not valid java name */
    public final long m5083getCenterF1C5BW0$ui_graphics() {
        return this.center;
    }

    public final List<Color> getColors$ui_graphics() {
        return this.colors;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo4707getIntrinsicSizeNHjbRc() {
        if ((Float.floatToRawIntBits(this.radius) & Integer.MAX_VALUE) >= 2139095040) {
            return Size.Companion.m4593getUnspecifiedNHjbRc();
        }
        float f = this.radius;
        return Size.m4576constructorimpl((Float.floatToRawIntBits(f * 2.0f) << 32) | (Float.floatToRawIntBits(f * 2.0f) & 4294967295L));
    }

    public final float getRadius$ui_graphics() {
        return this.radius;
    }

    public final List<Float> getStops$ui_graphics() {
        return this.stops;
    }

    /* renamed from: getTileMode-3opZhB0$ui_graphics, reason: not valid java name */
    public final int m5084getTileMode3opZhB0$ui_graphics() {
        return this.tileMode;
    }

    public int hashCode() {
        int hashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return TileMode.m5153hashCodeimpl(this.tileMode) + bv.a(this.radius, (Offset.m4518hashCodeimpl(this.center) + ((hashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31, 31);
    }

    @Override // androidx.compose.ui.graphics.Interpolatable
    public Object lerp(Object obj, float f) {
        if (obj == null) {
            obj = new SolidColor(Color.Companion.m4796getTransparent0d7_KjU(), null);
        }
        if (obj instanceof SolidColor) {
            List<Color> list = this.colors;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).m4771unboximpl();
                arrayList.add(Color.m4751boximpl(((SolidColor) obj).m5117getValue0d7_KjU()));
            }
            obj = new RadialGradient(arrayList, this.stops, this.center, this.radius, this.tileMode, null);
        }
        if (!(obj instanceof RadialGradient)) {
            return null;
        }
        RadialGradient radialGradient = (RadialGradient) obj;
        List<Color> lerpColorList = BrushKt.lerpColorList(this.colors, radialGradient.colors, f);
        List<Float> lerpNullableFloatList = BrushKt.lerpNullableFloatList(this.stops, radialGradient.stops, f);
        long m4539lerpWko1d7g = OffsetKt.m4539lerpWko1d7g(this.center, radialGradient.center, f);
        float lerp = MathHelpersKt.lerp(this.radius, radialGradient.radius, f);
        if (f >= 0.5f) {
            this = radialGradient;
        }
        return new RadialGradient(lerpColorList, lerpNullableFloatList, m4539lerpWko1d7g, lerp, this.tileMode, null);
    }

    public String toString() {
        String str;
        String str2 = "";
        if ((this.center & androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            str = "center=" + ((Object) Offset.m4524toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        if ((Float.floatToRawIntBits(this.radius) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + this.radius + ", ";
        }
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m5154toStringimpl(this.tileMode)) + ')';
    }

    private RadialGradient(List<Color> list, List<Float> list2, long j, float f, int i) {
        this.colors = list;
        this.stops = list2;
        this.center = j;
        this.radius = f;
        this.tileMode = i;
    }

    public /* synthetic */ RadialGradient(List list, List list2, long j, float f, int i, dq dqVar) {
        this(list, list2, j, f, i);
    }
}
