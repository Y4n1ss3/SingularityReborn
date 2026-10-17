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
import defpackage.bv;
import defpackage.j50;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TapasKt {
    private static ImageVector _tapas;

    public static final ImageVector getTapas(Icons.Rounded rounded) {
        ImageVector imageVector = _tapas;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Tapas", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(22.0f, 10.0f, 2.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        d.horizontalLineToRelative(-6.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        d.verticalLineToRelative(8.0f);
        d.curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f);
        d.verticalLineTo(21.0f);
        d.horizontalLineToRelative(-1.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(4.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        d.horizontalLineToRelative(-1.0f);
        d.verticalLineToRelative(-7.14f);
        d.curveTo(20.72f, 13.41f, 22.0f, 11.86f, 22.0f, 10.0f);
        uo.C(d, 20.0f, 3.0f, 3.0f, -4.0f);
        bv.z(d, 3.0f, 20.0f, 9.86f, 9.0f);
        d.lineTo(8.0f, 9.0f);
        d.verticalLineTo(8.0f);
        d.lineToRelative(1.86f, 0.0f);
        d.curveToRelative(1.31f, 0.0f, 2.5f, -0.94f, 2.63f, -2.24f);
        d.curveTo(12.64f, 4.26f, 11.47f, 3.0f, 10.0f, 3.0f);
        d.horizontalLineTo(8.0f);
        d.verticalLineTo(2.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        d.horizontalLineToRelative(0.0f);
        d.curveTo(6.45f, 1.0f, 6.0f, 1.45f, 6.0f, 2.0f);
        d.verticalLineToRelative(1.0f);
        d.lineTo(4.14f, 3.0f);
        d.curveToRelative(-1.31f, 0.0f, -2.5f, 0.94f, -2.63f, 2.24f);
        d.curveTo(1.36f, 6.74f, 2.53f, 8.0f, 4.0f, 8.0f);
        bv.C(d, 2.0f, 1.0f, 4.14f, 9.0f);
        d.curveToRelative(-1.31f, 0.0f, -2.5f, 0.94f, -2.63f, 2.24f);
        d.curveTo(1.36f, 12.74f, 2.53f, 14.0f, 4.0f, 14.0f);
        d.horizontalLineToRelative(2.0f);
        d.verticalLineToRelative(8.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(0.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        d.verticalLineToRelative(-8.0f);
        d.horizontalLineToRelative(2.0f);
        d.curveToRelative(1.47f, 0.0f, 2.64f, -1.26f, 2.49f, -2.76f);
        d.curveTo(12.36f, 9.94f, 11.17f, 9.0f, 9.86f, 9.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tapas = build;
        build.getClass();
        return build;
    }
}
