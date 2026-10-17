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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoPhotographyKt {
    private static ImageVector _noPhotography;

    public static final ImageVector getNoPhotography(Icons.Rounded rounded) {
        ImageVector imageVector = _noPhotography;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NoPhotography", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(10.94f, 8.12f, 7.48f, 4.66f);
        i.lineTo(8.4f, 3.65f);
        i.curveTo(8.78f, 3.24f, 9.32f, 3.0f, 9.88f, 3.0f);
        i.horizontalLineToRelative(4.24f);
        i.curveToRelative(0.56f, 0.0f, 1.1f, 0.24f, 1.47f, 0.65f);
        i.lineTo(16.83f, 5.0f);
        i.horizontalLineTo(20.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 0.05f, -0.01f, 0.1f, -0.02f, 0.16f);
        i.lineToRelative(-5.1f, -5.1f);
        i.curveTo(16.96f, 13.71f, 17.0f, 13.36f, 17.0f, 13.0f);
        i.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        i.curveTo(11.64f, 8.0f, 11.29f, 8.04f, 10.94f, 8.12f);
        k4.r(i, 19.78f, 22.61f, 18.17f, 21.0f);
        i.horizontalLineTo(4.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        i.verticalLineTo(7.0f);
        i.curveToRelative(0.0f, -0.59f, 0.27f, -1.12f, 0.68f, -1.49f);
        i.lineTo(1.39f, 4.22f);
        i.curveTo(1.0f, 3.83f, 1.0f, 3.2f, 1.39f, 2.81f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        i.lineToRelative(18.38f, 18.38f);
        i.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveTo(20.8f, 23.0f, 20.17f, 23.0f, 19.78f, 22.61f);
        k4.x(i, 14.49f, 17.32f, -1.5f, -1.5f);
        i.curveTo(12.67f, 15.92f, 12.35f, 16.0f, 12.0f, 16.0f);
        i.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        i.curveToRelative(0.0f, -0.35f, 0.08f, -0.67f, 0.19f, -0.98f);
        i.lineToRelative(-1.5f, -1.5f);
        i.curveTo(7.25f, 11.24f, 7.0f, 12.09f, 7.0f, 13.0f);
        i.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        i.curveTo(12.91f, 18.0f, 13.76f, 17.75f, 14.49f, 17.32f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noPhotography = build;
        build.getClass();
        return build;
    }
}
