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
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PermCameraMicKt {
    private static ImageVector _permCameraMic;

    public static final ImageVector getPermCameraMic(Icons.Rounded rounded) {
        ImageVector imageVector = _permCameraMic;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PermCameraMic", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(20.0f, 5.0f, -3.17f, -1.24f, -1.35f);
        i.curveToRelative(-0.37f, -0.41f, -0.91f, -0.65f, -1.47f, -0.65f);
        i.lineTo(9.88f, 3.0f);
        i.curveToRelative(-0.56f, 0.0f, -1.1f, 0.24f, -1.48f, 0.65f);
        i.lineTo(7.17f, 5.0f);
        i.lineTo(4.0f, 5.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(7.0f);
        i.verticalLineToRelative(-2.09f);
        i.curveToRelative(-2.45f, -0.42f, -4.41f, -2.32f, -4.89f, -4.75f);
        i.curveToRelative(-0.12f, -0.61f, 0.38f, -1.16f, 0.99f, -1.16f);
        i.curveToRelative(0.49f, 0.0f, 0.88f, 0.35f, 0.98f, 0.83f);
        i.curveTo(8.47f, 15.64f, 10.07f, 17.0f, 12.0f, 17.0f);
        i.reflectiveCurveToRelative(3.53f, -1.36f, 3.91f, -3.17f);
        i.curveToRelative(0.1f, -0.48f, 0.5f, -0.83f, 0.98f, -0.83f);
        i.curveToRelative(0.61f, 0.0f, 1.11f, 0.55f, 0.99f, 1.16f);
        i.curveToRelative(-0.48f, 2.43f, -2.44f, 4.34f, -4.89f, 4.75f);
        i.lineTo(12.99f, 21.0f);
        i.horizontalLineToRelative(7.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(21.99f, 7.0f);
        i.curveTo(22.0f, 5.9f, 21.1f, 5.0f, 20.0f, 5.0f);
        i.close();
        i.moveTo(14.0f, 13.0f);
        i.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        i.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        i.lineTo(10.0f, 9.0f);
        i.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        i.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(i, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _permCameraMic = build;
        build.getClass();
        return build;
    }
}
