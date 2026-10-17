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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DataUsageKt {
    private static ImageVector _dataUsage;

    public static final ImageVector getDataUsage(Icons.Rounded rounded) {
        ImageVector imageVector = _dataUsage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DataUsage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(13.0f, 3.87f, 0.02f);
        h.curveToRelative(0.0f, 0.67f, 0.45f, 1.23f, 1.08f, 1.43f);
        h.curveTo(16.93f, 6.21f, 19.0f, 8.86f, 19.0f, 12.0f);
        h.curveToRelative(0.0f, 0.52f, -0.06f, 1.01f, -0.17f, 1.49f);
        h.curveToRelative(-0.14f, 0.64f, 0.12f, 1.3f, 0.69f, 1.64f);
        h.lineToRelative(0.01f, 0.01f);
        h.curveToRelative(0.86f, 0.5f, 1.98f, 0.05f, 2.21f, -0.91f);
        h.curveToRelative(0.17f, -0.72f, 0.26f, -1.47f, 0.26f, -2.23f);
        h.curveToRelative(0.0f, -4.5f, -2.98f, -8.32f, -7.08f, -9.57f);
        h.curveToRelative(-0.95f, -0.29f, -1.92f, 0.44f, -1.92f, 1.44f);
        h.close();
        h.moveTo(10.94f, 18.92f);
        h.curveToRelative(-2.99f, -0.43f, -5.42f, -2.86f, -5.86f, -5.84f);
        h.curveToRelative(-0.54f, -3.6f, 1.66f, -6.77f, 4.83f, -7.76f);
        h.curveToRelative(0.64f, -0.19f, 1.09f, -0.76f, 1.09f, -1.43f);
        h.verticalLineToRelative(-0.02f);
        h.curveToRelative(0.0f, -1.0f, -0.97f, -1.73f, -1.93f, -1.44f);
        h.curveToRelative(-4.51f, 1.38f, -7.66f, 5.86f, -6.98f, 10.96f);
        h.curveToRelative(0.59f, 4.38f, 4.13f, 7.92f, 8.51f, 8.51f);
        h.curveToRelative(3.14f, 0.42f, 6.04f, -0.61f, 8.13f, -2.53f);
        h.curveToRelative(0.74f, -0.68f, 0.61f, -1.89f, -0.26f, -2.39f);
        h.curveToRelative(-0.58f, -0.34f, -1.3f, -0.23f, -1.8f, 0.22f);
        h.curveToRelative(-1.47f, 1.34f, -3.51f, 2.05f, -5.73f, 1.72f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dataUsage = build;
        build.getClass();
        return build;
    }
}
