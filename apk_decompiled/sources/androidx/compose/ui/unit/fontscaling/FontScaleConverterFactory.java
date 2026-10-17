package androidx.compose.ui.unit.fontscaling;

import androidx.compose.ui.unit.InlineClassHelperKt;
import defpackage.cq;
import defpackage.kr0;
import defpackage.p10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FontScaleConverterFactory {
    public static final int $stable;
    private static final float[] CommonFontSizes;
    public static final FontScaleConverterFactory INSTANCE;
    private static final Object[] LookupTablesWriteLock;
    private static final float MinScaleForNonLinear = 1.03f;
    private static final float ScaleKeyMultiplier = 100.0f;
    private static volatile kr0 sLookupTables;

    static {
        FontScaleConverterFactory fontScaleConverterFactory = new FontScaleConverterFactory();
        INSTANCE = fontScaleConverterFactory;
        CommonFontSizes = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier};
        sLookupTables = new kr0();
        Object[] objArr = new Object[0];
        LookupTablesWriteLock = objArr;
        synchronized (objArr) {
            fontScaleConverterFactory.putInto(sLookupTables, 1.15f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, ScaleKeyMultiplier}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.3f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, ScaleKeyMultiplier}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.5f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, ScaleKeyMultiplier}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.8f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, ScaleKeyMultiplier}));
            fontScaleConverterFactory.putInto(sLookupTables, 2.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, ScaleKeyMultiplier}));
        }
        if (fontScaleConverterFactory.getScaleFromKey(sLookupTables.d[0]) - 0.01f <= MinScaleForNonLinear) {
            InlineClassHelperKt.throwIllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
        $stable = 8;
    }

    private FontScaleConverterFactory() {
    }

    private final FontScaleConverter createInterpolatedTableBetween(FontScaleConverter fontScaleConverter, FontScaleConverter fontScaleConverter2, float f) {
        float[] fArr = CommonFontSizes;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            float f2 = CommonFontSizes[i];
            fArr2[i] = MathUtils.INSTANCE.lerp(fontScaleConverter.convertSpToDp(f2), fontScaleConverter2.convertSpToDp(f2), f);
        }
        return new FontScaleConverterTable(CommonFontSizes, fArr2);
    }

    private final FontScaleConverter get(float f) {
        kr0 kr0Var = sLookupTables;
        int key = getKey(f);
        kr0Var.getClass();
        return (FontScaleConverter) cq.h(kr0Var, key);
    }

    private final int getKey(float f) {
        return (int) (f * ScaleKeyMultiplier);
    }

    private final float getScaleFromKey(int i) {
        return i / ScaleKeyMultiplier;
    }

    private final void put(float f, FontScaleConverter fontScaleConverter) {
        synchronized (LookupTablesWriteLock) {
            kr0 clone = sLookupTables.clone();
            INSTANCE.putInto(clone, f, fontScaleConverter);
            sLookupTables = clone;
        }
    }

    private final void putInto(kr0 kr0Var, float f, FontScaleConverter fontScaleConverter) {
        kr0Var.b(getKey(f), fontScaleConverter);
    }

    public final FontScaleConverter forScale(float f) {
        FontScaleConverter fontScaleConverter;
        if (!isNonLinearFontScalingActive(f)) {
            return null;
        }
        FontScaleConverter fontScaleConverter2 = INSTANCE.get(f);
        if (fontScaleConverter2 != null) {
            return fontScaleConverter2;
        }
        kr0 kr0Var = sLookupTables;
        int e = p10.e(kr0Var.d, kr0Var.f, getKey(f));
        if (e >= 0) {
            return (FontScaleConverter) sLookupTables.c(e);
        }
        int i = -(e + 1);
        int i2 = i - 1;
        float f2 = 1.0f;
        if (i >= sLookupTables.f) {
            FontScaleConverterTable fontScaleConverterTable = new FontScaleConverterTable(new float[]{1.0f}, new float[]{f});
            put(f, fontScaleConverterTable);
            return fontScaleConverterTable;
        }
        if (i2 < 0) {
            float[] fArr = CommonFontSizes;
            fontScaleConverter = new FontScaleConverterTable(fArr, fArr);
        } else {
            f2 = getScaleFromKey(sLookupTables.d[i2]);
            fontScaleConverter = (FontScaleConverter) sLookupTables.c(i2);
        }
        FontScaleConverter createInterpolatedTableBetween = createInterpolatedTableBetween(fontScaleConverter, (FontScaleConverter) sLookupTables.c(i), MathUtils.INSTANCE.constrainedMap(0.0f, 1.0f, f2, getScaleFromKey(sLookupTables.d[i]), f));
        put(f, createInterpolatedTableBetween);
        return createInterpolatedTableBetween;
    }

    public final kr0 getSLookupTables() {
        return sLookupTables;
    }

    public final boolean isNonLinearFontScalingActive(float f) {
        return f >= MinScaleForNonLinear;
    }

    public final void setSLookupTables(kr0 kr0Var) {
        sLookupTables = kr0Var;
    }

    public static /* synthetic */ void getSLookupTables$annotations() {
    }
}
