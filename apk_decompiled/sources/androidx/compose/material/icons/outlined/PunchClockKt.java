package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PunchClockKt {
    private static ImageVector _punchClock;

    public static final ImageVector getPunchClock(Icons.Outlined outlined) {
        ImageVector imageVector = _punchClock;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PunchClock", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder v = uo.v(19.0f, 6.0f, -1.0f, 1.0f, 6.0f);
        v.verticalLineToRelative(5.0f);
        v.horizontalLineTo(5.0f);
        v.curveTo(3.9f, 6.0f, 3.0f, 6.9f, 3.0f, 8.0f);
        v.verticalLineToRelative(12.0f);
        v.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        v.horizontalLineToRelative(14.0f);
        v.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        v.verticalLineTo(8.0f);
        v.curveTo(21.0f, 6.9f, 20.1f, 6.0f, 19.0f, 6.0f);
        r6.B(v, 8.0f, 3.0f, 8.0f, 3.0f);
        bv.s(v, 8.0f, 3.0f, 19.0f, 20.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kp0.o(v, 5.0f, 8.0f, 14.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 9.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        b.reflectiveCurveTo(14.76f, 9.0f, 12.0f, 9.0f);
        b.close();
        b.moveTo(12.0f, 17.5f);
        b.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        b.reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f);
        b.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 13.93f, 17.5f, 12.0f, 17.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.5f, 11.5f, -1.0f, 0.0f);
        e.lineToRelative(0.0f, 2.71f);
        e.lineToRelative(1.64f, 1.64f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 0.71f, -0.71f, -1.35f, -1.35f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _punchClock = build;
        build.getClass();
        return build;
    }
}
