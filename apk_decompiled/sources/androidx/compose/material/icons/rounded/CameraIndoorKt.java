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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CameraIndoorKt {
    private static ImageVector _cameraIndoor;

    public static final ImageVector getCameraIndoor(Icons.Rounded rounded) {
        ImageVector imageVector = _cameraIndoor;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CameraIndoor", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(10.8f, 3.65f, -6.0f, 4.5f);
        e.curveTo(4.3f, 8.53f, 4.0f, 9.12f, 4.0f, 9.75f);
        e.verticalLineToRelative(9.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(12.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineToRelative(-9.0f);
        e.curveToRelative(0.0f, -0.63f, -0.3f, -1.22f, -0.8f, -1.6f);
        e.lineToRelative(-6.0f, -4.5f);
        e.curveTo(12.49f, 3.12f, 11.51f, 3.12f, 10.8f, 3.65f);
        k4.r(e, 15.27f, 15.67f, 14.0f, 15.0f);
        e.verticalLineToRelative(1.0f);
        e.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        e.horizontalLineTo(9.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.verticalLineToRelative(-4.0f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.horizontalLineToRelative(4.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        e.verticalLineToRelative(1.0f);
        e.lineToRelative(1.27f, -0.67f);
        e.curveTo(15.6f, 12.15f, 16.0f, 12.39f, 16.0f, 12.77f);
        e.verticalLineToRelative(2.46f);
        e.curveTo(16.0f, 15.61f, 15.6f, 15.85f, 15.27f, 15.67f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cameraIndoor = build;
        build.getClass();
        return build;
    }
}
