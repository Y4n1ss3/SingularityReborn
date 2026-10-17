package androidx.compose.material.icons.filled;

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
import defpackage.fc;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CarCrashKt {
    private static ImageVector _carCrash;

    public static final ImageVector getCarCrash(Icons.Filled filled) {
        ImageVector imageVector = _carCrash;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CarCrash", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        b.moveTo(17.91f, 13.0f);
        b.curveToRelative(0.06f, 0.16f, 0.09f, 0.33f, 0.09f, 0.5f);
        b.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        b.reflectiveCurveTo(15.0f, 14.33f, 15.0f, 13.5f);
        b.curveToRelative(0.0f, -0.39f, 0.15f, -0.74f, 0.39f, -1.01f);
        b.curveToRelative(-1.63f, -0.66f, -2.96f, -1.91f, -3.71f, -3.49f);
        fc.z(b, 5.81f, 1.04f, -3.0f, 11.0f);
        b.curveToRelative(0.0f, -0.69f, 0.1f, -1.37f, 0.29f, -2.0f);
        b.horizontalLineTo(6.5f);
        b.curveTo(5.84f, 4.0f, 5.29f, 4.42f, 5.08f, 5.01f);
        b.lineTo(3.0f, 11.0f);
        b.verticalLineToRelative(8.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(1.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        kf0.z(b, -1.0f, 12.0f, 1.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(1.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-6.68f);
        b.curveTo(19.95f, 12.83f, 18.84f, 13.01f, 17.91f, 13.0f);
        b.close();
        b.moveTo(7.5f, 15.0f);
        b.curveTo(6.67f, 15.0f, 6.0f, 14.33f, 6.0f, 13.5f);
        b.reflectiveCurveTo(6.67f, 12.0f, 7.5f, 12.0f);
        b.reflectiveCurveTo(9.0f, 12.67f, 9.0f, 13.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 8.33f, 15.0f, 7.5f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _carCrash = build;
        build.getClass();
        return build;
    }
}
