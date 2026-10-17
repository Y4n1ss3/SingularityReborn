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
import defpackage.fc;
import defpackage.gy;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StadiumKt {
    private static ImageVector _stadium;

    public static final ImageVector getStadium(Icons.Outlined outlined) {
        ImageVector imageVector = _stadium;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Stadium", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder u = kp0.u(7.0f, 5.0f, 3.0f, 7.0f, 3.0f);
        uo.l(u, 7.0f, 5.0f, 18.0f, 3.0f);
        u.verticalLineToRelative(4.0f);
        gy.B(u, 4.0f, -2.0f, 18.0f, 3.0f);
        u.moveTo(11.0f, 2.0f);
        u.verticalLineToRelative(4.0f);
        gy.B(u, 4.0f, -2.0f, 11.0f, 2.0f);
        u.moveTo(13.0f, 18.0f);
        u.horizontalLineToRelative(-2.0f);
        u.lineToRelative(0.0f, 4.0f);
        u.curveToRelative(-5.05f, -0.15f, -9.0f, -1.44f, -9.0f, -3.0f);
        u.verticalLineToRelative(-9.0f);
        u.curveToRelative(0.0f, -1.66f, 4.48f, -3.0f, 10.0f, -3.0f);
        u.reflectiveCurveToRelative(10.0f, 1.34f, 10.0f, 3.0f);
        u.verticalLineToRelative(9.0f);
        u.curveToRelative(0.0f, 1.56f, -3.95f, 2.85f, -9.0f, 3.0f);
        uo.l(u, 13.0f, 18.0f, 5.0f, 10.04f);
        u.curveTo(6.38f, 10.53f, 8.77f, 11.0f, 12.0f, 11.0f);
        u.reflectiveCurveToRelative(5.62f, -0.47f, 7.0f, -0.96f);
        u.curveTo(19.0f, 9.86f, 16.22f, 9.0f, 12.0f, 9.0f);
        u.reflectiveCurveTo(5.0f, 9.86f, 5.0f, 10.04f);
        u.close();
        u.moveTo(20.0f, 11.8f);
        u.curveToRelative(-1.82f, 0.73f, -4.73f, 1.2f, -8.0f, 1.2f);
        u.reflectiveCurveToRelative(-6.18f, -0.47f, -8.0f, -1.2f);
        u.verticalLineToRelative(6.78f);
        u.curveToRelative(0.61f, 0.41f, 2.36f, 1.01f, 5.0f, 1.28f);
        kf0.r(u, 16.0f, 6.0f, 3.86f);
        u.curveToRelative(2.64f, -0.27f, 4.39f, -0.87f, 5.0f, -1.28f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(u, 11.8f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stadium = build;
        build.getClass();
        return build;
    }
}
