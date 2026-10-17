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
import defpackage.af0;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DoubleArrowKt {
    private static ImageVector _doubleArrow;

    public static final ImageVector getDoubleArrow(Icons.Rounded rounded) {
        ImageVector imageVector = _doubleArrow;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DoubleArrow", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.08f, 11.42f, -4.04f, -5.65f);
        e.curveTo(15.7f, 5.29f, 15.15f, 5.0f, 14.56f, 5.0f);
        e.horizontalLineToRelative(0.0f);
        e.curveToRelative(-1.49f, 0.0f, -2.35f, 1.68f, -1.49f, 2.89f);
        e.lineTo(16.0f, 12.0f);
        e.lineToRelative(-2.93f, 4.11f);
        e.curveToRelative(-0.87f, 1.21f, 0.0f, 2.89f, 1.49f, 2.89f);
        e.horizontalLineToRelative(0.0f);
        e.curveToRelative(0.59f, 0.0f, 1.15f, -0.29f, 1.49f, -0.77f);
        e.lineToRelative(4.04f, -5.65f);
        e.curveTo(20.33f, 12.23f, 20.33f, 11.77f, 20.08f, 11.42f);
        e.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(13.08f, 11.42f, 9.05f, 5.77f);
        i.curveTo(8.7f, 5.29f, 8.15f, 5.0f, 7.56f, 5.0f);
        i.horizontalLineToRelative(0.0f);
        i.curveTo(6.07f, 5.0f, 5.2f, 6.68f, 6.07f, 7.89f);
        i.lineTo(9.0f, 12.0f);
        i.lineToRelative(-2.93f, 4.11f);
        i.curveTo(5.2f, 17.32f, 6.07f, 19.0f, 7.56f, 19.0f);
        i.horizontalLineToRelative(0.0f);
        i.curveToRelative(0.59f, 0.0f, 1.15f, -0.29f, 1.49f, -0.77f);
        i.lineToRelative(4.04f, -5.65f);
        i.curveTo(13.33f, 12.23f, 13.33f, 11.77f, 13.08f, 11.42f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doubleArrow = build;
        build.getClass();
        return build;
    }
}
