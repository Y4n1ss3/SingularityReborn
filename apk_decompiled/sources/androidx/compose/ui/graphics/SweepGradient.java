package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.SizeKt;
import defpackage.dq;
import defpackage.q10;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SweepGradient extends ShaderBrush implements Interpolatable {
    public static final int $stable = 0;
    private final long center;
    private final List<Color> colors;
    private final List<Float> stops;

    public /* synthetic */ SweepGradient(long j, List list, List list2, int i, dq dqVar) {
        this(j, list, (i & 4) != 0 ? null : list2, null);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo4730createShaderuvyYCjk(long j) {
        long m4508constructorimpl;
        long j2 = this.center;
        if ((androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask & j2) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            m4508constructorimpl = SizeKt.m4595getCenteruvyYCjk(j);
        } else {
            float intBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j2 >> 32)) == Float.POSITIVE_INFINITY ? j >> 32 : this.center >> 32));
            if (Float.intBitsToFloat((int) (this.center & 4294967295L)) != Float.POSITIVE_INFINITY) {
                j = this.center;
            }
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        }
        return ShaderKt.m5099SweepGradientShader9KIMszo(m4508constructorimpl, this.colors, this.stops);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SweepGradient)) {
            return false;
        }
        SweepGradient sweepGradient = (SweepGradient) obj;
        return Offset.m4513equalsimpl0(this.center, sweepGradient.center) && q10.b(this.colors, sweepGradient.colors) && q10.b(this.stops, sweepGradient.stops);
    }

    /* renamed from: getCenter-F1C5BW0$ui_graphics, reason: not valid java name */
    public final long m5148getCenterF1C5BW0$ui_graphics() {
        return this.center;
    }

    public final List<Color> getColors$ui_graphics() {
        return this.colors;
    }

    public final List<Float> getStops$ui_graphics() {
        return this.stops;
    }

    public int hashCode() {
        int hashCode = (this.colors.hashCode() + (Offset.m4518hashCodeimpl(this.center) * 31)) * 31;
        List<Float> list = this.stops;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // androidx.compose.ui.graphics.Interpolatable
    public Object lerp(Object obj, float f) {
        if (obj == null) {
            obj = new SolidColor(Color.Companion.m4796getTransparent0d7_KjU(), null);
        }
        if (obj instanceof SolidColor) {
            long j = this.center;
            List<Color> list = this.colors;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).m4771unboximpl();
                arrayList.add(Color.m4751boximpl(((SolidColor) obj).m5117getValue0d7_KjU()));
            }
            obj = new SweepGradient(j, arrayList, this.stops, null);
        }
        if (!(obj instanceof SweepGradient)) {
            return null;
        }
        SweepGradient sweepGradient = (SweepGradient) obj;
        return new SweepGradient(OffsetKt.m4539lerpWko1d7g(this.center, sweepGradient.center, f), BrushKt.lerpColorList(this.colors, sweepGradient.colors, f), BrushKt.lerpNullableFloatList(this.stops, sweepGradient.stops, f), null);
    }

    public String toString() {
        String str;
        if ((this.center & androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            str = "center=" + ((Object) Offset.m4524toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.colors + ", stops=" + this.stops + ')';
    }

    private SweepGradient(long j, List<Color> list, List<Float> list2) {
        this.center = j;
        this.colors = list;
        this.stops = list2;
    }

    public /* synthetic */ SweepGradient(long j, List list, List list2, dq dqVar) {
        this(j, list, list2);
    }
}
