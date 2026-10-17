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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsRemoteKt {
    private static ImageVector _settingsRemote;

    public static final ImageVector getSettingsRemote(Icons.Filled filled) {
        ImageVector imageVector = _settingsRemote;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SettingsRemote", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(15.0f, 9.0f, 9.0f, 9.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(6.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        i.lineTo(16.0f, 10.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.close();
        i.moveTo(12.0f, 15.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        i.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        i.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        i.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        k4.x(i, 7.05f, 6.05f, 1.41f, 1.41f);
        i.curveTo(9.37f, 6.56f, 10.62f, 6.0f, 12.0f, 6.0f);
        i.reflectiveCurveToRelative(2.63f, 0.56f, 3.54f, 1.46f);
        i.lineToRelative(1.41f, -1.41f);
        i.curveTo(15.68f, 4.78f, 13.93f, 4.0f, 12.0f, 4.0f);
        i.reflectiveCurveToRelative(-3.68f, 0.78f, -4.95f, 2.05f);
        i.close();
        i.moveTo(12.0f, 0.0f);
        i.curveTo(8.96f, 0.0f, 6.21f, 1.23f, 4.22f, 3.22f);
        i.lineToRelative(1.41f, 1.41f);
        i.curveTo(7.26f, 3.01f, 9.51f, 2.0f, 12.0f, 2.0f);
        i.reflectiveCurveToRelative(4.74f, 1.01f, 6.36f, 2.64f);
        i.lineToRelative(1.41f, -1.41f);
        i.curveTo(17.79f, 1.23f, 15.04f, 0.0f, 12.0f, 0.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsRemote = build;
        build.getClass();
        return build;
    }
}
