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
public final class WhatshotKt {
    private static ImageVector _whatshot;

    public static final ImageVector getWhatshot(Icons.Filled filled) {
        ImageVector imageVector = _whatshot;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Whatshot", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.5f, 0.67f);
        b.reflectiveCurveToRelative(0.74f, 2.65f, 0.74f, 4.8f);
        b.curveToRelative(0.0f, 2.06f, -1.35f, 3.73f, -3.41f, 3.73f);
        b.curveToRelative(-2.07f, 0.0f, -3.63f, -1.67f, -3.63f, -3.73f);
        b.lineToRelative(0.03f, -0.36f);
        b.curveTo(5.21f, 7.51f, 4.0f, 10.62f, 4.0f, 14.0f);
        b.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        b.curveTo(20.0f, 8.61f, 17.41f, 3.8f, 13.5f, 0.67f);
        b.close();
        b.moveTo(11.71f, 19.0f);
        b.curveToRelative(-1.78f, 0.0f, -3.22f, -1.4f, -3.22f, -3.14f);
        b.curveToRelative(0.0f, -1.62f, 1.05f, -2.76f, 2.81f, -3.12f);
        b.curveToRelative(1.77f, -0.36f, 3.6f, -1.21f, 4.62f, -2.58f);
        b.curveToRelative(0.39f, 1.29f, 0.59f, 2.65f, 0.59f, 4.04f);
        b.curveToRelative(0.0f, 2.65f, -2.15f, 4.8f, -4.8f, 4.8f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _whatshot = build;
        build.getClass();
        return build;
    }
}
