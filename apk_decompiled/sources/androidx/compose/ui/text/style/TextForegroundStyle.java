package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.style.TextForegroundStyle;
import defpackage.iy;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface TextForegroundStyle {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final TextForegroundStyle from(Brush brush, float f) {
            if (brush == null) {
                return Unspecified.INSTANCE;
            }
            if (brush instanceof SolidColor) {
                return m7516from8_81llA(TextDrawStyleKt.m7515modulateDxMtmZc(((SolidColor) brush).m5117getValue0d7_KjU(), f));
            }
            if (brush instanceof ShaderBrush) {
                return new BrushStyle((ShaderBrush) brush, f);
            }
            o.n();
            return null;
        }

        /* renamed from: from-8_81llA, reason: not valid java name */
        public final TextForegroundStyle m7516from8_81llA(long j) {
            return j != 16 ? new ColorStyle(j, null) : Unspecified.INSTANCE;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Unspecified implements TextForegroundStyle {
        public static final int $stable = 0;
        public static final Unspecified INSTANCE = new Unspecified();

        private Unspecified() {
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public float getAlpha() {
            return Float.NaN;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public Brush getBrush() {
            return null;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        /* renamed from: getColor-0d7_KjU */
        public long mo7369getColor0d7_KjU() {
            return Color.Companion.m4797getUnspecified0d7_KjU();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static float merge$lambda$0(TextForegroundStyle textForegroundStyle) {
        return ((BrushStyle) textForegroundStyle).getAlpha();
    }

    float getAlpha();

    Brush getBrush();

    /* renamed from: getColor-0d7_KjU */
    long mo7369getColor0d7_KjU();

    default TextForegroundStyle merge(TextForegroundStyle textForegroundStyle) {
        float takeOrElse;
        boolean z = textForegroundStyle instanceof BrushStyle;
        if (z && (this instanceof BrushStyle)) {
            BrushStyle brushStyle = (BrushStyle) textForegroundStyle;
            ShaderBrush value = brushStyle.getValue();
            final int i = 0;
            takeOrElse = TextDrawStyleKt.takeOrElse(brushStyle.getAlpha(), new iy(this) { // from class: ku0
                public final /* synthetic */ TextForegroundStyle e;

                {
                    this.e = this;
                }

                @Override // defpackage.iy
                public final Object invoke() {
                    float merge$lambda$0;
                    TextForegroundStyle merge$lambda$1;
                    int i2 = i;
                    TextForegroundStyle textForegroundStyle2 = this.e;
                    switch (i2) {
                        case 0:
                            merge$lambda$0 = TextForegroundStyle.merge$lambda$0(textForegroundStyle2);
                            return Float.valueOf(merge$lambda$0);
                        default:
                            merge$lambda$1 = TextForegroundStyle.merge$lambda$1(textForegroundStyle2);
                            return merge$lambda$1;
                    }
                }
            });
            return new BrushStyle(value, takeOrElse);
        }
        if (z && !(this instanceof BrushStyle)) {
            return textForegroundStyle;
        }
        if (!z && (this instanceof BrushStyle)) {
            return this;
        }
        final int i2 = 1;
        return textForegroundStyle.takeOrElse(new iy(this) { // from class: ku0
            public final /* synthetic */ TextForegroundStyle e;

            {
                this.e = this;
            }

            @Override // defpackage.iy
            public final Object invoke() {
                float merge$lambda$0;
                TextForegroundStyle merge$lambda$1;
                int i22 = i2;
                TextForegroundStyle textForegroundStyle2 = this.e;
                switch (i22) {
                    case 0:
                        merge$lambda$0 = TextForegroundStyle.merge$lambda$0(textForegroundStyle2);
                        return Float.valueOf(merge$lambda$0);
                    default:
                        merge$lambda$1 = TextForegroundStyle.merge$lambda$1(textForegroundStyle2);
                        return merge$lambda$1;
                }
            }
        });
    }

    default TextForegroundStyle takeOrElse(iy iyVar) {
        return !equals(Unspecified.INSTANCE) ? this : (TextForegroundStyle) iyVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static TextForegroundStyle merge$lambda$1(TextForegroundStyle textForegroundStyle) {
        return textForegroundStyle;
    }
}
