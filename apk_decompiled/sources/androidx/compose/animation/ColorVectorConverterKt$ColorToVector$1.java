package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ColorVectorConverterKt$ColorToVector$1 extends f30 implements ky {
    public static final ColorVectorConverterKt$ColorToVector$1 INSTANCE = new ColorVectorConverterKt$ColorToVector$1();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f30 implements ky {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.ky
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m46invoke8_81llA(((Color) obj).m4771unboximpl());
        }

        /* renamed from: invoke-8_81llA, reason: not valid java name */
        public final AnimationVector4D m46invoke8_81llA(long j) {
            long m4758convertvNxB06k = Color.m4758convertvNxB06k(j, ColorSpaces.INSTANCE.getOklab());
            return new AnimationVector4D(Color.m4763getAlphaimpl(m4758convertvNxB06k), Color.m4767getRedimpl(m4758convertvNxB06k), Color.m4766getGreenimpl(m4758convertvNxB06k), Color.m4764getBlueimpl(m4758convertvNxB06k));
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f30 implements ky {
        final /* synthetic */ ColorSpace $colorSpace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ColorSpace colorSpace) {
            super(1);
            this.$colorSpace = colorSpace;
        }

        @Override // defpackage.ky
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Color.m4751boximpl(m47invokevNxB06k((AnimationVector4D) obj));
        }

        /* renamed from: invoke-vNxB06k, reason: not valid java name */
        public final long m47invokevNxB06k(AnimationVector4D animationVector4D) {
            float v2 = animationVector4D.getV2();
            if (v2 < 0.0f) {
                v2 = 0.0f;
            }
            if (v2 > 1.0f) {
                v2 = 1.0f;
            }
            float v3 = animationVector4D.getV3();
            if (v3 < -0.5f) {
                v3 = -0.5f;
            }
            if (v3 > 0.5f) {
                v3 = 0.5f;
            }
            float v4 = animationVector4D.getV4();
            float f = v4 >= -0.5f ? v4 : -0.5f;
            float f2 = f <= 0.5f ? f : 0.5f;
            float v1 = animationVector4D.getV1();
            float f3 = v1 >= 0.0f ? v1 : 0.0f;
            return Color.m4758convertvNxB06k(ColorKt.Color(v2, v3, f2, f3 <= 1.0f ? f3 : 1.0f, ColorSpaces.INSTANCE.getOklab()), this.$colorSpace);
        }
    }

    public ColorVectorConverterKt$ColorToVector$1() {
        super(1);
    }

    @Override // defpackage.ky
    public final TwoWayConverter<Color, AnimationVector4D> invoke(ColorSpace colorSpace) {
        return VectorConvertersKt.TwoWayConverter(AnonymousClass1.INSTANCE, new AnonymousClass2(colorSpace));
    }
}
