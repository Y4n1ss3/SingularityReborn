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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DonutLargeKt {
    private static ImageVector _donutLarge;

    public static final ImageVector getDonutLarge(Icons.Rounded rounded) {
        ImageVector imageVector = _donutLarge;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DonutLarge", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(14.07f, 5.32f);
        b.curveTo(16.26f, 6.0f, 18.0f, 7.74f, 18.68f, 9.93f);
        b.curveToRelative(0.19f, 0.63f, 0.76f, 1.07f, 1.41f, 1.07f);
        b.horizontalLineToRelative(0.04f);
        b.curveToRelative(1.0f, 0.0f, 1.72f, -0.96f, 1.43f, -1.91f);
        b.curveToRelative(-0.97f, -3.18f, -3.48f, -5.69f, -6.66f, -6.66f);
        b.curveToRelative(-0.94f, -0.29f, -1.9f, 0.43f, -1.9f, 1.43f);
        b.verticalLineToRelative(0.04f);
        b.curveToRelative(0.0f, 0.66f, 0.44f, 1.23f, 1.07f, 1.42f);
        b.close();
        b.moveTo(18.68f, 14.07f);
        b.curveToRelative(-0.68f, 2.2f, -2.42f, 3.93f, -4.61f, 4.61f);
        b.curveToRelative(-0.63f, 0.19f, -1.07f, 0.76f, -1.07f, 1.41f);
        b.verticalLineToRelative(0.04f);
        b.curveToRelative(0.0f, 1.0f, 0.96f, 1.72f, 1.91f, 1.43f);
        b.curveToRelative(3.18f, -0.97f, 5.69f, -3.48f, 6.66f, -6.66f);
        b.curveToRelative(0.29f, -0.95f, -0.43f, -1.91f, -1.42f, -1.91f);
        b.horizontalLineToRelative(-0.05f);
        b.curveToRelative(-0.66f, 0.01f, -1.23f, 0.45f, -1.42f, 1.08f);
        b.close();
        b.moveTo(11.0f, 20.11f);
        b.curveToRelative(0.0f, -0.67f, -0.45f, -1.24f, -1.09f, -1.44f);
        b.curveTo(7.07f, 17.78f, 5.0f, 15.13f, 5.0f, 12.0f);
        b.reflectiveCurveToRelative(2.07f, -5.78f, 4.91f, -6.67f);
        b.curveToRelative(0.64f, -0.2f, 1.09f, -0.77f, 1.09f, -1.44f);
        b.verticalLineToRelative(-0.01f);
        b.curveToRelative(0.0f, -1.0f, -0.97f, -1.74f, -1.93f, -1.44f);
        b.curveTo(4.98f, 3.69f, 2.0f, 7.5f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 4.5f, 2.98f, 8.31f, 7.07f, 9.56f);
        b.curveToRelative(0.96f, 0.3f, 1.93f, -0.44f, 1.93f, -1.45f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _donutLarge = build;
        build.getClass();
        return build;
    }
}
