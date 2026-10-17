package androidx.compose.material.icons.sharp;

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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SupervisedUserCircleKt {
    private static ImageVector _supervisedUserCircle;

    public static final ImageVector getSupervisedUserCircle(Icons.Sharp sharp) {
        ImageVector imageVector = _supervisedUserCircle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SupervisedUserCircle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(15.61f, 8.34f);
        b.curveToRelative(1.07f, 0.0f, 1.93f, 0.86f, 1.93f, 1.93f);
        b.reflectiveCurveToRelative(-0.86f, 1.93f, -1.93f, 1.93f);
        b.reflectiveCurveToRelative(-1.93f, -0.86f, -1.93f, -1.93f);
        b.curveToRelative(-0.01f, -1.07f, 0.86f, -1.93f, 1.93f, -1.93f);
        b.close();
        b.moveTo(9.61f, 6.76f);
        b.curveToRelative(1.3f, 0.0f, 2.36f, 1.06f, 2.36f, 2.36f);
        b.reflectiveCurveToRelative(-1.06f, 2.36f, -2.36f, 2.36f);
        b.reflectiveCurveToRelative(-2.36f, -1.06f, -2.36f, -2.36f);
        b.curveToRelative(0.0f, -1.31f, 1.05f, -2.36f, 2.36f, -2.36f);
        bv.v(b, 9.61f, 15.89f, 3.75f);
        b.curveToRelative(-2.4f, -0.75f, -4.3f, -2.6f, -5.14f, -4.96f);
        b.curveToRelative(1.05f, -1.12f, 3.67f, -1.69f, 5.14f, -1.69f);
        b.curveToRelative(0.53f, 0.0f, 1.2f, 0.08f, 1.9f, 0.22f);
        b.curveToRelative(-1.64f, 0.87f, -1.9f, 2.02f, -1.9f, 2.68f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-0.27f, 0.0f, -0.53f, -0.01f, -0.79f, -0.04f);
        b.verticalLineToRelative(-4.07f);
        b.curveToRelative(0.0f, -1.42f, 2.94f, -2.13f, 4.4f, -2.13f);
        b.curveToRelative(1.07f, 0.0f, 2.92f, 0.39f, 3.84f, 1.15f);
        b.curveTo(18.28f, 17.88f, 15.39f, 20.0f, 12.0f, 20.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _supervisedUserCircle = build;
        build.getClass();
        return build;
    }
}
