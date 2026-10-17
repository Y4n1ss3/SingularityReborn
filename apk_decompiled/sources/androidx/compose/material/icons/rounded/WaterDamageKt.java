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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WaterDamageKt {
    private static ImageVector _waterDamage;

    public static final ImageVector getWaterDamage(Icons.Rounded rounded) {
        ImageVector imageVector = _waterDamage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WaterDamage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(11.33f, 3.6f, -8.36f, 7.53f);
        e.curveTo(2.63f, 11.43f, 2.84f, 12.0f, 3.3f, 12.0f);
        e.horizontalLineTo(5.0f);
        e.verticalLineToRelative(7.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.horizontalLineToRelative(12.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.verticalLineToRelative(-7.0f);
        e.horizontalLineToRelative(1.7f);
        e.curveToRelative(0.46f, 0.0f, 0.68f, -0.57f, 0.33f, -0.87f);
        e.lineTo(12.67f, 3.6f);
        e.curveTo(12.29f, 3.26f, 11.71f, 3.26f, 11.33f, 3.6f);
        e.close();
        e.moveTo(12.0f, 16.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        e.curveToRelative(0.0f, -0.78f, 0.99f, -2.44f, 1.58f, -3.36f);
        e.curveToRelative(0.2f, -0.31f, 0.64f, -0.31f, 0.84f, 0.0f);
        e.curveTo(13.01f, 11.56f, 14.0f, 13.22f, 14.0f, 14.0f);
        e.curveTo(14.0f, 15.1f, 13.1f, 16.0f, 12.0f, 16.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _waterDamage = build;
        build.getClass();
        return build;
    }
}
