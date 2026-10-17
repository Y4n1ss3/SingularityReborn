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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InvertColorsKt {
    private static ImageVector _invertColors;

    public static final ImageVector getInvertColors(Icons.TwoTone twoTone) {
        ImageVector imageVector = _invertColors;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.InvertColors", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.75f, 8.99f);
        b.curveTo(6.62f, 10.1f, 6.0f, 11.57f, 6.0f, 13.13f);
        b.curveTo(6.0f, 16.37f, 8.69f, 19.0f, 12.0f, 19.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 0.0f, -14.19f, 7.75f, 8.99f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.65f, 7.56f, 17.65f, 7.56f);
        i.lineTo(12.0f, 2.0f);
        i.lineTo(6.35f, 7.56f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveTo(4.9f, 8.99f, 4.0f, 10.96f, 4.0f, 13.13f);
        i.curveTo(4.0f, 17.48f, 7.58f, 21.0f, 12.0f, 21.0f);
        i.curveToRelative(4.42f, 0.0f, 8.0f, -3.52f, 8.0f, -7.87f);
        i.curveTo(20.0f, 10.96f, 19.1f, 8.99f, 17.65f, 7.56f);
        i.close();
        i.moveTo(6.0f, 13.13f);
        i.curveToRelative(0.0f, -1.56f, 0.62f, -3.03f, 1.75f, -4.14f);
        i.lineTo(12.0f, 4.81f);
        i.lineTo(12.0f, 19.0f);
        i.curveTo(8.69f, 19.0f, 6.0f, 16.37f, 6.0f, 13.13f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _invertColors = build;
        build.getClass();
        return build;
    }
}
