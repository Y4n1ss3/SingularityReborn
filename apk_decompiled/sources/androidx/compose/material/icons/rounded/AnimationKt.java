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
public final class AnimationKt {
    private static ImageVector _animation;

    public static final ImageVector getAnimation(Icons.Rounded rounded) {
        ImageVector imageVector = _animation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Animation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.0f, 2.0f);
        b.curveToRelative(-2.71f, 0.0f, -5.05f, 1.54f, -6.22f, 3.78f);
        b.curveToRelative(-1.28f, 0.67f, -2.34f, 1.72f, -3.0f, 3.0f);
        b.curveTo(3.54f, 9.95f, 2.0f, 12.29f, 2.0f, 15.0f);
        b.curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        b.curveToRelative(2.71f, 0.0f, 5.05f, -1.54f, 6.22f, -3.78f);
        b.curveToRelative(1.28f, -0.67f, 2.34f, -1.72f, 3.0f, -3.0f);
        b.curveTo(20.46f, 14.05f, 22.0f, 11.71f, 22.0f, 9.0f);
        b.curveTo(22.0f, 5.13f, 18.87f, 2.0f, 15.0f, 2.0f);
        b.close();
        b.moveTo(9.0f, 20.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        b.curveToRelative(0.0f, -1.12f, 0.37f, -2.16f, 1.0f, -3.0f);
        b.curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        b.curveTo(11.16f, 19.63f, 10.12f, 20.0f, 9.0f, 20.0f);
        b.close();
        b.moveTo(12.0f, 17.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        b.curveToRelative(0.0f, -1.12f, 0.37f, -2.16f, 1.0f, -3.0f);
        b.curveToRelative(0.0f, 3.86f, 3.13f, 6.99f, 7.0f, 7.0f);
        b.curveTo(14.16f, 16.63f, 13.12f, 17.0f, 12.0f, 17.0f);
        b.close();
        b.moveTo(16.7f, 13.7f);
        b.curveTo(16.17f, 13.89f, 15.6f, 14.0f, 15.0f, 14.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        b.curveToRelative(0.0f, -0.6f, 0.11f, -1.17f, 0.3f, -1.7f);
        b.curveTo(10.83f, 7.11f, 11.4f, 7.0f, 12.0f, 7.0f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        b.curveTo(17.0f, 12.6f, 16.89f, 13.17f, 16.7f, 13.7f);
        b.close();
        b.moveTo(19.0f, 12.0f);
        b.curveToRelative(0.0f, -3.86f, -3.13f, -6.99f, -7.0f, -7.0f);
        b.curveToRelative(0.84f, -0.63f, 1.87f, -1.0f, 3.0f, -1.0f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        b.curveTo(20.0f, 10.12f, 19.63f, 11.16f, 19.0f, 12.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _animation = build;
        build.getClass();
        return build;
    }
}
