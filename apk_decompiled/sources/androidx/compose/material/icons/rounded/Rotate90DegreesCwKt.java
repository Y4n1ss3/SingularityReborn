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
import defpackage.gy;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Rotate90DegreesCwKt {
    private static ImageVector _rotate90DegreesCw;

    public static final ImageVector getRotate90DegreesCw(Icons.Rounded rounded) {
        ImageVector imageVector = _rotate90DegreesCw;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Rotate90DegreesCw", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(3.86f, 18.46f);
        b.curveToRelative(2.65f, 3.45f, 7.11f, 4.37f, 10.74f, 2.79f);
        b.curveToRelative(0.61f, -0.27f, 0.74f, -1.09f, 0.27f, -1.56f);
        b.lineToRelative(-0.05f, -0.05f);
        b.curveToRelative(-0.29f, -0.29f, -0.72f, -0.35f, -1.1f, -0.19f);
        b.curveToRelative(-2.96f, 1.24f, -6.59f, 0.37f, -8.58f, -2.62f);
        b.curveToRelative(-1.58f, -2.37f, -1.55f, -5.37f, 0.05f, -7.73f);
        b.curveTo(6.6f, 7.03f, 8.8f, 6.03f, 11.0f, 6.03f);
        b.verticalLineToRelative(1.76f);
        b.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.86f, 0.36f);
        b.lineToRelative(2.79f, -2.79f);
        b.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        b.lineToRelative(-2.8f, -2.79f);
        b.curveTo(11.54f, 1.54f, 11.0f, 1.76f, 11.0f, 2.21f);
        b.verticalLineToRelative(1.8f);
        b.curveToRelative(-2.76f, 0.0f, -5.52f, 1.25f, -7.34f, 3.78f);
        b.curveTo(1.38f, 10.96f, 1.46f, 15.37f, 3.86f, 18.46f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(17.7f, 7.71f);
        b2.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b2.lineToRelative(-4.59f, 4.58f);
        b2.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b2.lineToRelative(4.59f, 4.59f);
        b2.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b2.lineToRelative(4.59f, -4.59f);
        b2.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b2, 17.7f, 7.71f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rotate90DegreesCw = build;
        build.getClass();
        return build;
    }
}
