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
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChargingStationKt {
    private static ImageVector _chargingStation;

    public static final ImageVector getChargingStation(Icons.Outlined outlined) {
        ImageVector imageVector = _chargingStation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ChargingStation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = kp0.e(14.5f, 11.0f, -3.0f, 6.0f, -4.0f);
        fc.D(e, -2.0f, 3.0f, -6.0f, 4.0f);
        kp0.B(e, 14.5f, 17.0f, 3.0f, 7.0f);
        bv.x(e, 1.0f, 10.0f, 3.0f);
        k4.A(e, 17.0f, 20.0f, 7.0f, 1.0f);
        e.horizontalLineToRelative(10.0f);
        e.verticalLineTo(20.0f);
        e.moveTo(17.0f, 1.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        e.verticalLineToRelative(18.0f);
        e.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        e.horizontalLineTo(7.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        e.verticalLineTo(3.0f);
        e.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        kf0.m(e, 17.0f, 17.0f, 1.0f);
        j50.y(e, 7.0f, 18.0f, 10.0f, 6.0f);
        e.horizontalLineTo(7.0f);
        e.verticalLineTo(18.0f);
        e.lineTo(7.0f, 18.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _chargingStation = build;
        build.getClass();
        return build;
    }
}
