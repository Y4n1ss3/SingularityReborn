package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FaceKt {
    private static ImageVector _face;

    public static final ImageVector getFace(Icons.Filled filled) {
        ImageVector imageVector = _face;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Face", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.0f, 11.75f);
        b.curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f);
        b.reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f);
        b.reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f);
        b.reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f);
        b.close();
        b.moveTo(15.0f, 11.75f);
        b.curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f);
        b.reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f);
        b.reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f);
        b.reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f);
        b.close();
        b.moveTo(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        b.curveToRelative(0.0f, -0.29f, 0.02f, -0.58f, 0.05f, -0.86f);
        b.curveToRelative(2.36f, -1.05f, 4.23f, -2.98f, 5.21f, -5.37f);
        b.curveTo(11.07f, 8.33f, 14.05f, 10.0f, 17.42f, 10.0f);
        b.curveToRelative(0.78f, 0.0f, 1.53f, -0.09f, 2.25f, -0.26f);
        b.curveToRelative(0.21f, 0.71f, 0.33f, 1.47f, 0.33f, 2.26f);
        b.curveToRelative(0.0f, 4.41f, -3.59f, 8.0f, -8.0f, 8.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _face = build;
        build.getClass();
        return build;
    }
}
