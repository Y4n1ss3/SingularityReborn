package androidx.compose.ui.unit;

import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface FontScaling {
    float getFontScale();

    /* renamed from: toDp-GaN1DYA */
    default float mo362toDpGaN1DYA(long j) {
        if (!TextUnitType.m7833equalsimpl0(TextUnit.m7804getTypeUIouoOA(j), TextUnitType.Companion.m7838getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.INSTANCE;
        if (!fontScaleConverterFactory.isNonLinearFontScalingActive(getFontScale())) {
            return Dp.m7611constructorimpl(getFontScale() * TextUnit.m7805getValueimpl(j));
        }
        FontScaleConverter forScale = fontScaleConverterFactory.forScale(getFontScale());
        if (forScale != null) {
            return Dp.m7611constructorimpl(forScale.convertSpToDp(TextUnit.m7805getValueimpl(j)));
        }
        return Dp.m7611constructorimpl(getFontScale() * TextUnit.m7805getValueimpl(j));
    }

    /* renamed from: toSp-0xMU5do */
    default long mo369toSp0xMU5do(float f) {
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.INSTANCE;
        if (!fontScaleConverterFactory.isNonLinearFontScalingActive(getFontScale())) {
            return TextUnitKt.getSp(f / getFontScale());
        }
        FontScaleConverter forScale = fontScaleConverterFactory.forScale(getFontScale());
        return TextUnitKt.getSp(forScale != null ? forScale.convertDpToSp(f) : f / getFontScale());
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m7722toDpGaN1DYA(FontScaling fontScaling, long j) {
            return FontScaling.super.mo362toDpGaN1DYA(j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m7723toSp0xMU5do(FontScaling fontScaling, float f) {
            return FontScaling.super.mo369toSp0xMU5do(f);
        }

        public static /* synthetic */ void getFontScale$annotations() {
        }
    }
}
