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
import defpackage.gy;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoFoodKt {
    private static ImageVector _noFood;

    public static final ImageVector getNoFood(Icons.Rounded rounded) {
        ImageVector imageVector = _noFood;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NoFood", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.0f, 22.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineTo(2.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(13.0f);
        b.curveTo(15.55f, 21.0f, 16.0f, 21.45f, 16.0f, 22.0f);
        b.close();
        b.moveTo(22.89f, 6.1f);
        b.curveTo(22.95f, 5.51f, 22.49f, 5.0f, 21.9f, 5.0f);
        b.horizontalLineTo(18.0f);
        b.verticalLineTo(2.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(3.0f);
        b.horizontalLineToRelative(-3.9f);
        b.curveToRelative(-0.59f, 0.0f, -1.05f, 0.51f, -1.0f, 1.1f);
        b.lineToRelative(0.24f, 2.41f);
        b.lineTo(18.0f, 15.17f);
        gy.B(b, 3.62f, 3.62f, 22.89f, 6.1f);
        b.moveTo(21.19f, 22.61f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.lineTo(12.0f, 12.0f);
        b.lineTo(9.01f, 9.01f);
        b.horizontalLineToRelative(0.0f);
        b.lineToRelative(-6.2f, -6.2f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveTo(1.0f, 3.2f, 1.0f, 3.83f, 1.39f, 4.22f);
        b.lineToRelative(4.99f, 4.99f);
        b.curveToRelative(-2.56f, 0.54f, -4.76f, 2.08f, -5.28f, 4.63f);
        b.curveTo(0.99f, 14.45f, 1.49f, 15.0f, 2.1f, 15.0f);
        b.lineToRelative(10.07f, 0.0f);
        b.lineToRelative(2.0f, 2.0f);
        b.horizontalLineTo(2.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(13.0f);
        b.curveToRelative(0.32f, 0.0f, 0.59f, -0.16f, 0.78f, -0.4f);
        b.lineToRelative(4.0f, 4.0f);
        b.curveTo(20.17f, 23.0f, 20.8f, 23.0f, 21.19f, 22.61f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 21.19f, 22.61f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noFood = build;
        build.getClass();
        return build;
    }
}
