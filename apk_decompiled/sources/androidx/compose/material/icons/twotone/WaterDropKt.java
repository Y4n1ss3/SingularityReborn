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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WaterDropKt {
    private static ImageVector _waterDrop;

    public static final ImageVector getWaterDrop(Icons.TwoTone twoTone) {
        ImageVector imageVector = _waterDrop;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.WaterDrop", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 4.67f);
        b.curveToRelative(-4.05f, 3.7f, -6.0f, 6.79f, -6.0f, 9.14f);
        b.curveToRelative(0.0f, 3.63f, 2.65f, 6.2f, 6.0f, 6.2f);
        b.reflectiveCurveToRelative(6.0f, -2.57f, 6.0f, -6.2f);
        b.curveTo(18.0f, 11.46f, 16.05f, 8.36f, 12.0f, 4.67f);
        b.close();
        b.moveTo(12.28f, 18.99f);
        b.curveToRelative(-2.13f, 0.13f, -4.62f, -1.09f, -5.19f, -4.12f);
        b.curveTo(7.01f, 14.42f, 7.37f, 14.0f, 7.83f, 14.0f);
        b.curveToRelative(0.37f, 0.0f, 0.67f, 0.26f, 0.74f, 0.62f);
        b.curveToRelative(0.41f, 2.23f, 2.28f, 2.98f, 3.64f, 2.87f);
        b.curveToRelative(0.43f, -0.02f, 0.79f, 0.32f, 0.79f, 0.75f);
        b.curveTo(13.0f, 18.64f, 12.68f, 18.97f, 12.28f, 18.99f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 2.0f);
        b2.curveToRelative(-5.33f, 4.55f, -8.0f, 8.48f, -8.0f, 11.8f);
        b2.curveToRelative(0.0f, 4.98f, 3.8f, 8.2f, 8.0f, 8.2f);
        b2.reflectiveCurveToRelative(8.0f, -3.22f, 8.0f, -8.2f);
        b2.curveTo(20.0f, 10.48f, 17.33f, 6.55f, 12.0f, 2.0f);
        b2.close();
        b2.moveTo(12.0f, 20.0f);
        b2.curveToRelative(-3.35f, 0.0f, -6.0f, -2.57f, -6.0f, -6.2f);
        b2.curveToRelative(0.0f, -2.34f, 1.95f, -5.44f, 6.0f, -9.14f);
        b2.curveToRelative(4.05f, 3.7f, 6.0f, 6.79f, 6.0f, 9.14f);
        b2.curveTo(18.0f, 17.43f, 15.35f, 20.0f, 12.0f, 20.0f);
        b2.close();
        b2.moveTo(7.83f, 14.0f);
        b2.curveToRelative(0.37f, 0.0f, 0.67f, 0.26f, 0.74f, 0.62f);
        b2.curveToRelative(0.41f, 2.22f, 2.28f, 2.98f, 3.64f, 2.87f);
        b2.curveToRelative(0.43f, -0.02f, 0.79f, 0.32f, 0.79f, 0.75f);
        b2.curveToRelative(0.0f, 0.4f, -0.32f, 0.73f, -0.72f, 0.75f);
        b2.curveToRelative(-2.13f, 0.13f, -4.62f, -1.09f, -5.19f, -4.12f);
        b2.curveTo(7.01f, 14.42f, 7.37f, 14.0f, 7.83f, 14.0f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _waterDrop = build;
        build.getClass();
        return build;
    }
}
