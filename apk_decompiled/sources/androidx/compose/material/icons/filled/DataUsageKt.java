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
import defpackage.af0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DataUsageKt {
    private static ImageVector _dataUsage;

    public static final ImageVector getDataUsage(Icons.Filled filled) {
        ImageVector imageVector = _dataUsage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DataUsage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(13.0f, 2.05f, 3.03f);
        h.curveToRelative(3.39f, 0.49f, 6.0f, 3.39f, 6.0f, 6.92f);
        h.curveToRelative(0.0f, 0.9f, -0.18f, 1.75f, -0.48f, 2.54f);
        h.lineToRelative(2.6f, 1.53f);
        h.curveToRelative(0.56f, -1.24f, 0.88f, -2.62f, 0.88f, -4.07f);
        h.curveToRelative(0.0f, -5.18f, -3.95f, -9.45f, -9.0f, -9.95f);
        h.close();
        h.moveTo(12.0f, 19.0f);
        h.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        h.curveToRelative(0.0f, -3.53f, 2.61f, -6.43f, 6.0f, -6.92f);
        h.verticalLineTo(2.05f);
        h.curveToRelative(-5.06f, 0.5f, -9.0f, 4.76f, -9.0f, 9.95f);
        h.curveToRelative(0.0f, 5.52f, 4.47f, 10.0f, 9.99f, 10.0f);
        h.curveToRelative(3.31f, 0.0f, 6.24f, -1.61f, 8.06f, -4.09f);
        h.lineToRelative(-2.6f, -1.53f);
        h.curveTo(16.17f, 17.98f, 14.21f, 19.0f, 12.0f, 19.0f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dataUsage = build;
        build.getClass();
        return build;
    }
}
