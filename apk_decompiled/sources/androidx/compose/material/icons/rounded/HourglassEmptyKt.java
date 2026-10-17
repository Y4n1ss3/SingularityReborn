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
import defpackage.fc;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HourglassEmptyKt {
    private static ImageVector _hourglassEmpty;

    public static final ImageVector getHourglassEmpty(Icons.Rounded rounded) {
        ImageVector imageVector = _hourglassEmpty;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HourglassEmpty", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.0f, 2.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.verticalLineToRelative(3.17f);
        b.curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.42f);
        b.lineTo(10.0f, 12.0f);
        b.lineToRelative(-3.42f, 3.42f);
        b.curveToRelative(-0.37f, 0.38f, -0.58f, 0.89f, -0.58f, 1.42f);
        b.lineTo(6.0f, 20.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(8.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineToRelative(-3.16f);
        b.curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.58f, -1.41f);
        b.lineTo(14.0f, 12.0f);
        b.lineToRelative(3.41f, -3.4f);
        b.curveToRelative(0.38f, -0.38f, 0.59f, -0.89f, 0.59f, -1.42f);
        b.lineTo(18.0f, 4.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        uo.l(b, 8.0f, 2.0f, 16.0f, 16.5f);
        b.lineTo(16.0f, 19.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.lineTo(9.0f, 20.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineToRelative(-2.5f);
        fc.C(b, 4.0f, -4.0f, 4.0f, 4.0f);
        b.moveTo(12.0f, 11.5f);
        b.lineToRelative(-4.0f, -4.0f);
        b.lineTo(8.0f, 5.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(6.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.o(b, 2.5f, -4.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hourglassEmpty = build;
        build.getClass();
        return build;
    }
}
