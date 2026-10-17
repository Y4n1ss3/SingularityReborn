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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CircleNotificationsKt {
    private static ImageVector _circleNotifications;

    public static final ImageVector getCircleNotifications(Icons.Sharp sharp) {
        ImageVector imageVector = _circleNotifications;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CircleNotifications", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        k4.r(b, 12.0f, 18.5f, 12.0f, 18.5f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        kf0.z(b, 0.0f, 3.0f, 0.0f);
        b.curveTo(13.5f, 17.83f, 12.83f, 18.5f, 12.0f, 18.5f);
        uo.q(b, 17.0f, 16.0f, 7.0f, -2.0f);
        b.horizontalLineToRelative(1.0f);
        b.verticalLineToRelative(-3.0f);
        b.curveToRelative(0.0f, -1.86f, 1.28f, -3.41f, 3.0f, -3.86f);
        kf0.r(b, 5.5f, 2.0f, 1.64f);
        b.curveToRelative(1.72f, 0.45f, 3.0f, 2.0f, 3.0f, 3.86f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.f(b, 3.0f, 1.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _circleNotifications = build;
        build.getClass();
        return build;
    }
}
