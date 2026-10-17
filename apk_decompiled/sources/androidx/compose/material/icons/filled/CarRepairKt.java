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
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CarRepairKt {
    private static ImageVector _carRepair;

    public static final ImageVector getCarRepair(Icons.Filled filled) {
        ImageVector imageVector = _carRepair;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CarRepair", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.22f, 12.0f);
        b.curveToRelative(0.68f, 0.0f, 1.22f, -0.54f, 1.22f, -1.22f);
        b.curveToRelative(0.0f, -0.67f, -0.54f, -1.22f, -1.22f, -1.22f);
        b.reflectiveCurveTo(15.0f, 10.11f, 15.0f, 10.78f);
        b.curveTo(15.0f, 11.46f, 15.55f, 12.0f, 16.22f, 12.0f);
        b.close();
        b.moveTo(6.56f, 10.78f);
        b.curveToRelative(0.0f, 0.67f, 0.54f, 1.22f, 1.22f, 1.22f);
        b.reflectiveCurveTo(9.0f, 11.46f, 9.0f, 10.78f);
        b.curveToRelative(0.0f, -0.67f, -0.54f, -1.22f, -1.22f, -1.22f);
        b.reflectiveCurveTo(6.56f, 10.11f, 6.56f, 10.78f);
        k4.r(b, 7.61f, 4.0f, 6.28f, 8.0f);
        uf.A(b, 11.43f, -1.33f, -4.0f, 7.61f);
        b.moveTo(16.28f, 3.0f);
        b.curveToRelative(0.0f, 0.0f, 0.54f, 0.01f, 0.92f, 0.54f);
        b.curveToRelative(0.02f, 0.02f, 0.03f, 0.04f, 0.05f, 0.07f);
        b.curveToRelative(0.07f, 0.11f, 0.14f, 0.24f, 0.19f, 0.4f);
        b.curveTo(17.66f, 4.66f, 19.0f, 8.69f, 19.0f, 8.69f);
        b.verticalLineToRelative(6.5f);
        b.curveToRelative(0.0f, 0.45f, -0.35f, 0.81f, -0.78f, 0.81f);
        b.horizontalLineToRelative(-0.44f);
        b.curveTo(17.35f, 16.0f, 17.0f, 15.64f, 17.0f, 15.19f);
        r6.v(b, 14.0f, 7.0f, 1.19f);
        b.curveTo(7.0f, 15.64f, 6.65f, 16.0f, 6.22f, 16.0f);
        b.horizontalLineTo(5.78f);
        b.curveTo(5.35f, 16.0f, 5.0f, 15.64f, 5.0f, 15.19f);
        b.verticalLineToRelative(-6.5f);
        b.curveToRelative(0.0f, 0.0f, 1.34f, -4.02f, 1.55f, -4.69f);
        b.curveToRelative(0.05f, -0.16f, 0.12f, -0.28f, 0.19f, -0.4f);
        b.curveTo(6.77f, 3.58f, 6.78f, 3.56f, 6.8f, 3.54f);
        b.curveTo(7.18f, 3.01f, 7.72f, 3.0f, 7.72f, 3.0f);
        kp0.r(b, 16.28f, 4.0f, 17.01f, 16.0f);
        uf.p(b, 19.0f, -7.0f, 3.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.q(b, -3.0f, 4.0f, 17.01f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _carRepair = build;
        build.getClass();
        return build;
    }
}
