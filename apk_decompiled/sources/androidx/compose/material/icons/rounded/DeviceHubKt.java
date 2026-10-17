package androidx.compose.material.icons.rounded;

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
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DeviceHubKt {
    private static ImageVector _deviceHub;

    public static final ImageVector getDeviceHub(Icons.Rounded rounded) {
        ImageVector imageVector = _deviceHub;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DeviceHub", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder j = kf0.j(17.0f, 16.0f, -4.0f, -4.0f, 8.82f);
        j.curveToRelative(1.35f, -0.49f, 2.26f, -1.89f, 1.93f, -3.46f);
        j.curveToRelative(-0.25f, -1.18f, -1.23f, -2.12f, -2.42f, -2.32f);
        j.curveTo(10.63f, 2.73f, 9.0f, 4.17f, 9.0f, 6.0f);
        j.curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        j.verticalLineTo(12.0f);
        j.lineToRelative(-4.0f, 4.0f);
        j.horizontalLineTo(4.0f);
        j.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        j.verticalLineToRelative(3.0f);
        j.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        j.horizontalLineToRelative(3.0f);
        j.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        j.verticalLineToRelative(-2.05f);
        j.lineToRelative(4.0f, -4.2f);
        j.lineToRelative(4.0f, 4.2f);
        j.verticalLineTo(20.0f);
        j.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        j.horizontalLineToRelative(3.0f);
        j.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        j.verticalLineToRelative(-3.0f);
        j.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(j, -3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _deviceHub = build;
        build.getClass();
        return build;
    }
}
