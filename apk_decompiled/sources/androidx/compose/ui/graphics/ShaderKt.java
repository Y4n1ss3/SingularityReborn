package androidx.compose.ui.graphics;

import android.graphics.Shader;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShaderKt {
    /* renamed from: CompositeShader-7EN7VTw, reason: not valid java name */
    public static final Shader m5092CompositeShader7EN7VTw(Shader shader, Shader shader2, int i) {
        return AndroidShader_androidKt.m4658ActualCompositeShader7EN7VTw(shader, shader2, i);
    }

    /* renamed from: ImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m5093ImageShaderF49vj9s(ImageBitmap imageBitmap, int i, int i2) {
        return AndroidShader_androidKt.m4659ActualImageShaderF49vj9s(imageBitmap, i, i2);
    }

    /* renamed from: ImageShader-F49vj9s$default, reason: not valid java name */
    public static /* synthetic */ Shader m5094ImageShaderF49vj9s$default(ImageBitmap imageBitmap, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = TileMode.Companion.m5156getClamp3opZhB0();
        }
        if ((i3 & 4) != 0) {
            i2 = TileMode.Companion.m5156getClamp3opZhB0();
        }
        return m5093ImageShaderF49vj9s(imageBitmap, i, i2);
    }

    /* renamed from: LinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m5095LinearGradientShaderVjE6UOU(long j, long j2, List<Color> list, List<Float> list2, int i) {
        return AndroidShader_androidKt.m4660ActualLinearGradientShaderVjE6UOU(j, j2, list, list2, i);
    }

    /* renamed from: LinearGradientShader-VjE6UOU$default, reason: not valid java name */
    public static /* synthetic */ Shader m5096LinearGradientShaderVjE6UOU$default(long j, long j2, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i2 & 16) != 0) {
            i = TileMode.Companion.m5156getClamp3opZhB0();
        }
        return m5095LinearGradientShaderVjE6UOU(j, j2, list, list3, i);
    }

    /* renamed from: RadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m5097RadialGradientShader8uybcMk(long j, float f, List<Color> list, List<Float> list2, int i) {
        return AndroidShader_androidKt.m4661ActualRadialGradientShader8uybcMk(j, f, list, list2, i);
    }

    /* renamed from: RadialGradientShader-8uybcMk$default, reason: not valid java name */
    public static /* synthetic */ Shader m5098RadialGradientShader8uybcMk$default(long j, float f, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i2 & 16) != 0) {
            i = TileMode.Companion.m5156getClamp3opZhB0();
        }
        return m5097RadialGradientShader8uybcMk(j, f, list, list3, i);
    }

    /* renamed from: SweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m5099SweepGradientShader9KIMszo(long j, List<Color> list, List<Float> list2) {
        return AndroidShader_androidKt.m4662ActualSweepGradientShader9KIMszo(j, list, list2);
    }

    /* renamed from: SweepGradientShader-9KIMszo$default, reason: not valid java name */
    public static /* synthetic */ Shader m5100SweepGradientShader9KIMszo$default(long j, List list, List list2, int i, Object obj) {
        if ((i & 4) != 0) {
            list2 = null;
        }
        return m5099SweepGradientShader9KIMszo(j, list, list2);
    }
}
