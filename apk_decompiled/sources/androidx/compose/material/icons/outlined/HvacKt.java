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
import defpackage.c21;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HvacKt {
    private static ImageVector _hvac;

    public static final ImageVector getHvac(Icons.Outlined outlined) {
        ImageVector imageVector = _hvac;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Hvac", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(19.0f, 3.0f, 5.0f);
        d.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        c21.d(d, 19.0f, 19.0f, 5.0f, 5.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, 14.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 18.0f);
        b.curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        b.reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f);
        b.reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f);
        b.reflectiveCurveTo(8.69f, 18.0f, 12.0f, 18.0f);
        b.close();
        b.moveTo(15.44f, 10.0f);
        b.curveToRelative(0.26f, 0.45f, 0.44f, 0.96f, 0.51f, 1.5f);
        b.horizontalLineToRelative(-7.9f);
        b.curveToRelative(0.07f, -0.54f, 0.24f, -1.05f, 0.51f, -1.5f);
        k4.w(b, 15.44f, 15.95f, 12.5f);
        b.curveToRelative(-0.07f, 0.54f, -0.24f, 1.05f, -0.51f, 1.5f);
        b.horizontalLineTo(8.56f);
        b.curveToRelative(-0.26f, -0.45f, -0.44f, -0.96f, -0.51f, -1.5f);
        kp0.r(b, 15.95f, 9.38f, 15.0f, 5.24f);
        b.curveToRelative(-0.7f, 0.61f, -1.61f, 1.0f, -2.62f, 1.0f);
        b.reflectiveCurveTo(10.09f, 15.61f, 9.38f, 15.0f);
        r6.g(b, 14.62f, 9.0f, 9.38f);
        b.curveToRelative(0.7f, -0.61f, 1.61f, -1.0f, 2.62f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 13.91f, 8.39f, 14.62f, 9.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hvac = build;
        build.getClass();
        return build;
    }
}
