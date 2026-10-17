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
public final class _1kKt {
    private static ImageVector __1k;

    public static final ImageVector get_1k(Icons.Rounded rounded) {
        ImageVector imageVector = __1k;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded._1k", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        k4.r(d, 9.25f, 15.0f, 9.25f, 15.0f);
        d.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        d.verticalLineTo(10.5f);
        d.horizontalLineTo(7.75f);
        d.curveTo(7.34f, 10.5f, 7.0f, 10.16f, 7.0f, 9.75f);
        d.verticalLineToRelative(0.0f);
        d.curveTo(7.0f, 9.34f, 7.34f, 9.0f, 7.75f, 9.0f);
        d.horizontalLineTo(9.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        d.verticalLineToRelative(4.25f);
        d.curveTo(10.0f, 14.66f, 9.66f, 15.0f, 9.25f, 15.0f);
        k4.r(d, 15.59f, 15.0f, 15.59f, 15.0f);
        d.curveToRelative(-0.22f, 0.0f, -0.42f, -0.1f, -0.55f, -0.27f);
        d.lineToRelative(-1.54f, -1.98f);
        d.verticalLineToRelative(1.5f);
        d.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        d.horizontalLineToRelative(0.0f);
        d.curveTo(12.34f, 15.0f, 12.0f, 14.66f, 12.0f, 14.25f);
        d.verticalLineToRelative(-4.5f);
        d.curveTo(12.0f, 9.34f, 12.34f, 9.0f, 12.75f, 9.0f);
        d.horizontalLineToRelative(0.0f);
        d.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        d.verticalLineToRelative(1.5f);
        d.lineToRelative(1.54f, -1.98f);
        d.curveTo(15.17f, 9.1f, 15.38f, 9.0f, 15.59f, 9.0f);
        d.horizontalLineToRelative(0.0f);
        d.curveToRelative(0.58f, 0.0f, 0.91f, 0.66f, 0.56f, 1.12f);
        d.lineTo(14.75f, 12.0f);
        d.lineToRelative(1.41f, 1.88f);
        d.curveTo(16.5f, 14.34f, 16.17f, 15.0f, 15.59f, 15.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __1k = build;
        build.getClass();
        return build;
    }
}
