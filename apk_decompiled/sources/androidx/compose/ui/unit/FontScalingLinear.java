package androidx.compose.ui.unit;

import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface FontScalingLinear {
    float getFontScale();

    /* renamed from: toDp-GaN1DYA, reason: not valid java name */
    default float m7726toDpGaN1DYA(long j) {
        if (TextUnitType.m7833equalsimpl0(TextUnit.m7804getTypeUIouoOA(j), TextUnitType.Companion.m7838getSpUIouoOA())) {
            return Dp.m7611constructorimpl(getFontScale() * TextUnit.m7805getValueimpl(j));
        }
        o.f("Only Sp can convert to Px");
        return 0.0f;
    }

    /* renamed from: toSp-0xMU5do, reason: not valid java name */
    default long m7727toSp0xMU5do(float f) {
        return TextUnitKt.getSp(f / getFontScale());
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m7728toDpGaN1DYA(FontScalingLinear fontScalingLinear, long j) {
            return FontScalingLinear.super.m7726toDpGaN1DYA(j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m7729toSp0xMU5do(FontScalingLinear fontScalingLinear, float f) {
            return FontScalingLinear.super.m7727toSp0xMU5do(f);
        }

        public static /* synthetic */ void getFontScale$annotations() {
        }
    }
}
