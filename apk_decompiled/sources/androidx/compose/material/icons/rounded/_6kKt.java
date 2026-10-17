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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _6kKt {
    private static ImageVector __6k;

    public static final ImageVector get_6k(Icons.Rounded rounded) {
        ImageVector imageVector = __6k;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded._6k", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder v = uo.v(8.0f, 12.5f, 1.5f, 14.0f, 8.0f);
        k4.B(v, 12.5f, 19.0f, 3.0f, 5.0f);
        v.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        v.verticalLineToRelative(14.0f);
        v.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        v.horizontalLineToRelative(14.0f);
        v.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        v.verticalLineTo(5.0f);
        v.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        uo.q(v, 10.25f, 10.5f, 8.0f, 1.0f);
        v.horizontalLineToRelative(2.0f);
        v.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        v.verticalLineTo(14.0f);
        v.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        v.horizontalLineTo(7.5f);
        v.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        v.verticalLineToRelative(-4.0f);
        v.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        v.horizontalLineToRelative(2.75f);
        v.curveTo(10.66f, 9.0f, 11.0f, 9.34f, 11.0f, 9.75f);
        v.verticalLineToRelative(0.0f);
        v.curveTo(11.0f, 10.16f, 10.66f, 10.5f, 10.25f, 10.5f);
        k4.r(v, 16.59f, 15.0f, 16.59f, 15.0f);
        v.curveToRelative(-0.22f, 0.0f, -0.42f, -0.1f, -0.55f, -0.27f);
        v.lineToRelative(-1.54f, -1.98f);
        v.verticalLineToRelative(1.55f);
        v.curveToRelative(0.0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f);
        v.horizontalLineTo(13.7f);
        v.curveToRelative(-0.39f, 0.0f, -0.7f, -0.31f, -0.7f, -0.7f);
        v.verticalLineTo(9.7f);
        v.curveTo(13.0f, 9.31f, 13.31f, 9.0f, 13.7f, 9.0f);
        v.horizontalLineToRelative(0.09f);
        v.curveToRelative(0.39f, 0.0f, 0.7f, 0.31f, 0.7f, 0.7f);
        v.verticalLineToRelative(1.55f);
        v.lineToRelative(1.54f, -1.98f);
        v.curveTo(16.17f, 9.1f, 16.38f, 9.0f, 16.59f, 9.0f);
        v.lineToRelative(0.0f, 0.0f);
        v.curveToRelative(0.58f, 0.0f, 0.91f, 0.66f, 0.56f, 1.12f);
        v.lineTo(15.75f, 12.0f);
        v.lineToRelative(1.41f, 1.88f);
        v.curveTo(17.5f, 14.34f, 17.17f, 15.0f, 16.59f, 15.0f);
        v.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, v.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __6k = build;
        build.getClass();
        return build;
    }
}
