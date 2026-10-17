package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MoreTimeKt {
    private static ImageVector _moreTime;

    public static final ImageVector getMoreTime(Icons.Sharp sharp) {
        ImageVector imageVector = _moreTime;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MoreTime", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(10.0f, 8.0f, 0.0f, 6.0f);
        e.lineToRelative(4.7f, 2.9f);
        e.lineToRelative(0.8f, -1.2f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -4.0f, -2.4f, 0.0f, -5.3f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.92f, 12.0f);
        b.curveToRelative(0.05f, 0.33f, 0.08f, 0.66f, 0.08f, 1.0f);
        b.curveToRelative(0.0f, 3.9f, -3.1f, 7.0f, -7.0f, 7.0f);
        b.reflectiveCurveToRelative(-7.0f, -3.1f, -7.0f, -7.0f);
        b.curveToRelative(0.0f, -3.9f, 3.1f, -7.0f, 7.0f, -7.0f);
        b.curveToRelative(0.7f, 0.0f, 1.37f, 0.1f, 2.0f, 0.29f);
        b.verticalLineTo(4.23f);
        b.curveTo(12.36f, 4.08f, 11.69f, 4.0f, 11.0f, 4.0f);
        b.curveToRelative(-5.0f, 0.0f, -9.0f, 4.0f, -9.0f, 9.0f);
        b.reflectiveCurveToRelative(4.0f, 9.0f, 9.0f, 9.0f);
        b.reflectiveCurveToRelative(9.0f, -4.0f, 9.0f, -9.0f);
        b.curveToRelative(0.0f, -0.34f, -0.02f, -0.67f, -0.06f, -1.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(b, 17.92f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(20.0f, 5.0f, 0.0f, -3.0f);
        e2.lineToRelative(-2.0f, 0.0f);
        e2.lineToRelative(0.0f, 3.0f);
        e2.lineToRelative(-3.0f, 0.0f);
        e2.lineToRelative(0.0f, 2.0f);
        e2.lineToRelative(3.0f, 0.0f);
        e2.lineToRelative(0.0f, 3.0f);
        e2.lineToRelative(2.0f, 0.0f);
        e2.lineToRelative(0.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e2, 3.0f, 0.0f, 0.0f, -2.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _moreTime = build;
        build.getClass();
        return build;
    }
}
