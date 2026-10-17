package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LightbulbKt {
    private static ImageVector _lightbulb;

    public static final ImageVector getLightbulb(Icons.Outlined outlined) {
        ImageVector imageVector = _lightbulb;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Lightbulb", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.0f, 21.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(4.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        bv.n(b, -1.0f, 9.0f, 20.0f, 1.0f);
        b.moveTo(12.0f, 2.0f);
        b.curveTo(8.14f, 2.0f, 5.0f, 5.14f, 5.0f, 9.0f);
        b.curveToRelative(0.0f, 2.38f, 1.19f, 4.47f, 3.0f, 5.74f);
        b.lineTo(8.0f, 17.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(6.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-2.26f);
        b.curveToRelative(1.81f, -1.27f, 3.0f, -3.36f, 3.0f, -5.74f);
        b.curveToRelative(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f);
        k4.x(b, 14.85f, 13.1f, -0.85f, 0.6f);
        fc.w(b, 14.0f, 16.0f, -4.0f, -2.3f);
        b.lineToRelative(-0.85f, -0.6f);
        b.curveTo(7.8f, 12.16f, 7.0f, 10.63f, 7.0f, 9.0f);
        b.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        b.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        b.curveToRelative(0.0f, 1.63f, -0.8f, 3.16f, -2.15f, 4.1f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lightbulb = build;
        build.getClass();
        return build;
    }
}
