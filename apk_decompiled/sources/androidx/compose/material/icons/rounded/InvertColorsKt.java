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
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InvertColorsKt {
    private static ImageVector _invertColors;

    public static final ImageVector getInvertColors(Icons.Rounded rounded) {
        ImageVector imageVector = _invertColors;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.InvertColors", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(12.0f, 4.81f, 12.0f, 19.0f);
        i.curveToRelative(-3.31f, 0.0f, -6.0f, -2.63f, -6.0f, -5.87f);
        i.curveToRelative(0.0f, -1.56f, 0.62f, -3.03f, 1.75f, -4.14f);
        i.lineTo(12.0f, 4.81f);
        i.moveTo(6.35f, 7.56f);
        i.lineTo(6.35f, 7.56f);
        i.curveTo(4.9f, 8.99f, 4.0f, 10.96f, 4.0f, 13.13f);
        i.curveTo(4.0f, 17.48f, 7.58f, 21.0f, 12.0f, 21.0f);
        i.curveToRelative(4.42f, 0.0f, 8.0f, -3.52f, 8.0f, -7.87f);
        i.curveToRelative(0.0f, -2.17f, -0.9f, -4.14f, -2.35f, -5.57f);
        i.lineToRelative(0.0f, 0.0f);
        i.lineTo(12.7f, 2.69f);
        i.curveToRelative(-0.39f, -0.38f, -1.01f, -0.38f, -1.4f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 6.35f, 7.56f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _invertColors = build;
        build.getClass();
        return build;
    }
}
