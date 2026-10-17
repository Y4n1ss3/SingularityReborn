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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalMallKt {
    private static ImageVector _localMall;

    public static final ImageVector getLocalMall(Icons.Rounded rounded) {
        ImageVector imageVector = _localMall;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalMall", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(19.0f, 6.0f, -2.0f);
        a.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        a.reflectiveCurveTo(7.0f, 3.24f, 7.0f, 6.0f);
        a.lineTo(5.0f, 6.0f);
        a.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        a.verticalLineToRelative(12.0f);
        a.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        a.horizontalLineToRelative(14.0f);
        a.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.lineTo(21.0f, 8.0f);
        a.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        a.close();
        a.moveTo(12.0f, 3.0f);
        a.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        a.lineTo(9.0f, 6.0f);
        a.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        a.close();
        a.moveTo(12.0f, 13.0f);
        a.curveToRelative(-2.33f, 0.0f, -4.29f, -1.59f, -4.84f, -3.75f);
        a.curveToRelative(-0.17f, -0.63f, 0.32f, -1.25f, 0.97f, -1.25f);
        a.curveToRelative(0.47f, 0.0f, 0.85f, 0.34f, 0.98f, 0.8f);
        a.curveToRelative(0.35f, 1.27f, 1.51f, 2.2f, 2.89f, 2.2f);
        a.reflectiveCurveToRelative(2.54f, -0.93f, 2.89f, -2.2f);
        a.curveToRelative(0.13f, -0.46f, 0.51f, -0.8f, 0.98f, -0.8f);
        a.curveToRelative(0.65f, 0.0f, 1.13f, 0.62f, 0.97f, 1.25f);
        a.curveTo(16.29f, 11.41f, 14.33f, 13.0f, 12.0f, 13.0f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localMall = build;
        build.getClass();
        return build;
    }
}
