package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import defpackage.dq;
import defpackage.q10;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LinearGradient extends ShaderBrush implements Interpolatable {
    public static final int $stable = 0;
    private final List<Color> colors;
    private final long end;
    private final long start;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ LinearGradient(List list, List list2, long j, long j2, int i, int i2, dq dqVar) {
        this(list, (i2 & 2) != 0 ? null : list2, j, j2, (i2 & 16) != 0 ? TileMode.Companion.m5156getClamp3opZhB0() : i, null);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo4730createShaderuvyYCjk(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.start >> 32)) == Float.POSITIVE_INFINITY ? j >> 32 : this.start >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.start & 4294967295L)) == Float.POSITIVE_INFINITY ? j & 4294967295L : this.start & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.end >> 32)) == Float.POSITIVE_INFINITY ? j >> 32 : this.end >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.end & 4294967295L)) == Float.POSITIVE_INFINITY ? j & 4294967295L : this.end & 4294967295L));
        return ShaderKt.m5095LinearGradientShaderVjE6UOU(Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L)), Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32)), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) obj;
        return q10.b(this.colors, linearGradient.colors) && q10.b(this.stops, linearGradient.stops) && Offset.m4513equalsimpl0(this.start, linearGradient.start) && Offset.m4513equalsimpl0(this.end, linearGradient.end) && TileMode.m5152equalsimpl0(this.tileMode, linearGradient.tileMode);
    }

    public final List<Color> getColors$ui_graphics() {
        return this.colors;
    }

    /* renamed from: getEnd-F1C5BW0$ui_graphics, reason: not valid java name */
    public final long m5000getEndF1C5BW0$ui_graphics() {
        return this.end;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo4707getIntrinsicSizeNHjbRc() {
        float f = Float.NaN;
        float abs = (Math.abs(Float.intBitsToFloat((int) (this.start >> 32))) > Float.MAX_VALUE || Math.abs(Float.intBitsToFloat((int) (this.end >> 32))) > Float.MAX_VALUE) ? Float.NaN : Math.abs(Float.intBitsToFloat((int) (this.start >> 32)) - Float.intBitsToFloat((int) (this.end >> 32)));
        if (Math.abs(Float.intBitsToFloat((int) (this.start & 4294967295L))) <= Float.MAX_VALUE && Math.abs(Float.intBitsToFloat((int) (this.end & 4294967295L))) <= Float.MAX_VALUE) {
            f = Math.abs(Float.intBitsToFloat((int) (this.start & 4294967295L)) - Float.intBitsToFloat((int) (this.end & 4294967295L)));
        }
        return Size.m4576constructorimpl((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    /* renamed from: getStart-F1C5BW0$ui_graphics, reason: not valid java name */
    public final long m5001getStartF1C5BW0$ui_graphics() {
        return this.start;
    }

    public final List<Float> getStops$ui_graphics() {
        return this.stops;
    }

    /* renamed from: getTileMode-3opZhB0$ui_graphics, reason: not valid java name */
    public final int m5002getTileMode3opZhB0$ui_graphics() {
        return this.tileMode;
    }

    public int hashCode() {
        int hashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return TileMode.m5153hashCodeimpl(this.tileMode) + ((Offset.m4518hashCodeimpl(this.end) + ((Offset.m4518hashCodeimpl(this.start) + ((hashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31)) * 31);
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
            obj = new LinearGradient(arrayList, this.stops, this.start, this.end, this.tileMode, null);
        }
        if (!(obj instanceof LinearGradient)) {
            return null;
        }
        LinearGradient linearGradient = (LinearGradient) obj;
        List<Color> lerpColorList = BrushKt.lerpColorList(this.colors, linearGradient.colors, f);
        List<Float> lerpNullableFloatList = BrushKt.lerpNullableFloatList(this.stops, linearGradient.stops, f);
        long m4729lerpSafeWko1d7g = BrushKt.m4729lerpSafeWko1d7g(this.start, linearGradient.start, f);
        long m4729lerpSafeWko1d7g2 = BrushKt.m4729lerpSafeWko1d7g(this.end, linearGradient.end, f);
        if (f >= 0.5f) {
            this = linearGradient;
        }
        return new LinearGradient(lerpColorList, lerpNullableFloatList, m4729lerpSafeWko1d7g, m4729lerpSafeWko1d7g2, this.tileMode, null);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (((((this.start & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) ^ androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) Offset.m4524toStringimpl(this.start)) + ", ";
        } else {
            str = "";
        }
        if ((((androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase ^ (this.end & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase)) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) Offset.m4524toStringimpl(this.end)) + ", ";
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m5154toStringimpl(this.tileMode)) + ')';
    }

    private LinearGradient(List<Color> list, List<Float> list2, long j, long j2, int i) {
        this.colors = list;
        this.stops = list2;
        this.start = j;
        this.end = j2;
        this.tileMode = i;
    }

    public /* synthetic */ LinearGradient(List list, List list2, long j, long j2, int i, dq dqVar) {
        this(list, list2, j, j2, i);
    }
}
