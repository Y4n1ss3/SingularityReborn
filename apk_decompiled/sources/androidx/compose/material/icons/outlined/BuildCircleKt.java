package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BuildCircleKt {
    private static ImageVector _buildCircle;

    public static final ImageVector getBuildCircle(Icons.Outlined outlined) {
        ImageVector imageVector = _buildCircle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BuildCircle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        PathFillType.Companion companion = PathFillType.Companion;
        int m5057getEvenOddRgk1Os = companion.m5057getEvenOddRgk1Os();
        Color.Companion companion2 = Color.Companion;
        SolidColor solidColor = new SolidColor(companion2.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion3 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion3.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion4 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion4.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        b.curveToRelative(0.0f, -4.41f, 3.59f, -8.0f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        b.curveTo(20.0f, 16.41f, 16.41f, 20.0f, 12.0f, 20.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), m5057getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int m5057getEvenOddRgk1Os2 = companion.m5057getEvenOddRgk1Os();
        SolidColor solidColor2 = new SolidColor(companion2.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion3.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion4.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(13.49f, 11.38f);
        b2.curveToRelative(0.43f, -1.22f, 0.17f, -2.64f, -0.81f, -3.62f);
        b2.curveToRelative(-1.11f, -1.11f, -2.79f, -1.3f, -4.1f, -0.59f);
        b2.lineToRelative(2.35f, 2.35f);
        b2.lineToRelative(-1.41f, 1.41f);
        b2.lineTo(7.17f, 8.58f);
        b2.curveToRelative(-0.71f, 1.32f, -0.52f, 2.99f, 0.59f, 4.1f);
        b2.curveToRelative(0.98f, 0.98f, 2.4f, 1.24f, 3.62f, 0.81f);
        b2.lineToRelative(3.41f, 3.41f);
        b2.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        b2.lineToRelative(1.4f, -1.4f);
        b2.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b2, 13.49f, 11.38f), m5057getEvenOddRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _buildCircle = build;
        build.getClass();
        return build;
    }
}
