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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DeviceHubKt {
    private static ImageVector _deviceHub;

    public static final ImageVector getDeviceHub(Icons.Sharp sharp) {
        ImageVector imageVector = _deviceHub;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DeviceHub", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder j = kf0.j(17.0f, 16.0f, -4.0f, -4.0f, 8.82f);
        j.curveTo(14.16f, 8.4f, 15.0f, 7.3f, 15.0f, 6.0f);
        j.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        j.reflectiveCurveTo(9.0f, 4.34f, 9.0f, 6.0f);
        j.curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        j.verticalLineTo(12.0f);
        j.lineToRelative(-4.0f, 4.0f);
        j.horizontalLineTo(3.0f);
        kf0.z(j, 5.0f, 5.0f, -3.05f);
        j.lineToRelative(4.0f, -4.2f);
        fc.u(j, 4.0f, 4.2f, 21.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.s(j, -5.0f, -4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _deviceHub = build;
        build.getClass();
        return build;
    }
}
