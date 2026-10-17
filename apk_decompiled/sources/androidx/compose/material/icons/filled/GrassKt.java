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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GrassKt {
    private static ImageVector _grass;

    public static final ImageVector getGrass(Icons.Filled filled) {
        ImageVector imageVector = _grass;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Grass", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(12.0f, 20.0f, 2.0f, -2.0f, 5.75f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveTo(7.02f, 15.19f, 4.81f, 12.99f, 2.0f, 12.26f);
        i.curveTo(2.64f, 12.1f, 3.31f, 12.0f, 4.0f, 12.0f);
        i.curveTo(8.42f, 12.0f, 12.0f, 15.58f, 12.0f, 20.0f);
        i.close();
        i.moveTo(22.0f, 12.26f);
        i.curveTo(21.36f, 12.1f, 20.69f, 12.0f, 20.0f, 12.0f);
        i.curveToRelative(-2.93f, 0.0f, -5.48f, 1.58f, -6.88f, 3.93f);
        i.curveToRelative(0.29f, 0.66f, 0.53f, 1.35f, 0.67f, 2.07f);
        i.curveToRelative(0.13f, 0.65f, 0.2f, 1.32f, 0.2f, 2.0f);
        i.horizontalLineToRelative(2.0f);
        i.horizontalLineToRelative(6.0f);
        i.verticalLineToRelative(-2.0f);
        i.horizontalLineToRelative(-5.75f);
        i.curveTo(16.98f, 15.19f, 19.19f, 12.99f, 22.0f, 12.26f);
        i.close();
        i.moveTo(15.64f, 11.02f);
        i.curveToRelative(0.78f, -2.09f, 2.23f, -3.84f, 4.09f, -5.0f);
        i.curveTo(15.44f, 6.16f, 12.0f, 9.67f, 12.0f, 14.0f);
        i.curveToRelative(0.0f, 0.01f, 0.0f, 0.02f, 0.0f, 0.02f);
        i.curveTo(12.95f, 12.75f, 14.2f, 11.72f, 15.64f, 11.02f);
        i.close();
        i.moveTo(11.42f, 8.85f);
        i.curveTo(10.58f, 6.66f, 8.88f, 4.89f, 6.7f, 4.0f);
        i.curveTo(8.14f, 5.86f, 9.0f, 8.18f, 9.0f, 10.71f);
        i.curveToRelative(0.0f, 0.21f, -0.03f, 0.41f, -0.04f, 0.61f);
        i.curveToRelative(0.43f, 0.24f, 0.83f, 0.52f, 1.22f, 0.82f);
        i.curveTo(10.39f, 10.96f, 10.83f, 9.85f, 11.42f, 8.85f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _grass = build;
        build.getClass();
        return build;
    }
}
