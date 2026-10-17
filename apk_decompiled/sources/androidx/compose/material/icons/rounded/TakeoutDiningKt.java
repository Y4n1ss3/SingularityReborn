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
public final class TakeoutDiningKt {
    private static ImageVector _takeoutDining;

    public static final ImageVector getTakeoutDining(Icons.Rounded rounded) {
        ImageVector imageVector = _takeoutDining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TakeoutDining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.29f, 6.75f);
        b.curveToRelative(-0.39f, -0.39f, -1.01f, -0.39f, -1.4f, 0.0f);
        b.lineTo(19.0f, 7.63f);
        b.lineToRelative(0.03f, -0.56f);
        b.lineToRelative(-3.46f, -3.48f);
        b.curveTo(15.19f, 3.21f, 14.68f, 3.0f, 14.15f, 3.0f);
        b.horizontalLineToRelative(-4.3f);
        b.curveTo(9.32f, 3.0f, 8.81f, 3.21f, 8.43f, 3.59f);
        b.lineTo(4.97f, 7.07f);
        b.lineTo(5.0f, 7.57f);
        b.lineTo(4.11f, 6.7f);
        b.curveTo(3.72f, 6.32f, 3.1f, 6.32f, 2.72f, 6.71f);
        b.lineTo(2.7f, 6.73f);
        b.curveTo(2.32f, 7.12f, 2.32f, 7.75f, 2.72f, 8.13f);
        b.lineTo(4.66f, 10.0f);
        b.horizontalLineToRelative(14.69f);
        b.lineToRelative(1.92f, -1.84f);
        b.curveTo(21.67f, 7.78f, 21.68f, 7.14f, 21.29f, 6.75f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(5.79f, 18.15f);
        b2.curveTo(5.87f, 19.19f, 6.74f, 20.0f, 7.79f, 20.0f);
        b2.horizontalLineToRelative(8.43f);
        b2.curveToRelative(1.05f, 0.0f, 1.92f, -0.81f, 1.99f, -1.85f);
        b2.lineToRelative(0.49f, -6.6f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.m(b2, 5.3f, 5.79f, 18.15f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _takeoutDining = build;
        build.getClass();
        return build;
    }
}
