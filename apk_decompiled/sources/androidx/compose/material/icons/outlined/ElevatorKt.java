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
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ElevatorKt {
    private static ImageVector _elevator;

    public static final ImageVector getElevator(Icons.Outlined outlined) {
        ImageVector imageVector = _elevator;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Elevator", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = kp0.y(19.0f, 5.0f, 14.0f, 5.0f, 5.0f);
        r6.z(y, 19.0f, 19.0f, 3.0f, 5.0f);
        y.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        y.verticalLineToRelative(14.0f);
        y.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        y.horizontalLineToRelative(14.0f);
        y.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        y.verticalLineTo(5.0f);
        y.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        uo.l(y, 19.0f, 3.0f, 10.0f, 18.0f);
        kf0.z(y, -4.0f, 1.0f, -2.5f);
        y.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        y.horizontalLineTo(8.0f);
        y.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        j50.C(y, 14.0f, 1.0f, 4.0f, 10.0f);
        y.moveTo(8.5f, 8.5f);
        y.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        y.reflectiveCurveTo(9.19f, 6.0f, 8.5f, 6.0f);
        y.reflectiveCurveTo(7.25f, 6.56f, 7.25f, 7.25f);
        y.reflectiveCurveTo(7.81f, 8.5f, 8.5f, 8.5f);
        k4.x(y, 18.0f, 11.0f, -2.5f, -4.0f);
        kf0.h(y, 13.0f, 11.0f, 18.0f);
        y.moveTo(13.0f, 13.0f);
        y.lineToRelative(2.5f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.d(y, 2.5f, -4.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _elevator = build;
        build.getClass();
        return build;
    }
}
