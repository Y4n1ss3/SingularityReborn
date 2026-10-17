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
public final class DangerousKt {
    private static ImageVector _dangerous;

    public static final ImageVector getDangerous(Icons.Rounded rounded) {
        ImageVector imageVector = _dangerous;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Dangerous", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(14.9f, 3.0f, 9.1f);
        d.curveTo(8.57f, 3.0f, 8.06f, 3.21f, 7.68f, 3.59f);
        d.lineToRelative(-4.1f, 4.1f);
        d.curveTo(3.21f, 8.06f, 3.0f, 8.57f, 3.0f, 9.1f);
        d.verticalLineToRelative(5.8f);
        d.curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f);
        d.lineToRelative(4.1f, 4.1f);
        d.curveTo(8.06f, 20.79f, 8.57f, 21.0f, 9.1f, 21.0f);
        d.horizontalLineToRelative(5.8f);
        d.curveToRelative(0.53f, 0.0f, 1.04f, -0.21f, 1.41f, -0.59f);
        d.lineToRelative(4.1f, -4.1f);
        d.curveTo(20.79f, 15.94f, 21.0f, 15.43f, 21.0f, 14.9f);
        d.verticalLineTo(9.1f);
        d.curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f);
        d.lineToRelative(-4.1f, -4.1f);
        d.curveTo(15.94f, 3.21f, 15.43f, 3.0f, 14.9f, 3.0f);
        k4.r(d, 15.54f, 15.54f, 15.54f, 15.54f);
        d.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        d.lineTo(12.0f, 13.41f);
        d.lineToRelative(-2.12f, 2.12f);
        d.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        d.lineToRelative(0.0f, 0.0f);
        d.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        d.lineTo(10.59f, 12.0f);
        d.lineTo(8.46f, 9.88f);
        d.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        d.lineToRelative(0.0f, 0.0f);
        d.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        d.lineTo(12.0f, 10.59f);
        d.lineToRelative(2.12f, -2.12f);
        d.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        d.lineToRelative(0.0f, 0.0f);
        d.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        d.lineTo(13.41f, 12.0f);
        d.lineToRelative(2.12f, 2.12f);
        d.curveTo(15.93f, 14.51f, 15.93f, 15.15f, 15.54f, 15.54f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dangerous = build;
        build.getClass();
        return build;
    }
}
