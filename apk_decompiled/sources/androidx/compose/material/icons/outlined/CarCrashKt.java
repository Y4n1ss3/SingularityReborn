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
import defpackage.af0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CarCrashKt {
    private static ImageVector _carCrash;

    public static final ImageVector getCarCrash(Icons.Outlined outlined) {
        ImageVector imageVector = _carCrash;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CarCrash", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.0f, 1.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        b.reflectiveCurveTo(20.76f, 1.0f, 18.0f, 1.0f);
        af0.r(b, 18.5f, 7.0f, -1.0f, 3.0f);
        uo.r(b, 1.0f, 7.0f, 18.5f, 8.0f);
        uf.y(b, 1.0f, -1.0f, 8.0f, 18.5f);
        b.moveTo(6.0f, 13.5f);
        b.curveTo(6.0f, 12.67f, 6.67f, 12.0f, 7.5f, 12.0f);
        b.reflectiveCurveTo(9.0f, 12.67f, 9.0f, 13.5f);
        b.reflectiveCurveTo(8.33f, 15.0f, 7.5f, 15.0f);
        b.reflectiveCurveTo(6.0f, 14.33f, 6.0f, 13.5f);
        b.close();
        b.moveTo(19.0f, 12.93f);
        b.curveToRelative(0.65f, -0.09f, 1.34f, -0.28f, 2.0f, -0.6f);
        b.horizontalLineToRelative(0.0f);
        b.verticalLineTo(19.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineToRelative(-1.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        r6.s(b, -1.0f, 6.0f, 1.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineTo(4.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineToRelative(-8.0f);
        b.lineToRelative(2.08f, -5.99f);
        b.curveTo(5.29f, 4.42f, 5.84f, 4.0f, 6.5f, 4.0f);
        b.lineToRelative(4.79f, 0.0f);
        b.curveTo(11.1f, 4.63f, 11.0f, 5.31f, 11.0f, 6.0f);
        b.horizontalLineTo(6.85f);
        b.lineTo(5.81f, 9.0f);
        b.horizontalLineToRelative(5.86f);
        b.verticalLineToRelative(0.0f);
        b.curveToRelative(0.36f, 0.75f, 0.84f, 1.43f, 1.43f, 2.0f);
        af0.m(b, 5.0f, 11.0f, 5.0f, 14.0f);
        uo.l(b, 19.0f, 12.93f, 17.91f, 13.0f);
        b.curveToRelative(-0.89f, -0.01f, -1.74f, -0.19f, -2.53f, -0.51f);
        b.curveTo(15.15f, 12.76f, 15.0f, 13.11f, 15.0f, 13.5f);
        b.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        b.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        b.curveTo(18.0f, 13.32f, 17.97f, 13.16f, 17.91f, 13.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _carCrash = build;
        build.getClass();
        return build;
    }
}
