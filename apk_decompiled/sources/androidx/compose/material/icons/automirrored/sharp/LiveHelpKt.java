package androidx.compose.material.icons.automirrored.sharp;

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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LiveHelpKt {
    private static ImageVector _liveHelp;

    public static final ImageVector getLiveHelp(Icons.AutoMirrored.Sharp sharp) {
        ImageVector imageVector = _liveHelp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Sharp.LiveHelp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(21.0f, 2.0f, 3.0f, 2.0f, 18.0f);
        s.horizontalLineToRelative(6.0f);
        s.lineToRelative(3.0f, 3.0f);
        s.lineToRelative(3.0f, -3.0f);
        gy.n(s, 6.0f, 21.0f, 2.0f);
        k4.C(s, 13.0f, 18.0f, -2.0f, -2.0f);
        fc.x(s, 2.0f, 2.0f, 15.07f, 10.25f);
        s.lineToRelative(-0.9f, 0.92f);
        s.curveTo(13.45f, 11.9f, 13.0f, 12.5f, 13.0f, 14.0f);
        s.horizontalLineToRelative(-2.0f);
        s.verticalLineToRelative(-0.5f);
        s.curveToRelative(0.0f, -1.1f, 0.45f, -2.1f, 1.17f, -2.83f);
        s.lineToRelative(1.24f, -1.26f);
        s.curveToRelative(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f);
        s.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        s.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        s.lineTo(8.0f, 8.0f);
        s.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        s.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        s.curveToRelative(0.0f, 0.88f, -0.36f, 1.68f, -0.93f, 2.25f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _liveHelp = build;
        build.getClass();
        return build;
    }
}
