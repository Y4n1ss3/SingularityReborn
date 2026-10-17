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
public final class MasksKt {
    private static ImageVector _masks;

    public static final ImageVector getMasks(Icons.Sharp sharp) {
        ImageVector imageVector = _masks;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Masks", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.5f, 6.0f);
        b.curveToRelative(-1.31f, 0.0f, -2.37f, 1.01f, -2.48f, 2.3f);
        b.curveTo(15.14f, 7.8f, 14.18f, 6.5f, 12.0f, 6.5f);
        b.curveToRelative(-2.19f, 0.0f, -3.14f, 1.3f, -5.02f, 1.8f);
        b.curveTo(6.87f, 7.02f, 5.81f, 6.0f, 4.5f, 6.0f);
        b.curveTo(3.12f, 6.0f, 2.0f, 7.12f, 2.0f, 8.5f);
        b.verticalLineTo(9.0f);
        b.curveToRelative(0.0f, 6.0f, 3.6f, 7.81f, 6.52f, 7.98f);
        b.curveTo(9.53f, 17.62f, 10.72f, 18.0f, 12.0f, 18.0f);
        b.reflectiveCurveToRelative(2.47f, -0.38f, 3.48f, -1.02f);
        b.curveTo(18.4f, 16.81f, 22.0f, 15.0f, 22.0f, 9.0f);
        b.verticalLineTo(8.5f);
        b.curveTo(22.0f, 7.12f, 20.88f, 6.0f, 19.5f, 6.0f);
        bv.g(b, 3.5f, 9.0f, 8.5f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(3.0f);
        b.curveToRelative(0.0f, 1.28f, 0.38f, 2.47f, 1.01f, 3.48f);
        b.curveTo(4.99f, 14.27f, 3.5f, 12.65f, 3.5f, 9.0f);
        b.close();
        b.moveTo(20.5f, 9.0f);
        b.curveToRelative(0.0f, 3.65f, -1.49f, 5.27f, -3.01f, 5.98f);
        b.curveToRelative(0.64f, -1.01f, 1.01f, -2.2f, 1.01f, -3.48f);
        b.verticalLineToRelative(-3.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        bv.t(b, 9.0f, 10.69f, 10.48f);
        b.curveToRelative(-0.44f, 0.26f, -0.96f, 0.56f, -1.69f, 0.76f);
        b.verticalLineTo(10.2f);
        b.curveToRelative(0.48f, -0.17f, 0.84f, -0.38f, 1.18f, -0.58f);
        b.curveTo(10.72f, 9.3f, 11.23f, 9.0f, 12.0f, 9.0f);
        b.reflectiveCurveToRelative(1.27f, 0.3f, 1.8f, 0.62f);
        b.curveToRelative(0.34f, 0.2f, 0.71f, 0.42f, 1.2f, 0.59f);
        b.verticalLineToRelative(1.04f);
        b.curveToRelative(-0.75f, -0.21f, -1.26f, -0.51f, -1.71f, -0.78f);
        b.curveTo(12.83f, 10.2f, 12.49f, 10.0f, 12.0f, 10.0f);
        b.curveTo(11.51f, 10.0f, 11.16f, 10.2f, 10.69f, 10.48f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _masks = build;
        build.getClass();
        return build;
    }
}
