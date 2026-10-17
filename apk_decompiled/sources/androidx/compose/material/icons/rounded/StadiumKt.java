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
import defpackage.bv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StadiumKt {
    private static ImageVector _stadium;

    public static final ImageVector getStadium(Icons.Rounded rounded) {
        ImageVector imageVector = _stadium;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Stadium", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(6.11f, 5.45f, 3.72f, 6.64f);
        i.curveTo(3.39f, 6.8f, 3.0f, 6.56f, 3.0f, 6.19f);
        i.verticalLineTo(3.81f);
        i.curveTo(3.0f, 3.44f, 3.39f, 3.2f, 3.72f, 3.36f);
        i.lineToRelative(2.38f, 1.19f);
        i.curveTo(6.47f, 4.74f, 6.47f, 5.26f, 6.11f, 5.45f);
        bv.v(i, 18.0f, 3.81f, 2.38f);
        i.curveToRelative(0.0f, 0.37f, 0.39f, 0.61f, 0.72f, 0.45f);
        i.lineToRelative(2.38f, -1.19f);
        i.curveToRelative(0.37f, -0.18f, 0.37f, -0.71f, 0.0f, -0.89f);
        i.lineToRelative(-2.38f, -1.19f);
        i.curveTo(18.39f, 3.2f, 18.0f, 3.44f, 18.0f, 3.81f);
        bv.v(i, 11.0f, 2.81f, 2.38f);
        i.curveToRelative(0.0f, 0.37f, 0.39f, 0.61f, 0.72f, 0.45f);
        i.lineToRelative(2.38f, -1.19f);
        i.curveToRelative(0.37f, -0.18f, 0.37f, -0.71f, 0.0f, -0.89f);
        i.lineToRelative(-2.38f, -1.19f);
        i.curveTo(11.39f, 2.2f, 11.0f, 2.44f, 11.0f, 2.81f);
        i.close();
        i.moveTo(5.0f, 10.04f);
        i.curveTo(6.38f, 10.53f, 8.77f, 11.0f, 12.0f, 11.0f);
        i.reflectiveCurveToRelative(5.62f, -0.47f, 7.0f, -0.96f);
        i.curveTo(19.0f, 9.86f, 16.22f, 9.0f, 12.0f, 9.0f);
        i.reflectiveCurveTo(5.0f, 9.86f, 5.0f, 10.04f);
        af0.l(i, 14.0f, 17.0f, -4.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.lineToRelative(0.0f, 3.88f);
        i.curveTo(4.94f, 21.49f, 2.0f, 20.34f, 2.0f, 19.0f);
        i.verticalLineToRelative(-9.0f);
        i.curveToRelative(0.0f, -1.66f, 4.48f, -3.0f, 10.0f, -3.0f);
        i.reflectiveCurveToRelative(10.0f, 1.34f, 10.0f, 3.0f);
        i.verticalLineToRelative(9.0f);
        i.curveToRelative(0.0f, 1.34f, -2.94f, 2.48f, -7.0f, 2.87f);
        i.lineTo(15.0f, 18.0f);
        i.curveTo(15.0f, 17.45f, 14.55f, 17.0f, 14.0f, 17.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stadium = build;
        build.getClass();
        return build;
    }
}
