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
import defpackage.af0;
import defpackage.gy;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InvertColorsOffKt {
    private static ImageVector _invertColorsOff;

    public static final ImageVector getInvertColorsOff(Icons.Outlined outlined) {
        ImageVector imageVector = _invertColorsOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.InvertColorsOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.19f, 21.19f, 2.81f, 2.81f);
        i.lineTo(1.39f, 4.22f);
        i.lineToRelative(4.2f, 4.2f);
        i.curveToRelative(-1.0f, 1.31f, -1.6f, 2.94f, -1.6f, 4.7f);
        i.curveTo(4.0f, 17.48f, 7.58f, 21.0f, 12.0f, 21.0f);
        i.curveToRelative(1.75f, 0.0f, 3.36f, -0.56f, 4.67f, -1.5f);
        gy.B(i, 3.1f, 3.1f, 21.19f, 21.19f);
        i.moveTo(12.0f, 19.0f);
        i.curveToRelative(-3.31f, 0.0f, -6.0f, -2.63f, -6.0f, -5.87f);
        i.curveToRelative(0.0f, -1.19f, 0.36f, -2.32f, 1.02f, -3.28f);
        uf.o(i, 12.0f, 14.83f, 19.0f);
        i.moveTo(8.38f, 5.56f);
        i.lineTo(12.0f, 2.0f);
        i.lineToRelative(5.65f, 5.56f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveTo(19.1f, 8.99f, 20.0f, 10.96f, 20.0f, 13.13f);
        i.curveToRelative(0.0f, 1.18f, -0.27f, 2.29f, -0.74f, 3.3f);
        i.lineTo(12.0f, 9.17f);
        i.verticalLineTo(4.81f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 9.8f, 6.97f, 8.38f, 5.56f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _invertColorsOff = build;
        build.getClass();
        return build;
    }
}
