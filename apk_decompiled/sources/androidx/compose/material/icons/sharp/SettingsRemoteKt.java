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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsRemoteKt {
    private static ImageVector _settingsRemote;

    public static final ImageVector getSettingsRemote(Icons.Sharp sharp) {
        ImageVector imageVector = _settingsRemote;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SettingsRemote", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(16.0f, 9.0f, 8.0f, 9.0f, 14.0f);
        gy.n(s, 8.0f, 16.0f, 9.0f);
        s.moveTo(12.0f, 15.0f);
        s.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        s.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        s.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        s.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        k4.x(s, 7.05f, 6.05f, 1.41f, 1.41f);
        s.curveTo(9.37f, 6.56f, 10.62f, 6.0f, 12.0f, 6.0f);
        s.reflectiveCurveToRelative(2.63f, 0.56f, 3.54f, 1.46f);
        s.lineToRelative(1.41f, -1.41f);
        s.curveTo(15.68f, 4.78f, 13.93f, 4.0f, 12.0f, 4.0f);
        s.reflectiveCurveToRelative(-3.68f, 0.78f, -4.95f, 2.05f);
        s.close();
        s.moveTo(12.0f, 0.0f);
        s.curveTo(8.96f, 0.0f, 6.21f, 1.23f, 4.22f, 3.22f);
        s.lineToRelative(1.41f, 1.41f);
        s.curveTo(7.26f, 3.01f, 9.51f, 2.0f, 12.0f, 2.0f);
        s.reflectiveCurveToRelative(4.74f, 1.01f, 6.36f, 2.64f);
        s.lineToRelative(1.41f, -1.41f);
        s.curveTo(17.79f, 1.23f, 15.04f, 0.0f, 12.0f, 0.0f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsRemote = build;
        build.getClass();
        return build;
    }
}
