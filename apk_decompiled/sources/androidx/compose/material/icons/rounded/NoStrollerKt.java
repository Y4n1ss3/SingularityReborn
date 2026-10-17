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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoStrollerKt {
    private static ImageVector _noStroller;

    public static final ImageVector getNoStroller(Icons.Rounded rounded) {
        ImageVector imageVector = _noStroller;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NoStroller", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.0f, 20.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveTo(8.0f, 18.9f, 8.0f, 20.0f);
        b.close();
        b.moveTo(14.3f, 4.1f);
        b.curveTo(13.03f, 3.4f, 11.56f, 3.0f, 10.0f, 3.0f);
        b.curveTo(8.77f, 3.0f, 7.61f, 3.26f, 6.54f, 3.71f);
        gy.B(b, 4.37f, 4.37f, 14.3f, 4.1f);
        b.moveTo(20.49f, 21.9f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.lineToRelative(-9.82f, -9.82f);
        b.lineTo(3.51f, 3.51f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(7.26f, 7.26f);
        b.lineToRelative(-2.66f, 3.12f);
        b.curveToRelative(-0.55f, 0.65f, -0.09f, 1.65f, 0.76f, 1.65f);
        b.horizontalLineToRelative(6.66f);
        b.lineToRelative(1.17f, 1.17f);
        b.curveToRelative(-0.88f, 0.33f, -1.47f, 1.25f, -1.26f, 2.28f);
        b.curveToRelative(0.15f, 0.76f, 0.78f, 1.39f, 1.54f, 1.54f);
        b.curveToRelative(1.03f, 0.21f, 1.95f, -0.38f, 2.28f, -1.26f);
        b.lineToRelative(1.2f, 1.2f);
        b.curveTo(19.46f, 22.29f, 20.09f, 22.29f, 20.49f, 21.9f);
        uo.l(b, 20.49f, 21.9f, 17.0f, 6.27f);
        b.curveTo(17.58f, 5.59f, 17.97f, 5.0f, 18.65f, 5.0f);
        b.curveToRelative(0.68f, 0.0f, 1.22f, 0.52f, 1.33f, 1.21f);
        b.curveTo(20.08f, 6.66f, 20.48f, 7.0f, 20.96f, 7.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.curveToRelative(0.0f, -0.06f, 0.0f, -0.11f, -0.01f, -0.16f);
        b.lineToRelative(0.0f, -0.01f);
        b.curveTo(21.65f, 4.22f, 20.3f, 3.0f, 18.65f, 3.0f);
        b.curveToRelative(-1.66f, 0.0f, -2.54f, 1.27f, -3.18f, 2.03f);
        b.lineToRelative(-3.5f, 4.11f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.l(b, 17.0f, 14.17f, 6.27f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noStroller = build;
        build.getClass();
        return build;
    }
}
