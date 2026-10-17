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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _7kKt {
    private static ImageVector __7k;

    public static final ImageVector get_7k(Icons.Rounded rounded) {
        ImageVector imageVector = __7k;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded._7k", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(19.0f, 3.0f, 5.0f);
        d.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        r6.g(d, 8.95f, 15.0f, 8.76f);
        d.curveToRelative(-0.5f, 0.0f, -0.86f, -0.49f, -0.72f, -0.97f);
        d.lineToRelative(1.08f, -3.53f);
        d.horizontalLineTo(7.25f);
        d.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        d.verticalLineToRelative(0.0f);
        d.curveTo(6.5f, 9.34f, 6.84f, 9.0f, 7.25f, 9.0f);
        d.horizontalLineTo(10.0f);
        d.curveToRelative(0.67f, 0.0f, 1.15f, 0.65f, 0.96f, 1.29f);
        d.lineToRelative(-1.3f, 4.18f);
        d.curveTo(9.57f, 14.79f, 9.28f, 15.0f, 8.95f, 15.0f);
        k4.r(d, 16.59f, 15.0f, 16.59f, 15.0f);
        d.curveToRelative(-0.22f, 0.0f, -0.42f, -0.1f, -0.55f, -0.27f);
        d.lineToRelative(-1.54f, -1.98f);
        d.verticalLineToRelative(1.55f);
        d.curveToRelative(0.0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f);
        d.horizontalLineTo(13.7f);
        d.curveToRelative(-0.39f, 0.0f, -0.7f, -0.31f, -0.7f, -0.7f);
        d.verticalLineTo(9.7f);
        d.curveTo(13.0f, 9.31f, 13.31f, 9.0f, 13.7f, 9.0f);
        d.horizontalLineToRelative(0.09f);
        d.curveToRelative(0.39f, 0.0f, 0.7f, 0.31f, 0.7f, 0.7f);
        d.verticalLineToRelative(1.55f);
        d.lineToRelative(1.54f, -1.98f);
        d.curveTo(16.17f, 9.1f, 16.38f, 9.0f, 16.59f, 9.0f);
        d.lineToRelative(0.0f, 0.0f);
        d.curveToRelative(0.58f, 0.0f, 0.91f, 0.66f, 0.56f, 1.12f);
        d.lineTo(15.75f, 12.0f);
        d.lineToRelative(1.41f, 1.88f);
        d.curveTo(17.5f, 14.34f, 17.17f, 15.0f, 16.59f, 15.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __7k = build;
        build.getClass();
        return build;
    }
}
