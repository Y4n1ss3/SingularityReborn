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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GrassKt {
    private static ImageVector _grass;

    public static final ImageVector getGrass(Icons.Rounded rounded) {
        ImageVector imageVector = _grass;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Grass", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.64f, 11.02f);
        b.curveToRelative(0.55f, -1.47f, 1.43f, -2.78f, 2.56f, -3.83f);
        b.curveToRelative(0.38f, -0.36f, 0.04f, -1.0f, -0.46f, -0.85f);
        b.curveToRelative(-3.32f, 0.98f, -5.75f, 4.05f, -5.74f, 7.69f);
        b.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        b.curveTo(12.95f, 12.75f, 14.2f, 11.72f, 15.64f, 11.02f);
        b.close();
        b.moveTo(11.42f, 8.85f);
        b.curveToRelative(-0.6f, -1.56f, -1.63f, -2.91f, -2.96f, -3.87f);
        b.curveTo(8.04f, 4.68f, 7.5f, 5.17f, 7.74f, 5.63f);
        b.curveTo(8.54f, 7.15f, 9.0f, 8.88f, 9.0f, 10.71f);
        b.curveToRelative(0.0f, 0.21f, -0.03f, 0.41f, -0.04f, 0.61f);
        b.curveToRelative(0.43f, 0.24f, 0.83f, 0.52f, 1.22f, 0.82f);
        b.curveTo(10.39f, 10.96f, 10.83f, 9.85f, 11.42f, 8.85f);
        r6.g(b, 12.0f, 20.0f, 3.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(4.75f);
        b.curveToRelative(-0.57f, -2.19f, -2.04f, -4.02f, -4.0f, -5.06f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(-0.16f, -0.08f, -0.26f, -0.25f, -0.26f, -0.44f);
        b.curveToRelative(0.0f, -0.27f, 0.22f, -0.49f, 0.49f, -0.5f);
        b.curveToRelative(0.01f, 0.0f, 0.02f, 0.0f, 0.02f, 0.0f);
        b.curveTo(8.42f, 12.0f, 12.0f, 15.58f, 12.0f, 20.0f);
        k4.r(b, 20.26f, 12.94f, 20.26f, 12.94f);
        b.curveToRelative(-1.96f, 1.04f, -3.44f, 2.87f, -4.0f, 5.06f);
        b.horizontalLineTo(21.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineToRelative(-5.0f);
        b.horizontalLineToRelative(-2.0f);
        b.curveToRelative(0.0f, -0.68f, -0.07f, -1.35f, -0.2f, -2.0f);
        b.curveToRelative(-0.15f, -0.72f, -0.38f, -1.42f, -0.67f, -2.07f);
        b.curveTo(14.52f, 13.58f, 17.07f, 12.0f, 20.0f, 12.0f);
        b.curveToRelative(0.01f, 0.0f, 0.02f, 0.0f, 0.02f, 0.0f);
        b.curveToRelative(0.27f, 0.0f, 0.49f, 0.23f, 0.49f, 0.5f);
        b.curveTo(20.52f, 12.69f, 20.41f, 12.85f, 20.26f, 12.94f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _grass = build;
        build.getClass();
        return build;
    }
}
