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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StarsKt {
    private static ImageVector _stars;

    public static final ImageVector getStars(Icons.Rounded rounded) {
        ImageVector imageVector = _stars;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Stars", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.99f, 2.0f);
        b.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        b.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
        k4.r(b, 15.22f, 17.39f, 12.0f, 15.45f);
        b.lineToRelative(-3.22f, 1.94f);
        b.curveToRelative(-0.38f, 0.23f, -0.85f, -0.11f, -0.75f, -0.54f);
        b.lineToRelative(0.85f, -3.66f);
        b.lineToRelative(-2.83f, -2.45f);
        b.curveToRelative(-0.33f, -0.29f, -0.15f, -0.84f, 0.29f, -0.88f);
        b.lineToRelative(3.74f, -0.32f);
        b.lineToRelative(1.46f, -3.45f);
        b.curveToRelative(0.17f, -0.41f, 0.75f, -0.41f, 0.92f, 0.0f);
        b.lineToRelative(1.46f, 3.44f);
        b.lineToRelative(3.74f, 0.32f);
        b.curveToRelative(0.44f, 0.04f, 0.62f, 0.59f, 0.28f, 0.88f);
        b.lineToRelative(-2.83f, 2.45f);
        b.lineToRelative(0.85f, 3.67f);
        b.curveToRelative(0.1f, 0.43f, -0.36f, 0.77f, -0.74f, 0.54f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stars = build;
        build.getClass();
        return build;
    }
}
