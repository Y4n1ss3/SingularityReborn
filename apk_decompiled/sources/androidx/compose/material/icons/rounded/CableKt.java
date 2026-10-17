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
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CableKt {
    private static ImageVector _cable;

    public static final ImageVector getCable(Icons.Rounded rounded) {
        ImageVector imageVector = _cable;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Cable", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(20.0f, 5.0f, 4.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        d.horizontalLineToRelative(-2.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        d.verticalLineToRelative(1.0f);
        d.horizontalLineToRelative(0.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        d.verticalLineToRelative(3.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(1.0f);
        d.lineToRelative(0.0f, 6.91f);
        d.curveToRelative(0.0f, 1.04f, -0.76f, 1.98f, -1.79f, 2.08f);
        d.curveTo(14.01f, 19.11f, 13.0f, 18.17f, 13.0f, 17.0f);
        d.lineToRelative(0.0f, -9.86f);
        d.curveToRelative(0.0f, -2.13f, -1.61f, -3.99f, -3.74f, -4.13f);
        d.curveTo(6.93f, 2.86f, 5.0f, 4.7f, 5.0f, 7.0f);
        d.verticalLineToRelative(7.0f);
        d.horizontalLineTo(4.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        d.verticalLineToRelative(3.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(0.0f);
        d.verticalLineToRelative(1.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(2.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        d.verticalLineToRelative(-1.0f);
        d.horizontalLineToRelative(0.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        d.verticalLineToRelative(-3.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        d.horizontalLineTo(7.0f);
        d.lineToRelative(0.0f, -6.91f);
        d.curveToRelative(0.0f, -1.04f, 0.76f, -1.98f, 1.79f, -2.08f);
        d.curveTo(9.99f, 4.89f, 11.0f, 5.83f, 11.0f, 7.0f);
        d.lineToRelative(0.0f, 9.86f);
        d.curveToRelative(0.0f, 2.13f, 1.61f, 3.99f, 3.74f, 4.13f);
        d.curveTo(17.07f, 21.14f, 19.0f, 19.3f, 19.0f, 17.0f);
        d.verticalLineToRelative(-7.0f);
        d.horizontalLineToRelative(1.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        d.verticalLineTo(6.0f);
        d.curveTo(21.0f, 5.45f, 20.55f, 5.0f, 20.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(d, 20.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cable = build;
        build.getClass();
        return build;
    }
}
