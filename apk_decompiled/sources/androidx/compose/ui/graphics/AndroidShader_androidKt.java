package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.ComposeShader;
import android.graphics.Shader;
import defpackage.o;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidShader_androidKt {
    /* renamed from: ActualCompositeShader-7EN7VTw, reason: not valid java name */
    public static final Shader m4658ActualCompositeShader7EN7VTw(Shader shader, Shader shader2, int i) {
        return new ComposeShader(shader, shader2, AndroidBlendMode_androidKt.m4608toAndroidBlendModes9anfk8(i));
    }

    /* renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m4659ActualImageShaderF49vj9s(ImageBitmap imageBitmap, int i, int i2) {
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), AndroidTileMode_androidKt.m4664toAndroidTileMode0vamqd0(i), AndroidTileMode_androidKt.m4664toAndroidTileMode0vamqd0(i2));
    }

    /* renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m4660ActualLinearGradientShaderVjE6UOU(long j, long j2, List<Color> list, List<Float> list2, int i) {
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new android.graphics.LinearGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors), AndroidTileMode_androidKt.m4664toAndroidTileMode0vamqd0(i));
    }

    /* renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m4661ActualRadialGradientShader8uybcMk(long j, float f, List<Color> list, List<Float> list2, int i) {
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new android.graphics.RadialGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors), AndroidTileMode_androidKt.m4664toAndroidTileMode0vamqd0(i));
    }

    /* renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m4662ActualSweepGradientShader9KIMszo(long j, List<Color> list, List<Float> list2) {
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new android.graphics.SweepGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors));
    }

    public static final int countTransparentColors(List<Color> list) {
        return 0;
    }

    public static final int[] makeTransparentColors(List<Color> list, int i) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ColorKt.m4815toArgb8_81llA(list.get(i2).m4771unboximpl());
        }
        return iArr;
    }

    public static final float[] makeTransparentStops(List<Float> list, List<Color> list2, int i) {
        int i2 = 0;
        if (i == 0) {
            if (list == null) {
                return null;
            }
            float[] fArr = new float[list.size()];
            Iterator<Float> it = list.iterator();
            while (it.hasNext()) {
                fArr[i2] = it.next().floatValue();
                i2++;
            }
            return fArr;
        }
        float[] fArr2 = new float[list2.size() + i];
        fArr2[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int size = list2.size() - 1;
        int i3 = 1;
        for (int i4 = 1; i4 < size; i4++) {
            long m4771unboximpl = list2.get(i4).m4771unboximpl();
            float floatValue = list != null ? list.get(i4).floatValue() : i4 / (list2.size() - 1);
            int i5 = i3 + 1;
            fArr2[i3] = floatValue;
            if (Color.m4763getAlphaimpl(m4771unboximpl) == 0.0f) {
                i3 += 2;
                fArr2[i5] = floatValue;
            } else {
                i3 = i5;
            }
        }
        fArr2[i3] = list != null ? list.get(list2.size() - 1).floatValue() : 1.0f;
        return fArr2;
    }

    private static final void validateColorStops(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            o.m("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            o.m("colors and colorStops arguments must have equal length.");
        }
    }
}
