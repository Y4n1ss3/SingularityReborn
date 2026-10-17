package androidx.compose.material3.internal;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Icons {
    public static final int $stable = 0;
    public static final Icons INSTANCE = new Icons();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class AutoMirrored {
        public static final int $stable = 0;
        public static final AutoMirrored INSTANCE = new AutoMirrored();

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Filled {
            private static ImageVector _keyboardArrowLeft;
            private static ImageVector _keyboardArrowRight;
            public static final Filled INSTANCE = new Filled();
            public static final int $stable = 8;

            private Filled() {
            }

            public final ImageVector getKeyboardArrowLeft$material3() {
                ImageVector imageVector = _keyboardArrowLeft;
                if (imageVector != null) {
                    imageVector.getClass();
                    return imageVector;
                }
                ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.KeyboardArrowLeft", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
                int defaultFillType = VectorKt.getDefaultFillType();
                SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
                int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
                int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
                PathBuilder i = af0.i(15.41f, 16.59f, 10.83f, 12.0f);
                i.lineToRelative(4.58f, -4.59f);
                i.lineTo(14.0f, 6.0f);
                i.lineToRelative(-6.0f, 6.0f);
                ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(i, 6.0f, 6.0f, 1.41f, -1.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
                _keyboardArrowLeft = build;
                build.getClass();
                return build;
            }

            public final ImageVector getKeyboardArrowRight$material3() {
                ImageVector imageVector = _keyboardArrowRight;
                if (imageVector != null) {
                    imageVector.getClass();
                    return imageVector;
                }
                ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.KeyboardArrowRight", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
                int defaultFillType = VectorKt.getDefaultFillType();
                SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
                int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
                int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
                PathBuilder i = af0.i(8.59f, 16.59f, 13.17f, 12.0f);
                i.lineTo(8.59f, 7.41f);
                i.lineTo(10.0f, 6.0f);
                i.lineToRelative(6.0f, 6.0f);
                ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(i, -6.0f, 6.0f, -1.41f, -1.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
                _keyboardArrowRight = build;
                build.getClass();
                return build;
            }
        }

        private AutoMirrored() {
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Filled {
        private static ImageVector _arrowDropDown;
        private static ImageVector _check;
        private static ImageVector _close;
        private static ImageVector _dateRange;
        private static ImageVector _edit;
        public static final Filled INSTANCE = new Filled();
        public static final int $stable = 8;

        private Filled() {
        }

        public final ImageVector getArrowDropDown$material3() {
            ImageVector imageVector = _arrowDropDown;
            if (imageVector != null) {
                imageVector.getClass();
                return imageVector;
            }
            ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(new ImageVector.Builder("Filled.ArrowDropDown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null), uf.g(k4.e(7.0f, 10.0f, 5.0f, 5.0f), 5.0f, -5.0f), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, StrokeCap.Companion.m5135getButtKaPHkGw(), StrokeJoin.Companion.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
            _arrowDropDown = build;
            build.getClass();
            return build;
        }

        public final ImageVector getCheck$material3() {
            ImageVector imageVector = _check;
            if (imageVector != null) {
                imageVector.getClass();
                return imageVector;
            }
            ImageVector.Builder builder = new ImageVector.Builder("Filled.Check", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = VectorKt.getDefaultFillType();
            SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
            int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
            int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
            PathBuilder i = af0.i(9.0f, 16.17f, 4.83f, 12.0f);
            i.lineToRelative(-1.42f, 1.41f);
            i.lineTo(9.0f, 19.0f);
            ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(i, 21.0f, 7.0f, -1.41f, -1.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
            _check = build;
            build.getClass();
            return build;
        }

        public final ImageVector getClose$material3() {
            ImageVector imageVector = _close;
            if (imageVector != null) {
                imageVector.getClass();
                return imageVector;
            }
            ImageVector.Builder builder = new ImageVector.Builder("Filled.Close", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = VectorKt.getDefaultFillType();
            SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
            int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
            int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
            PathBuilder i = af0.i(19.0f, 6.41f, 17.59f, 5.0f);
            i.lineTo(12.0f, 10.59f);
            i.lineTo(6.41f, 5.0f);
            i.lineTo(5.0f, 6.41f);
            i.lineTo(10.59f, 12.0f);
            i.lineTo(5.0f, 17.59f);
            i.lineTo(6.41f, 19.0f);
            i.lineTo(12.0f, 13.41f);
            i.lineTo(17.59f, 19.0f);
            ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 19.0f, 17.59f, 13.41f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
            _close = build;
            build.getClass();
            return build;
        }

        public final ImageVector getDateRange$material3() {
            ImageVector imageVector = _dateRange;
            if (imageVector != null) {
                imageVector.getClass();
                return imageVector;
            }
            ImageVector.Builder builder = new ImageVector.Builder("Filled.DateRange", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = VectorKt.getDefaultFillType();
            SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
            int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
            int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
            PathBuilder s = uo.s(9.0f, 11.0f, 7.0f, 11.0f, 2.0f);
            fc.x(s, 2.0f, -2.0f, 13.0f, 11.0f);
            gy.D(s, -2.0f, 2.0f, 2.0f, -2.0f);
            k4.C(s, 17.0f, 11.0f, -2.0f, 2.0f);
            fc.x(s, 2.0f, -2.0f, 19.0f, 4.0f);
            uo.n(s, -1.0f, 18.0f, 2.0f, -2.0f);
            s.verticalLineToRelative(2.0f);
            s.lineTo(8.0f, 4.0f);
            s.lineTo(8.0f, 2.0f);
            s.lineTo(6.0f, 2.0f);
            s.verticalLineToRelative(2.0f);
            s.lineTo(5.0f, 4.0f);
            s.curveToRelative(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
            s.lineTo(3.0f, 20.0f);
            s.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
            s.horizontalLineToRelative(14.0f);
            s.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            s.lineTo(21.0f, 6.0f);
            s.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            k4.r(s, 19.0f, 20.0f, 5.0f, 20.0f);
            ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(s, 5.0f, 9.0f, 14.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
            _dateRange = build;
            build.getClass();
            return build;
        }

        public final ImageVector getEdit$material3() {
            ImageVector imageVector = _edit;
            if (imageVector != null) {
                imageVector.getClass();
                return imageVector;
            }
            ImageVector.Builder builder = new ImageVector.Builder("Filled.Edit", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = VectorKt.getDefaultFillType();
            SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
            int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
            int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
            PathBuilder c = fc.c(3.0f, 17.25f, 21.0f, 3.75f);
            c.lineTo(17.81f, 9.94f);
            gy.B(c, -3.75f, -3.75f, 3.0f, 17.25f);
            c.moveTo(20.71f, 7.04f);
            c.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
            c.lineToRelative(-2.34f, -2.34f);
            c.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
            c.lineToRelative(-1.83f, 1.83f);
            ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(c, 3.75f, 3.75f, 1.83f, -1.83f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
            _edit = build;
            build.getClass();
            return build;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Outlined {
        private static ImageVector _keyboard;
        private static ImageVector _schedule;
        public static final Outlined INSTANCE = new Outlined();
        public static final int $stable = 8;

        private Outlined() {
        }

        public final ImageVector getKeyboard() {
            ImageVector imageVector = _keyboard;
            if (imageVector != null) {
                imageVector.getClass();
                return imageVector;
            }
            ImageVector.Builder builder = new ImageVector.Builder("Outlined.Keyboard", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = VectorKt.getDefaultFillType();
            SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
            int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
            int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
            PathBuilder y = gy.y(20.0f, 7.0f, 10.0f, 4.0f, 17.0f);
            y.lineTo(4.0f, 7.0f);
            y.horizontalLineToRelative(16.0f);
            y.moveToRelative(0.0f, -2.0f);
            y.lineTo(4.0f, 5.0f);
            y.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
            y.lineTo(2.0f, 17.0f);
            y.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            y.horizontalLineToRelative(16.0f);
            y.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            y.lineTo(22.0f, 7.0f);
            y.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            r6.B(y, 11.0f, 8.0f, 2.0f, 2.0f);
            kp0.A(y, -2.0f, 11.0f, 11.0f, 2.0f);
            kf0.C(y, 2.0f, -2.0f, 8.0f, 8.0f);
            j50.o(y, 2.0f, 2.0f, 8.0f, 10.0f);
            k4.C(y, 8.0f, 11.0f, 2.0f, 2.0f);
            uo.l(y, 8.0f, 13.0f, 5.0f, 11.0f);
            j50.o(y, 2.0f, 2.0f, 5.0f, 13.0f);
            k4.C(y, 5.0f, 8.0f, 2.0f, 2.0f);
            uo.l(y, 5.0f, 10.0f, 8.0f, 14.0f);
            j50.o(y, 8.0f, 2.0f, 8.0f, 16.0f);
            k4.C(y, 14.0f, 11.0f, 2.0f, 2.0f);
            kp0.A(y, -2.0f, 14.0f, 8.0f, 2.0f);
            kf0.C(y, 2.0f, -2.0f, 17.0f, 11.0f);
            j50.n(y, 2.0f, 2.0f, -2.0f);
            k4.C(y, 17.0f, 8.0f, 2.0f, 2.0f);
            ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(y, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
            _keyboard = build;
            build.getClass();
            return build;
        }

        public final ImageVector getSchedule() {
            ImageVector imageVector = _schedule;
            if (imageVector != null) {
                imageVector.getClass();
                return imageVector;
            }
            ImageVector.Builder builder = new ImageVector.Builder("Outlined.Schedule", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = VectorKt.getDefaultFillType();
            SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
            int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
            int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
            PathBuilder b = uf.b(11.99f, 2.0f);
            b.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
            b.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
            b.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
            b.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
            b.close();
            b.moveTo(12.0f, 20.0f);
            b.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
            b.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
            b.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
            b.reflectiveCurveToRelative(-3.58f, 8.0f, -8.0f, 8.0f);
            k4.r(b, 12.5f, 7.0f, 11.0f, 7.0f);
            b.verticalLineToRelative(6.0f);
            b.lineToRelative(5.25f, 3.15f);
            ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, 0.75f, -1.23f, -4.5f, -2.67f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
            _schedule = build;
            build.getClass();
            return build;
        }
    }

    private Icons() {
    }
}
