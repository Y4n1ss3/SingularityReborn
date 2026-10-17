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
public final class WaterDropKt {
    private static ImageVector _waterDrop;

    public static final ImageVector getWaterDrop(Icons.Rounded rounded) {
        ImageVector imageVector = _waterDrop;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WaterDrop", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.66f, 2.58f);
        b.curveToRelative(-0.38f, -0.33f, -0.95f, -0.33f, -1.33f, 0.0f);
        b.curveTo(6.45f, 6.88f, 4.0f, 10.62f, 4.0f, 13.8f);
        b.curveToRelative(0.0f, 4.98f, 3.8f, 8.2f, 8.0f, 8.2f);
        b.reflectiveCurveToRelative(8.0f, -3.22f, 8.0f, -8.2f);
        b.curveTo(20.0f, 10.62f, 17.55f, 6.88f, 12.66f, 2.58f);
        b.close();
        b.moveTo(7.83f, 14.0f);
        b.curveToRelative(0.37f, 0.0f, 0.67f, 0.26f, 0.74f, 0.62f);
        b.curveToRelative(0.41f, 2.22f, 2.28f, 2.98f, 3.64f, 2.87f);
        b.curveToRelative(0.43f, -0.02f, 0.79f, 0.32f, 0.79f, 0.75f);
        b.curveToRelative(0.0f, 0.4f, -0.32f, 0.73f, -0.72f, 0.75f);
        b.curveToRelative(-2.13f, 0.13f, -4.62f, -1.09f, -5.19f, -4.12f);
        b.curveTo(7.01f, 14.42f, 7.37f, 14.0f, 7.83f, 14.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _waterDrop = build;
        build.getClass();
        return build;
    }
}
