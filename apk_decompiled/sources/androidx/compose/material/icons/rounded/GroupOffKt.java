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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GroupOffKt {
    private static ImageVector _groupOff;

    public static final ImageVector getGroupOff(Icons.Rounded rounded) {
        ImageVector imageVector = _groupOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.GroupOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.0f, 8.0f);
        b.curveToRelative(0.0f, -1.42f, -0.5f, -2.73f, -1.33f, -3.76f);
        b.curveTo(14.09f, 4.1f, 14.53f, 4.0f, 15.0f, 4.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        b.reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f);
        b.curveToRelative(-0.06f, 0.0f, -0.12f, 0.0f, -0.18f, 0.0f);
        b.lineToRelative(-0.77f, -0.77f);
        b.curveTo(14.65f, 10.29f, 15.0f, 9.18f, 15.0f, 8.0f);
        b.close();
        b.moveTo(7.24f, 4.41f);
        b.curveTo(7.77f, 4.15f, 8.37f, 4.0f, 9.0f, 4.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        b.curveToRelative(0.0f, 0.63f, -0.15f, 1.23f, -0.41f, 1.76f);
        uo.l(b, 7.24f, 4.41f, 21.19f, 21.19f);
        b.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        b.reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0.0f);
        b.lineToRelative(-2.99f, -2.99f);
        b.curveTo(16.6f, 19.85f, 16.32f, 20.0f, 16.0f, 20.0f);
        b.horizontalLineTo(2.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineToRelative(-2.0f);
        b.curveToRelative(0.0f, -2.66f, 5.33f, -4.0f, 8.0f, -4.0f);
        b.curveToRelative(0.37f, 0.0f, 0.8f, 0.03f, 1.25f, 0.08f);
        b.lineTo(9.17f, 12.0f);
        b.curveTo(9.11f, 12.0f, 9.06f, 12.0f, 9.0f, 12.0f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        b.curveToRelative(0.0f, -0.06f, 0.0f, -0.11f, 0.0f, -0.17f);
        b.lineTo(1.39f, 4.22f);
        b.curveTo(1.0f, 3.83f, 1.0f, 3.2f, 1.39f, 2.81f);
        b.reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0.0f);
        uo.l(b, 21.19f, 21.19f, 18.89f, 16.07f);
        b.curveToRelative(-0.29f, -1.22f, -1.13f, -2.19f, -2.23f, -2.94f);
        b.curveTo(19.42f, 13.53f, 23.0f, 14.82f, 23.0f, 17.0f);
        b.verticalLineToRelative(2.0f);
        b.curveToRelative(0.0f, 0.32f, -0.15f, 0.6f, -0.38f, 0.79f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 18.89f, 16.07f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _groupOff = build;
        build.getClass();
        return build;
    }
}
