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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Wifi2BarKt {
    private static ImageVector _wifi2Bar;

    public static final ImageVector getWifi2Bar(Icons.Rounded rounded) {
        ImageVector imageVector = _wifi2Bar;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Wifi2Bar", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 16.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveTo(13.1f, 16.0f, 12.0f, 16.0f);
        b.close();
        b.moveTo(5.38f, 14.37f);
        b.curveToRelative(-0.63f, -0.63f, -0.59f, -1.71f, 0.13f, -2.24f);
        b.curveTo(7.33f, 10.79f, 9.57f, 10.0f, 12.0f, 10.0f);
        b.curveToRelative(2.43f, 0.0f, 4.67f, 0.79f, 6.49f, 2.13f);
        b.curveToRelative(0.72f, 0.53f, 0.76f, 1.6f, 0.13f, 2.24f);
        b.curveToRelative(-0.53f, 0.54f, -1.37f, 0.57f, -1.98f, 0.12f);
        b.curveTo(15.33f, 13.55f, 13.73f, 13.0f, 12.0f, 13.0f);
        b.curveToRelative(-1.73f, 0.0f, -3.33f, 0.55f, -4.64f, 1.49f);
        b.curveTo(6.75f, 14.93f, 5.91f, 14.9f, 5.38f, 14.37f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifi2Bar = build;
        build.getClass();
        return build;
    }
}
