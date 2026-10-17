package androidx.compose.material.icons.twotone;

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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WbCloudyKt {
    private static ImageVector _wbCloudy;

    public static final ImageVector getWbCloudy(Icons.TwoTone twoTone) {
        ImageVector imageVector = _wbCloudy;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.WbCloudy", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.23f, 12.04f, -1.52f, -0.11f);
        e.lineToRelative(-0.3f, -1.5f);
        e.curveTo(16.89f, 7.86f, 14.62f, 6.0f, 12.01f, 6.0f);
        e.curveTo(9.95f, 6.0f, 8.08f, 7.14f, 7.13f, 8.96f);
        e.lineToRelative(-0.5f, 0.95f);
        e.lineToRelative(-1.07f, 0.11f);
        e.curveToRelative(-2.02f, 0.22f, -3.55f, 1.93f, -3.55f, 3.98f);
        e.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        e.horizontalLineToRelative(13.0f);
        e.curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f);
        e.curveToRelative(0.0f, -1.55f, -1.23f, -2.86f, -2.78f, -2.96f);
        e.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.36f, 10.04f);
        b.curveTo(18.67f, 6.59f, 15.65f, 4.0f, 12.01f, 4.0f);
        b.curveTo(9.11f, 4.0f, 6.6f, 5.64f, 5.35f, 8.04f);
        b.curveTo(2.35f, 8.36f, 0.01f, 10.91f, 0.01f, 14.0f);
        b.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        b.horizontalLineToRelative(13.0f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        b.curveToRelative(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        af0.l(b, 19.01f, 18.0f, -13.0f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        b.curveToRelative(0.0f, -2.05f, 1.53f, -3.76f, 3.56f, -3.97f);
        b.lineToRelative(1.07f, -0.11f);
        b.lineToRelative(0.5f, -0.95f);
        b.curveTo(8.08f, 7.14f, 9.95f, 6.0f, 12.01f, 6.0f);
        b.curveToRelative(2.61f, 0.0f, 4.89f, 1.86f, 5.4f, 4.43f);
        b.lineToRelative(0.3f, 1.5f);
        b.lineToRelative(1.52f, 0.11f);
        b.curveToRelative(1.56f, 0.11f, 2.78f, 1.41f, 2.78f, 2.96f);
        b.curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbCloudy = build;
        build.getClass();
        return build;
    }
}
