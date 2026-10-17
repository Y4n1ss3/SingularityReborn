package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.util.MathHelpersKt;
import defpackage.o;
import defpackage.y80;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BrushKt {
    public static final ShaderBrush ShaderBrush(final Shader shader) {
        return new ShaderBrush() { // from class: androidx.compose.ui.graphics.BrushKt$ShaderBrush$1
            @Override // androidx.compose.ui.graphics.ShaderBrush
            /* renamed from: createShader-uvyYCjk, reason: not valid java name */
            public Shader mo4730createShaderuvyYCjk(long j) {
                return shader;
            }
        };
    }

    public static final List<Color> lerpColorList(List<Color> list, List<Color> list2, float f) {
        int max = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(max);
        for (int i = 0; i < max; i++) {
            arrayList.add(Color.m4751boximpl(ColorKt.m4812lerpjxsXWHM(list.get(Math.min(i, list.size() - 1)).m4771unboximpl(), list2.get(Math.min(i, list2.size() - 1)).m4771unboximpl(), f)));
        }
        return arrayList;
    }

    public static final List<Float> lerpFloatList(List<Float> list, List<Float> list2, float f) {
        int max = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(max);
        for (int i = 0; i < max; i++) {
            arrayList.add(Float.valueOf(MathHelpersKt.lerp(list.get(Math.min(i, list.size() - 1)).floatValue(), list2.get(Math.min(i, list2.size() - 1)).floatValue(), f)));
        }
        return arrayList;
    }

    public static final List<Float> lerpNullableFloatList(List<Float> list, List<Float> list2, float f) {
        if (list2 == null || list == null) {
            return null;
        }
        return lerpFloatList(list, list2, f);
    }

    /* renamed from: lerpSafe-Wko1d7g, reason: not valid java name */
    public static final long m4729lerpSafeWko1d7g(long j, long j2, float f) {
        return (((((j & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) ^ androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0 && (((androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase ^ (j2 & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase)) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) ? OffsetKt.m4539lerpWko1d7g(j, j2, f) : f < 0.5f ? j : j2;
    }

    public static final ShaderBrush toShaderBrush(Brush brush) {
        if (brush instanceof ShaderBrush) {
            return (ShaderBrush) brush;
        }
        if (!(brush instanceof SolidColor)) {
            o.n();
            return null;
        }
        SolidColor solidColor = (SolidColor) brush;
        Brush m4716verticalGradient8A3gB4$default = Brush.Companion.m4716verticalGradient8A3gB4$default(Brush.Companion, y80.E(Color.m4751boximpl(solidColor.m5117getValue0d7_KjU()), Color.m4751boximpl(solidColor.m5117getValue0d7_KjU())), 0.0f, 0.0f, 0, 14, (Object) null);
        m4716verticalGradient8A3gB4$default.getClass();
        return (ShaderBrush) m4716verticalGradient8A3gB4$default;
    }
}
